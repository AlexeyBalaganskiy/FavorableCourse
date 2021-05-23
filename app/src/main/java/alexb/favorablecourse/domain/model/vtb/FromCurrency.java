package alexb.favorablecourse.domain.model.vtb;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FromCurrency {

    @JsonProperty("Symbol")
    private String mSymbol;
    @JsonProperty("Code")
    private String mCode;
    @JsonProperty("Name")
    private String mName;

    public String getSymbol() {
        return mSymbol;
    }

    public void setSymbol(String symbol) {
        mSymbol = symbol;
    }

    public String getCode() {
        return mCode;
    }

    public void setCode(String code) {
        mCode = code;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }
}
