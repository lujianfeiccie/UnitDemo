package com.example.unitdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener{

	EditText edit_dp,edit_px,edit_sp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		edit_dp = (EditText)findViewById(R.id.edit_dp);
		edit_px = (EditText)findViewById(R.id.edit_px);
		edit_sp = (EditText)findViewById(R.id.edit_sp);
		findViewById(R.id.bt_dp).setOnClickListener(this);
		findViewById(R.id.bt_px).setOnClickListener(this);
		findViewById(R.id.bt_sp).setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.bt_dp:
			String dp  = edit_dp.getText().toString();
			try{
			int i_dp = Integer.parseInt(dp);
			int i_px = OtherTool.DipToPixels(this, i_dp);
			edit_px.setText(""+i_px);
			int i_sp = OtherTool.px2sp(this, i_px);
			edit_sp.setText(""+i_sp);
			}catch(Exception e){
				
			}
			break;
		case R.id.bt_px:
			String px  = edit_px.getText().toString();
			try{
			int i_px = Integer.parseInt(px);
			float i_dp = OtherTool.PixelsToDip(this, i_px);
			edit_dp.setText(""+i_dp);
			int i_sp = OtherTool.px2sp(this, i_px);
			edit_sp.setText(""+i_sp);
			}catch(Exception e){
				
			}
			break;
		case R.id.bt_sp:
			String sp  = edit_sp.getText().toString();
			try{
			int i_px = OtherTool.sp2px(this, Float.parseFloat(sp));
			float i_dp = OtherTool.PixelsToDip(this, i_px);
			edit_dp.setText(""+i_dp);
			edit_px.setText(""+i_px);
			}catch(Exception e){
				
			}
			break;
		}
	}

}
