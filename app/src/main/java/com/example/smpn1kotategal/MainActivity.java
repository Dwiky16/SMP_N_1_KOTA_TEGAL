package com.example.smpn1kotategal;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class MainActivity extends AppCompatActivity {

    private long backPress;
    private Toast backToast;
    SliderView sliderView;
    int[] images = {R.drawable.poster2,
            R.drawable.poster3,
            R.drawable.poster1,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

    }

    public void berita(View view) {
        Intent intent = new Intent(com.example.smpn1kotategal.MainActivity.this, BeritaActivity.class);
        startActivity(intent);
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
        Intent intent = new Intent(com.example.smpn1kotategal.MainActivity.this, GoogleActivity.class);
        startActivity(intent);
    }

    public void facebook(View view) {
        Intent intent = new Intent(com.example.smpn1kotategal.MainActivity.this, FacebookActivity.class);
        startActivity(intent);
    }

    public void instagram(View view) {
        Intent intent = new Intent(com.example.smpn1kotategal.MainActivity.this, InstagramActivity.class);
        startActivity(intent);
    }

    public void youtube(View view) {
        Intent intent = new Intent(com.example.smpn1kotategal.MainActivity.this, YouTubeActivity.class);
        startActivity(intent);
    }


    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}