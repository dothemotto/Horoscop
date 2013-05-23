package com.ciuby.horoscop;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button b1 = (Button) findViewById(R.id.button1);
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(MainActivity.this,Varsator.class));
			}
		});
		Button b2 = (Button) findViewById(R.id.button2);
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 //TODO Auto-generated method stub
				startActivity(new Intent(MainActivity.this,Pesti.class));
			}
		});
		Button b3 = (Button) findViewById(R.id.button9);
		b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 //TODO Auto-generated method stub
				startActivity(new Intent(MainActivity.this,Balanta.class));
			}
		});
		Button b4 = (Button) findViewById(R.id.button3);
		b4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 //TODO Auto-generated method stub
				startActivity(new Intent(MainActivity.this,Berbec.class));
			}
		});
		Button b5 = (Button) findViewById(R.id.button12);
		b5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 //TODO Auto-generated method stub
				startActivity(new Intent(MainActivity.this,Capricorn.class));
			}
		});
		Button b6 = (Button) findViewById(R.id.button8);
		b6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 //TODO Auto-generated method stub
				startActivity(new Intent(MainActivity.this,Fecioara.class));
			}
		});
		Button b7 = (Button) findViewById(R.id.button5);
		b7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 //TODO Auto-generated method stub
				startActivity(new Intent(MainActivity.this,Gemeni.class));
			}
		});
		Button b8 = (Button) findViewById(R.id.button7);
		b8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 //TODO Auto-generated method stub
				startActivity(new Intent(MainActivity.this,Leu.class));
			}
		});
		Button b9 = (Button) findViewById(R.id.button6);
		b9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 //TODO Auto-generated method stub
				startActivity(new Intent(MainActivity.this,Rac.class));
			}
		});
		Button b10 = (Button) findViewById(R.id.button11);
		b10.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 //TODO Auto-generated method stub
				startActivity(new Intent(MainActivity.this,Sagetator.class));
			}
		});
		Button b11 = (Button) findViewById(R.id.button10);
		b11.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 //TODO Auto-generated method stub
				startActivity(new Intent(MainActivity.this,Scorpion.class));
			}
		});
		Button b12 = (Button) findViewById(R.id.button4);
		b12.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 //TODO Auto-generated method stub
				startActivity(new Intent(MainActivity.this,Taur.class));
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
