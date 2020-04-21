package com.xyw.ssm.dao;

import com.xyw.ssm.domain.Traveller;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ITravellersDao {

    @Select("select * from traveller where id in (select travellerId from order_traveller where orderId=#{ordersId} )")
    List<Traveller> findByOrdersId(Integer orderId);
}
