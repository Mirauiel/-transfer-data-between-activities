package com.example.proje_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    Button btn1 ;
    EditText ad_text , soyad_text , tc_text;

    RadioButton c1_button , c2_button ;

    CheckBox cb1_button ,cb2_button ,cb3_button ,cb4_button ,cb5_button;

    String cinsiyet , diller="" ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ad_text = findViewById(R.id.t1);
        soyad_text = findViewById(R.id.t2);
        tc_text = findViewById(R.id.t3);

        c1_button = findViewById(R.id.r1);
        c2_button = findViewById(R.id.r2);

        cb1_button = findViewById(R.id.cb1);
        cb2_button = findViewById(R.id.cb2);
        cb3_button = findViewById(R.id.cb3);
        cb4_button = findViewById(R.id.cb4);
        cb5_button = findViewById(R.id.cb5);

        btn1 = findViewById(R.id.b1);

        c1_button.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    cinsiyet="erkek";
                }
            }
        });

        c2_button.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    cinsiyet="kadın";
                }
            }
        });


        cb1_button.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    diller+="Java";
                }
            }
        });
        cb2_button.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    diller+="Kotlin";
                }
            }
        });
        cb3_button.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    diller+="Python";
                }
            }
        });
        cb4_button.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    diller+="C#";
                }
            }
        });
        cb5_button.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    diller+="C++";
                }
            }
        });



        btn1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                String ad=ad_text.getText().toString();
                String soyad=soyad_text.getText().toString();
                String tc=tc_text.getText().toString();


                Intent sayfa2=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(sayfa2);
                sayfa2.putExtra("ad_text",ad);
                sayfa2.putExtra("soyad_text",soyad);
                sayfa2.putExtra("tc_text",tc);
                sayfa2.putExtra("cnst",cinsiyet);
                sayfa2.putExtra("dll",diller);
                startActivity(sayfa2);



                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        finish();

                        Intent intent = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                }, 5000);

            }
          }
        );


    }
}