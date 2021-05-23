package alexb.favorablecourse.presentation;

import android.app.Application;

import alexb.favorablecourse.data.source.remote.HttpClient;
import alexb.favorablecourse.data.repository.CurrencyRepositoryImpl;
import alexb.favorablecourse.data.source.remote.RemoteDataSource;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public CurrencyRepositoryImpl createRepository() {
        return new CurrencyRepositoryImpl(new RemoteDataSource(new HttpClient()));
    }
}
