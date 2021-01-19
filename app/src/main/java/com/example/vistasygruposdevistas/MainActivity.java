package com.example.vistasygruposdevistas;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnExercise1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnExercise1=(Button)findViewById(R.id.btnExercise1);
        btnExercise1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
            switch (v.getId()) {

                case R.id.btnExercise1:
                    Intent i1 = new Intent(MainActivity.this,Exercise2 .class);
                    startActivity(i1);
                    break;
                    }
    }
}