package com.example.demo.model;


public class ServiceResponse<T> {

	Integer status;
	Boolean isSuccess;
	Boolean isFailure;
	String message;
	T body;
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Boolean getIsSuccess() {
		return isSuccess;
	}
	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsFailure() {
		return isFailure;
	}
	public void setIsFailure(Boolean isFailure) {
		this.isFailure = isFailure;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getBody() {
		return body;
	}
	public void setBody(T body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "ServiceResponse [status=" + status + ", isSuccess=" + isSuccess + ", isFailure=" + isFailure
				+ ", message=" + message + ", body=" + body + "]";
	}
	public ServiceResponse(Integer status, Boolean isSuccess, Boolean isFailure, String message, T body) {
		super();
		this.status = status;
		this.isSuccess = isSuccess;
		this.isFailure = isFailure;
		this.message = message;
		this.body = body;
	}
	public ServiceResponse() {
		super();
	}
	
	
}
