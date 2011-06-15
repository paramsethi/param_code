package com.param;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class param extends Activity {
  EditText mEditText_number = null;
  LinearLayout mLinearLayout_no_button = null;
  Button mButton_dial = null;

  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    mLinearLayout_no_button = new LinearLayout(this);

    mEditText_number = new EditText(this);
    mEditText_number.setText("5713378521");
    mLinearLayout_no_button.addView(mEditText_number);

    mButton_dial = new Button(this);
    mButton_dial.setText("Dial!");
    mLinearLayout_no_button.addView(mButton_dial);
    mButton_dial.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        performDial();
      }
    });

    setContentView(mLinearLayout_no_button);
  }
  
  

  public boolean onKeyDown(int keyCode, KeyEvent event) {
    if (keyCode == KeyEvent.KEYCODE_CALL) {
      performDial();
      return true;
    }
    return false;
  }

  public void performDial(){
    if(mEditText_number!=null){
      try {
        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + mEditText_number.getText())));
      } catch (Exception e) {
        e.printStackTrace();
      }
    }//if
  }
  
  @Override
	protected void onDestroy() {
	  System.runFinalizersOnExit(true);
		super.onDestroy();
	}
}