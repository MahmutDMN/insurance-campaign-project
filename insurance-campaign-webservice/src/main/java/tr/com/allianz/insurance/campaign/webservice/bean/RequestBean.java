package tr.com.allianz.insurance.campaign.webservice.bean;

public class RequestBean {
    private String id;
    private String message;

    public RequestBean() {
    }

    public RequestBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
