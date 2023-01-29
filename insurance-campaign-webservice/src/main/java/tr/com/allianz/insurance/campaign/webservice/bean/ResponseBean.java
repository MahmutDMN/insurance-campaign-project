package tr.com.allianz.insurance.campaign.webservice.bean;

public class ResponseBean {
    private String resultCode;
    private String resultMessage;

    public ResponseBean() {
    }

    public ResponseBean(String resultCode, String resultMessage) {
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }
}
