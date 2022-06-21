package com.example.parayonetimid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Kategori extends AppCompatActivity {

    private BottomNavigationView mBottomBarr;

    ImageButton ktgrekl;

    TextView textViewv;
    TextView textViewh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);

        textViewv = findViewById(R.id.textView80);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("userInput");
        textViewv.setText(userName);


        textViewh = findViewById(R.id.textView81);

        Intent hrcmm = getIntent();
        String userNamee = hrcmm.getStringExtra("userInput");
        textViewh.setText(userNamee);


        mBottomBarr = (BottomNavigationView)findViewById(R.id.ktgr_BottomNavigationView);

        mBottomBarr.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.bottombat_menu_home:
                        startActivity(new Intent(getApplicationContext(),sayfa3.class));
                        overridePendingTransition(0, 0);
                        Toast.makeText(getApplicationContext(), "Profil", Toast.LENGTH_SHORT).show();
                        return;

                    case R.id.bottombat_menu_ktgr:
                        startActivity(new Intent(getApplicationContext(),Kategori.class));
                        overridePendingTransition(0, 0);
                        Toast.makeText(getApplicationContext(), "Kategori", Toast.LENGTH_SHORT).show();
                        return;

                    case R.id.bottombat_menu_setting:
                        startActivity(new Intent(getApplicationContext(),Ayarlar.class));
                        overridePendingTransition(0, 0);
                        Toast.makeText(getApplicationContext(), "Ayarlar", Toast.LENGTH_SHORT).show();
                        return;


                    default:
                        return;

                }


            }
        });


        ktgreklednm();

        ktgrekl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ktgreklee=new Intent(getApplicationContext(),Kategrekle.class);
                startActivity(ktgreklee);
            }
        });
    }

    public void ktgreklednm()
    {
        ktgrekl=findViewById(R.id.imageButton4);
    }
}