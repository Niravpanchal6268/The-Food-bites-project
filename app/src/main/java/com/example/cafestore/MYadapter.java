package com.example.cafestore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Locale;

public class MYadapter extends RecyclerView.Adapter<Myview_page_holder> {

    ArrayList<model> list;

    public MYadapter(ArrayList<model> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Myview_page_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
       View  view =layoutInflater.inflate(R.layout.single_raw,parent,false);


        return new Myview_page_holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myview_page_holder holder, int position) {

        holder.imageView.setImageResource(list.get(position).getImg());
        holder.t1.setText(list.get(position).getName());
        holder.t2.setText(list.get(position).getPrice());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}
