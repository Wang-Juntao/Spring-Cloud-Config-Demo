package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {
	
	//这里的配置会自动从配置服务器获取
	@Value("${foo}")
	String foo;
	@Value("${democonfigclient.message}")
	String message;
	//冒号之后是默认值
	@Value("${appName:config-client}")
	String appName;
	
	
	@RequestMapping("/")
	public Map<String,String> hello(){
		Map<String,String> config = new HashMap<String,String>();
		config.put("foo", foo);
		config.put("message", message);
		config.put("appName", appName);
		return config;
	}

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
}
