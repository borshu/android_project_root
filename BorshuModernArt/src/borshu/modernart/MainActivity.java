package borshu.modernart;

import android.app.Activity;
import android.app.Dialog;
import android.app.FragmentManager;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity {
	//start
	private int[] mLeftTopColor = {106, 118, 190};
	private int[] mLeftBottomColor = {223, 96, 151};
	private int[] mRightTopColor = {176, 43, 26};
	private int[] mRightCenterColor = {229, 229, 229};
	private int[] mRightBottomColor = {39, 57, 155};
	
	private float mF1p5 = (float)(150/100);
	private float mF0p32 = (float)(32/100);
	private float mF0p79 = (float)(79/100);
	private float mF1p35 = (float)(135/100);
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		
		SeekBar sb = (SeekBar)findViewById(R.id.changeColorBar);
		final TextView leftTop = (TextView) findViewById(R.id.leftTop);
		final TextView leftBottom = (TextView) findViewById(R.id.leftBottom);
		final TextView rightTop = (TextView) findViewById(R.id.rightTop);
		final TextView rightCenter = (TextView) findViewById(R.id.rightCenter);
		final TextView rightBottom = (TextView) findViewById(R.id.rightBottom);
		
		sb.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
	
				leftTop.setBackgroundColor(Color.rgb((int)(mLeftTopColor[0] + (progress * mF1p5)), 
													(int)(mLeftTopColor[1] + (progress * mF1p35)), 
													mLeftTopColor[2]));
				
				leftBottom.setBackgroundColor(Color.rgb((int)(mLeftBottomColor[0] + (progress * mF0p32)), 
														(int)(mLeftBottomColor[1] + (progress * mF1p35)), 
														mLeftBottomColor[2]));
				
				rightTop.setBackgroundColor(Color.rgb((int)(mRightTopColor[0] + (progress * mF0p79)), 
													(int)(mRightTopColor[1] + (progress * mF1p35)), 
													mRightTopColor[2]));
				
				rightCenter.setBackgroundColor(Color.rgb((int)(mRightCenterColor[0]), 
														(int)(mRightCenterColor[1]), 
															mRightCenterColor[2]));
				
				rightBottom.setBackgroundColor(Color.rgb((int)(mRightBottomColor[0] + (progress * mF1p5)), 
															(int)(mRightBottomColor[1] + (progress * mF1p5)), 
															mRightBottomColor[2]));
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			FragmentManager manager = getFragmentManager();
			MoreInfoDialog myDialogFragment = new MoreInfoDialog();
		    myDialogFragment.show(manager, "more_info");
		    
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
	
	@Override
	public Dialog onCreateDialog(int id){
		Log.i("borshu", "create dialog " + id);
		return null;
	}
}
