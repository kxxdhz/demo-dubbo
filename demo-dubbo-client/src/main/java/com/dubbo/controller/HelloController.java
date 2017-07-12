package com.dubbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dubbo.service.HelloService;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@Autowired
	private HelloService helloService;

	@RequestMapping("/{name}")
	@ResponseBody
	public String sayHello(@PathVariable("name") String name){
		String result=helloService.sayHello(name);
		return result;
	}
	
}
