package com.alsfirsova.domain.rest.generated;

import com.google.gson.annotations.SerializedName;

public class PaymentTypesAmount{

	@SerializedName("paymaster24WmzCz")
	private Paymaster24WmzCz paymaster24WmzCz;

	@SerializedName("safeChargeUsdCz")
	private SafeChargeUsdCz safeChargeUsdCz;

	@SerializedName("safeChargeYandexMoneyCz")
	private SafeChargeYandexMoneyCz safeChargeYandexMoneyCz;

	public void setPaymaster24WmzCz(Paymaster24WmzCz paymaster24WmzCz){
		this.paymaster24WmzCz = paymaster24WmzCz;
	}

	public Paymaster24WmzCz getPaymaster24WmzCz(){
		return paymaster24WmzCz;
	}

	public void setSafeChargeUsdCz(SafeChargeUsdCz safeChargeUsdCz){
		this.safeChargeUsdCz = safeChargeUsdCz;
	}

	public SafeChargeUsdCz getSafeChargeUsdCz(){
		return safeChargeUsdCz;
	}

	public void setSafeChargeYandexMoneyCz(SafeChargeYandexMoneyCz safeChargeYandexMoneyCz){
		this.safeChargeYandexMoneyCz = safeChargeYandexMoneyCz;
	}

	public SafeChargeYandexMoneyCz getSafeChargeYandexMoneyCz(){
		return safeChargeYandexMoneyCz;
	}
}