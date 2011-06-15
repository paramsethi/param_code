package com.param.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MyFirstClass extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView tv = new TextView(this);
		tv.setCursorVisible(true);
		tv.setBackgroundColor(5);
		tv.setText("Hello World!!! Hey I did it!!!!");
		setContentView(tv);
	}
}
