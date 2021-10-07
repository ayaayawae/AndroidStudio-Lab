package id.ac.umn.uts_38083;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;

import java.io.Serializable;

public class LoginActivity extends AppCompatActivity {
    EditText etNamaLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);

        etNamaLogin = findViewById(R.id.etNamaLogin);
    }

    public void openLibrary(View view) {
        Intent intent = new Intent(this,LibraryActivity.class);
        if(etNamaLogin.getText().toString().isEmpty()) {
            etNamaLogin.setError("Harap diisi");
        } else {
            intent.putExtra("nama", etNamaLogin.getText().toString());
            startActivity(intent);
        }
    }
}