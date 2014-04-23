package com.thunderstick.medreminder;

import android.app.Activity;
import android.os.Bundle;
import android.view.textservice.SpellCheckerSubtype;
import android.widget.Button;
import android.widget.GridLayout.Spec;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class add extends Activity
{
	TabHost tbhst;
	TabSpec spec;

	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add);
        
        tbhst = (TabHost)findViewById(R.id.tabhost);
        tbhst.setup();
        
        spec = tbhst.newTabSpec("Item");
        spec.setContent(R.id.Item);
        spec.setIndicator("Items");
        tbhst.addTab(spec);
        
        spec = tbhst.newTabSpec("Schedule");
        spec.setContent(R.id.Schedule);
        spec.setIndicator("Schedule");
        tbhst.addTab(spec);

}
}