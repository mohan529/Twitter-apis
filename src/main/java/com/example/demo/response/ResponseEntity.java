package com.example.demo.response;

public class ResponseEntity {

	private Boolean status;
	private String msg;
	private  Object jsondata;
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getJsondata() {
		return jsondata;
	}
	public void setJsondata(Object jsondata) {
		this.jsondata = jsondata;
	}
	
	
	
}
