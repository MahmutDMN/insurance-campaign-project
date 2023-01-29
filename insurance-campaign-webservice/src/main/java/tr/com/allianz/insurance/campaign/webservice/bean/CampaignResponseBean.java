package tr.com.allianz.insurance.campaign.webservice.bean;

public class CampaignResponseBean {
    private Long campaignId;
    private String campaignHeader;
    private String campaignDetail;
    private String campaignCategoryName;
    private String campaignStatus;

    public CampaignResponseBean() {
    }

    public CampaignResponseBean(Long campaignId, String campaignHeader, String campaignDetail, String campaignCategoryName) {
        this.campaignId = campaignId;
        this.campaignHeader = campaignHeader;
        this.campaignDetail = campaignDetail;
        this.campaignCategoryName = campaignCategoryName;
    }

    public CampaignResponseBean(Long campaignId, String campaignHeader, String campaignDetail, String campaignCategoryName, String campaignStatus) {
        this.campaignId = campaignId;
        this.campaignHeader = campaignHeader;
        this.campaignDetail = campaignDetail;
        this.campaignCategoryName = campaignCategoryName;
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

    public String getCampaignCategoryName() {
        return campaignCategoryName;
    }

    public void setCampaignCategoryName(String campaignCategoryName) {
        this.campaignCategoryName = campaignCategoryName;
    }

    public String getCampaignStatus() {
        return campaignStatus;
    }

    public void setCampaignStatus(String campaignStatus) {
        this.campaignStatus = campaignStatus;
    }
}
