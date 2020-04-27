package com.qs.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Desc:
 * @author: jianfeng
 * @Time: 2020/4/27 13:28
 * @Copyright:
 * @Warning:
 */
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CompentScan.class);
		Bean bean=context.getBean(Bean.class);
		System.out.println(bean);
	}

}
