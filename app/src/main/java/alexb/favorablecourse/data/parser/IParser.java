package alexb.favorablecourse.data.parser;

import androidx.annotation.NonNull;

public interface IParser<T> {

    T parse(@NonNull String response);
}
