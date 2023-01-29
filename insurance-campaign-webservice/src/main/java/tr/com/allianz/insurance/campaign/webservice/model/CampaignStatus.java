package tr.com.allianz.insurance.campaign.webservice.model;

public class CampaignStatus {
    private Long id;
    private String statusName;
    private String statusNameTr;

    public static final CampaignStatus PASSIVE = new CampaignStatus(0L, "Passive", "Pasif");
    public static final CampaignStatus ACTIVE = new CampaignStatus(1L, "Active", "Aktif");
    public static final CampaignStatus WAITING_FOR_APPROVAL = new CampaignStatus(2L, "Waiting For Approval", "Onay Bekliyor");

    public CampaignStatus() {
    }

    public CampaignStatus(Long id, String statusName, String statusNameTr) {
        this.id = id;
        this.statusName = statusName;
        this.statusNameTr = statusNameTr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusNameTr() {
        return statusNameTr;
    }

    public void setStatusNameTr(String statusNameTr) {
        this.statusNameTr = statusNameTr;
    }
}
