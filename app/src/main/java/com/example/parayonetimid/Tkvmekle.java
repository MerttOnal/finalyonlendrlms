package com.example.parayonetimid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tkvmekle extends AppCompatActivity {

    Button btnkl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tkvmekle);

        denemekl();

        btnkl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tkvmyazi=new Intent(getApplicationContext(),Tkvmyazi.class);
                startActivity(tkvmyazi);
            }
        });
    }

    public void denemekl(){btnkl=findViewById(R.id.button26);}
}