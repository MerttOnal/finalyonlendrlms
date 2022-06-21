package com.example.parayonetimid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Ayarlar extends AppCompatActivity {

    private BottomNavigationView mBottomBarrr;

    ImageButton ayrlr;
    ImageButton hpsl;
    ImageButton yrdm;
    ImageButton pcynt;
    ImageButton hspkd;
    ImageButton ydkl;
    ImageButton tema;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayarlar);

        mBottomBarrr = (BottomNavigationView)findViewById(R.id.ayrl_BottomNavigationView);

        mBottomBarrr.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
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


        deneme1();
        deneme2();
        deneme3();
        deneme4();
        deneme5();
        deneme6();
        deneme7();


        ayrlr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ayrllr=new Intent(getApplicationContext(),Ayarlarr.class);
                startActivity(ayrllr);
            }
        });

        hpsl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hpsll=new Intent(getApplicationContext(),Hesapsil.class);
                startActivity(hpsll);
            }
        });

        yrdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent yrdmm=new Intent(getApplicationContext(),Yardim.class);
                startActivity(yrdmm);
            }
        });

        pcynt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pcyntt=new Intent(getApplicationContext(),Pcdenynt.class);
                startActivity(pcyntt);
            }
        });

        hspkd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hspkdd=new Intent(getApplicationContext(),Hesapkodu.class);
                startActivity(hspkdd);
            }
        });

        ydkl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ydkll=new Intent(getApplicationContext(),Yedekle.class);
                startActivity(ydkll);
            }
        });

        tema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent temaa=new Intent(getApplicationContext(),Tema.class);
                startActivity(temaa);
            }
        });

    }


    public void deneme1(){ayrlr=findViewById(R.id.imageButton6);}
    public void deneme2(){hpsl=findViewById(R.id.imageButton7);}
    public void deneme3(){yrdm=findViewById(R.id.imageButton8);}
    public void deneme4(){pcynt=findViewById(R.id.imageButton9);}
    public void deneme5(){hspkd=findViewById(R.id.imageButton10);}
    public void deneme6(){ydkl=findViewById(R.id.imageButton11);}
    public void deneme7(){tema=findViewById(R.id.imageButton13);}
}