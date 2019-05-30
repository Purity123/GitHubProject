package com.hundsun.drools;

import java.util.Collection;

import org.kie.api.io.ResourceType;
import org.kie.internal.KnowledgeBase;
import org.kie.internal.KnowledgeBaseFactory;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderError;
import org.kie.internal.builder.KnowledgeBuilderErrors;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.definition.KnowledgePackage;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.runtime.StatefulKnowledgeSession;

import com.hundsun.bean.Student;
import com.hundsun.utils.GetKnowledgeBaseUtil;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// 通过readKnowledgeBase方法得到带规则的知识库
		KnowledgeBase knowledgeBase = GetKnowledgeBaseUtil.readKnowledgeBase();
		/* 通过知识库创建一个会话 */
		StatefulKnowledgeSession ksession = knowledgeBase.newStatefulKnowledgeSession();
		try {
			Student student = new Student();
			student.setAge(17);

			/* 将数据 专业名词叫 fact事实 加入到会话 */
			ksession.insert(student);
			Student student1 = new Student();
			student1.setAge(25);
			ksession.insert(student1);

			/* 执行所有的规则 与事实进行匹配 */
			ksession.fireAllRules();
		} finally {
			/* 关闭会话 */
			ksession.dispose();
		}
	}

	
}
