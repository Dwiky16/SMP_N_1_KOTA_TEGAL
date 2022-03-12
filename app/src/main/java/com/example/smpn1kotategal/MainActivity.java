package com.example.smpn1kotategal;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    private long backPress;
    private Toast backToast;

    ViewFlipper viewFlipper;
    Animation fadein, fadeout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);

        fadein = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        fadeout = AnimationUtils.loadAnimation(this,R.anim.fade_out);

        viewFlipper.setInAnimation(fadein);
        viewFlipper.setOutAnimation(fadeout);

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.startFlipping();
    }

    @Override
    public void onBackPressed() {
        if (backPress + 2000 > System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            return;
        }else{
            backToast = Toast.makeText(getBaseContext(), "Tekan sekali lagi untuk keluar", Toast.LENGTH_LONG);
            backToast.show();
        }
        backPress = System.currentTimeMillis();
    }

    public void profil(View view) {
        Intent intent = new Intent(com.example.smpn1kotategal.MainActivity.this, ProfilActivity.class);
        startActivity(intent);
    }

    public void guru(View view) {
        Intent intent = new Intent(com.example.smpn1kotategal.MainActivity.this, GuruActivity.class);
        startActivity(intent);
    }

    public void fasilitas(View view) {
        Intent intent = new Intent(com.example.smpn1kotategal.MainActivity.this, FasilitasActivity.class);
        startActivity(intent);
    }

    public void perpus(View view) {
        Intent intent = new Intent(com.example.smpn1kotategal.MainActivity.this, PerpusActivity.class);
        startActivity(intent);
    }

    public void eskul(View view) {
        Intent intent = new Intent(com.example.smpn1kotategal.MainActivity.this, EkstraActivity.class);
        startActivity(intent);
    }

    public void galeri(View view) {
        Intent intent = new Intent(com.example.smpn1kotategal.MainActivity.this, GaleryActivity.class);
        startActivity(intent);
    }

    public void google(View view) {
        goToUrl("https://sekolah.data.kemdikbud.go.id/index.php/chome/profil/c06c735a-2df5-e011-9a92-7fef8f49b92d");
    }

    public void facebook(View view) {
        goToUrl("https://www.facebook.com/smp1tegal/");
    }

    public void instagram(View view) {
        goToUrl("https://www.instagram.com/spensasik/");
    }

    public void youtube(View view) {
        goToUrl("https://www.youtube.com/channel/UCbmF3iXtln2X6sXQP9NQtGg");
    }


    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}