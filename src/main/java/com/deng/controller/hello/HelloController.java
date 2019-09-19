package com.deng.controller.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HelloController {
    @RequestMapping(path="/hello")
	public String sayhello() {
		System.out.println("hello springmvc");
		return "success ";
	}
	
}
