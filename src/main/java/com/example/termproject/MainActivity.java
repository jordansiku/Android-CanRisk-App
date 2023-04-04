package com.example.termproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnext1;
    TextView tv4;
    RadioGroup rg1,rg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnext1=findViewById(R.id.buttonnext1);
        tv4=findViewById(R.id.textView4);
        rg1=findViewById(R.id.RadioGroup1);
        rg2=findViewById(R.id.RadioGroup2);

        tv4.setVisibility(View.INVISIBLE);






        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){

                    case R.id.rb4045:
                        TotalScore.score=0;
                        break;

                    case R.id.rb4554:
                        TotalScore.score=TotalScore.score+7;

                        break;

                    case R.id.rb5564:
                        TotalScore.score=TotalScore.score+13;

                        break;


                    case R.id.rb6574:
                        TotalScore.score=TotalScore.score+15;

                        break;


                }
            }
        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i){
                    case R.id.rbmale:
                        TotalScore.score = TotalScore.score + 6;

                        break;

                    case R.id.rbfemele:
                        TotalScore.score = TotalScore.score + 0;

                        break;
                }

            }
        });



        btnext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {







                Toast.makeText(MainActivity.this, " Your score is "+TotalScore.score, Toast.LENGTH_SHORT).show();


                Intent act2= new Intent(MainActivity.this,MainActivity2.class);
                startActivity(act2);

            }
        });

    }
}