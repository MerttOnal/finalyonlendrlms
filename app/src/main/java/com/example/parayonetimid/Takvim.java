package com.example.parayonetimid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Takvim extends AppCompatActivity {

    Button tkvmmekl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takvim);
        tanimlamaz();

        tkvmmekl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tvkmekl=new Intent(getApplicationContext(),Tkvmekle.class);
                startActivity(tvkmekl);
            }
        });
    }

    public void tanimlamaz(){tkvmmekl=findViewById(R.id.button20);}
}