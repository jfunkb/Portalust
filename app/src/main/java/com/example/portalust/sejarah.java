package com.example.portalust;

import android.os.Bundle;
import android.webkit.WebView;

public class sejarah extends MainActivity {

    private WebView webView;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah);

        webView = findViewById(R.id.websejarah);
        webView = findViewById(R.id.websejarah);
        webView.setWebViewClient(new WebViewClient());
        String url = "https://ustjogja.ac.id/id/sejarah-ust";
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);

    }

    private class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            view.loadUrl(url);
            return true;
        }
    }

}