package tr.com.allianz.insurance.campaign.webservice.util;

import tr.com.allianz.insurance.campaign.webservice.model.CampaignCategory;
import tr.com.allianz.insurance.campaign.webservice.model.CampaignStatus;

import static tr.com.allianz.insurance.campaign.webservice.model.CampaignCategory.*;

public class Util {
    public static CampaignCategory getCampaignCategoryByCampaignCatagoryName(String campaignName) {

        if (TAMAMLAYICI_SAGLIK_SIGORTASI.getName().equals(campaignName)) {
            return TAMAMLAYICI_SAGLIK_SIGORTASI;

        } else if (OZEL_SAGLIK_SIGORTASI.getName().equals(campaignName)) {
            return OZEL_SAGLIK_SIGORTASI;

        } else if (HAYAT_SIGORTASI.getName().equals(campaignName)) {
            return HAYAT_SIGORTASI;

        } else if (DIGER.getName().equals(campaignName)) {
            return DIGER;

        } else {
            throw new IllegalArgumentException("There is no matching campaignName for campaignName:"+campaignName+" .");
        }
    }

    public static CampaignCategory getCampaignCategoryByCampaignCategoryId(Long campaignCategoryId) {
        if (campaignCategoryId.equals(TAMAMLAYICI_SAGLIK_SIGORTASI.getId())) {
            return TAMAMLAYICI_SAGLIK_SIGORTASI;

        } else if (campaignCategoryId.equals(OZEL_SAGLIK_SIGORTASI.getId())) {
            return OZEL_SAGLIK_SIGORTASI;

        } else if (campaignCategoryId.equals(HAYAT_SIGORTASI.getId())) {
            return HAYAT_SIGORTASI;

        } else if (campaignCategoryId.equals(DIGER.getId())) {
            return DIGER;

        } else {
            throw new IllegalArgumentException("There is no matching for campaignCategoryId:"+campaignCategoryId+" .");
        }

    }

    public static CampaignStatus getFirstStatusByCampaignCategoryId(Long campaignCategoryId){
        if (campaignCategoryId.equals(TAMAMLAYICI_SAGLIK_SIGORTASI.getId())) {
            return CampaignStatus.WAITING_FOR_APPROVAL;

        } else if (campaignCategoryId.equals(OZEL_SAGLIK_SIGORTASI.getId())) {
            return CampaignStatus.WAITING_FOR_APPROVAL;

        } else if (campaignCategoryId.equals(HAYAT_SIGORTASI.getId())) {
            return CampaignStatus.ACTIVE;

        } else if (campaignCategoryId.equals(DIGER.getId())) {
            return CampaignStatus.WAITING_FOR_APPROVAL;

        } else {
            throw new IllegalArgumentException("There is no matching for campaignCategoryId:"+campaignCategoryId+" .");
        }

    }

    public static CampaignStatus getCampaignStatusByCampaignStatusName(String campaignStatusName) {

        if (CampaignStatus.PASSIVE.getStatusNameTr().equals(campaignStatusName)) {
            return CampaignStatus.PASSIVE;

        } else if (CampaignStatus.ACTIVE.getStatusNameTr().equals(campaignStatusName)) {
            return CampaignStatus.ACTIVE;

        } else if (CampaignStatus.WAITING_FOR_APPROVAL.getStatusNameTr().equals(campaignStatusName)) {
            return CampaignStatus.WAITING_FOR_APPROVAL;

        } else {
            throw new IllegalArgumentException("There is no matching campaignStatus for campaignStatusName:"+campaignStatusName+" .");
        }
    }


    public static CampaignStatus getCampaignStatusByCampaignStatusId(Long campaignStatusId){
        if (campaignStatusId.equals(CampaignStatus.PASSIVE.getId())) {
            return CampaignStatus.PASSIVE;

        } else if (campaignStatusId.equals(CampaignStatus.ACTIVE.getId())) {
            return CampaignStatus.ACTIVE;

        } else if (campaignStatusId.equals(CampaignStatus.WAITING_FOR_APPROVAL.getId())) {
            return CampaignStatus.WAITING_FOR_APPROVAL;

        } else {
            throw new IllegalArgumentException("There is no matching for campaignStatusId:"+campaignStatusId+" .");
        }

    }

}
