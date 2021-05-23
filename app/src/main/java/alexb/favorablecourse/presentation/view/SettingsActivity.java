package alexb.favorablecourse.presentation.view;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

import alexb.favorablecourse.R;
import alexb.favorablecourse.presentation.utils.InputFilterMinMax;

public class SettingsActivity extends AppCompatActivity {


    private static final String PREFS_FILE = "Account";
    private static final String PREF_TIME = "Time";
    private EditText editTextTime;

    SharedPreferences settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setings);
        editTextTime = findViewById(R.id.edTime);
        settings = getSharedPreferences(PREFS_FILE, MODE_PRIVATE);
        editTextTime.setFilters(new InputFilter[]{new InputFilterMinMax("1", "12")});
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_settings, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.save) {
            saveSettings();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void saveSettings() {
        String time = editTextTime.getText().toString();

        if (time.trim().isEmpty()) {
            Toast.makeText(this, "Введите данные", Toast.LENGTH_SHORT).show();
            return;
        }
        finish();
    }
}