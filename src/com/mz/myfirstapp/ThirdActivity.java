package com.mz.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.thirdactivity);
		
		
		TextView tv=(TextView) findViewById(R.id.textView1);
		tv.append(getIntent().getExtras().getString("textvalue"));
		
		
	}
}
