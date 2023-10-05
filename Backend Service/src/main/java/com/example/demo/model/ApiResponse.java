package com.example.demo.model;

public class ApiResponse<T> {
	Integer status;
	String message;
	T body;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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
		return "ServiceResponse [status=" + status + ", message=" + message + ", body=" + body + "]";
	}

	public ApiResponse(Integer status, String message, T body) {
		super();
		this.status = status;
		this.message = message;
		this.body = body;
	}

	public ApiResponse() {
		super();
	}

}
