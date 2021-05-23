package alexb.favorablecourse.data.parser;

import androidx.annotation.NonNull;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.Objects;

public class JsoupParser implements IHtmlParser<Document> {

    @Override
    public Document parse(@NonNull String response) {
        return Jsoup.parse(Objects.requireNonNull(response));
    }
}
