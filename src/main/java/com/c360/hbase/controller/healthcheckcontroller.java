package com.c360.hbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c360.hbase.service.HBasePymt;

@RestController
public class healthcheckcontroller {
	
	@Autowired
	HBasePymt hBasePymt;

	@RequestMapping("/ping")
	public String healthcheck() {
		hBasePymt.saveQuote();
		return "Service is Alive";
	}
}
