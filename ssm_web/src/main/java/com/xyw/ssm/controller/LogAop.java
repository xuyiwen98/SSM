package com.xyw.ssm.controller;

import com.xyw.ssm.domain.SysLog;
import com.xyw.ssm.service.ISysLogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;

@Component
@Aspect
public class LogAop {

    private Date visitTime;//开始时间
    private Class clazz;//访问的类
    private Method method;//访问的方法

    @Autowired
    private ISysLogService sysLogService;

    @Autowired
    private HttpServletRequest request;  //再web.xml配置Listener才能使用


    //前置通知  获取开始时间,执行的哪个类,执行的哪个方法
    @Before("execution(* com.xyw.ssm.controller.*.*(..))")
    public void doBefore(JoinPoint jp) throws NoSuchMethodException {
        //获取访问时刻
        visitTime = new Date();

        clazz = jp.getTarget().getClass();//具体要访问的类
        String methodName = jp.getSignature().getName();//获取访问的方法名称

        //获取具体执行的方法的method对象
        Object[] args = jp.getArgs();//获取访问的方法参数
        if(args==null||args.length==0){
            method=clazz.getMethod(methodName);//只能获取无参数的方法
        }else {
            Class[] classArgs = new Class[args.length];
            for (int i = 0; i < args.length; i++) {
                classArgs[i]=args[i].getClass();
            }
            method=clazz.getMethod(methodName,classArgs);

        }

        
    }

    //后置通知
    @After("execution(* com.xyw.ssm.controller.*.*(..))")
    public void doAfter(JoinPoint jp) {

        long time=new Date().getTime()-visitTime.getTime();//获取访问时长

        //获取url
        String url="";
        if(clazz!=null&&method!=null&&clazz!=LogAop.class){
            //1.获取类上的RequestMapping("/XX")
            RequestMapping classAnnotation = (RequestMapping) clazz.getAnnotation(RequestMapping.class);
            if(classAnnotation!=null){
                String[] classValue = classAnnotation.value();
                //获取方法上的RequestMapping("/XXX")
                RequestMapping methodAnnotation = method.getAnnotation(RequestMapping.class);
                if(methodAnnotation!=null&&!classValue[0].equals("/sysLog")){
                    String[] methodValue = methodAnnotation.value();
                    url=classValue[0]+methodValue[0];


                    //获取访问的ip
                    String ip=request.getRemoteAddr();

                    //获取当前操作的用户
                    SecurityContext context = SecurityContextHolder.getContext();//从上下文获得当前登录的用户
                    User user = (User) context.getAuthentication().getPrincipal();
                    /*User user2 =(User)request.getSession().getAttribute("SPRING_SECURITY_CONTEXT");*/
                    String username = user.getUsername();



                    //将日志相关信息封装到SysLog对象
                    SysLog sysLog = new SysLog();
                    sysLog.setExecutionTime(time);
                    sysLog.setIp(ip);
                    sysLog.setUrl(url);
                    sysLog.setUsername(username);
                    sysLog.setVisitTime(visitTime);
                    sysLog.setMethod("[类名]"+clazz.getName()+"[方法名]"+method.getName());

                    //调用Service完成操作
                    sysLogService.save(sysLog);

                }
            }
        }



    }
}
