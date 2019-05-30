package com.hs.drools.demo.dao;

import com.hs.drools.demo.bean.PayInfoBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PayInfoDAO {

    List<PayInfoBean> queryPayInfoList();

}
