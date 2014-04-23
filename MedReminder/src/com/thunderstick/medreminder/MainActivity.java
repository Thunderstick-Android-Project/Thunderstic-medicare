package com.thunderstick.medreminder;





import com.thunderstick.medreminder.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;



public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.mainpage);

	
		Thread timer = new Thread() {

			public void run() {
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent openMainActivity = new Intent(
							"com.thunderstick.medreminder.AddItem");
					startActivity(openMainActivity);
				}
			}
		};
		
		timer.start();
		

	}

}
