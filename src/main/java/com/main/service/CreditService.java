package com.main.service;

import java.util.List;

import com.main.dto.CreditCardDTO;
import com.main.entity.CreditCardEntity;

public interface CreditService {	
	
	List<CreditCardDTO> FetchAllCreditCards();

	void save(CreditCardDTO creditCardDTO);
	
	void delete(int id);
	
	CreditCardDTO fetchCreditCard(int id);
}
