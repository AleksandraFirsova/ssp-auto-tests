package com.alsfirsova.domain.rest.generated;

import com.google.gson.annotations.SerializedName;

public class LivechatNotes{

	@SerializedName("profileLink")
	private String profileLink;

	@SerializedName("level")
	private String level;

	@SerializedName("segment")
	private String segment;

	@SerializedName("managerName")
	private String managerName;

	@SerializedName("verticals")
	private String verticals;

	public void setProfileLink(String profileLink){
		this.profileLink = profileLink;
	}

	public String getProfileLink(){
		return profileLink;
	}

	public void setLevel(String level){
		this.level = level;
	}

	public String getLevel(){
		return level;
	}

	public void setSegment(String segment){
		this.segment = segment;
	}

	public String getSegment(){
		return segment;
	}

	public void setManagerName(String managerName){
		this.managerName = managerName;
	}

	public String getManagerName(){
		return managerName;
	}

	public void setVerticals(String verticals){
		this.verticals = verticals;
	}

	public String getVerticals(){
		return verticals;
	}
}