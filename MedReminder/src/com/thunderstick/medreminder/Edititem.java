package com.thunderstick.medreminder;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Edititem extends Activity {

	TabHost th;
	TabSpec specs;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		setContentView(R.layout.itemedit);

		th = (TabHost) findViewById(R.id.tabhost);

		th.setup();
		specs = th.newTabSpec("tag1");// just set it up
		specs.setContent(R.id.Item);
		specs.setIndicator("Item");
		th.addTab(specs);

		specs = th.newTabSpec("tag2");// just set it up
		specs.setContent(R.id.Shedule);
		specs.setIndicator("Shedule");
		th.addTab(specs);
	}

}
