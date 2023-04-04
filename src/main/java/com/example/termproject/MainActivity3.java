package com.example.termproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    RadioGroup rg1,rg2,rg3,rg4;
    Button btnext3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        rg1=findViewById(R.id.RadioGroupAct3_1);
        rg2=findViewById(R.id.RadioGroupAct3_2);
        rg3=findViewById(R.id.RadioGroupAct3_3);
        rg4=findViewById(R.id.RadioGroupAct3_4);
        btnext3=findViewById(R.id.buttonnext3);

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch(i) {

                    case R.id.radioButton1Act3:
                        TotalScore.score = 0;
                        break;

                    case R.id.radioButton2Act3:
                        TotalScore.score = TotalScore.score + 4;

                        break;

                    case R.id.radioButton3Act3:
                        TotalScore.score = TotalScore.score + 9;

                        break;
                }
            }
        });

        RadioGroup.OnCheckedChangeListener allrg = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch(i) {

                    case R.id.radioButton1Act3:
                        TotalScore.score =TotalScore.score+ 0;
                        break;

                    case R.id.radioButton2Act3:
                        TotalScore.score = TotalScore.score + 4;

                        break;

                    case R.id.radioButton3Act3:
                        TotalScore.score = TotalScore.score + 6;

                        break;

                    case R.id.radioButton4Act3:
                        TotalScore.score =TotalScore.score+ 0;
                        break;

                    case R.id.radioButton5Act3:
                        TotalScore.score = TotalScore.score + 1;

                        break;

                    case R.id.radioButton6Act3:
                        TotalScore.score = TotalScore.score + 0;

                        break;

                    case R.id.radioButton7Act3:
                        TotalScore.score =TotalScore.score+2;
                        break;

                    case R.id.radioButton8Act3:
                        TotalScore.score = TotalScore.score + 4;

                        break;

                    case R.id.radioButton9Act3:
                        TotalScore.score = TotalScore.score + 0;

                        break;

                }

            }
        };

        rg1.setOnCheckedChangeListener(allrg);
        rg2.setOnCheckedChangeListener(allrg);
        rg3.setOnCheckedChangeListener(allrg);
        rg4.setOnCheckedChangeListener(allrg);

        btnext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity3.this, " Your score is "+TotalScore.score, Toast.LENGTH_SHORT).show();


                Intent act4= new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(act4);
            }
        });





    }
}