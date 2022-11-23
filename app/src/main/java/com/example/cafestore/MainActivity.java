package com.example.cafestore;

import androidx.appcompat.app.AppCompatActivity;

import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;


public class MainActivity extends AppCompatActivity {

       ViewPager viewPager;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=findViewById(R.id.viewpage_id);
        page_adapter adapter = new page_adapter(getSupportFragmentManager());
        adapter.addfragament(new login_in_F());
        adapter.addfragament(new sign_up_F());
        viewPager.setAdapter(adapter);


    }




}