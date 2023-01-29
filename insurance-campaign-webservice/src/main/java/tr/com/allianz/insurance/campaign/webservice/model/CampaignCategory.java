package tr.com.allianz.insurance.campaign.webservice.model;

public class CampaignCategory {
    private Long id;
    private String name;
    private String shortName;

    public static final CampaignCategory TAMAMLAYICI_SAGLIK_SIGORTASI = new CampaignCategory(1L, "Tamamlayıcı Sağlık Sigortası", "TSS");
    public static final CampaignCategory OZEL_SAGLIK_SIGORTASI = new CampaignCategory(2L, "Özel Sağlık Sigortası", "ÖSS");
    public static final CampaignCategory HAYAT_SIGORTASI = new CampaignCategory(3L, "Hayat Sigortası", "HS");
    public static final CampaignCategory DIGER = new CampaignCategory(4L, "Diger", "-");


    public CampaignCategory() {
    }

    public CampaignCategory(Long id, String name, String shortName) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
}
