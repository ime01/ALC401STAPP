package com.example.flowz.alc401stapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView welcomeText;
    TextView webViewText;
    TextView aboutMeText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void openAlcPage(View view) {
        Intent openWebPage = new Intent(MainActivity.this, WebPageActivity.class);
        startActivity(openWebPage);
    }

    public void openAboutMe (View view) {
        Intent openWebPage = new Intent(MainActivity.this, AboutMeActivity.class);
        startActivity(openWebPage);
    }
}
