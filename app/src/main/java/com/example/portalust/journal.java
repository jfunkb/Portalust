package com.example.portalust;

import android.os.Bundle;
import android.webkit.WebView;

public class journal extends MainActivity {

    private WebView webView;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journal);

        webView = findViewById(R.id.webjournal);
        webView = findViewById(R.id.webjournal);
        webView.setWebViewClient(new WebViewClient());
        String url = "https://jurnal.ustjogja.ac.id/";
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