package com.ioc;

import com.ioc.common.MyApplicationContext;
import com.ioc.controller.LoginController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DefaultStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(DefaultStartApplication.class, args);
		// 从容器中获取对象(自动首字母小写)
		MyApplicationContext applicationContext = null;
		try {
			applicationContext = new MyApplicationContext();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		LoginController loginController = (LoginController) applicationContext.getIocBean("LoginController");
		String login = loginController.login();
		System.out.println(login);

	}

}
