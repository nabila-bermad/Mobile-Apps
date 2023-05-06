package com.example.laconduite;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActivityTheme65 extends  Activity {
	RadioGroup rGroupTheme65;
	RadioButton buttonTheme651,buttonTheme652;
	Chronometer Chronometer65;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme65);



		
		
		
		
rGroupTheme65 = (RadioGroup) findViewById(R.id.radioGroupTheme65);
		
        Chronometer65 = (Chronometer) findViewById(R.id.chronometer65);
		
		Chronometer65.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonTheme651 = new RadioButton(this);
		buttonTheme651.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme65.addView(buttonTheme651);
		 
		 buttonTheme652 = new RadioButton(this);
		buttonTheme652.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme65.addView(buttonTheme652);
		 
		
		 
		rGroupTheme65.check(buttonTheme651.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme65.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderTheme65(View v) 
	
	{ buttonTheme651.setTextColor(Color.BLUE);
	
	 rGroupTheme65.check(buttonTheme651.getId()) ;
	 
	 Chronometer65.stop();
	}	
	
	
	
	
}
