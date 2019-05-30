package com.hs.drools.demo.dao;

import com.hs.drools.demo.bean.CustomerBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerDAO {

    public List<CustomerBean> queryCustomerList();

    public void changeLevByPayAmount(CustomerBean customerBean);

}
