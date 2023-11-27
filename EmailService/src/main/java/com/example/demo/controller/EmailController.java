package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.EmailService;
@RestController
public class EmailController {
	@Autowired
	private EmailService email;
	@GetMapping("/sendmail")
	public String sendmail() {
		email.sendmail("divyashreesenthilkumar@gmail.com", "Welcome", "this is a sample mail");
		return "Email sent";
	}
}