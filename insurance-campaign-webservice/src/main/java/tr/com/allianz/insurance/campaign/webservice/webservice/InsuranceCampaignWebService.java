package tr.com.allianz.insurance.campaign.webservice.webservice;

import tr.com.allianz.insurance.campaign.webservice.bean.*;

import java.util.ArrayList;

public interface InsuranceCampaignWebService {
    ResponseBean addCampaign(CampaignRequestBean campaignRequestBean);
    ArrayList<CampaignResponseBean> getAllCampaign();
    ResponseBean changeCampaignStatus(CampaignChangeStatusRequestBean request);
    CampaignStatisticsResponseBean getCampaignStatistics();

}
