package com.hundsun.drools;

import org.kie.api.runtime.KieSession;

import com.hundsun.bean.Student;
import com.hundsun.utils.KieSessionFactory;

public class App2 {
	public static void main(String[] args) throws Exception {
        
        KieSession kieSession2 = KieSessionFactory.get();
        Student student1 = new Student();
        student1.setAge(17);
        Student student2 = new Student();
        student2.setAge(25);
        kieSession2.insert(student1);
        kieSession2.insert(student2);
        kieSession2.fireAllRules();
        
        KieSessionFactory.disposeKieSession();

	}
	
	
}
