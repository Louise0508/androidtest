package com.cookandroid.dcu_image_viwer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    sajin picture;

    int curNum = 0;
    File[] imageFiles;
    String imageFname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        picture = findViewById(R.id.sajin1);
        imageFiles = new File(Environment.getExternalStorageDirectory().getAbsolutePath()
                +"/Pictures").listFiles();
        imageFname = imageFiles[curNum].toString();
        picture.imagePath = imageFname;
        
    }
}