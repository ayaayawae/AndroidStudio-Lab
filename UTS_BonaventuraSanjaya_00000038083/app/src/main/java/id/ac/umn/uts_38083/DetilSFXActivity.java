package id.ac.umn.uts_38083;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetilSFXActivity extends AppCompatActivity {
    private MediaPlayer sfxDetil;
    private TextView tvJudul, tvKeterangan, tvUri;
    private Button playBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detil_sfxactivity);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvJudul = findViewById(R.id.tvJudul);
        tvKeterangan = findViewById(R.id.tvKeterangan);
//        tvUri = findViewById(R.)
        playBtn = findViewById(R.id.playBtn);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        SumberSFX ssfx = (SumberSFX) bundle.getSerializable("DetilSFX");
        tvJudul.setText(ssfx.getJudul());
        tvKeterangan.setText(ssfx.getKeterangan());

        getSupportActionBar().setTitle(ssfx.getJudul());

        sfxDetil = MediaPlayer.create(this, Uri.parse(ssfx.getSoundURI()));
        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sfxDetil.start();
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        sfxDetil.stop();
        sfxDetil.release();
        sfxDetil = null;
        onBackPressed();
        return true;
    }
}