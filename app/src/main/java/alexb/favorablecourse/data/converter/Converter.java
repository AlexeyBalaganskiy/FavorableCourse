package alexb.favorablecourse.data.converter;

public interface Converter<T, R> {

    T convert(R request);
}
