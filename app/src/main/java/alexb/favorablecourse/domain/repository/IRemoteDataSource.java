package alexb.favorablecourse.domain.repository;

import java.util.ArrayList;

import alexb.favorablecourse.domain.model.alfa.Alfa;
import alexb.favorablecourse.domain.model.cbr.Cbr;
import alexb.favorablecourse.domain.model.expo.Expo;
import alexb.favorablecourse.domain.model.sber.Sberbank;
import alexb.favorablecourse.domain.model.tinkoff.Tinkoff;
import alexb.favorablecourse.domain.model.vtb.Vtb;

import static alexb.favorablecourse.data.source.remote.constant.UrlConst.URL_ALFABANK;
import static alexb.favorablecourse.data.source.remote.constant.UrlConst.URL_CBR;
import static alexb.favorablecourse.data.source.remote.constant.UrlConst.URL_EXPO;
import static alexb.favorablecourse.data.source.remote.constant.UrlConst.URL_SBERBANK;
import static alexb.favorablecourse.data.source.remote.constant.UrlConst.URL_TINKOFF;
import static alexb.favorablecourse.data.source.remote.constant.UrlConst.URL_VTB;

public interface IRemoteDataSource {

    Expo getExpo(String date);

    Cbr getCbr(String date);

    Sberbank getSberbank(long courseId);

    ArrayList<Alfa> getAlfabank();

    Vtb getVtb();

    Tinkoff getTinkoff();
}
