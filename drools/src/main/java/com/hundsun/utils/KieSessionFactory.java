package com.hundsun.utils;

import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.Message;
import org.kie.api.event.rule.DebugRuleRuntimeEventListener;
import org.kie.api.io.Resource;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderError;
import org.kie.internal.builder.KnowledgeBuilderErrors;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.io.ResourceFactory;

public class KieSessionFactory {
	private static KieSession kieSession;
	/**
	 * 创建KieSession单例对象
	 * @return
	 * @throws Exception
	 */
	public static KieSession get() throws Exception {
		 
	    try {
	    	if (kieSession != null) {
	            kieSession.dispose();
	            kieSession = null;
	          }
	      KieServices kieServices = KieServices.Factory.get();
	      KieFileSystem kfs = kieServices.newKieFileSystem();
	      Resource resource = kieServices.getResources().newClassPathResource("rules/studentrule.drl");
	      resource.setResourceType(ResourceType.DRL);
	      kfs.write(resource);
	      
	      KieBuilder kieBuilder = kieServices.newKieBuilder(kfs).buildAll();
	      if (kieBuilder.getResults().getMessages(Message.Level.ERROR).size() > 0) {
	        throw new Exception();
	      }
	      
	      KieContainer kieContainer = kieServices.newKieContainer(kieServices.getRepository().getDefaultReleaseId());
	      KieBase kBase = kieContainer.getKieBase();
	      kieSession = kBase.newKieSession();
	      return kieSession;
	 
	    } catch (Exception ex) {
	      throw ex;
	    }
	 
	  }
	
	/**
	   * 
	   * @title disposeKieSession
	   * @description TODO (清空对象)
	   * @return void
	   */
	  public static void disposeKieSession() {
	    if (kieSession != null) {
	      kieSession.dispose();
	      kieSession = null;
	    }
	 
	  }
	  
	  public static KieSession newKieSession(String classPath) throws Exception {
		  
		    KieServices kieServices = KieServices.Factory.get();
		    KieFileSystem kfs = kieServices.newKieFileSystem();
		    Resource resource = kieServices.getResources().newClassPathResource(classPath);
		    resource.setResourceType(ResourceType.DRL);
		    kfs.write(resource);
		    KieBuilder kieBuilder = kieServices.newKieBuilder(kfs).buildAll();
		    if (kieBuilder.getResults().getMessages(Message.Level.ERROR).size() > 0) {
		      throw new Exception();
		    }
		    KieContainer kieContainer = kieServices.newKieContainer(kieServices.getRepository().getDefaultReleaseId());
		    KieBase kBase = kieContainer.getKieBase();
		    KieSession kieSession = kBase.newKieSession();
		    kieSession.addEventListener(new DebugRuleRuntimeEventListener());
		    return kieSession;
		 
		  }
		 
		  public static StatelessKieSession newStatelessKieSession(String classPath) throws Exception {
		    KieServices kieServices = KieServices.Factory.get();
		    KieFileSystem kfs = kieServices.newKieFileSystem();
		    Resource resource = kieServices.getResources().newClassPathResource(classPath);
		    resource.setResourceType(ResourceType.DRL);
		    kfs.write(resource);
		    KieBuilder kieBuilder = kieServices.newKieBuilder(kfs).buildAll();
		    if (kieBuilder.getResults().getMessages(Message.Level.ERROR).size() > 0) {
		      throw new Exception();
		    }
		    KieContainer kieContainer = kieServices.newKieContainer(kieServices.getRepository().getDefaultReleaseId());
		    KieBase kBase = kieContainer.getKieBase();
		    StatelessKieSession kiesession = kBase.newStatelessKieSession();
		    return kiesession;
		 
		  }
}
