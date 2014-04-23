package com.thunderstick.medreminder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {
<<<<<<< HEAD

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
					Intent openMainActivity = new Intent("com.thunderstick.medreminder.add");
					startActivity(openMainActivity);
				}
			}
		};
		timer.start();


	}

=======
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage);
        
        setContentView(R.layout.add);
        
        
        
    }

   
>>>>>>> bbe0dacdac5adc2abaf9665354bc6136d91a46a9
}
