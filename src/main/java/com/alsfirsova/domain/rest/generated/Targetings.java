package com.alsfirsova.domain.rest.generated;

import com.google.gson.annotations.SerializedName;

public class Targetings{

	@SerializedName("limitStartingSspCampaigns")
	private Boolean limitStartingSspCampaigns;

	@SerializedName("scpaNativeads")
	private Boolean scpaNativeads;

	@SerializedName("campaignTargetingIp")
	private Boolean campaignTargetingIp;

	@SerializedName("advertiserSmsNotifications")
	private Boolean advertiserSmsNotifications;

	@SerializedName("fullStoryOn")
	private Boolean fullStoryOn;

	@SerializedName("frequencyCappingAvailability")
	private Boolean frequencyCappingAvailability;

	@SerializedName("advertiserCampaignOffer")
	private Boolean advertiserCampaignOffer;

	@SerializedName("smartCpaOnclick")
	private Boolean smartCpaOnclick;

	@SerializedName("campaignTestBudget")
	private Boolean campaignTestBudget;

	public void setLimitStartingSspCampaigns(Boolean limitStartingSspCampaigns){
		this.limitStartingSspCampaigns = limitStartingSspCampaigns;
	}

	public boolean isLimitStartingSspCampaigns(){
		return limitStartingSspCampaigns;
	}

	public void setScpaNativeads(Boolean scpaNativeads){
		this.scpaNativeads = scpaNativeads;
	}

	public boolean isScpaNativeads(){
		return scpaNativeads;
	}

	public void setCampaignTargetingIp(Boolean campaignTargetingIp){
		this.campaignTargetingIp = campaignTargetingIp;
	}

	public boolean isCampaignTargetingIp(){
		return campaignTargetingIp;
	}

	public void setAdvertiserSmsNotifications(Boolean advertiserSmsNotifications){
		this.advertiserSmsNotifications = advertiserSmsNotifications;
	}

	public boolean isAdvertiserSmsNotifications(){
		return advertiserSmsNotifications;
	}

	public void setFullStoryOn(Boolean fullStoryOn){
		this.fullStoryOn = fullStoryOn;
	}

	public boolean isFullStoryOn(){
		return fullStoryOn;
	}

	public void setFrequencyCappingAvailability(Boolean frequencyCappingAvailability){
		this.frequencyCappingAvailability = frequencyCappingAvailability;
	}

	public boolean isFrequencyCappingAvailability(){
		return frequencyCappingAvailability;
	}

	public void setAdvertiserCampaignOffer(Boolean advertiserCampaignOffer){
		this.advertiserCampaignOffer = advertiserCampaignOffer;
	}

	public boolean isAdvertiserCampaignOffer(){
		return advertiserCampaignOffer;
	}

	public void setSmartCpaOnclick(Boolean smartCpaOnclick){
		this.smartCpaOnclick = smartCpaOnclick;
	}

	public boolean isSmartCpaOnclick(){
		return smartCpaOnclick;
	}

	public void setCampaignTestBudget(Boolean campaignTestBudget){
		this.campaignTestBudget = campaignTestBudget;
	}

	public boolean isCampaignTestBudget(){
		return campaignTestBudget;
	}
}