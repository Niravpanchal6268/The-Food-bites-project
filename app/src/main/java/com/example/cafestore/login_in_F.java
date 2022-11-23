package com.example.cafestore;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.google.android.material.button.MaterialButton;

public class login_in_F extends Fragment {

    MaterialButton button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_login_in_, container, false);
        button = view.findViewById(R.id.login_btn_id);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Toast.makeText(MainActivity.this, "552", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), home_page.class);
                startActivity(intent);

            }
        });
        return view;
    }

}