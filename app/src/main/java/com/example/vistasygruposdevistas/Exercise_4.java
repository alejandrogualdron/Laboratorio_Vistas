package com.example.vistasygruposdevistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Exercise_4 extends AppCompatActivity implements View.OnClickListener {
    Button btnExercise4;
    Button btnAnterior3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_4);
        btnExercise4=(Button)findViewById(R.id.btnExercise4);
        btnExercise4.setOnClickListener(this);

        btnAnterior3=(Button)findViewById(R.id.btnAnterior3);
        btnAnterior3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnExercise4:
                Intent i1 = new Intent(Exercise_4.this, Exercise_5.class);
                startActivity(i1);
                break;
            case R.id.btnAnterior3:
                Intent i2 = new Intent(Exercise_4.this, Exercise_3.class);
                startActivity(i2);
                break;
        }
    }
}