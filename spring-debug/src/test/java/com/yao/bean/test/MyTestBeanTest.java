package com.yao.bean.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiaoK
 * @date 2022/7/5
 */
class MyTestBeanTest {

	@Test
	void testSimpleLoad() {
		BeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		MyTestBean bean = (MyTestBean) xmlBeanFactory.getBean("myTestBean");
		assertEquals("testStr", bean.getTestStr());
	}
}