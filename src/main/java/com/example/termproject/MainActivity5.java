package com.example.termproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    RadioGroup rg1,rg2;
    Button btresult;
    String risk = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        AlertDialog.Builder builder= new AlertDialog.Builder(this);


        rg1=findViewById(R.id.RadioGroupAct5_1);
        rg2=findViewById(R.id.RadioGroupAct5_2);
        btresult=findViewById(R.id.buttonresultat);

        RadioGroup.OnCheckedChangeListener allrgact5 = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch(i) {

                    case R.id.rbwhite:
                        TotalScore.score =TotalScore.score+ 0;
                        break;

                    case R.id.rbabo:
                        TotalScore.score = TotalScore.score + 3;

                        break;

                    case R.id.rbblack:
                        TotalScore.score = TotalScore.score + 5;

                        break;

                    case R.id.rbeastasian:
                        TotalScore.score =TotalScore.score+ 10;
                        break;

                    case R.id.rbsouthasian:
                        TotalScore.score =TotalScore.score+ 11;
                        break;

                    case R.id.rbother:
                        TotalScore.score =TotalScore.score+ 3;
                        break;

                    case R.id.rbhighsc:
                        TotalScore.score =TotalScore.score+ 5;
                        break;

                    case R.id.rbscdiploma:
                        TotalScore.score =TotalScore.score+ 1;
                        break;

                    case R.id.rbcoluniv:
                        TotalScore.score =TotalScore.score+ 0;
                        break;

                    case R.id.rbcoldeg:
                        TotalScore.score =TotalScore.score+ 0;
                        break;



                }

            }
        };

        rg1.setOnCheckedChangeListener(allrgact5);
        rg2.setOnCheckedChangeListener(allrgact5);



        if (TotalScore.score < 21){

            risk = "low risk";
        }

        else if (TotalScore.score >= 21 && TotalScore.score <= 32){

            risk = "moderate risk";
        }

        else if (TotalScore.score >= 33){

            risk = "high risk";
        }

        btresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


        builder.setTitle("Your score is : " + TotalScore.score + " points");
        builder.setMessage(risk);
        builder.setPositiveButton("OK", null);
        AlertDialog dialog = builder.create();
        dialog.show();

            }
        });

       //Toast.makeText(this, "You are in  "+risk, Toast.LENGTH_LONG).show();



        /*AlertDialog.Builder builder= new AlertDialog.Builder(getApplicationContext());

        builder.setTitle("Your score is : " + TotalScore.score + " points");
        builder.setMessage(risk);
        builder.setPositiveButton("OK", null);
        AlertDialog dialog = builder.create();
        dialog.show();*/
    }
}