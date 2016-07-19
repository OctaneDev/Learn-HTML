package com.bigtooth.apps.guide.html;

import android.app.*;
import android.os.*;
import android.support.v7.app.AppCompatActivity;
import android.view.*;
import android.widget.*;
import android.content.Intent;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity
{
	InterstitialAd mInterstitialAd;

    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		MobileAds.initialize(getApplicationContext(), "ca-app-pub-5164171001589422/4425382992");

		AdView mAdView = (AdView) findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		mAdView.loadAd(adRequest);

		mInterstitialAd = new InterstitialAd(this);
		mInterstitialAd.setAdUnitId("ca-app-pub-5164171001589422/5997008595");

		mInterstitialAd.setAdListener(new AdListener() {
			@Override
			public void onAdClosed() {
				requestNewInterstitial();
			}
		});

		requestNewInterstitial();
    }
	private void requestNewInterstitial() {
		AdRequest adRequest = new AdRequest.Builder()
				.addTestDevice("5C6759521D465119182182A234FF5CE3")
				.build();

		mInterstitialAd.loadAd(adRequest);
	}
	public void whatis(View view) {
		if (mInterstitialAd.isLoaded()) {
			mInterstitialAd.show();
			Intent intent = new Intent(this, WhatIs.class);
			startActivity(intent);
		} else {
			Intent intent = new Intent(this, WhatIs.class);
			startActivity(intent);
		}
	}
	public void basics(View view) {
		if (mInterstitialAd.isLoaded()) {
			mInterstitialAd.show();
			Intent intent = new Intent(this, Basics.class);
			startActivity(intent);
		} else {
			Intent intent = new Intent(this, Basics.class);
			startActivity(intent);
		}
	}
	public void difficult(View view) {
		if (mInterstitialAd.isLoaded()) {
			mInterstitialAd.show();
			Intent intent = new Intent(this, Difficult.class);
			startActivity(intent);
		} else {
			Intent intent = new Intent(this, Difficult.class);
			startActivity(intent);
		}
	}
	public void styling(View view) {
		if (mInterstitialAd.isLoaded()) {
			mInterstitialAd.show();
			Intent intent = new Intent(this, Styling.class);
			startActivity(intent);
		} else {
			Intent intent = new Intent(this, Styling.class);
			startActivity(intent);
		}
	}
	public void tools(View view) {
		if (mInterstitialAd.isLoaded()) {
			mInterstitialAd.show();
			Intent intent = new Intent(this, Tools.class);
			startActivity(intent);
		} else {
			Intent intent = new Intent(this, Tools.class);
			startActivity(intent);
		}
	}
}
