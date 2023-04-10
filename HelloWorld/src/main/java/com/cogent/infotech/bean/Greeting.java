package com.cogent.infotech.bean;

import org.springframework.stereotype.Component;

@Component
public class Greeting {
	public String hello() {
		return "Welcom to Spring boot";
	}
}
