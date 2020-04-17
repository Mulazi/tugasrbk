package com.dimaspg.tugasutsrbk;

import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.validator.ValidatorException;
import java.util.Arrays;
@ManagedBean
@SessionScoped
public class EmployeeBean {

	// Member Variables
	private String namaDepan;
	private String namaBelakang;
	private String kota;
	private String address;
	private String emailAddress;
	private String mobileNumber;
	

	public String[] suka;

	  public void setNamaDepan(String namaDepan) {
		this.namaDepan = namaDepan;
	}
	
	public String getNamaDepan() {
		return namaDepan;
	}
	
	public void setNamaBelakang(String namaBelakang) {
		this.namaBelakang = namaBelakang;
	}
	
	public String getNamaBelakang() {
		return namaBelakang;
	}

	public void setKota(String kota) {
		this.kota = kota;
	}
	
	public String getKota() {
		return kota;
	}
	
	
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}




	// Validate Email
	public void validateEmail(FacesContext context, UIComponent toValidate, Object value) throws ValidatorException {
		String emailStr = (String) value;
		if (-1 == emailStr.indexOf("@")) {
			FacesMessage message = new FacesMessage("Email Address is Valid");
			throw new ValidatorException(message);
		}
	}
}
