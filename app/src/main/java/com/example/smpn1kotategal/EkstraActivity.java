package com.example.smpn1kotategal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class EkstraActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekstra);
    }

    public void pramuka(View view) {
        Intent intent = new Intent(com.example.smpn1kotategal.EkstraActivity.this, PramukaActivity.class);
        startActivity(intent);
    }

    public void pmr(View view) {
        Intent intent = new Intent(com.example.smpn1kotategal.EkstraActivity.this, PmrActivity.class);
        startActivity(intent);
    }

    public void basket(View view) {
        Intent intent = new Intent(com.example.smpn1kotategal.EkstraActivity.this, BasketActivity.class);
        startActivity(intent);
    }

    public void volly(View view) {
    }
}