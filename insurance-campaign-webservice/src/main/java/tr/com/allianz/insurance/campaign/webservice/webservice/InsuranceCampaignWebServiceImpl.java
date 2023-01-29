package tr.com.allianz.insurance.campaign.webservice.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.allianz.insurance.campaign.webservice.bean.*;
import tr.com.allianz.insurance.campaign.webservice.service.InsuranceCampaignService;

import java.util.ArrayList;

@Service
public class InsuranceCampaignWebServiceImpl implements InsuranceCampaignWebService {

    private final InsuranceCampaignService insuranceCampaignService;

    @Autowired
    public InsuranceCampaignWebServiceImpl(InsuranceCampaignService insuranceCampaignService) {
        this.insuranceCampaignService = insuranceCampaignService;
    }


    @Override
    public ResponseBean addCampaign(CampaignRequestBean request) {
        return insuranceCampaignService.addCampaign(request.getCampaignHeader(), request.getCampaignDetail(), request.getCampaignCategory());
    }

    @Override
    public ArrayList<CampaignResponseBean> getAllCampaign() {
        return insuranceCampaignService.getAllCampaign();
    }

    @Override
    public ResponseBean changeCampaignStatus(CampaignChangeStatusRequestBean request) {
        return insuranceCampaignService.changeCampaignStatus(request.getCampaignId(), request.getCampaignStatusName());
    }

    @Override
    public CampaignStatisticsResponseBean getCampaignStatistics() {
        return insuranceCampaignService.getCampaignStatistics();
    }
}
