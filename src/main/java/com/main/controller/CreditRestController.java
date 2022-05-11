package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.dto.AppResponse;
import com.main.dto.CreditCardDTO;
import com.main.service.CreditService;

@RestController
public class CreditRestController {
	
	@Autowired
	CreditService creditService;
	
	
	@GetMapping("/creditcards/{ccid}")
	CreditCardDTO fetchCreditCard(@PathVariable int ccid){
		CreditCardDTO dto = creditService.fetchCreditCard(ccid);
		return dto;
	}
	
	@PostMapping("/creditcards")
	AppResponse registerCredit(@RequestBody CreditCardDTO creditDTO) {
		creditService.save(creditDTO);
		AppResponse response = new AppResponse();
		response.setMessage("successfully registered");
		response.setStatus(200);
		
		return response;
	}
	
	@DeleteMapping("/creditcards/{ccid}")
	AppResponse deleteCredit(@PathVariable int ccid) {
		creditService.delete(ccid);
		AppResponse response = new AppResponse();
		response.setMessage("successfully deleted");
		response.setStatus(200);
		
		return response;
	}
	
	
	
	
}
