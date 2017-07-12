package com.dubbo.service.impl;

import com.dubbo.service.HelloService;

public class HelloServiceImpl implements HelloService{

	public String sayHello(String name) {
		System.out.println("**************hello:"+name+"¹§Ï²Äãµ÷ÊÔ³É¹¦*****************");
		return "hello:"+name;
	}

}
