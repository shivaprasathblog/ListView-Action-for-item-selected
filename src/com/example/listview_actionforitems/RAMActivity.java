package com.example.listview_actionforitems;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class RAMActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ram);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ram, menu);
		return true;
	}

}
