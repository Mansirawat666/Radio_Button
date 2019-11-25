package com.example.radio_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
RadioGroup r1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1=findViewById(R.id.r1);
        r1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.r2:
                        Toast.makeText(MainActivity.this, "Male", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.r3:
                        Toast.makeText(MainActivity.this, "Female", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });


    }
}
