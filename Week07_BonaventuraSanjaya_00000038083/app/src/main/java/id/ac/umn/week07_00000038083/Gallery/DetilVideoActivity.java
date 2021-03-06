package id.ac.umn.week07_00000038083.Gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.VideoView;

import id.ac.umn.week07_00000038083.R;

public class DetilVideoActivity extends AppCompatActivity {
    private VideoView vvDetil;
    private EditText etJudul, etKeterangan, etUri;
    private Button btnKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detil_video);
        vvDetil = findViewById(R.id.vvDetil);
        etJudul = findViewById(R.id.etJudul);
        etKeterangan = findViewById(R.id.etKeterangan);
        etUri = findViewById(R.id.etUri);
        btnKembali = findViewById(R.id.btnBack);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        SumberVideo sv = (SumberVideo) bundle.getSerializable("DetilVideo");
        etJudul.setText(sv.getJudul());
        etKeterangan.setText(sv.getKeterangan());
        etUri.setText(sv.getVideoURI());
        vvDetil.setVideoURI(Uri.parse(sv.getVideoURI()));
        vvDetil.seekTo(100);
        vvDetil.start();
        MediaController controller = new MediaController(this);
        controller.setMediaPlayer(vvDetil);
        vvDetil.setMediaController(controller);
        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}