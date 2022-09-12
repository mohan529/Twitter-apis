package com.example.demo.service;


import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.model.TwitterEntity;
import com.example.demo.response.ResponseEntity;


@Component
public interface TwitterServices {


	ResponseEntity insertTwitteData(List<TwitterEntity> twitte);

	ResponseEntity HashTagsGet(Timestamp createdAt);

	ResponseEntity getAll();

	ResponseEntity getTwitterHashTage();



	

}
