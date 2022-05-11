package com.main.dto;

public class AppResponse {
	private String message; 
	private int status;
	
	public AppResponse(String message, int status) {
		super();
		this.message = message;
		this.status = status;
	}

	public AppResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "AppResponse [message=" + message + ", status=" + status + "]";
	} 
	
	


}
