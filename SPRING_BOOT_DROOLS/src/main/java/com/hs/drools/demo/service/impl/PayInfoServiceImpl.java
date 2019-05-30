package com.hs.drools.demo.service.impl;

import com.hs.drools.demo.bean.PayInfoBean;
import com.hs.drools.demo.dao.PayInfoDAO;
import com.hs.drools.demo.service.PayInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayInfoServiceImpl implements PayInfoService {

    @Autowired
    private PayInfoDAO payInfoDAO;

    @Override
    public List<PayInfoBean> queryPayInfoList(){
        return payInfoDAO.queryPayInfoList();
    }

}
