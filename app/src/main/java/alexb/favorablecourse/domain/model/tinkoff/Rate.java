package alexb.favorablecourse.domain.model.tinkoff;

public class Rate {

    private String mCategory;
    private FromCurrency mFromCurrency;
    private ToCurrency mToCurrency;
    private double mBuy;
    private double mSell;

    public String getCategory() {
        return mCategory;
    }

    public void setCategory(String category) {
        mCategory = category;
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

    public double getBuy() {
        return mBuy;
    }

    public void setBuy(double buy) {
        mBuy = buy;
    }

    public double getSell() {
        return mSell;
    }

    public void setSell(double sell) {
        mSell = sell;
    }
}
