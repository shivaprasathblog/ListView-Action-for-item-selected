package com.example.listview_actionforitems;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class DesktopActivity extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_desktop);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.desktop, menu);
		return true;
	}

}
