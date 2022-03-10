package com.example.smpn1kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GaleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galery);
    }

    public void osis(View view) {
        Intent intent = new Intent(com.example.smpn1kotategal.GaleryActivity.this, PemilihanOsisActivity.class);
        startActivity(intent);
    }
}