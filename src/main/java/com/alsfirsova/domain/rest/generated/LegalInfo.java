package com.alsfirsova.domain.rest.generated;

import com.google.gson.annotations.SerializedName;

public class LegalInfo{

	@SerializedName("residenceCountry")
	private String residenceCountry;

	@SerializedName("firstName")
	private String firstName;

	@SerializedName("lastName")
	private String lastName;

	public void setResidenceCountry(String residenceCountry){
		this.residenceCountry = residenceCountry;
	}

	public String getResidenceCountry(){
		return residenceCountry;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}
}