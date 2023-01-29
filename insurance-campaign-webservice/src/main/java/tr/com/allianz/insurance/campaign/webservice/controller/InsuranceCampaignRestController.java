package tr.com.allianz.insurance.campaign.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tr.com.allianz.insurance.campaign.webservice.bean.*;
import tr.com.allianz.insurance.campaign.webservice.webservice.InsuranceCampaignWebService;

import java.util.ArrayList;

@RestController
public class InsuranceCampaignRestController {

    @Autowired
    private final InsuranceCampaignWebService campaignWebService;

    public InsuranceCampaignRestController(InsuranceCampaignWebService campaignWebService) {
        this.campaignWebService = campaignWebService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/checkService")
    public ResponseBean checkService() {
        return new ResponseBean("00", "System Up");
    }


    @RequestMapping(method = RequestMethod.POST, value = "/getAllCampaign")
    public ArrayList<CampaignResponseBean> getAllCampaign() {
        ArrayList<CampaignResponseBean> resp = campaignWebService.getAllCampaign();
        return resp;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addCampaign")
    public ResponseBean addCampaign(@RequestBody CampaignRequestBean request) {
        try {
            checkCharacterSize(request.getCampaignHeader(), 10, 50, "campaignHeader(Kampanya Başlıgı)");
            checkCharacterSize(request.getCampaignDetail(), 50, 200, "campaignDetail(Kampanya Detayı)");

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseBean("99", e.getMessage());
        }
        return campaignWebService.addCampaign(request);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/changeCampaignStatus")
    public ResponseBean changeCampaignStatus(@RequestBody CampaignChangeStatusRequestBean request) {
        ResponseBean resp = campaignWebService.changeCampaignStatus(request);
        return resp;
    }


    @RequestMapping(method = RequestMethod.GET, value = "/dashboard/classifieds/statistics")
    public CampaignStatisticsResponseBean statistics() {
        CampaignStatisticsResponseBean resp = campaignWebService.getCampaignStatistics();
        return resp;
    }


    private void checkCharacterSize(String str, int minSize, int maxSize, String prefix) throws Exception {
        if (str != null) {
            if (str.length() < minSize || str.length() > maxSize) {
                throw new Exception("Girilen kampanya için " + prefix + "alanı " + "minimum :" + minSize + " karakter maksimum :" + maxSize + " karakter uzunlugunda olmalıdır.");
            }

        } else {
            throw new Exception("Eksik parametre gönderildi. Gerekli parametre : " + prefix);
        }
    }

}
