package alexb.favorablecourse.domain.model.tinkoff;

import java.util.List;

public class Payload {

    private LastUpdate mLastUpdate;
    private List<Rate> mRates;

    public LastUpdate getLastUpdate() {
        return mLastUpdate;
    }

    public void setLastUpdate(LastUpdate lastUpdate) {
        mLastUpdate = lastUpdate;
    }

    public List<Rate> getRates() {
        return mRates;
    }

    public void setRates(List<Rate> rates) {
        mRates = rates;
    }
}
