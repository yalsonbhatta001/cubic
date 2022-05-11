package com.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.CreditCardEntity;

public interface CreditCardRepository extends JpaRepository<CreditCardEntity, Integer>{

}
