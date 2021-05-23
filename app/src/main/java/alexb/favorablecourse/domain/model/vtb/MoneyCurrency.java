package alexb.favorablecourse.domain.model.vtb;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MoneyCurrency {
    @JsonProperty("ItemName")
    private String mItemName;
    @JsonProperty("Code")
    private String mCode;
    @JsonProperty("Name")
    private String mName;
    @JsonProperty("IsPublished")
    private boolean mIsPublished;
    @JsonProperty("ValueTypeId")
    private String mValueTypeId;
    @JsonProperty("Symbol")
    private String mSymbol;

    public String getItemName() {
        return mItemName;
    }

    public void setItemName(String itemName) {
        mItemName = itemName;
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

    public boolean isPublished() {
        return mIsPublished;
    }

    public void setPublished(boolean published) {
        mIsPublished = published;
    }

    public String getValueTypeId() {
        return mValueTypeId;
    }

    public void setValueTypeId(String valueTypeId) {
        mValueTypeId = valueTypeId;
    }

    public String getSymbol() {
        return mSymbol;
    }

    public void setSymbol(String symbol) {
        mSymbol = symbol;
    }
}
