package com.thanglequoc.main;

import javax.faces.bean.ManagedBean;


@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {
	public HelloWorld() {
		System.out.println("Hello World started ");
	}
	
	public String getMessage() {
		return "Hello World !";
	}
}
