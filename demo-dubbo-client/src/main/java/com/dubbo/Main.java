package com.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.service.HelloService;

/**
 * 服务的消费方启动类
 * @author lvpeng
 * @date 2017年7月11日 下午4:20:58
 */
public class Main {

	public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationConsumer.xml"});
        context.start();
 
        HelloService helloService = (HelloService) context.getBean("helloService");
		String result=helloService.sayHello("lvpeng");
        System.out.println( result );
    }
	
}
