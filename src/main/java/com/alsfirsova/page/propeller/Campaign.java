package com.alsfirsova.page.propeller;

public class Campaign {
    private String urlCampaign;
    private String[] countriesCampaign;
    private String cpaCampaign;
    private String name;
    private PricingModel pricingModel;

    public Campaign(PricingModel pricingModel) {
        this.pricingModel = pricingModel;
    }

    public PricingModel getPricingModel() {
        return pricingModel;
    }

    public String getName() {
        return name;
    }

    public Campaign withName(String name) {
        this.name = name;
        return this;
    }

    public String getUrlCampaign() {
        return urlCampaign;
    }

    public Campaign withUrlCampaign(String urlCampaign) {
         this.urlCampaign = urlCampaign;
         return this;
    }

    public String[] getCountriesCampaign() {
        return countriesCampaign;
    }

    public Campaign withCountriesCampaign(String... countriesCampaign) {
        this.countriesCampaign = countriesCampaign;
        return this;
    }

    public String getCpaCampaign() {
        return cpaCampaign;
    }

    public Campaign withCpaCampaign(String cpaCampaign) {
         this.cpaCampaign = cpaCampaign;
         return this;
    }
}
