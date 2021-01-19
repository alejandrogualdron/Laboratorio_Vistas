package com.example.vistasygruposdevistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Exercise_5 extends AppCompatActivity implements View.OnClickListener{
    Button btnExercise5;
    Button btnAnterior4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_5);

        btnExercise5=(Button)findViewById(R.id.btnExercise5);
        btnExercise5.setOnClickListener(this);

        btnAnterior4=(Button)findViewById(R.id.btnAnterior4);
        btnAnterior4.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnExercise5:
                Intent i1 = new Intent(Exercise_5.this, Exercise_6.class);
                startActivity(i1);
                break;
            case R.id.btnAnterior4:
                Intent i2 = new Intent(Exercise_5.this, Exercise_4.class);
                startActivity(i2);
                break;
        }

    }
}