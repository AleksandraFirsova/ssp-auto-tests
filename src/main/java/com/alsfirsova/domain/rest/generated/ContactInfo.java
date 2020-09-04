package com.alsfirsova.domain.rest.generated;

import com.google.gson.annotations.SerializedName;

public class ContactInfo{

	@SerializedName("website")
	private String website;

	public void setWebsite(String website){
		this.website = website;
	}

	public String getWebsite(){
		return website;
	}
}