package alexb.favorablecourse.data.converter;

import androidx.annotation.NonNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;

public class ConverterStreamToString implements Converter<String, InputStream> {

    String mCharset;

    public void setCharset(@NonNull String charset) {
        mCharset = Objects.requireNonNull(charset);
    }

    @Override
    public String convert(@NonNull InputStream data) {

        StringBuilder sb = new StringBuilder();
        String line;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(Objects.requireNonNull(data), mCharset))) {
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}
