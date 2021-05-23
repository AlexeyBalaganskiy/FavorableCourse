package alexb.favorablecourse.domain.model.expo;


import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "item")
public class CurrencyExpo {

    @Element(name = "exportDate")
    private double mExportDate;
    @Element(name = "rateType")
    private String mRateType;
    @Element(name = "midRate")
    private double mMidRate;
    @Element(name = "buyRate")
    private double mBuyRate;
    @Element(name = "saleRate")
    private double mSaleRate;
    @Element(name = "customBuyRate")
    private Object mCustomBuyRate;
    @Element(name = "customSaleRate")
    private Object mCustomSaleRate;
    @Element(name = "currency")
    private String mCurrency;
    @Element(name = "country")
    private String mCountry;
    @Element(name = "quotationUnit")
    private int mQuotationUnit;


    public double getExportDate() {
        return mExportDate;
    }

    public void setExportDate(double exportDate) {
        mExportDate = exportDate;
    }

    public String getRateType() {
        return mRateType;
    }

    public void setRateType(String rateType) {
        mRateType = rateType;
    }

    public double getMidRate() {
        return mMidRate;
    }

    public void setMidRate(double midRate) {
        mMidRate = midRate;
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

    public Object getCustomBuyRate() {
        return mCustomBuyRate;
    }

    public void setCustomBuyRate(Object customBuyRate) {
        mCustomBuyRate = customBuyRate;
    }

    public Object getCustomSaleRate() {
        return mCustomSaleRate;
    }

    public void setCustomSaleRate(Object customSaleRate) {
        mCustomSaleRate = customSaleRate;
    }

    public String getCurrency() {
        return mCurrency;
    }

    public void setCurrency(String currency) {
        mCurrency = currency;
    }

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public int getQuotationUnit() {
        return mQuotationUnit;
    }

    public void setQuotationUnit(int quotationUnit) {
        mQuotationUnit = quotationUnit;
    }
}
