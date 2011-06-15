package com.param;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
/**
 * My Android app
 * @author parampreetsethi
 *
 */
public class HelloWorld extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView tv = new TextView(this);
		tv.setCursorVisible(true);
		tv.setBackgroundColor(5);
		tv.setText("Hello World!!! Hey I did it!!!!");
		setContentView(tv);
	}
	
	
	@Override
	protected void onDestroy() {
		System.runFinalizersOnExit(true);
		super.onDestroy();
	}
}
