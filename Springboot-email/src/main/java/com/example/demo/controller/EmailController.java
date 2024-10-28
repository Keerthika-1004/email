package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MailRequest;
import com.example.demo.dto.MailResponse;
import com.example.demo.service.EmailService;

@RestController
public class EmailController {
	@Autowired
	private EmailService service;
	
	@PostMapping("/sendingEmail")
	public MailResponse sendingEmail(@RequestBody MailRequest request) {
		Map<String, Object> model = new HashMap<>();
		model.put("Name", request.getName());
		model.put("Location", "Chennai,India");
		return service.sendingEmail(request, model);
		
		
	}
	

}
