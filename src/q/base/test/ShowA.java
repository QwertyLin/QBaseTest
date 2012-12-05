package q.base.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowA extends Activity {
	
	public static final String EXTRA_TAG = "tag";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		String tag = getIntent().getStringExtra(EXTRA_TAG);
		
		TextView tv = new TextView(this);
		tv.setText("show activity：" + tag);
		setContentView(tv);
	}
}
