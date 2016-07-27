package tr.edu.yildiz.service.request;

public class BinNumberSaveRequest {

    private String bin;
    private Integer cardFamilyId;

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public Integer getCardFamilyId() {
        return cardFamilyId;
    }

    public void setCardFamilyId(Integer cardFamilyId) {
        this.cardFamilyId = cardFamilyId;
    }
}
