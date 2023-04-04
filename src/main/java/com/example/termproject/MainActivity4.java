package com.example.termproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    RadioGroup rg1, rg2;
    TextView tv;
    Button btnext4;
    CheckBox cb1,cb2,cb3,cb4,cb5,cb6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        rg1=findViewById(R.id.RadioGroup1Act4);
        rg2=findViewById(R.id.RadioGroup2Act4);
        tv=findViewById(R.id.tvinv);
        btnext4=findViewById(R.id.buttonnext4);
        cb1=findViewById(R.id.checkBoxMother);
        cb2=findViewById(R.id.checkBoxFather);
        cb3=findViewById(R.id.checkBoxbrosis);
        cb4=findViewById(R.id.checkBoxchil);
        cb5=findViewById(R.id.checkBoxother);
        cb6=findViewById(R.id.checkBoxno);
        tv.setVisibility(View.INVISIBLE);

        RadioGroup.OnCheckedChangeListener allrgact4 = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch(i) {

                    case R.id.radioButton:
                        TotalScore.score =TotalScore.score+ 14;
                        break;

                    case R.id.radioButton2:
                        TotalScore.score = TotalScore.score + 0;

                        break;

                    case R.id.radioButton3:
                        TotalScore.score = TotalScore.score + 1;

                        break;

                    case R.id.radioButton4:
                        TotalScore.score =TotalScore.score+ 0;
                        break;

                }

            }
        };

        rg1.setOnCheckedChangeListener(allrgact4);
        rg2.setOnCheckedChangeListener(allrgact4);


        if(cb1.isChecked()){

            TotalScore.score =TotalScore.score+ 2;

        }
         if(cb2.isChecked()){
            TotalScore.score =TotalScore.score+ 2;
        }
         if(cb3.isChecked()){
            TotalScore.score =TotalScore.score+ 2;
        }
         if(cb4.isChecked()){
            TotalScore.score =TotalScore.score+ 2;
        }
         if(cb5.isChecked()){
            TotalScore.score =TotalScore.score+ 0;
        }
         if(cb6.isChecked()){
            TotalScore.score =TotalScore.score+ 0;
        }



        btnext4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity4.this, " Your score is "+TotalScore.score, Toast.LENGTH_SHORT).show();


                Intent act5= new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(act5);
            }
        });



    }
}