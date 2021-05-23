package alexb.favorablecourse.data.parser;

import androidx.annotation.NonNull;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Objects;

public class JacksonParser<T> implements IJsonParser<T> {

    private Class<T> mModel;
    private final ObjectMapper mObjectMapper;


    public JacksonParser(@NonNull Class<T> clazz) {
        mModel = Objects.requireNonNull(clazz);
        mObjectMapper = new ObjectMapper();
    }

    @Override
    public T parse(@NonNull String response) {
        T result = null;
        try {
            result = mObjectMapper.readValue(Objects.requireNonNull(response), mModel);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}