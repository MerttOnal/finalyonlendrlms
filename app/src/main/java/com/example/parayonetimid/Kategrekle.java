package com.example.parayonetimid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Kategrekle extends AppCompatActivity {

    Button btnnnn;
    Button btnnnnk;

    String usernamee;
    String usernameee;
    EditText editTextt;
    EditText editTexttt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategrekle);

        tanimlamaa3();
        tanimlamaa4();

        editTextt = findViewById(R.id.editTextTextPersonName5);
        usernamee = "";

        btnnnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                usernamee = editTextt.getText().toString();

                Intent logn=new Intent(getApplicationContext(),Kategori.class);

                logn.putExtra("userInput",usernamee);

                startActivity(logn);

            }
        });

        editTexttt = findViewById(R.id.editTextNumber);
        usernameee = "";

        btnnnnk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                usernameee = editTextt.getText().toString();

                Intent hrcm=new Intent(getApplicationContext(),Kategori.class);

                hrcm.putExtra("userInput",usernameee);

                startActivity(hrcm);

            }
        });


    }
    public void tanimlamaa3(){btnnnn=findViewById(R.id.button18);}
    public void tanimlamaa4(){btnnnnk=findViewById(R.id.button23);}
}