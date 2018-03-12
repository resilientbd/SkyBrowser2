package com.rubel.rubelrana.skybrowser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class urlActivity extends AppCompatActivity {
    private WebView srcd2;
    private Button back,next,refer,home;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url);

        back = (Button) findViewById(R.id.id1);
        next = (Button) findViewById(R.id.id2);
        refer = (Button) findViewById(R.id.id3);
        home = (Button) findViewById(R.id.id4);

        srcd2=(WebView) findViewById(R.id.webid);
        WebSettings webSettings = srcd2.getSettings();
        webSettings.setJavaScriptEnabled(true);
        srcd2.setWebViewClient(new WebViewClient());
        url = getIntent().getExtras().get("url_address").toString();
        srcd2.loadUrl(url);
        refer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view == refer){
                    srcd2.reload();
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view == next){
                    srcd2.goForward();
                }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view == back){
                    srcd2.goBack();
                }
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sky = new Intent(urlActivity.this,MainActivity.class);
                startActivity(sky);
            }
        });

    }

    @Override
    public void onBackPressed()
    {
        if(srcd2.canGoBack())
        {
            srcd2.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}
