package alexb.favorablecourse.data.repository;

import java.util.ArrayList;

import alexb.favorablecourse.data.source.remote.RemoteDataSource;
import alexb.favorablecourse.domain.model.alfa.Alfa;
import alexb.favorablecourse.domain.model.cbr.Cbr;
import alexb.favorablecourse.domain.model.expo.Expo;
import alexb.favorablecourse.domain.model.sber.Sberbank;
import alexb.favorablecourse.domain.model.tinkoff.Tinkoff;
import alexb.favorablecourse.domain.model.vtb.Vtb;
import alexb.favorablecourse.domain.repository.CurrencyRepository;

public class CurrencyRepositoryImpl implements CurrencyRepository {

    private final RemoteDataSource remote;

    public CurrencyRepositoryImpl(RemoteDataSource remoteDataSource) {
        this.remote = remoteDataSource;
    }

    @Override
    public ArrayList<Alfa> getAlfabankCurrency() {
        return remote.getAlfabank();
    }

    @Override
    public Sberbank getSberbankCurrency(int id) {
        return remote.getSberbank(id);
    }

    @Override
    public Cbr getCbrCurrency(String date) {
        return remote.getCbr(date);
    }

    @Override
    public Tinkoff getTinkoffCurrency() {
        return remote.getTinkoff();
    }

    @Override
    public Expo getExpoCurrency(String date) {
        return remote.getExpo(date);
    }

    @Override
    public Vtb getVtbCurrency() {
        return remote.getVtb();
    }
}
