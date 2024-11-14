package com.example.portalust;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class by extends MainActivity {

    private WebView webView;
    private WebSettings webSettings;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_by);

        webView = findViewById(R.id.webby);
        webView = findViewById(R.id.webby);
        webView.getSettings();
        webView.setWebViewClient(new WebViewClient());
        String url = "https://pmb.ustjogja.ac.id/biayakuliah";
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