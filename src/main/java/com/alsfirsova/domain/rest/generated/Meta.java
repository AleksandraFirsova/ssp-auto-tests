package com.alsfirsova.domain.rest.generated;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Meta{

	@SerializedName("recurringPaymentAmount")
	private String recurringPaymentAmount;

	@SerializedName("whoisRequired")
	private Boolean whoisRequired;

	@SerializedName("paymentTypesAmount")
	private PaymentTypesAmount paymentTypesAmount;

	@SerializedName("recurringPaymentStatus")
	private Integer recurringPaymentStatus;

	@SerializedName("customSspCampaignStartingLimit")
	private Boolean customSspCampaignStartingLimit;

	@SerializedName("isCloneWithFrequencyCappingPopupClosed")
	private Boolean isCloneWithFrequencyCappingPopupClosed;

	@SerializedName("language")
	private String language;

	@SerializedName("acceptedApiTerms")
	private Integer acceptedApiTerms;

	@SerializedName("acceptedOldTerms")
	private Boolean acceptedOldTerms;

	@SerializedName("isLivechatAvailable")
	private Boolean isLivechatAvailable;

	@SerializedName("isCpcOverflowPopupClosed")
	private Boolean isCpcOverflowPopupClosed;

	@SerializedName("recurringPaymentThreshold")
	private String recurringPaymentThreshold;

	@SerializedName("isSspApiAvailable")
	private Boolean isSspApiAvailable;

	@SerializedName("showQualitySurvey")
	private Boolean showQualitySurvey;

	@SerializedName("isArchivePopupClosed")
	private Boolean isArchivePopupClosed;

	@SerializedName("languageLastUpdate")
	private Integer languageLastUpdate;

	@SerializedName("acceptedNewTerms")
	private Boolean acceptedNewTerms;

	@SerializedName("campaignListHiddenColumns")
	private List<Object> campaignListHiddenColumns;

	@SerializedName("isRuCzTermsAccepted")
	private Boolean isRuCzTermsAccepted;

	public void setRecurringPaymentAmount(String recurringPaymentAmount){
		this.recurringPaymentAmount = recurringPaymentAmount;
	}

	public String getRecurringPaymentAmount(){
		return recurringPaymentAmount;
	}

	public void setWhoisRequired(Boolean whoisRequired){
		this.whoisRequired = whoisRequired;
	}

	public boolean isWhoisRequired(){
		return whoisRequired;
	}

	public void setPaymentTypesAmount(PaymentTypesAmount paymentTypesAmount){
		this.paymentTypesAmount = paymentTypesAmount;
	}

	public PaymentTypesAmount getPaymentTypesAmount(){
		return paymentTypesAmount;
	}

	public void setRecurringPaymentStatus(Integer recurringPaymentStatus){
		this.recurringPaymentStatus = recurringPaymentStatus;
	}

	public Integer getRecurringPaymentStatus(){
		return recurringPaymentStatus;
	}

	public void setCustomSspCampaignStartingLimit(Boolean customSspCampaignStartingLimit){
		this.customSspCampaignStartingLimit = customSspCampaignStartingLimit;
	}

	public boolean isCustomSspCampaignStartingLimit(){
		return customSspCampaignStartingLimit;
	}

	public void setIsCloneWithFrequencyCappingPopupClosed(Boolean isCloneWithFrequencyCappingPopupClosed){
		this.isCloneWithFrequencyCappingPopupClosed = isCloneWithFrequencyCappingPopupClosed;
	}

	public boolean isIsCloneWithFrequencyCappingPopupClosed(){
		return isCloneWithFrequencyCappingPopupClosed;
	}

	public void setLanguage(String language){
		this.language = language;
	}

	public String getLanguage(){
		return language;
	}

	public void setAcceptedApiTerms(Integer acceptedApiTerms){
		this.acceptedApiTerms = acceptedApiTerms;
	}

	public Integer getAcceptedApiTerms(){
		return acceptedApiTerms;
	}

	public void setAcceptedOldTerms(Boolean acceptedOldTerms){
		this.acceptedOldTerms = acceptedOldTerms;
	}

	public boolean isAcceptedOldTerms(){
		return acceptedOldTerms;
	}

	public void setIsLivechatAvailable(Boolean isLivechatAvailable){
		this.isLivechatAvailable = isLivechatAvailable;
	}

	public boolean isIsLivechatAvailable(){
		return isLivechatAvailable;
	}

	public void setIsCpcOverflowPopupClosed(Boolean isCpcOverflowPopupClosed){
		this.isCpcOverflowPopupClosed = isCpcOverflowPopupClosed;
	}

	public boolean isIsCpcOverflowPopupClosed(){
		return isCpcOverflowPopupClosed;
	}

	public void setRecurringPaymentThreshold(String recurringPaymentThreshold){
		this.recurringPaymentThreshold = recurringPaymentThreshold;
	}

	public String getRecurringPaymentThreshold(){
		return recurringPaymentThreshold;
	}

	public void setIsSspApiAvailable(Boolean isSspApiAvailable){
		this.isSspApiAvailable = isSspApiAvailable;
	}

	public boolean isIsSspApiAvailable(){
		return isSspApiAvailable;
	}

	public void setShowQualitySurvey(Boolean showQualitySurvey){
		this.showQualitySurvey = showQualitySurvey;
	}

	public boolean isShowQualitySurvey(){
		return showQualitySurvey;
	}

	public void setIsArchivePopupClosed(Boolean isArchivePopupClosed){
		this.isArchivePopupClosed = isArchivePopupClosed;
	}

	public boolean isIsArchivePopupClosed(){
		return isArchivePopupClosed;
	}

	public void setLanguageLastUpdate(Integer languageLastUpdate){
		this.languageLastUpdate = languageLastUpdate;
	}

	public Integer getLanguageLastUpdate(){
		return languageLastUpdate;
	}

	public void setAcceptedNewTerms(Boolean acceptedNewTerms){
		this.acceptedNewTerms = acceptedNewTerms;
	}

	public boolean isAcceptedNewTerms(){
		return acceptedNewTerms;
	}

	public void setCampaignListHiddenColumns(List<Object> campaignListHiddenColumns){
		this.campaignListHiddenColumns = campaignListHiddenColumns;
	}

	public List<Object> getCampaignListHiddenColumns(){
		return campaignListHiddenColumns;
	}

	public void setIsRuCzTermsAccepted(Boolean isRuCzTermsAccepted){
		this.isRuCzTermsAccepted = isRuCzTermsAccepted;
	}

	public boolean isIsRuCzTermsAccepted(){
		return isRuCzTermsAccepted;
	}
}