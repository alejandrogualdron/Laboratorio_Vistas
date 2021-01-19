package com.example.vistasygruposdevistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.ToggleButton;

public class Exercise_7 extends AppCompatActivity implements View.OnClickListener {
    Switch onOff;
    ToggleButton a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_7);

        onOff=(Switch) findViewById(R.id.switch_view);
        onOff.setOnClickListener(this);

        a=(ToggleButton) findViewById(R.id.tbExercise8);
        a.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.switch_view:
               boolean on =((Switch)v).isChecked();
               if(on){
                   //on
               }else{
                   //off
               }

                break;
            case R.id.tbExercise8:
                boolean as=((ToggleButton)v).isChecked();
                if(as){
                    //on
                    Intent i1 = new Intent(Exercise_7.this, Exercise_8.class);
                    startActivity(i1);
                }else {
                    //off
                    Intent i2 = new Intent(Exercise_7.this, Exercise_6.class);
                    startActivity(i2);
                }
                break;
        }
    }
}