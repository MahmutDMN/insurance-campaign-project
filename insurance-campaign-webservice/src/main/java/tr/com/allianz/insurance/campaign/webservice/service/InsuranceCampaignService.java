package tr.com.allianz.insurance.campaign.webservice.service;

import tr.com.allianz.insurance.campaign.webservice.bean.CampaignResponseBean;
import tr.com.allianz.insurance.campaign.webservice.bean.CampaignStatisticsResponseBean;
import tr.com.allianz.insurance.campaign.webservice.bean.ResponseBean;

import java.util.ArrayList;

public interface InsuranceCampaignService {
    ResponseBean addCampaign(String campaignHeader, String campaignDetail, String campaignCategory);
    ArrayList<CampaignResponseBean> getAllCampaign();
    ResponseBean changeCampaignStatus(Long campaignId, String campaignStatusName);
    CampaignStatisticsResponseBean getCampaignStatistics();
}
