package com.xyw.ssm.service;

import com.xyw.ssm.domain.SysLog;

import java.util.List;

public interface ISysLogService {
    public void save(SysLog sysLog);

    List<SysLog> findAll();
}
