package sg.edu.rp.c346.id20013327.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textViewDisplay);



        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int date = dp.getDayOfMonth();
                int month = dp.getMonth()+1;
                int year = dp.getYear();

                tvDisplay.setText("Date is " + date + "/" + month + "/" + year);

            }
        });


        btnDisplayTime.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int timeInHour = tp.getCurrentHour();
                int timeInMinutes = tp.getCurrentMinute();
                if(timeInHour < 10 && timeInMinutes < 10) {
                    String time = "Time is 0" + String.valueOf(timeInHour) + ":0" + String.valueOf(timeInMinutes) ;
                    tvDisplay.setText(time);
                } else if(timeInHour < 10) {
                    String time = "Time is 0" + String.valueOf(timeInHour) + ":" + String.valueOf(timeInMinutes) ;
                    tvDisplay.setText(time);
                } else if(timeInMinutes < 10) {
                    String time = "Time is " + String.valueOf(timeInHour) + ":0" + String.valueOf(timeInMinutes) ;
                    tvDisplay.setText(time);
                } else {
                    String time = "Time is " + String.valueOf(timeInHour) + ":" + String.valueOf(timeInMinutes);
                    tvDisplay.setText(time);
                }
            }
        });


    }


}