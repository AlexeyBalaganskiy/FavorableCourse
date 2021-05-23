package alexb.favorablecourse.domain.model.vtb;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MoneyRate {

    @JsonProperty("MinAmount")
    private int mMinAmount;
    @JsonProperty("FromCurrencyCount")
    private int mFromCurrencyCount;
    @JsonProperty("NodeDescription")
    private String mNodeDescription;
    @JsonProperty("StartDate")
    private String mStartDate;
    @JsonProperty("FromCurrency")
    private FromCurrency mFromCurrency;
    @JsonProperty("ToCurrency")
    private ToCurrency mToCurrency;
    @JsonProperty("BankSellAt")
    private double mBankSellAt;
    @JsonProperty("BankBuyAt")
    private double mBankBuyAt;
    @JsonProperty("CbRate")
    private double mCbRate;
    @JsonProperty("IsBankSellAtRaised")
    private boolean mIsBankSellAtRaised;
    @JsonProperty("IsBankBuyAtRaised")
    private boolean mIsBankBuyAtRaised;

    public int getMinAmount() {
        return mMinAmount;
    }

    public void setMinAmount(int minAmount) {
        mMinAmount = minAmount;
    }

    public int getFromCurrencyCount() {
        return mFromCurrencyCount;
    }

    public void setFromCurrencyCount(int fromCurrencyCount) {
        mFromCurrencyCount = fromCurrencyCount;
    }

    public String getNodeDescription() {
        return mNodeDescription;
    }

    public void setNodeDescription(String nodeDescription) {
        mNodeDescription = nodeDescription;
    }

    public String getStartDate() {
        return mStartDate;
    }

    public void setStartDate(String startDate) {
        mStartDate = startDate;
    }

    public FromCurrency getFromCurrency() {
        return mFromCurrency;
    }

    public void setFromCurrency(FromCurrency fromCurrency) {
        mFromCurrency = fromCurrency;
    }

    public ToCurrency getToCurrency() {
        return mToCurrency;
    }

    public void setToCurrency(ToCurrency toCurrency) {
        mToCurrency = toCurrency;
    }

    public double getBankSellAt() {
        return mBankSellAt;
    }

    public void setBankSellAt(double bankSellAt) {
        mBankSellAt = bankSellAt;
    }

    public double getBankBuyAt() {
        return mBankBuyAt;
    }

    public void setBankBuyAt(double bankBuyAt) {
        mBankBuyAt = bankBuyAt;
    }

    public double getCbRate() {
        return mCbRate;
    }

    public void setCbRate(double cbRate) {
        mCbRate = cbRate;
    }

    public boolean isBankSellAtRaised() {
        return mIsBankSellAtRaised;
    }

    public void setBankSellAtRaised(boolean bankSellAtRaised) {
        mIsBankSellAtRaised = bankSellAtRaised;
    }

    public boolean isBankBuyAtRaised() {
        return mIsBankBuyAtRaised;
    }

    public void setBankBuyAtRaised(boolean bankBuyAtRaised) {
        mIsBankBuyAtRaised = bankBuyAtRaised;
    }
}
