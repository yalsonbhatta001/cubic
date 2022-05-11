package com.main.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.dao.CreditCardRepository;
import com.main.dto.CreditCardDTO;
import com.main.entity.CreditCardEntity;

@Service
@Transactional
public class CreditCardServiceImpl implements CreditService {
	@Autowired
	CreditCardRepository creditRepository;

	@Override
	public List<CreditCardDTO> FetchAllCreditCards() {
		List<CreditCardDTO> dtoList = new ArrayList<>();
		List<CreditCardEntity> entityList = creditRepository.findAll();

		for (CreditCardEntity creditCard : entityList) {
			CreditCardDTO creditCardDTO = new CreditCardDTO();
			BeanUtils.copyProperties(creditCardDTO, creditCard);
			dtoList.add(creditCardDTO);
		}

		return dtoList;
	}

	@Override
	public void save(CreditCardDTO creditCardDTO) {
		CreditCardEntity creditEntity = new CreditCardEntity();

		BeanUtils.copyProperties(creditCardDTO, creditEntity);
		
		Timestamp timestamp = new Timestamp(new Date().getTime());
		creditEntity.setDoe(timestamp);

		creditRepository.save(creditEntity);
	}

	@Override
	public void delete(int id) {
		creditRepository.deleteById(id);
	}

	@Override
	public CreditCardDTO fetchCreditCard(int id) {
		
		
		CreditCardEntity entity = creditRepository.getOne(id);
		CreditCardDTO dto = new CreditCardDTO();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}

}
