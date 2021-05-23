package alexb.favorablecourse.domain.model;

public class BaseModelCurrency {

    private double mBuyRate;
    private double mSaleRate;
    private String mCurrency;
    private String mFullNameCurrency;
    private String mCodeCurrency;
    private String mBank;

    public BaseModelCurrency(double buyRate, double saleRate, String currency, String fullNameCurrency, String codeCurrency, String bank) {
        mBuyRate = buyRate;
        mSaleRate = saleRate;
        mCurrency = currency;
        mFullNameCurrency = fullNameCurrency;
        mCodeCurrency = codeCurrency;
        mBank = bank;
    }

    public String getBank() {
        return mBank;
    }

    public void setBank(String bank) {
        mBank = bank;
    }

    public double getBuyRate() {
        return mBuyRate;
    }

    public void setBuyRate(double buyRate) {
        mBuyRate = buyRate;
    }

    public double getSaleRate() {
        return mSaleRate;
    }

    public void setSaleRate(double saleRate) {
        mSaleRate = saleRate;
    }

    public String getCurrency() {
        return mCurrency;
    }

    public void setCurrency(String currency) {
        mCurrency = currency;
    }

    public String getFullNameCurrency() {
        return mFullNameCurrency;
    }

    public void setFullNameCurrency(String fullNameCurrency) {
        mFullNameCurrency = fullNameCurrency;
    }

    public String getCodeCurrency() {
        return mCodeCurrency;
    }

    public void setCodeCurrency(String codeCurrency) {
        mCodeCurrency = codeCurrency;
    }
}
