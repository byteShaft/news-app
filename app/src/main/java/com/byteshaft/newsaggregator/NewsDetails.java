package com.byteshaft.newsaggregator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class NewsDetails extends AppCompatActivity {
    private WebView mWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);
        mWebview = (WebView) findViewById(R.id.webview);
        Bundle bundle = getIntent().getExtras();
        mWebview.loadUrl(bundle.getString("Link"));
    }
}
