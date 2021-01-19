package com.example.vistasygruposdevistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Exercise2 extends AppCompatActivity implements View.OnClickListener {
    Button btnExercise2;
    Button btnAnterior;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2);
        btnExercise2=(Button)findViewById(R.id.btnExercise2);
        btnExercise2.setOnClickListener(this);

        btnAnterior=(Button)findViewById(R.id.btnAnterior);
        btnAnterior.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnExercise2:
                Intent i1 = new Intent(Exercise2.this, Exercise_3.class);
                startActivity(i1);
                break;
            case R.id.btnAnterior:
                Intent i2 = new Intent(Exercise2.this, MainActivity.class);
                startActivity(i2);
                break;
        }
    }
}