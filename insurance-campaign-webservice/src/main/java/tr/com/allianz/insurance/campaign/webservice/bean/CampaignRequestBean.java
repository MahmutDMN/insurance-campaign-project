package tr.com.allianz.insurance.campaign.webservice.bean;

public class CampaignRequestBean {
    private String campaignHeader;
    private String campaignDetail;
    private String campaignCategory;

    public CampaignRequestBean() {
    }

    public CampaignRequestBean(String campaignHeader, String campaignDetail, String campaignCategory) {
        this.campaignHeader = campaignHeader;
        this.campaignDetail = campaignDetail;
        this.campaignCategory = campaignCategory;
    }

    public String getCampaignHeader() {
        return campaignHeader;
    }

    public void setCampaignHeader(String campaignHeader) {
        this.campaignHeader = campaignHeader;
    }

    public String getCampaignDetail() {
        return campaignDetail;
    }

    public void setCampaignDetail(String campaignDetail) {
        this.campaignDetail = campaignDetail;
    }

    public String getCampaignCategory() {
        return campaignCategory;
    }

    public void setCampaignCategory(String campaignCategory) {
        this.campaignCategory = campaignCategory;
    }
}
