package com.example.flowz.alc401stapp;

import android.net.http.SslError;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebPageActivity extends AppCompatActivity {
    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_page);
        webView =(findViewById(R.id.my_webview));


        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }



//        );
//        WebSettings webSettings = webView.getSettings();
//        webSettings.setJavaScriptEnabled(true);

//        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

//        webView.setWebViewClient(new WebViewClient(){
//            @Override
//            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
//                handler.proceed();
//            }
//        });
//        webView.loadUrl("https://andela.com/alc/");


        });
        webView.loadUrl("https://andela.com/alc/");
//        WebSettings webSettings = webView.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        webView.getSettings().setLoadsImagesAutomatically(true);
//        webView.getSettings().setJavaScriptEnabled(true);
//        webView.loadUrl("https://andela.com/alc/");
}
}