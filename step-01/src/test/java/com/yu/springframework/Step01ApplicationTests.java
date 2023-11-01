package com.yu.springframework;

import com.yu.springframework.bean.UserService;
import org.junit.Test;

public class Step01ApplicationTests {

	@Test
	public void testYuSpring() {

		BeanFactory beanFactory = new BeanFactory();
		BeanDefinition beanDefinition = new BeanDefinition(new UserService());
		beanFactory.registerBeanDefinition("UserService",beanDefinition);

		UserService userService = (UserService) beanFactory.getBean("UserService");
		userService.queryUserInfo();
	}

}
