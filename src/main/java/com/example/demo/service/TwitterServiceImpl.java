package com.example.demo.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.TwitterRepository;
import com.example.demo.model.TwitterEntity;
import com.example.demo.response.ResponseEntity;


@Service
public class TwitterServiceImpl implements TwitterServices {

	
	@Autowired
	private TwitterRepository repository;
	
	

	@Override
	public ResponseEntity insertTwitteData(List<TwitterEntity> twitte) {
		
		ResponseEntity response=new ResponseEntity();
		try {
			List<TwitterEntity> data=repository.saveAll(twitte);
			response.setStatus(true);
			response.setMsg("Twitte data insert successfully.");
			response.setJsondata(data);
			
		}catch(Exception e) {
			response.setStatus(false);
			response.setMsg("data not inserted Please try again");
			e.printStackTrace();
			
		}
		return response;
	}

	@Override
	public ResponseEntity HashTagsGet(Timestamp createdAt) {
		ResponseEntity response=new ResponseEntity();
		try {
			response.setStatus(true);
			response.setMsg("data get successfully.");
			response.setJsondata(repository.hashTagsGet(createdAt));
		}catch(Exception e) {
			response.setStatus(false);
			response.setMsg("something is wrong");
			e.printStackTrace();
		}
		
		return response;
	}

	@Override
	public ResponseEntity getAll() {
		ResponseEntity response=new ResponseEntity();
		try {
			response.setStatus(true);
			response.setMsg("data get successfully");
			response.setJsondata(repository.findAll());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public ResponseEntity getTwitterHashTage() {
		ResponseEntity response=new ResponseEntity();
		try {
			List<TwitterEntity> twitte=repository.getTwitterHashTage();
			response.setStatus(true);
			response.setMsg("Your data get Successfully");
			response.setJsondata(twitte);
			
		}catch(Exception e) {
			response.setStatus(false);
			response.setMsg("something is wrong.Please try again");
			e.printStackTrace();
		}
		
		return response;
	}

	
	
	
	

}
