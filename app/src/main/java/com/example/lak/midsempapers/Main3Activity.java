package com.example.lak.midsempapers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

public class Main3Activity extends AppCompatActivity {

    WebView pdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Bundle extras=getIntent().getExtras();

        String papername=extras.getString("PaperName").toString();

        setTitle(papername);

        pdf=(WebView) findViewById(R.id.Pdfview);

        pdf.getSettings().setLoadWithOverviewMode(true);
        pdf.getSettings().setUseWideViewPort(true);
        pdf.getSettings().setBuiltInZoomControls(true);

        Log.d("path",papername);



        String path="file:///android_asset/"+papername+".htm";
        Log.d("path",path);
        pdf.loadUrl(path);
    }
}
