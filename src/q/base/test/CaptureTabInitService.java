package q.base.test;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class CaptureTabInitService {
	
	

	public static final void init(){
		
	}
	
	public static final void initLayoutClick(View layout){
		layout.setOnTouchListener(new OnTouchListener() {
			    int maxX, maxY;
			    float x, y;
			    float y1, y2, y3;
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				if(maxX == 0){
					maxX = v.getWidth();
					maxY = v.getHeight();
					y2 = maxY / 2;
					y1 = y2 / 2;
					y3 = y1 * 3;
				}
				x = event.getX();
				y = event.getY();
				
				switch(event.getAction()){
				case MotionEvent.ACTION_UP:
					if(x < 0 || x > maxX || y < 0 || y > y3){
						return true;
					}
					if(y < y1){
						System.out.println("4");
					}else if(y < y2){
						System.out.println("3");
					}else if(y < y3){
						System.out.println("2");
					}
					
					return true;
				}
				return true;
			}
		});
	}
	
}

