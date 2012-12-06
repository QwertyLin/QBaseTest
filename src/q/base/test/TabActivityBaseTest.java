package q.base.test;

import q.base.TabActivityBase;
import android.app.TabActivity;
import android.content.Intent;
import android.view.View;
import android.widget.RadioButton;

public class TabActivityBaseTest extends TabActivityBase {

	@Override
	protected int getCount() {
		return 4;
	}

	@Override
	protected Intent getIntent(int position) {
		return new Intent(this, ShowA.class).putExtra(ShowA.EXTRA_TAG, "intent" + position);
	}

	@Override
	protected String getBtnText(int position) {
		return "测试";
	}

	@Override
	protected int getBtnDrawable(int position) {
		// TODO Auto-generated method stub
		return R.drawable.base_checkbox;
	}


}
