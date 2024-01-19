package com.example.demo;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello Spring";
	}
	
	@RequestMapping("/info")
	HashMap<String, String> userinfo(){
		HashMap<String, String> map = 
				new HashMap<String, String>();
		map.put("name", "홍길동");
		map.put("age", "21");
		return map;
		
	}

}
