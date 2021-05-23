package alexb.favorablecourse.data.parser;

import androidx.annotation.NonNull;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.StringReader;
import java.util.Objects;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class XmlToDocumentParser implements IXmlParser<Document> {

    @Override
    public Document parse(@NonNull String response) {
        Document result = null;
        DocumentBuilder builder;
        InputSource src = new InputSource();
        src.setCharacterStream(new StringReader(Objects.requireNonNull(response)));
        try {
            builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            result = builder.parse(src);
        } catch (IOException | SAXException | ParserConfigurationException e) {
            e.printStackTrace();
        }
        return result;
    }
}
