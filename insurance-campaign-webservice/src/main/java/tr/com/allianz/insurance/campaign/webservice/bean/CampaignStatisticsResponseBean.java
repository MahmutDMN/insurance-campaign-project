package tr.com.allianz.insurance.campaign.webservice.bean;

public class CampaignStatisticsResponseBean {
    private int passiveCampaign;
    private int activeCampaign;
    private int waitingForApproval;

    public CampaignStatisticsResponseBean(int passiveCampaign, int activeCampaign, int waitingForApproval) {
        this.passiveCampaign = passiveCampaign;
        this.activeCampaign = activeCampaign;
        this.waitingForApproval = waitingForApproval;
    }

    public int getPassiveCampaign() {
        return passiveCampaign;
    }

    public void setPassiveCampaign(int passiveCampaign) {
        this.passiveCampaign = passiveCampaign;
    }

    public int getActiveCampaign() {
        return activeCampaign;
    }

    public void setActiveCampaign(int activeCampaign) {
        this.activeCampaign = activeCampaign;
    }

    public int getWaitingForApproval() {
        return waitingForApproval;
    }

    public void setWaitingForApproval(int waitingForApproval) {
        this.waitingForApproval = waitingForApproval;
    }
}
