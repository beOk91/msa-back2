package com.msa.cj.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/second")
@Slf4j
public class MyController2 {
	
	@GetMapping("/hello")
	public String hello() {
		return "hello second service 222";
	}
}
