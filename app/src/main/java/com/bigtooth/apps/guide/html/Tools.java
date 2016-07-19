package com.bigtooth.apps.guide.html;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Tools extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-5164171001589422/4425382992");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        TextView textView =(TextView)findViewById(R.id.textView1);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='http://www.w3schools.com'>W3 Schools</a>";
        textView.setText(Html.fromHtml(text));

        TextView textView1 =(TextView)findViewById(R.id.textView2);
        textView1.setClickable(true);
        textView1.setMovementMethod(LinkMovementMethod.getInstance());
        String text1 = "<a href='http://www.stackoverflow.com'>Stack Overflow</a>";
        textView1.setText(Html.fromHtml(text1));

        TextView textView2 =(TextView)findViewById(R.id.textView3);
        textView2.setClickable(true);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        String text2 = "<a href='http://www.adobe.com/products/dreamweaver.html'>Adobe Dreamweaver</a>";
        textView2.setText(Html.fromHtml(text2));
    }

}
