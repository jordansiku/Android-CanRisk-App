package com.example.termproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    RadioGroup rg;
    Button btnext2;
    TextView tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        rg=findViewById(R.id.RadioGroupAct2);
        btnext2=findViewById(R.id.buttonnext2);
        tv6=findViewById(R.id.textView6);
        tv6.setVisibility(View.INVISIBLE);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){

                    case R.id.radioButton25:
                        TotalScore.score=TotalScore.score+0;
                        break;

                    case R.id.radioButton29:
                        TotalScore.score=TotalScore.score+4;

                        break;

                    case R.id.radioButton34:
                        TotalScore.score=TotalScore.score+9;

                        break;


                    case R.id.radioButtonover:
                        TotalScore.score=TotalScore.score+14;

                        break;


                }
            }
        });

        btnext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {







                Toast.makeText(MainActivity2.this, " Your score is "+TotalScore.score, Toast.LENGTH_SHORT).show();


                Intent act3= new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(act3);

            }
        });
    }
}