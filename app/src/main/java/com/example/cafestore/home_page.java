package com.example.cafestore;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.SearchView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class home_page extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        bottomNavigationView = findViewById(R.id.botton_nav_id);


        getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_id,new home_f()).commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;

                switch (item.getItemId())
                {

                    case R.id.home_m_id:
                        fragment = new home_f();
                        break;

                    case R.id.menu_m_id:
                        fragment = new menu_F();
                        break;

                    case R.id.wallet_m_id:
                        fragment = new wallet_F();
                        break;


                    case R.id.setting_m_id:
                        fragment = new setting_F();
                        break;

                }
            getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_id,fragment).commit();
                return true;


            }
        });


    }





}