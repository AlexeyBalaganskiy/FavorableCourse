package alexb.favorablecourse.domain.model.tinkoff;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tinkoff {

    private String mResultCode;
    @JsonProperty("payload")
    private Payload mPayload;
    private String mTrackingId;

    public String getResultCode() {
        return mResultCode;
    }

    public void setResultCode(String resultCode) {
        mResultCode = resultCode;
    }

    public Payload getPayload() {
        return mPayload;
    }

    public void setPayload(Payload payload) {
        mPayload = payload;
    }

    public String getTrackingId() {
        return mTrackingId;
    }

    public void setTrackingId(String trackingId) {
        mTrackingId = trackingId;
    }
}