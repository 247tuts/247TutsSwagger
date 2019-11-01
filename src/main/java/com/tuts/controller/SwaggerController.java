package com.tuts.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/swagger")
@Api("Configure The Swagger With 247 Tuts")
public class SwaggerController {

	@GetMapping("/hello")
	@ApiOperation(value="return hello using map")
	public Map<String, String> helloSwggaer(){
		Map<String, String> map=new HashMap<String, String>();
		map.put("message", "Hello Swagger");
		return map;
	}
}
