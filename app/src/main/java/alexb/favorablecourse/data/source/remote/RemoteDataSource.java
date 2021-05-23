package alexb.favorablecourse.data.source.remote;

import java.util.ArrayList;

import alexb.favorablecourse.data.parser.AlfabankXmlParserDecorator;
import alexb.favorablecourse.data.parser.JacksonParser;
import alexb.favorablecourse.data.parser.JsoupParser;
import alexb.favorablecourse.data.parser.SberbankJsonParser;
import alexb.favorablecourse.data.parser.SimpleXmlParser;
import alexb.favorablecourse.data.parser.XmlToDocumentParser;
import alexb.favorablecourse.domain.model.alfa.Alfa;
import alexb.favorablecourse.domain.model.cbr.Cbr;
import alexb.favorablecourse.domain.model.expo.Expo;
import alexb.favorablecourse.domain.model.sber.Sberbank;
import alexb.favorablecourse.domain.model.tinkoff.Tinkoff;
import alexb.favorablecourse.domain.model.vtb.Vtb;
import alexb.favorablecourse.domain.repository.IRemoteDataSource;

import static alexb.favorablecourse.data.source.remote.constant.UrlConst.URL_ALFABANK;
import static alexb.favorablecourse.data.source.remote.constant.UrlConst.URL_CBR;
import static alexb.favorablecourse.data.source.remote.constant.UrlConst.URL_EXPO;
import static alexb.favorablecourse.data.source.remote.constant.UrlConst.URL_SBERBANK;
import static alexb.favorablecourse.data.source.remote.constant.UrlConst.URL_TINKOFF;
import static alexb.favorablecourse.data.source.remote.constant.UrlConst.URL_VTB;

public class RemoteDataSource implements IRemoteDataSource {

    private final SimpleXmlParser<Expo> mExpoParser;
    private final SimpleXmlParser<Cbr> mCbrParser;
    private final SberbankJsonParser<Sberbank> mSberbankParser;
    private final AlfabankXmlParserDecorator mAlfabankParser;
    private final JacksonParser<Tinkoff> mTinkoffParser;
    private final JacksonParser<Vtb> mVtbParser;
    private HttpClient mExpoHttpClient = null;
    private HttpClient mSberbankHttpClient = null;
    private HttpClient mAlfabankHttpClient = null;
    private HttpClient mCbrHttpClient = null;
    private HttpClient mVtbHttpClient = null;
    private HttpClient mTinkoffHttpClient = null;
    private final HttpClient mHttpClient;

    public RemoteDataSource(HttpClient client) {
        mExpoParser = new SimpleXmlParser<>(Expo.class);
        mCbrParser = new SimpleXmlParser<>(Cbr.class);
        mSberbankParser = new SberbankJsonParser<>(Sberbank.class);
        mAlfabankParser = new AlfabankXmlParserDecorator(new XmlToDocumentParser(), new JsoupParser());
        mTinkoffParser = new JacksonParser<>(Tinkoff.class);
        mVtbParser = new JacksonParser<>(Vtb.class);
        mHttpClient = client;
    }

    public Expo getExpo(String date) {
        String url = URL_EXPO + date;
        if (mExpoHttpClient == null) {
            mExpoHttpClient = mHttpClient;
        }
        mExpoHttpClient.setUrl(url);
        return mExpoParser.parse(mExpoHttpClient.requestCall());
    }

    public Cbr getCbr(String date) {
        String url = URL_CBR + date;
        if (mCbrHttpClient == null) {
            mCbrHttpClient = mHttpClient;
        }
        mCbrHttpClient.setUrl(url);

        return mCbrParser.parse(mCbrHttpClient.requestCall());
    }

    public Sberbank getSberbank(long courseId) {
        String url = URL_SBERBANK + courseId;
        if (mSberbankHttpClient == null) {
            mSberbankHttpClient = mHttpClient;
        }
        mSberbankHttpClient.setUrl(url);
        return mSberbankParser.parse(mSberbankHttpClient.requestCall());
    }

    public ArrayList<Alfa> getAlfabank() {
        if (mAlfabankHttpClient == null) {
            mAlfabankHttpClient = mHttpClient;
        }
        mAlfabankHttpClient.setUrl(URL_ALFABANK);
        return mAlfabankParser.parse(mAlfabankHttpClient.requestCall());
    }

    public Vtb getVtb() {
        if (mVtbHttpClient == null) {
            mVtbHttpClient = mHttpClient;
        }
        mVtbHttpClient.setUrl(URL_VTB);
        return mVtbParser.parse(mVtbHttpClient.requestCall());
    }

    public Tinkoff getTinkoff() {
        if (mTinkoffHttpClient == null) {
            mTinkoffHttpClient = mHttpClient;
        }
        mTinkoffHttpClient.setUrl(URL_TINKOFF);
        return mTinkoffParser.parse(mTinkoffHttpClient.requestCall());
    }
}