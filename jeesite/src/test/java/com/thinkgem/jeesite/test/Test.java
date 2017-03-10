package com.thinkgem.jeesite.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args) {
		ClassPathResource resouce = new ClassPathResource("beans.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(resouce);//调用该方法可以使xml中的bean注册到factory中。  单例的bean默认保存在ConcurrentHashmap中。
		
		
	}
}
