package com.example.proje_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText ads_text , soyads_text , tcs_text , cinsiyets_text , dillers_text;
    String adg , soyadg , tcg , cnsytg , dillerg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ads_text = (EditText)findViewById(R.id.t21);
        soyads_text = (EditText)findViewById(R.id.t22);
        tcs_text = (EditText)findViewById(R.id.t23);
        cinsiyets_text = (EditText)findViewById(R.id.t24);
        dillers_text =findViewById(R.id.t25);

        Intent sayfa2 = getIntent();
        adg = sayfa2.getStringExtra("ad_text");

        ads_text.setText(adg);
        ads_text.setEnabled(false);


        soyadg = sayfa2.getStringExtra("soyad_text");

        soyads_text.setText(soyadg);
        soyads_text.setEnabled(false);


        tcg = sayfa2.getStringExtra("tc_text");

        tcs_text.setText(tcg);
        tcs_text.setEnabled(false);


        cnsytg = sayfa2.getStringExtra("cnst");

        cinsiyets_text.setText(cnsytg);
        cinsiyets_text.setEnabled(false);


        dillerg = sayfa2.getStringExtra("dll");

        dillers_text.setText(dillerg);
        dillers_text.setEnabled(false);
    }
}