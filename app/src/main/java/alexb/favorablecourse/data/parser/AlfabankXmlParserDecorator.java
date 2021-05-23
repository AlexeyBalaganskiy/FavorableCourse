package alexb.favorablecourse.data.parser;

import androidx.annotation.NonNull;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.w3c.dom.Document;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

import alexb.favorablecourse.domain.model.alfa.Alfa;

public class AlfabankXmlParserDecorator implements IXmlParser<ArrayList<Alfa>> {

    private final IXmlParser<Document> mXmlParser;
    private final IHtmlParser<org.jsoup.nodes.Document> mHtmlParser;

    public AlfabankXmlParserDecorator(@NonNull IXmlParser<Document> xmlParser, @NonNull IHtmlParser<org.jsoup.nodes.Document> htmlParser) {
        mXmlParser = Objects.requireNonNull(xmlParser);
        mHtmlParser = Objects.requireNonNull(htmlParser);
    }

    @Override
    public ArrayList<Alfa> parse(@NonNull String response) {
        Document doc = mXmlParser.parse(Objects.requireNonNull(response));
        org.jsoup.nodes.Document docHtml = mHtmlParser.parse(doc.getDocumentElement().getTextContent());
        Elements elements = docHtml.getElementsByClass("noncash").removeAttr("id");
        ArrayList<Alfa> list = new ArrayList<>();
        Iterator<Element> iterator = elements.iterator();
        while (iterator.hasNext()) {
            list.add(new Alfa(iterator.next().attr("title"),
                    iterator.next().text(),
                    iterator.next().attr("class")
                            .replace("noncash ", "")));
        }
        return list;
    }
}
