package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Response;
import com.example.service.IFetchAPIData;

@RestController
//@RequestMapping("/paths")
public class MyController {
	
	@Autowired
	IFetchAPIData fetchAPIDataService;

	@RequestMapping(value="/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Response fetchAPIData() {
		return fetchAPIDataService.getResponseData();
	}
}
