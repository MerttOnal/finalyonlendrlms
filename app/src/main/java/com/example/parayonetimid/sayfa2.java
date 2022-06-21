package com.example.parayonetimid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class sayfa2 extends AppCompatActivity {

    Button lgn;

    private EditText editemail, editsifre;
    private String txtEmail, txtSifre;
    private FirebaseAuth mAuth;

    String username;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayfa2);
        deneme();

        editText = findViewById(R.id.editTextTextPersonName);
        username = "";

        lgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                username = editText.getText().toString();

                Intent logn=new Intent(getApplicationContext(),sayfa3.class);

                logn.putExtra("userInput",username);

                startActivity(logn);

           }
        });

        editemail = (EditText) findViewById(R.id.editTextTextEmailAddress);
        editsifre = (EditText) findViewById(R.id.editTextTextPersonName2);

        mAuth = FirebaseAuth.getInstance();
    }

    public void kayitOl (View v) {
        txtEmail = editemail.getText().toString();
        txtSifre = editsifre.getText().toString();

        if (!TextUtils.isEmpty(txtEmail) && !TextUtils.isEmpty(txtSifre)) {
            mAuth.createUserWithEmailAndPassword(txtEmail, txtSifre)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful())
                                Toast.makeText(sayfa2.this, "Kayıt İşlemi Başarılı", Toast.LENGTH_SHORT).show();
                            else
                                Toast.makeText(sayfa2.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });

        } else
            Toast.makeText(this, "Email ve şifre boş olamaz.", Toast.LENGTH_SHORT).show();
    }
    public void deneme(){lgn=findViewById(R.id.button3);}
}