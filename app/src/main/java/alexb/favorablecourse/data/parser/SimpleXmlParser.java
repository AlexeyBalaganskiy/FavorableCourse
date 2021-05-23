package alexb.favorablecourse.data.parser;

import androidx.annotation.NonNull;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.util.Objects;

public class SimpleXmlParser<T> implements IXmlParser<T> {

    private final Class<T> mModel;
    private final Serializer mSerializer;

    public SimpleXmlParser(@NonNull Class<T> clazz) {
        mModel = Objects.requireNonNull(clazz);
        mSerializer = new Persister();
    }

    @Override
    public T parse(@NonNull String response) {
        T result = null;
        try {
            result = mSerializer.read(mModel, Objects.requireNonNull(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
