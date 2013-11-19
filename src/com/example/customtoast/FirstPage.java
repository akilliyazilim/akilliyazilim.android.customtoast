package com.example.customtoast;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FirstPage extends Activity {

	Button normal_toast,custom_toast;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first_page);
		
		normal_toast = (Button)findViewById(R.id.ToastButton);
		custom_toast = (Button)findViewById(R.id.CustomToast);
		
		normal_toast.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// display in long period of time, for short toast, write Toast.LENGTH_SHORT
				Toast.makeText(getApplicationContext(), "Normal Toast!", Toast.LENGTH_LONG).show();
			}
		});
		
		custom_toast.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				// get your custom_toast.xml ayout
				LayoutInflater inflater = getLayoutInflater();
 
				View layout = inflater.inflate(R.layout.custom_toast,
				  (ViewGroup) findViewById(R.id.custom_toast_layout_id));
 
				// set a dummy image
				ImageView image = (ImageView) layout.findViewById(R.id.image);
				image.setImageResource(R.drawable.image);
 
				// set a message
				TextView text = (TextView) layout.findViewById(R.id.text);
				text.setText("Custom Toast!");
 
				// Toast...
				Toast toast = new Toast(getApplicationContext());
				toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
				toast.setDuration(Toast.LENGTH_LONG);
				toast.setView(layout);
				toast.show();
			}
		});
		
		
		
		
	}

}
