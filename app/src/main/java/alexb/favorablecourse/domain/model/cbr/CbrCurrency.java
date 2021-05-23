package alexb.favorablecourse.domain.model.cbr;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Valute", strict = false)
public class CbrCurrency {

    @Element(name = "NumCode")
    private int mCodeCurrency;
    @Element(name = "CharCode")
    private String mCurrency;
    @Element(name = "Nominal")
    private int mDenomination;
    @Element(name = "Name")
    private String mCurrencyName;
    @Element(name = "Value")
    private String mPrice;


    public int getCodeCurrency() {
        return mCodeCurrency;
    }

    public void setCodeCurrency(int codeCurrency) {
        mCodeCurrency = codeCurrency;
    }

    public String getCurrency() {
        return mCurrency;
    }

    public void setCurrency(String currency) {
        mCurrency = currency;
    }

    public int getDenomination() {
        return mDenomination;
    }

    public void setDenomination(int denomination) {
        mDenomination = denomination;
    }

    public String getCurrencyName() {
        return mCurrencyName;
    }

    public void setCurrencyName(String currencyName) {
        mCurrencyName = currencyName;
    }

    public String getPrice() {
        return mPrice;
    }

    public void setPrice(String price) {
        mPrice = price;
    }
}
