package com.alsfirsova.domain.rest.generated;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class ResponseEntity {

	@SerializedName("contactInfo")
	private ContactInfo contactInfo;

	@SerializedName("level")
	private String level;

	@SerializedName("statusAdserving")
	private Object statusAdserving;

	@SerializedName("roles")
	private List<String> roles;

	@SerializedName("accountType")
	private Integer accountType;

	@SerializedName("targetings")
	private Targetings targetings;

	@SerializedName("banMessage")
	private Object banMessage;

	@SerializedName("login")
	private String login;

	@SerializedName(value = "token", alternate = "accessToken")
	private String accessToken;

	@SerializedName("legalInfo")
	private LegalInfo legalInfo;

	@SerializedName("meta")
	private Meta meta;

	@SerializedName("id")
	private Integer id;

	@SerializedName("livechatNotes")
	private LivechatNotes livechatNotes;

	@SerializedName("tokenType")
	private String tokenType;

	@SerializedName("email")
	private String email;

	private static transient Gson gson = new Gson();



	public void setContactInfo(ContactInfo contactInfo){
		this.contactInfo = contactInfo;
	}

	public ContactInfo getContactInfo(){
		return contactInfo;
	}

	public void setLevel(String level){
		this.level = level;
	}

	public String getLevel(){
		return level;
	}

	public void setStatusAdserving(Object statusAdserving){
		this.statusAdserving = statusAdserving;
	}

	public Object getStatusAdserving(){
		return statusAdserving;
	}

	public void setRoles(List<String> roles){
		this.roles = roles;
	}

	public List<String> getRoles(){
		return roles;
	}

	public void setAccountType(Integer accountType){
		this.accountType = accountType;
	}

	public Integer getAccountType(){
		return accountType;
	}

	public void setTargetings(Targetings targetings){
		this.targetings = targetings;
	}

	public Targetings getTargetings(){
		return targetings;
	}

	public void setBanMessage(Object banMessage){
		this.banMessage = banMessage;
	}

	public Object getBanMessage(){
		return banMessage;
	}

	public void setLogin(String login){
		this.login = login;
	}

	public String getLogin(){
		return login;
	}

	public void setAccessToken(String accessToken){
		this.accessToken = accessToken;
	}

	public String getAccessToken(){
		return accessToken;
	}

	public void setLegalInfo(LegalInfo legalInfo){
		this.legalInfo = legalInfo;
	}

	public LegalInfo getLegalInfo(){
		return legalInfo;
	}

	public void setMeta(Meta meta){
		this.meta = meta;
	}

	public Meta getMeta(){
		return meta;
	}

	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return id;
	}

	public void setLivechatNotes(LivechatNotes livechatNotes){
		this.livechatNotes = livechatNotes;
	}

	public LivechatNotes getLivechatNotes(){
		return livechatNotes;
	}

	public void setTokenType(String tokenType){
		this.tokenType = tokenType;
	}

	public String getTokenType(){
		return tokenType;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public static ResponseEntity fromJson(String json) {
		return gson.fromJson(json, ResponseEntity.class);
	}

	public String toJson() {
		return gson.toJson(this);
	}


}