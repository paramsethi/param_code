package com.hello;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Hello world sample for Android
 * @author parampreetsethi
 *
 */
public class HelloAndroid extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView tv = new TextView(this);
		tv.setCursorVisible(true);
		tv.setBackgroundColor(5);
		tv.setText("Hello Android!!! Here I come :)!!");
		setContentView(tv);
	}
	
	
	@Override
	public void onDestroy() {
		System.runFinalizersOnExit(true);
		super.onDestroy();
	}
}