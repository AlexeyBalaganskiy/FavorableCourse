package alexb.favorablecourse.domain.model.expo;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "List")
public class Expo {

    @ElementList(inline = true, required = false)
    private List<CurrencyExpo> mItem;

    public List<CurrencyExpo> getItem() {
        return mItem;
    }

    public void setItem(List<CurrencyExpo> item) {
        mItem = item;
    }
}