package com.coffeshop;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;

public class MainActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		ImageButton register = (ImageButton)findViewById(R.id.registerButton);
		
		register.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0)
			{
				Log.e("","dasdada");
				Intent intent = new Intent(MainActivity.this, RegisterScreen.class);
				startActivity(intent);
			}
			
		});
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		// TODO Auto-generated method stub
		return super.onOptionsItemSelected(item);
	}

}
