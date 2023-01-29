package tr.com.allianz.insurance.campaign.webservice.model;

public class Campaign {
    private Long campaignId;
    private String campaignHeader;
    private String campaignDetail;
    private CampaignCategory campaignCategory;
    private CampaignStatus campaignStatus;

    public Campaign() {
    }


    public Campaign(Long campaignId, String campaignHeader, String campaignDetail, CampaignCategory campaignCategory, CampaignStatus campaignStatus) {
        this.campaignId = campaignId;
        this.campaignHeader = campaignHeader;
        this.campaignDetail = campaignDetail;
        this.campaignCategory = campaignCategory;
        this.campaignStatus = campaignStatus;
    }

    public Long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
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

    public CampaignCategory getCampaignCategory() {
        return campaignCategory;
    }

    public void setCampaignCategory(CampaignCategory campaignCategory) {
        this.campaignCategory = campaignCategory;
    }

    public CampaignStatus getCampaignStatus() {
        return campaignStatus;
    }

    public void setCampaignStatus(CampaignStatus campaignStatus) {
        this.campaignStatus = campaignStatus;
    }
}
