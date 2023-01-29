package tr.com.allianz.insurance.campaign.webservice.service;

import org.springframework.stereotype.Service;
import tr.com.allianz.insurance.campaign.webservice.bean.*;
import tr.com.allianz.insurance.campaign.webservice.model.Campaign;
import tr.com.allianz.insurance.campaign.webservice.model.CampaignCategory;
import tr.com.allianz.insurance.campaign.webservice.model.CampaignStatus;
import tr.com.allianz.insurance.campaign.webservice.util.Util;

import java.util.ArrayList;

@Service
public class InsuranceCampaignServiceImpl implements InsuranceCampaignService {

    public ArrayList<Campaign> campaignList;

    public InsuranceCampaignServiceImpl() {
        this.campaignList = getCampaign();
    }


    @Override
    public ResponseBean addCampaign(String campaignHeader, String campaignDetail, String campaignCategoryName) {
        try {
            CampaignCategory campaignCategory=Util.getCampaignCategoryByCampaignCatagoryName(campaignCategoryName);
            checkAddCampaignHeader(campaignHeader);
            checkAddCampaignDetail(campaignDetail);

            CampaignStatus campaignStatus=Util.getFirstStatusByCampaignCategoryId(campaignCategory.getId());

            this.campaignList.add(new Campaign(generateCampaignNextId(), campaignHeader,campaignDetail,campaignCategory, campaignStatus));

        }catch (Exception e){
            return new ResponseBean("99",e.getMessage());
        }
        return new ResponseBean("00","SUCCESS");
    }

    private Long generateCampaignNextId() {
        Long nextId=1L;
        for (Campaign c:this.campaignList) {
            if(c.getCampaignId() > nextId){
                nextId=c.getCampaignId();
            }
        }
        return nextId;
    }

    @Override
    public ArrayList<CampaignResponseBean> getAllCampaign() {
        ArrayList<CampaignResponseBean> resp = new ArrayList<CampaignResponseBean>();
        try {
            for (Campaign campaign: campaignList ) {
                CampaignResponseBean bean=new CampaignResponseBean();

                bean.setCampaignId(campaign.getCampaignId());
                bean.setCampaignHeader(campaign.getCampaignHeader());
                bean.setCampaignDetail(campaign.getCampaignDetail());
                bean.setCampaignCategoryName(campaign.getCampaignCategory().getName());
                bean.setCampaignStatus(campaign.getCampaignStatus().getStatusNameTr());

                resp.add(bean);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return resp;
    }

    @Override
    public ResponseBean changeCampaignStatus(Long campaignId, String campaignStatusName) {
        try {
            boolean isFound=false;
            CampaignStatus newStatus = Util.getCampaignStatusByCampaignStatusName(campaignStatusName);
            for (int i = 0; i < this.campaignList.size(); i++) {
                Campaign c =campaignList.get(i);
                if(c.getCampaignId().equals(campaignId)){
                    isFound=true;
                    c.setCampaignStatus(newStatus);
                    campaignList.set(i,c);
                    break;
                }

            }
            if(!isFound){
                throw new Exception("Kampanya durumu degiştirilemedi.");
            }

        }catch (Exception e){
            return new ResponseBean("99",e.getMessage());
        }

        return new ResponseBean("00","SUCCESS");
    }

    @Override
    public CampaignStatisticsResponseBean getCampaignStatistics() {
        int passiveSize=0;
        int activeSize=0;
        int waitForApprovalSize=0;
        for (Campaign c : this.campaignList ) {
            if (c.getCampaignStatus().getId().equals(CampaignStatus.PASSIVE.getId())){
                passiveSize+=1;
            }
            if (c.getCampaignStatus().getId().equals(CampaignStatus.ACTIVE.getId())){
                activeSize+=1;
            }
            if (c.getCampaignStatus().getId().equals(CampaignStatus.WAITING_FOR_APPROVAL.getId())){
                waitForApprovalSize+=1;
            }

        }

        return new CampaignStatisticsResponseBean(passiveSize,activeSize,waitForApprovalSize);

    }


    private void checkAddCampaignHeader (String campaignHeader) throws Exception {

        for (Campaign campaign : this.campaignList) {
            if(campaign.getCampaignHeader().equals(campaignHeader)){
                throw new Exception("Bu kampanya adı zaten bulunmaktadır.");
            };

        }
    }

    private void checkAddCampaignDetail (String campaignDetail) throws Exception {
        for (Campaign campaign : this.campaignList) {
            if(campaign.getCampaignHeader().equals(campaignDetail)){
                throw new Exception("Bu kampanya detayı zaten bulunmaktadır.");
            };
        }

    }

    private ArrayList<Campaign> getCampaign(){
        ArrayList<Campaign> lst=new ArrayList<Campaign>();
        lst.add(new Campaign(1L,"Tamamlayıcı saglık sigortası 1 header","Tamamlayıcı saglık sigortası 1 detail", Util.getCampaignCategoryByCampaignCategoryId(1L), CampaignStatus.PASSIVE));
        lst.add(new Campaign(2L,"Özel Sağlık Sigortası 1 header","Tamamlayıcı saglık sigortası 1 detail",Util.getCampaignCategoryByCampaignCategoryId(2L),CampaignStatus.WAITING_FOR_APPROVAL));
        lst.add(new Campaign(3L,"Hayat Sigortası 1 header","Tamamlayıcı saglık sigortası 1 detail",Util.getCampaignCategoryByCampaignCategoryId(3L),CampaignStatus.ACTIVE));
        lst.add(new Campaign(4L,"Diger 1 header","Tamamlayıcı saglık sigortası 1 detail",Util.getCampaignCategoryByCampaignCategoryId(4L),CampaignStatus.ACTIVE));
        return lst;
    }
}
