package alexb.favorablecourse.domain.model.vtb;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Vtb {

    @JsonProperty("GroupedRates")
    private List<GroupedRate> mGroupedRates;
    @JsonProperty("DateFrom")
    private String mDateFrom;
    @JsonProperty("IsRightPlaceholder")
    private boolean mIsRightPlaceholder;
    @JsonProperty("MoneyCurrencies")
    private List<MoneyCurrency> mMoneyCurrencies;

    public List<GroupedRate> getGroupedRates() {
        return mGroupedRates;
    }

    public void setGroupedRates(List<GroupedRate> groupedRates) {
        mGroupedRates = groupedRates;
    }

    public String getDateFrom() {
        return mDateFrom;
    }

    public void setDateFrom(String dateFrom) {
        mDateFrom = dateFrom;
    }

    public boolean isRightPlaceholder() {
        return mIsRightPlaceholder;
    }

    public void setIsRightPlaceholder(boolean rightPlaceholder) {
        mIsRightPlaceholder = rightPlaceholder;
    }

    public List<MoneyCurrency> getMoneyCurrencies() {
        return mMoneyCurrencies;
    }

    public void setMoneyCurrencies(List<MoneyCurrency> moneyCurrencies) {
        mMoneyCurrencies = moneyCurrencies;
    }
}
