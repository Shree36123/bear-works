package com.shree.microservices.bear.web.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shree.microservices.bear.services.BearServices;
import com.shree.microservices.bear.web.model.BearModel;
@RequestMapping("/api/v1/bear")
@RestController
public class BearController {

	private final BearServices bearServices;
	
	public BearController(BearServices bearServices) {
		this.bearServices=bearServices;
	}
	
	@GetMapping({"/{bearid}"})
	public ResponseEntity<BearModel> getResponse(@PathVariable("bearid") UUID bearid){
		
		return new ResponseEntity<>(bearServices.getBearbyId(bearid), HttpStatus.OK);
	}
	
}
