package alexb.favorablecourse.domain.model.sber;

public class Sberbank {

    private String mIsoCur;
    private String mCurrencyName;
    private String mCurrencyNameEng;
    private String mRateType;
    private String mCategoryCode;
    private int mScale;
    private double mBuyValue;
    private double mSellValue;
    private long mActiveFrom;
    private double mBuyValuePrev;
    private double mSellValuePrev;
    private int mAmountFrom;
    private double mAmountTo;

    public String getIsoCur() {
        return mIsoCur;
    }

    public void setIsoCur(String isoCur) {
        mIsoCur = isoCur;
    }

    public String getCurrencyName() {
        return mCurrencyName;
    }

    public void setCurrencyName(String currencyName) {
        mCurrencyName = currencyName;
    }

    public String getCurrencyNameEng() {
        return mCurrencyNameEng;
    }

    public void setCurrencyNameEng(String currencyNameEng) {
        mCurrencyNameEng = currencyNameEng;
    }

    public String getRateType() {
        return mRateType;
    }

    public void setRateType(String rateType) {
        mRateType = rateType;
    }

    public String getCategoryCode() {
        return mCategoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        mCategoryCode = categoryCode;
    }

    public int getScale() {
        return mScale;
    }

    public void setScale(int scale) {
        mScale = scale;
    }

    public double getBuyValue() {
        return mBuyValue;
    }

    public void setBuyValue(double buyValue) {
        mBuyValue = buyValue;
    }

    public double getSellValue() {
        return mSellValue;
    }

    public void setSellValue(double sellValue) {
        mSellValue = sellValue;
    }

    public long getActiveFrom() {
        return mActiveFrom;
    }

    public void setActiveFrom(long activeFrom) {
        mActiveFrom = activeFrom;
    }

    public double getBuyValuePrev() {
        return mBuyValuePrev;
    }

    public void setBuyValuePrev(double buyValuePrev) {
        mBuyValuePrev = buyValuePrev;
    }

    public double getSellValuePrev() {
        return mSellValuePrev;
    }

    public void setSellValuePrev(double sellValuePrev) {
        mSellValuePrev = sellValuePrev;
    }

    public int getAmountFrom() {
        return mAmountFrom;
    }

    public void setAmountFrom(int amountFrom) {
        mAmountFrom = amountFrom;
    }

    public double getAmountTo() {
        return mAmountTo;
    }

    public void setAmountTo(double amountTo) {
        mAmountTo = amountTo;
    }
}
