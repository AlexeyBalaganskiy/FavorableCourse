package alexb.favorablecourse.domain.model.cbr;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;


@Root(name = "ValCurs", strict = false)
public class Cbr {
    @ElementList(inline = true, required = false, name = "Valute")
    private List<CbrCurrency> mCurrency;

    public List<CbrCurrency> getCurrency() {
        return mCurrency;
    }

    public void setCurrency(List<CbrCurrency> currency) {
        mCurrency = currency;
    }
}
