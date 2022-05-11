package com.main.dto;

import java.security.Timestamp;

public class CreditCardDTO {
		private int ccid;
		private String name; 
		private String ccno; 
		private String cvv; 
		private String exp; 
		private int balance; 
		private Timestamp doe;
		public CreditCardDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
		public CreditCardDTO(String name, String ccno, String cvv, String exp, int balance) {
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
			return "CreditCardDTO [ccid=" + ccid + ", name=" + name + ", ccno=" + ccno + ", cvv=" + cvv + ", exp=" + exp
					+ ", balance=" + balance + ", doe=" + doe + ", getCcid()=" + getCcid() + ", getName()=" + getName()
					+ ", getCcno()=" + getCcno() + ", getCvv()=" + getCvv() + ", getExp()=" + getExp()
					+ ", getBalance()=" + getBalance() + ", getDoe()=" + getDoe() + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
		
		
}
