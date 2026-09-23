package com.calculatoruniverse.app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create WebView
        webView = new WebView(this);

        // Show WebView on screen
        setContentView(webView);

        // WebView settings
        WebSettings settings = webView.getSettings();

        // Enable JavaScript
        settings.setJavaScriptEnabled(true);

        // Enable local storage
        settings.setDomStorageEnabled(true);

        // Enable database
        settings.setDatabaseEnabled(true);

        // Allow website content
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);

        // Keep links inside the app
        webView.setWebViewClient(new WebViewClient());

        // Load MASTERMIND website
        webView.loadUrl(
            "https://cracker-birthday-calculator.onrender.com"
        );
    }

    @Override
    public void onBackPressed() {

        // Go back inside WebView if possible
        if (webView != null && webView.canGoBack()) {

            webView.goBack();

        } else {

            // Otherwise close the app
            super.onBackPressed();

        }
    }
}
