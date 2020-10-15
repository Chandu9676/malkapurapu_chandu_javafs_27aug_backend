package com.abridged.bookmydoctor.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@Entity
@Table(name = "admin_info")
@JsonRootName("AdminInfoBean")
@JsonInclude(content = Include.NON_NULL)

public class AdminInfoBean  implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2544233157946777100L;

	@Id
	@Column
	@JsonProperty
	@NotNull
	private int adminId;
	
	@Column
	@JsonProperty
	@NotNull
	private String email;
	
	@Column
	@JsonProperty
	@NotNull
	private String password;

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
