package com.hs.drools.demo.service.impl;

import com.hs.drools.demo.bean.CustomerBean;
import com.hs.drools.demo.bean.PayInfoBean;
import com.hs.drools.demo.dao.CustomerDAO;
import com.hs.drools.demo.service.CustomerService;
import com.hs.drools.demo.service.PayInfoService;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Autowired
    private PayInfoService payInfoService;

    @Override
    public void changeLevByPayAmount(){
        System.out.println("执行逻辑代码……");
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession kSession = kContainer.newKieSession("ksession-rules");

        List<CustomerBean> customerBeanList = customerDAO.queryCustomerList();
        List<PayInfoBean> payInfoBeanList = payInfoService.queryPayInfoList();

        if(null != payInfoBeanList && payInfoBeanList.size() != 0){
            for(PayInfoBean payInfoBean : payInfoBeanList){
                kSession.insert(payInfoBean);
            }
        }

        if(null != customerBeanList && customerBeanList.size() != 0){
            for(CustomerBean customerBean : customerBeanList){
                kSession.insert(customerBean);//插入
                kSession.fireAllRules();//执行规则
                customerDAO.changeLevByPayAmount(customerBean);
            }
        }

        kSession.dispose();
        System.out.println("执行逻辑规则完毕……");
    }

}
