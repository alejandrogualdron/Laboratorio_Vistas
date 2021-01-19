package com.example.vistasygruposdevistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Exercise_3 extends AppCompatActivity implements View.OnClickListener {
    Button btnExercise3;
    Button btnAnterior2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_3);

        btnExercise3=(Button)findViewById(R.id.btnExercise3);
        btnExercise3.setOnClickListener(this);

        btnAnterior2=(Button)findViewById(R.id.btnAnterior2);
        btnAnterior2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnExercise3:
                Intent i1 = new Intent(Exercise_3.this, Exercise_4.class);
                startActivity(i1);
                break;
            case R.id.btnAnterior2:
                Intent i2 = new Intent(Exercise_3.this, Exercise2.class);
                startActivity(i2);
                break;
        }

    }
}