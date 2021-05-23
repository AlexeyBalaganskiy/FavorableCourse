package alexb.favorablecourse.domain.model.alfa;

public class Alfa {

    private String mCurrency;
    private String mPrise;
    private String mType;

    public Alfa(String currency, String prise, String type) {
        mCurrency = currency;
        mPrise = prise;
        mType = type;
    }

    public String getCurrency() {
        return mCurrency;
    }

    public void setCurrency(String currency) {
        mCurrency = currency;
    }

    public String getPrise() {
        return mPrise;
    }

    public void setPrise(String prise) {
        mPrise = prise;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }
}
