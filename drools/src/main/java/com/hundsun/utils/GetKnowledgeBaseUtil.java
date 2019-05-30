package com.hundsun.utils;

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

public class GetKnowledgeBaseUtil {
	/* 读取规则 放入规则库 */
	public static KnowledgeBase readKnowledgeBase() {

		/* 通过规则收集工厂 派出一个规则收集者来 */
		KnowledgeBuilder knowledgeBuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();

		/* 通过规则收集者 收集规则 */
		knowledgeBuilder.add(ResourceFactory.newClassPathResource("studentrule1.drl"), ResourceType.DRL);

		/* 获得规则收集者 收集规则过程中的错误 */
		KnowledgeBuilderErrors errors = knowledgeBuilder.getErrors();

		/* 如果error集大于0 说明有错误 */
		if (errors.size() > 0) {

			/* 遍历error集合 */
			for (KnowledgeBuilderError error : errors) {
				/* 打印输出错误 */
				System.out.println("我是规则收集者，收集过程中遇到" + error + "错误");
			}
			throw new IllegalArgumentException("Could not parse knowledge");
		}

		/* 规则收集者将 规则打包 */
		Collection<KnowledgePackage> knowledgePackages = knowledgeBuilder.getKnowledgePackages();

		/* 通过知识库工厂 new一个知识库来加载规则 */
		KnowledgeBase knowledgeBase = KnowledgeBaseFactory.newKnowledgeBase();

		/* 用知识库加载规则 */
		knowledgeBase.addKnowledgePackages(knowledgePackages);

		/* 返回知识库 */
		return knowledgeBase;
	}
}
