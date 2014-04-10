package com.appcapgem;

import org.apache.cordova.DroidGap;

import android.os.Bundle;

public class MainActivity extends DroidGap{

	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		super.loadUrl("file:///android_asset/www/index.html");
	}
}