/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-04-11 10:04:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<!-- 页面meta -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\r\n");
      out.write("<title>数据 - AdminLTE2定制版</title>\r\n");
      out.write("<meta name=\"description\" content=\"AdminLTE2定制版\">\r\n");
      out.write("<meta name=\"keywords\" content=\"AdminLTE2定制版\">\r\n");
      out.write("\r\n");
      out.write("<!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("<meta\r\n");
      out.write("\tcontent=\"width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no\"\r\n");
      out.write("\tname=\"viewport\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/ionicons/css/ionicons.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/iCheck/square/blue.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/morris/morris.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/jvectormap/jquery-jvectormap-1.2.2.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/datepicker/datepicker3.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/daterangepicker/daterangepicker.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/datatables/dataTables.bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/treeTable/jquery.treetable.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/treeTable/jquery.treetable.theme.default.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/select2/select2.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/colorpicker/bootstrap-colorpicker.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/bootstrap-markdown/css/bootstrap-markdown.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/adminLTE/css/AdminLTE.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/adminLTE/css/skins/_all-skins.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/style.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/ionslider/ion.rangeSlider.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/ionslider/ion.rangeSlider.skinNice.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/plugins/bootstrap-slider/slider.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"hold-transition skin-blue sidebar-mini\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 页面头部 -->\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t<!-- 页面头部 /-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 导航侧栏 -->\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "aside.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t<!-- 导航侧栏 /-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- 内容区域 -->\r\n");
      out.write("\t\t<div class=\"content-wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 内容头部 -->\r\n");
      out.write("\t\t\t<section class=\"content-header\">\r\n");
      out.write("\t\t\t<h1>\r\n");
      out.write("\t\t\t\t用户管理 <small>全部用户</small>\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("\t\t\t<ol class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/index.jsp\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-dashboard\"></i> 首页</a></li>\r\n");
      out.write("\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/findAll.do\">用户管理</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"active\">全部用户</li>\r\n");
      out.write("\t\t\t</ol>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t\t<!-- 内容头部 /-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- 正文区域 -->\r\n");
      out.write("\t\t\t\t<section class=\"content\"> <!-- .box-body -->\r\n");
      out.write("\t\t\t\t<div class=\"box box-primary\">\r\n");
      out.write("\t\t\t\t\t<div class=\"box-header with-border\">\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"box-title\">列表</h3>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"box-body\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- 数据表格 -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"table-box\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!--工具栏-->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group form-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"btn-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" title=\"新建\" onclick=\"location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/pages/user-add.jsp'\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-file-o\"></i> 新建\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" title=\"刷新\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-refresh\"></i> 刷新\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"box-tools pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"has-feedback\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control input-sm\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"搜索\"> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-search form-control-feedback\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!--工具栏/-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!--数据列表-->\r\n");
      out.write("\t\t\t\t\t\t\t<table id=\"dataList\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"table table-bordered table-striped table-hover dataTable\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th class=\"\" style=\"padding-right: 0px\"><input\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tid=\"selall\" type=\"checkbox\" class=\"icheckbox_square-blue\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th class=\"sorting_asc\">ID</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th class=\"sorting_desc\">用户名</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th class=\"sorting_asc sorting_asc_disabled\">邮箱</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th class=\"sorting_desc sorting_desc_disabled\">联系电话</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th class=\"sorting\">状态</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th class=\"text-center\">操作</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!--\r\n");
      out.write("                            <tfoot>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                            <th>Rendering engine</th>\r\n");
      out.write("                            <th>Browser</th>\r\n");
      out.write("                            <th>Platform(s)</th>\r\n");
      out.write("                            <th>Engine version</th>\r\n");
      out.write("                            <th>CSS grade</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            </tfoot>-->\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t<!--数据列表/-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- 数据表格 /-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- /.box-body -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- .box-footer-->\r\n");
      out.write("\t\t\t\t\t<div class=\"box-footer\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group form-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t\t总共2 页，共14 条数据。 每页 <select class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>1</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>2</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>3</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>4</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>5</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select> 条\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"box-tools pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"pagination\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" aria-label=\"Previous\">首页</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">上一页</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">1</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">2</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">3</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">4</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">5</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">下一页</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" aria-label=\"Next\">尾页</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- /.box-footer-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t<!-- 正文区域 /-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- @@close -->\r\n");
      out.write("\t\t\t<!-- 内容区域 /-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 底部导航 -->\r\n");
      out.write("\t\t\t<footer class=\"main-footer\">\r\n");
      out.write("\t\t\t<div class=\"pull-right hidden-xs\">\r\n");
      out.write("\t\t\t\t<b>Version</b> 1.0.8\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<strong>Copyright &copy; 2014-2017 <a\r\n");
      out.write("\t\t\t\thref=\"http://www.itcast.cn\">研究院研发部</a>.\r\n");
      out.write("\t\t\t</strong> All rights reserved. </footer>\r\n");
      out.write("\t\t\t<!-- 底部导航 /-->\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<script src=\"../plugins/jQuery/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/jQueryUI/jquery-ui.min.js\"></script>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\t$.widget.bridge('uibutton', $.ui.button);\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<script src=\"../plugins/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/raphael/raphael-min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/morris/morris.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/sparkline/jquery.sparkline.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/jvectormap/jquery-jvectormap-1.2.2.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/jvectormap/jquery-jvectormap-world-mill-en.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/knob/jquery.knob.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/daterangepicker/moment.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/daterangepicker/daterangepicker.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/daterangepicker/daterangepicker.zh-CN.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/datepicker/bootstrap-datepicker.js\"></script>\r\n");
      out.write("\t\t<script\r\n");
      out.write("\t\t\tsrc=\"../plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js\"></script>\r\n");
      out.write("\t\t<script\r\n");
      out.write("\t\t\tsrc=\"../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/slimScroll/jquery.slimscroll.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/fastclick/fastclick.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/iCheck/icheck.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/adminLTE/js/app.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/treeTable/jquery.treetable.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/select2/select2.full.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/colorpicker/bootstrap-colorpicker.min.js\"></script>\r\n");
      out.write("\t\t<script\r\n");
      out.write("\t\t\tsrc=\"../plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/bootstrap-markdown/js/bootstrap-markdown.js\"></script>\r\n");
      out.write("\t\t<script\r\n");
      out.write("\t\t\tsrc=\"../plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/bootstrap-markdown/js/markdown.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/bootstrap-markdown/js/to-markdown.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/ckeditor/ckeditor.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/input-mask/jquery.inputmask.js\"></script>\r\n");
      out.write("\t\t<script\r\n");
      out.write("\t\t\tsrc=\"../plugins/input-mask/jquery.inputmask.date.extensions.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/input-mask/jquery.inputmask.extensions.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/datatables/jquery.dataTables.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/datatables/dataTables.bootstrap.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/chartjs/Chart.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/flot/jquery.flot.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/flot/jquery.flot.resize.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/flot/jquery.flot.pie.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/flot/jquery.flot.categories.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/ionslider/ion.rangeSlider.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"../plugins/bootstrap-slider/bootstrap-slider.js\"></script>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t\t// 选择框\r\n");
      out.write("\t\t\t\t$(\".select2\").select2();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t// WYSIHTML5编辑器\r\n");
      out.write("\t\t\t\t$(\".textarea\").wysihtml5({\r\n");
      out.write("\t\t\t\t\tlocale : 'zh-CN'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t// 设置激活菜单\r\n");
      out.write("\t\t\tfunction setSidebarActive(tagUri) {\r\n");
      out.write("\t\t\t\tvar liObj = $(\"#\" + tagUri);\r\n");
      out.write("\t\t\t\tif (liObj.length > 0) {\r\n");
      out.write("\t\t\t\t\tliObj.parent().parent().addClass(\"active\");\r\n");
      out.write("\t\t\t\t\tliObj.addClass(\"active\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(document)\r\n");
      out.write("\t\t\t\t\t.ready(\r\n");
      out.write("\t\t\t\t\t\t\tfunction() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t// 激活导航位置\r\n");
      out.write("\t\t\t\t\t\t\t\tsetSidebarActive(\"admin-datalist\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t// 列表按钮 \r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#dataList td input[type='checkbox']\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.iCheck(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tcheckboxClass : 'icheckbox_square-blue',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tincreaseArea : '20%'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t// 全选操作 \r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#selall\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.click(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tvar clicks = $(this).is(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t':checked');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tif (!clicks) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#dataList td input[type='checkbox']\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.iCheck(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"uncheck\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#dataList td input[type='checkbox']\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.iCheck(\"check\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$(this).data(\"clicks\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t!clicks);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /pages/user-list.jsp(148,9) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/pages/user-list.jsp(148,9) '${userList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${userList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /pages/user-list.jsp(148,9) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("user");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td><input name=\"ids\" type=\"checkbox\"></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.username }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.phoneNum }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.statusStr }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\t\t\t\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td class=\"text-center\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("/user/findById.do?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" class=\"btn bg-olive btn-xs\">详情</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("/user/findUserByIdAndAllRole.do?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" class=\"btn bg-olive btn-xs\">添加角色</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
