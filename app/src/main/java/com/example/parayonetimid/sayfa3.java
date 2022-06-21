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

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class sayfa3 extends AppCompatActivity {

    private BottomNavigationView mBottomBar;


    Button btnn;
    Button bnklr;
    Button tkvm;

    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayfa3);

        textView = findViewById(R.id.textView79);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("userInput");
        textView.setText(userName);

        mBottomBar = (BottomNavigationView)findViewById(R.id.sayfa3_BottomNavigationView);

        mBottomBar.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
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

        tanimlamaa();
        tanimlama2();
        tanimlamaa2();


        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aylknlz=new Intent(getApplicationContext(),aylikanlz.class);
                startActivity(aylknlz);
            }
        });

        bnklr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bnkl=new Intent(getApplicationContext(),bankalar.class);
                startActivity(bnkl);
            }
        });

        tkvm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tvmm=new Intent(getApplicationContext(),Takvim.class);
                startActivity(tvmm);
            }
        });

    }

    public void tanimlamaa(){btnn=findViewById(R.id.button2);}
    public void tanimlama2(){bnklr=findViewById(R.id.button5);}
    public void tanimlamaa2(){tkvm=findViewById(R.id.button6);}
}