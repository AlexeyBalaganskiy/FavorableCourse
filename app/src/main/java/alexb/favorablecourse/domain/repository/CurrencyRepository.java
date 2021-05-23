package alexb.favorablecourse.domain.repository;

import java.util.ArrayList;

import alexb.favorablecourse.domain.model.alfa.Alfa;
import alexb.favorablecourse.domain.model.cbr.Cbr;
import alexb.favorablecourse.domain.model.expo.Expo;
import alexb.favorablecourse.domain.model.sber.Sberbank;
import alexb.favorablecourse.domain.model.tinkoff.Tinkoff;
import alexb.favorablecourse.domain.model.vtb.Vtb;

public interface CurrencyRepository {

    ArrayList<Alfa> getAlfabankCurrency();

    Sberbank getSberbankCurrency(int url);

    Cbr getCbrCurrency(String url);

    Tinkoff getTinkoffCurrency();

    Expo getExpoCurrency(String url);

    Vtb getVtbCurrency();
}
