package com.main.entity;


import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "credit_card_tbl")
public class CreditCardEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ccid;
	private String name; 
	private String ccno; 
	private String cvv; 
	private String exp; 
	private int balance; 
	private Timestamp doe;
	public CreditCardEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCardEntity(String name, String ccno, String cvv, String exp, int balance) {
		super();
		this.name = name;
		this.ccno = ccno;
		this.cvv = cvv;
		this.exp = exp;
		this.balance = balance;
	}
	public int getCcid() {
		return ccid;
	}
	public void setCcid(int ccid) {
		this.ccid = ccid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCcno() {
		return ccno;
	}
	public void setCcno(String ccno) {
		this.ccno = ccno;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Timestamp getDoe() {
		return doe;
	}
	public void setDoe(Timestamp doe) {
		this.doe = doe;
	}
	@Override
	public String toString() {
		return "CreditCardEntity [ccid=" + ccid + ", name=" + name + ", ccno=" + ccno + ", cvv=" + cvv + ", exp=" + exp
				+ ", balance=" + balance + ", doe=" + doe + "]";
	} 
	
	
}