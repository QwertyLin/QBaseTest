package q.base.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

public class RotateTest extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rotate);
		
		
		CaptureTabInitService.initLayoutClick(findViewById(R.id.capture_tab_layout));
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		new Thread(){
			public void run() {
				SystemClock.sleep(3000);
				runOnUiThread(new Runnable() {
					
					@Override
					public void run() {
						//startActivity(new Intent(RotateTest.this, TabActivityBaseTest.class));
					}
				});
			};
		}.start();
	}
}
