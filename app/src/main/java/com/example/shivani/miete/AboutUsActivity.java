package com.example.shivani.miete;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutUsActivity extends AppCompatActivity {
    TextView textView2, shivaniText, sakshiText, raviText, textView3, aboutUsHead;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        aboutUsHead = (TextView) findViewById(R.id.aboutUsHead);
        textView2 = (TextView) findViewById(R.id.textView2);
        shivaniText = (TextView) findViewById(R.id.shivani);
        sakshiText = (TextView) findViewById(R.id.sakshi);
        raviText = (TextView) findViewById(R.id.ravi);
        textView3 = (TextView) findViewById(R.id.textView3);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/alex.ttf");
        textView2.setTypeface(custom_font);
        aboutUsHead.setTypeface(custom_font);
        shivaniText.setTypeface(custom_font);
        sakshiText.setTypeface(custom_font);
        raviText.setTypeface(custom_font);
        textView3.setTypeface(custom_font);
    }
}
