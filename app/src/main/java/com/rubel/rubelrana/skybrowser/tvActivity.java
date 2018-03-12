package com.rubel.rubelrana.skybrowser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tvActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv);
        btn3 = (Button) findViewById(R.id.tv1);
        btn1 = (Button) findViewById(R.id.insta1);
        btn2 = (Button) findViewById(R.id.bik1);
        btn4 = (Button) findViewById(R.id.sony);
        btn5 = (Button) findViewById(R.id.ml1);
        btn6 = (Button) findViewById(R.id.news1);
        btn7 = (Button) findViewById(R.id.news2);
        btn8 = (Button) findViewById(R.id.exit);

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                finish();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == btn7)
                {
                    Intent news2 = new Intent(tvActivity.this,urlActivity.class);
                    news2.putExtra("url_address","http://www.prothomalo.com/");
                    startActivity(news2);
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == btn6)
                {
                    Intent news1 = new Intent(tvActivity.this,urlActivity.class);
                    news1.putExtra("url_address","https://bangla.bdnews24.com/");
                    startActivity(news1);
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == btn5)
                {
                    Intent mail = new Intent(tvActivity.this,urlActivity.class);
                    mail.putExtra("url_address","https://www.gmail.com");
                    startActivity(mail);
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == btn4)
                {
                    Intent sony = new Intent(tvActivity.this,urlActivity.class);
                    sony.putExtra("url_address","https://www.sonyliv.com");
                    startActivity(sony);
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == btn2)
                {
                    Intent bikroy = new Intent(tvActivity.this,urlActivity.class);
                    bikroy.putExtra("url_address","https://www.bikroy.com");
                    startActivity(bikroy);
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == btn1)
                {
                    Intent insta = new Intent(tvActivity.this,urlActivity.class);
                    insta.putExtra("url_address","https://www.instagram.com");
                    startActivity(insta);
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view == btn3)
                {
                    Intent tv = new Intent(tvActivity.this,urlActivity.class);
                    tv.putExtra("url_address","http://www.bioscopelive.com/");
                    startActivity(tv);
                }
            }
        });
    }
}
