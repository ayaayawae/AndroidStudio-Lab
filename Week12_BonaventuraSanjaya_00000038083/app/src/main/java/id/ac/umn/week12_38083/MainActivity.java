package id.ac.umn.week12_38083;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ActivityA(View view) {
        Intent intent = new Intent(this, AActivity.class);
        startActivity(intent);
    }

    public void ActivityB(View view) {
        Intent intent = new Intent(this, BActivity.class);
        startActivity(intent);
    }
}