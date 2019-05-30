package com.hs.drools.demo.service.impl;

import com.hs.drools.demo.bean.MessageBean;
import com.hs.drools.demo.service.DroolsService;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

@Service
public class DroolsServiceImpl implements DroolsService {

    @Override
    public String fireRule(){
        // load up the knowledge base
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession kSession = kContainer.newKieSession("ksession-rules");

        MessageBean message = new MessageBean();
        message.setMessage("Hello World");
        message.setStatus(MessageBean.HELLO);
        kSession.insert(message);//插入

        kSession.fireAllRules();//执行规则
        kSession.dispose();
        return message.getMessage();

    }

}
