package alexb.favorablecourse.domain.model.vtb;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GroupedRate {

    @JsonProperty("MoneyRates")
    private List<MoneyRate> mMoneyRates;

    public List<MoneyRate> getMoneyRates() {
        return mMoneyRates;
    }

    public void setMoneyRates(List<MoneyRate> moneyRates) {
        mMoneyRates = moneyRates;
    }
}
