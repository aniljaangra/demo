package com.mz.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secondactivity);
		
		Button b=(Button) findViewById(R.id.button1);
		final EditText et=(EditText) findViewById(R.id.editText1);
		
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(SecondActivity.this,ThirdActivity.class);
				System.out.println(et.getText().toString());
				intent.putExtra("textvalue", et.getText().toString());
				startActivity(intent);
			}
		});
		
	}
}
