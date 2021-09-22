package id.ac.umn.week06_38083;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import id.ac.umn.week06_38083.buletan.BuletanActivity;
import id.ac.umn.week06_38083.buletan.ViewAnimasi;
import id.ac.umn.week06_38083.kuda_lari.KudaActivity;
import id.ac.umn.week06_38083.per.PerActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewBuletan(View view) {
        Intent tes = new Intent(MainActivity.this, BuletanActivity.class);
        startActivity(tes);
    }

    public void viewKuda(View view) {
        Intent tes = new Intent(MainActivity.this, KudaActivity.class);
        startActivity(tes);
    }

    public void viewPer(View view) {
        Intent tes = new Intent(MainActivity.this, PerActivity.class);
        startActivity(tes);
    }
}