package com.ddxx.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ddxx.model.User;
import com.ddxx.provider.DemoService;

public class Consumer {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "dubbo-consumer.xml" });
		context.start();

		DemoService demoService = (DemoService) context.getBean("demoService");
		String hello = demoService.sayHello("ddxx");
		System.out.println(hello);

		List<User> list = demoService.getUsers();
		if (list != null && list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i).getName());
			}
		}
		System.in.read();
	}

}