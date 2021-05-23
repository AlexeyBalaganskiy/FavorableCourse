package alexb.favorablecourse.data.converter;

import java.io.IOException;
import java.util.List;

import alexb.favorablecourse.domain.model.BaseModelCurrency;
import alexb.favorablecourse.domain.model.expo.Expo;

public class ConverterModel<T> implements Converter {

    private Class<T> model;
    private List<BaseModelCurrency> baseModel;
    private List<Object> a;
    private Integer b;


    public ConverterModel(Class<T> clazz)
    {
        b++;
        System.out.println(b);
        a.add((Expo)new Expo());
        this.model = clazz;
    }


    @Override
    public Object convert(Object response) {
        return null;
    }
}
