package com.example.parayonetimid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Tkvmyazi extends AppCompatActivity {

    ImageButton gc;
    Button yazi;
    String usernameek;
    EditText editTexttk;
    TextView editTextty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tkvmyazi);

        tanimlamaa8();
        tanimlamaa9();

        editTexttk = findViewById(R.id.editTextTextPersonName4);
        usernameek = "";

        yazi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                usernameek = editTexttk.getText().toString();

                Intent yazii=new Intent(getApplicationContext(),Tkvmyazi.class);

                yazii.putExtra("userInput",usernameek);

                startActivity(yazii);
            }
        });

        editTextty = findViewById(R.id.textView86);

        Intent intenty = getIntent();
        String userName = intenty.getStringExtra("userInput");
        editTextty.setText(userName);

        gc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gcc=new Intent(getApplicationContext(),sayfa3.class);
                startActivity(gcc);
            }
        });

    }

    public void tanimlamaa8(){yazi=findViewById(R.id.button28);}
    public void tanimlamaa9(){gc=findViewById(R.id.imageButton5);}
}