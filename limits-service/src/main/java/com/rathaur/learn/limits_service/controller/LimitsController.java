package com.rathaur.learn.limits_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rathaur.learn.limits_service.bean.Limits;
import com.rathaur.learn.limits_service.config.LimitsConfiguration;

@RestController
public class LimitsController {

	@Autowired
	LimitsConfiguration config;
	
	@GetMapping("/limits")
	public Limits retriveLimits() {
		return new Limits(config.getMinimum(), config.getMaximum());
	}
}
