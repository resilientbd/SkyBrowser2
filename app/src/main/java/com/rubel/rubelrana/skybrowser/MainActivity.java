package com.rubel.rubelrana.skybrowser;


         import android.app.Activity;
         import android.content.Intent;
         import android.graphics.Bitmap;
         import android.os.Bundle;
         import android.view.KeyEvent;
         import android.view.View;
         import android.webkit.WebSettings;
         import android.webkit.WebView;
         import android.widget.Button;
         import android.widget.EditText;
         import android.widget.ProgressBar;


public class MainActivity extends Activity {

    WebView web1;
    EditText ed1;
    Button bt1,fb,cricket,you,gog,selct;
    String Address;
    String add;
    ProgressBar pbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        web1 = (WebView)findViewById(R.id.webView1);
        ed1 = (EditText)findViewById(R.id.editText1);
        bt1 = (Button)findViewById(R.id.button1);
        pbar = (ProgressBar)findViewById(R.id.progressBar1);
        pbar.setVisibility(View.GONE);
        fb = (Button) findViewById(R.id.fb1);
        you= (Button) findViewById(R.id.you1);
        gog = (Button) findViewById(R.id.gog1);
        cricket = (Button) findViewById(R.id.cricket);
        selct = (Button)findViewById(R.id.choice);
        selct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tv = new Intent(MainActivity.this,tvActivity.class);
                startActivity(tv);
            }
        });
        cricket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == cricket)
                {
                    Intent cricket = new Intent(MainActivity.this,urlActivity.class);
                    cricket.putExtra("url_address","https://www.cricbuzz.com");
                    startActivity(cricket);
                }
            }
        });
        you.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == you)
                {
                    Intent youtube = new Intent(MainActivity.this,urlActivity.class);
                    youtube.putExtra("url_address","https://www.youtube.com");
                    startActivity( youtube);
                }
            }
        });
        gog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == gog)
                {
                    Intent google = new Intent(MainActivity.this,urlActivity.class);
                    google.putExtra("url_address","https://www.google.com");
                    startActivity(google);
                }
            }
        });
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == fb)
                {
                    Intent facebook = new Intent(MainActivity.this,urlActivity.class);
                    facebook.putExtra("url_address","https://www.facebook.com");
                    startActivity(facebook);
                }
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Address = "http://" + ed1.getText().toString();
                WebSettings webSetting = web1.getSettings();
                webSetting.setBuiltInZoomControls(true);
                webSetting.setJavaScriptEnabled(true);
                web1.setWebViewClient(new WebViewClient());
                web1.loadUrl(Address);
            }
        });
    }

    public class WebViewClient extends android.webkit.WebViewClient
    {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {

            // TODO Auto-generated method stub
            super.onPageStarted(view, url, favicon);
            pbar.setVisibility(View.VISIBLE);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            //TODO Auto-generated method stub
            view.loadUrl(url);
            return true;
        }
        @Override
        public void onPageFinished(WebView view, String url) {

            // TODO Auto-generated method stub

            super.onPageFinished(view, url);
            pbar.setVisibility(View.GONE);
        }

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && web1.canGoBack()) {
            web1.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}