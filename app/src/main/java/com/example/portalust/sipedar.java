package  com.example.portalust;


import android.os.Bundle;
import android.webkit.WebView;




public class sipedar extends MainActivity {

    private WebView webView;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sipedar);

        webView = findViewById(R.id.sipedarweb);
        webView = findViewById(R.id.sipedarweb);
        webView.setWebViewClient(new WebViewClient());
        String url = "https://sipedar.ustjogja.ac.id/login/index.php";
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