package com.example.isolate;

import android.os.Bundle;
import android.app.Activity;
import android.webkit.WebView;

public class InstructionsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);

        // get our html content
        String htmlAsString = getString(R.string.test);


        WebView webView = (WebView) findViewById(R.id.webView);
        webView.loadDataWithBaseURL(null, htmlAsString, "text/html", "utf-8", null);

    }

}
