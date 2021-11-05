package id.ac.umn.week10_bonaventurasanjaya_00000038083;

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

    public void goActivityA(View view) {
        Intent intent = new Intent(MainActivity.this, A_Activity.class);
        startActivity(intent);
    }

    public void goActivityB(View view) {
        Intent intent = new Intent(MainActivity.this, B_Activity.class);
        startActivity(intent);
    }

    public void goActivityC(View view) {
        Intent intent = new Intent(MainActivity.this, C_Activity.class);
        startActivity(intent);
    }
}