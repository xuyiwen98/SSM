package com.xyw.ssm.dao;

import com.xyw.ssm.domain.Member;
import org.apache.ibatis.annotations.Select;

public interface IMemberDao {
    @Select("select * from member where id=#{id}")
    Member findById(Integer id);
}
