package com.dubbo.service.impl;

import com.dubbo.service.HelloService;

public class HelloServiceImpl implements HelloService{

	public String sayHello(String name) {
		System.out.println("**************hello:"+name+"，恭喜你调试成功！*****************");
		return "hello:"+name;
	}

}
