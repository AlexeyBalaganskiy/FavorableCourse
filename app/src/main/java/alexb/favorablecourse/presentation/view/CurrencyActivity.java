package alexb.favorablecourse.presentation.view;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import alexb.favorablecourse.presentation.MyApplication;
import alexb.favorablecourse.R;
import alexb.favorablecourse.data.repository.CurrencyRepositoryImpl;
import alexb.favorablecourse.domain.model.alfa.Alfa;
import alexb.favorablecourse.domain.model.cbr.Cbr;
import alexb.favorablecourse.domain.model.expo.Expo;
import alexb.favorablecourse.domain.model.sber.Sberbank;
import alexb.favorablecourse.domain.model.tinkoff.Tinkoff;
import alexb.favorablecourse.domain.model.vtb.Vtb;

public class CurrencyActivity extends AppCompatActivity {

    private ArrayList<String> mSpinnerList = new ArrayList<>();
    private Spinner mSpinner;
    private CurrencyRepositoryImpl mCurrencyRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        mSpinner = findViewById(R.id.spinner);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        MyApplication myApplication = (MyApplication) getApplication();
        mCurrencyRepository = myApplication.createRepository();
        //loadExpo();
        //loadCbr();
        //loadVtb();
        //loadTinkoff();
        //loadAlfa();
        //loadSber();
        initSpinner();
    }

    private void initSpinner() {
        mSpinnerList.add("USD");
        mSpinnerList.add("EUR");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, mSpinnerList);
        mSpinner.setAdapter(adapter);
    }

    @SuppressLint("StaticFieldLeak")
    private void loadTinkoff() {
        new AsyncTask<Void, Void, Tinkoff>() {

            @Override
            protected Tinkoff doInBackground(Void... voids) {
                return mCurrencyRepository.getTinkoffCurrency();
            }

            @Override
            protected void onPostExecute(Tinkoff course) {
                System.out.println(course.getPayload().getRates().get(0).getBuy());

            }
        }.execute();
    }

    @SuppressLint("StaticFieldLeak")
    private void loadVtb() {
        new AsyncTask<Void, Void, Vtb>() {

            @Override
            protected Vtb doInBackground(Void... voids) {

                return mCurrencyRepository.getVtbCurrency();
            }

            @Override
            protected void onPostExecute(Vtb course) {
                System.out.println(course.getMoneyCurrencies().get(0).getName());
            }
        }.execute();
    }

    @SuppressLint("StaticFieldLeak")
    private void loadAlfa() {
        new AsyncTask<Void, Void, List<Alfa>>() {

            @Override
            protected List<Alfa> doInBackground(Void... voids) {

                return mCurrencyRepository.getAlfabankCurrency();
            }

            @Override
            protected void onPostExecute(List<Alfa> alfa) {
                System.out.println(alfa.get(0).getCurrency());
            }
        }.execute();
    }

    @SuppressLint("StaticFieldLeak")
    private void loadCbr() {
        new AsyncTask<Void, Void, Cbr>() {

            @Override
            protected Cbr doInBackground(Void... voids) {
                return mCurrencyRepository.getCbrCurrency("28/04/2021");
            }

            @Override
            protected void onPostExecute(Cbr course) {
                System.out.println(course.getCurrency().get(0).getCurrencyName() + "CBR");
            }
        }.execute();
    }

    @SuppressLint("StaticFieldLeak")
    private void loadExpo() {
        new AsyncTask<Void, Void, Expo>() {

            @Override
            protected Expo doInBackground(Void... voids) {
                return mCurrencyRepository.getExpoCurrency("2021-04-27");
            }

            @Override
            protected void onPostExecute(Expo course) {
                System.out.println(course.getItem().get(0).getBuyRate() + "пп");
            }
        }.execute();
    }

    @SuppressLint("StaticFieldLeak")
    private void loadSber() {
        new AsyncTask<Void, Void, Sberbank>() {

            @Override
            protected Sberbank doInBackground(Void... voids) {
                return mCurrencyRepository.getSberbankCurrency(840);
            }

            @Override
            protected void onPostExecute(Sberbank course) {
                System.out.println(course.getBuyValue());
            }
        }.execute();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings:
                Intent intent = new Intent(this, SettingsActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}





