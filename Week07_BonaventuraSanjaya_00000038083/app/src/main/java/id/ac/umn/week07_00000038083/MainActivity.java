package id.ac.umn.week07_00000038083;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import id.ac.umn.week07_00000038083.Gallery.OpenGallery;
import id.ac.umn.week07_00000038083.Kamera.OpenCam;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openCam(View view) {
        Intent intent = new Intent(this, OpenCam.class);
        startActivity(intent);
    }

    public void openGallery(View view) {
        Intent intent = new Intent(this, OpenGallery.class);
        startActivity(intent);
    }
}