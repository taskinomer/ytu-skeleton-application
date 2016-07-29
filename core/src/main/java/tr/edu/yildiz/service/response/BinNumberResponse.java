package tr.edu.yildiz.service.response;

public class BinNumberResponse {

    private boolean succeed = false;
    private String message;

    public boolean isSucceed() {
        return succeed;
    }

    public void setSucceed(boolean succeed) {
        this.succeed = succeed;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
