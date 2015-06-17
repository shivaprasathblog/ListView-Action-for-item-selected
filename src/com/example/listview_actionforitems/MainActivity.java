package com.example.listview_actionforitems;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity 
{
	
ListView lv;

String [] fruits ={"Laptop","Tablet","Mobile","Desktop","Keyboard","Mouse","Hard Disk","RAM"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		lv=(ListView)findViewById(R.id.listView1);
		
		ArrayAdapter<String>ad = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,fruits);
		lv.setAdapter(ad);
		
		lv.setOnItemClickListener(new OnItemClickListener() 
		{

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,long arg3) 
					
			{
				// TODO Auto-generated method stub
				if (arg2==0)
				{
					/**Action to be performed if item 0(Laptop) is clicked**/
					Intent i = new Intent(MainActivity.this,LaptopActivity.class);
					startActivity(i);
				}
				if (arg2==1)
				{
					Intent i = new Intent(MainActivity.this,TabletActivity.class);
					startActivity(i);
				}
				
				if (arg2==2)
				{
					Intent i = new Intent(MainActivity.this,MobileActivity.class);
					startActivity(i);
				}
				if (arg2==3)
				{
					Intent i = new Intent(MainActivity.this,DesktopActivity.class);
					startActivity(i);
				}
				if (arg2==4)
				{
					Intent i = new Intent(MainActivity.this,KeyboardActivity.class);
					startActivity(i);
				}
				if (arg2==5)
				{
					Intent i = new Intent(MainActivity.this,MouseActivity.class);
					startActivity(i);
				}
				if (arg2==6)
				{
					Intent i = new Intent(MainActivity.this,HarddiskActivity.class);
					startActivity(i);
				}
				if (arg2==7)
				{
					Intent i = new Intent(MainActivity.this,RAMActivity.class);
					startActivity(i);
				}
			
			}
		});
	}



}
