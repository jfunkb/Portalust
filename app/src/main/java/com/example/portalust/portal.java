package com.example.portalust;

import android.os.Bundle;
import android.webkit.WebView;

public class portal extends MainActivity {

    private WebView webView;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal);

        webView = findViewById(R.id.webportal);
        webView = findViewById(R.id.webportal);
        webView.setWebViewClient(new WebViewClient());
        String url = "https://portal.ustjogja.ac.id/";
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