package alexb.favorablecourse.data.parser;

import androidx.annotation.NonNull;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Objects;

import alexb.favorablecourse.domain.model.sber.Sberbank;

public class SberbankJsonParser<T> implements IParser<Sberbank> {

    private final JacksonParser<T> mJacksonParser;

    public SberbankJsonParser(@NonNull Class<T> clazz) {
        mJacksonParser = new JacksonParser<>(Objects.requireNonNull(clazz));
    }

    @Override
    public Sberbank parse(@NonNull String response) {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode;
        String result = null;
        try {
            rootNode = objectMapper.readTree(Objects.requireNonNull(response));
            result = rootNode.findValue("0").toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return (Sberbank) mJacksonParser.parse(result);
    }
}