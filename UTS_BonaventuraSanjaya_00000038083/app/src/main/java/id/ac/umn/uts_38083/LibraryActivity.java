package id.ac.umn.uts_38083;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.LinkedList;

public class LibraryActivity extends AppCompatActivity {
    RecyclerView rvDaftarSFX;
    DaftarSFXAdapter mAdapter;
    LinkedList<SumberSFX> daftarSFX = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        Intent intent = getIntent();
        Toast.makeText(this, "Selamat datang, "+intent.getStringExtra("nama"), Toast.LENGTH_SHORT).show();
        isiDaftarSFX();

        rvDaftarSFX = findViewById(R.id.recyclerView);
        mAdapter = new DaftarSFXAdapter(this, daftarSFX);
        rvDaftarSFX.setAdapter(mAdapter);
        rvDaftarSFX.setLayoutManager(new LinearLayoutManager(this));

        getSupportActionBar().setTitle(intent.getStringExtra("nama"));
    }

    public void isiDaftarSFX() {
        daftarSFX.add(new SumberSFX("Alarm", "Alarm Tone 996", "android.resource://" +
                getPackageName() + "/"+ R.raw.sfx01));
        daftarSFX.add(new SumberSFX("Game over", "Arcade Retro Game Over", "android.resource://" +
                getPackageName() + "/"+ R.raw.sfx02));
        daftarSFX.add(new SumberSFX("Alarm", "Classic Alarm 995", "android.resource://" +
                getPackageName() + "/"+ R.raw.sfx03));
        daftarSFX.add(new SumberSFX("Ambience", "Crickets and insects ambience", "android.resource://" +
                getPackageName() + "/"+ R.raw.sfx04));
        daftarSFX.add(new SumberSFX("Dog Barking", "Dog Barking Twice", "android.resource://" +
                getPackageName() + "/"+ R.raw.sfx05));
        daftarSFX.add(new SumberSFX("Rocket sound", "Fast Rocket Sound", "android.resource://" +
                getPackageName() + "/"+ R.raw.sfx06));
        daftarSFX.add(new SumberSFX("Sweep Transition", "Small Sweep Transition", "android.resource://" +
                getPackageName() + "/"+ R.raw.sfx07));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.action_profile:
                intent = new Intent(this, ProfileActivity.class);
                startActivity(intent);;
                return true;
            case R.id.action_home:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);;
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}