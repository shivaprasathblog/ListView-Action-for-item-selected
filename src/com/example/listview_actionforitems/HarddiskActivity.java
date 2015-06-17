package com.example.listview_actionforitems;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class HarddiskActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_harddisk);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.harddisk, menu);
		return true;
	}

}
