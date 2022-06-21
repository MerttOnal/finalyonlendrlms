package com.example.parayonetimid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimlama();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dvm=new Intent(getApplicationContext(),sayfa2.class);
                startActivity(dvm);
            }
        });


    }
    public void tanimlama()
    {
        btn=findViewById(R.id.button);
    }

}