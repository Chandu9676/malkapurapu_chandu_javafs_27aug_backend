package com.abridged.bookmydoctor.response;

import java.util.List;

import com.abridged.bookmydoctor.dto.PatientInfoBean;

import lombok.Data;

@Data
public class PatientResponse {

	private int statusCode;
	private boolean isError;
	private String message;
	private PatientInfoBean bean;
	private List<PatientInfoBean> list; 
	
	
	
	/**
	 * @return the statusCode
	 */
	public int getStatusCode() {
		return statusCode;
	}
	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	/**
	 * @return the isError
	 */
	public boolean isError() {
		return isError;
	}
	/**
	 * @param isError the isError to set
	 */
	public void setError(boolean isError) {
		this.isError = isError;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the bean
	 */
	public PatientInfoBean getBean() {
		return bean;
	}
	/**
	 * @param bean the bean to set
	 */
	public void setBean(PatientInfoBean bean) {
		this.bean = bean;
	}
	/**
	 * @return the list
	 */
	public List<PatientInfoBean> getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(List<PatientInfoBean> list) {
		this.list = list;
	}
	
	
	
	
}
