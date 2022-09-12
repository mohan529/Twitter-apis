package com.example.demo.controller;


import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TwitterEntity;
import com.example.demo.response.ResponseEntity;
import com.example.demo.service.TwitterServices;

@RestController
public class TwitterController {

	
	@Autowired
	private TwitterServices services;
	
	
	@PostMapping(value="/twitte/create",consumes = "application/json")
	public ResponseEntity insertTwitteData(@RequestBody List<TwitterEntity> twitte) {
	 
		return services.insertTwitteData(twitte);
	}
	
	 
	@GetMapping(value="/getHashTags")
	public ResponseEntity  getHashTagsData(@RequestParam ("createdAt") Timestamp createdAt) {
	
		return services.HashTagsGet(createdAt);
	}
	
	@GetMapping(value="/getAll")
	public ResponseEntity getAllData() {
		return services.getAll();
	}
	
	@GetMapping("/get/twitter/hashtags")
	public ResponseEntity  getTwitterHashTage() {
		return services.getTwitterHashTage();
	}
	
	
	
	
}
