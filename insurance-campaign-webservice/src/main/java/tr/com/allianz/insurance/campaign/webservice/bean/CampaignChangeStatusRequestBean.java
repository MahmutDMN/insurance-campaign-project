package tr.com.allianz.insurance.campaign.webservice.bean;

public class CampaignChangeStatusRequestBean {
    private Long campaignId;
    private String campaignStatusName;

    public CampaignChangeStatusRequestBean() {
    }

    public Long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public String getCampaignStatusName() {
        return campaignStatusName;
    }

    public void setCampaignStatusName(String campaignStatusName) {
        this.campaignStatusName = campaignStatusName;
    }
}
