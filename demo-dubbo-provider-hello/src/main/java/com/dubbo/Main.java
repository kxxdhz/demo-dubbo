package com.dubbo;

/**
 * 服务的提供方启动类
 * @author lvpeng
 * @date 2017年07月11日 下午2:56:05
 */
import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationProvider.xml" });
		context.start();
		System.out.println("按任意键退出");
		System.in.read();
	}

}
