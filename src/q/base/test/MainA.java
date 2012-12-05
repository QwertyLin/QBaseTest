package q.base.test;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;

public class MainA extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        startActivity(new Intent(this, TabActivityBaseTest.class));
        
        finish();
    }

}
