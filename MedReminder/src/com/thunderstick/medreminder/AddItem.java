package com.thunderstick.medreminder;



import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class AddItem extends Activity {

	TabHost th;
	TabSpec specs;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.additem);
		
		th=(TabHost)findViewById(R.id.tabhost);
		
		th.setup();
		specs=th.newTabSpec("tag1");//just set it up
		specs.setContent(R.id.tab1);
		specs.setIndicator("Item");
		th.addTab(specs);
	
		specs=th.newTabSpec("tag2");//just set it up
		specs.setContent(R.id.tab2);
		specs.setIndicator("Shedule");
		th.addTab(specs);
	}
	
	

}
