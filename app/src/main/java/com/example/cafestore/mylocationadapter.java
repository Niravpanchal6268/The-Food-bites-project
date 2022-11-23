package com.example.cafestore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class mylocationadapter  extends RecyclerView.Adapter<Myview_page_holder> {
    ArrayList<model> hlist;

    public mylocationadapter(ArrayList<model> hlist) {
        this.hlist = hlist;
    }

    @NonNull
    @Override
    public Myview_page_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View hview = layoutInflater.inflate(R.layout.location_layout,parent, false);

        return new Myview_page_holder(hview);
    }

    @Override
    public void onBindViewHolder(@NonNull Myview_page_holder holder, int position) {

        holder.himage.setImageResource(hlist.get(position).getH_imag());
        holder.hname.setText(hlist.get(position).getH_name());
        holder.hrating.setText(hlist.get(position).getH_rating());


    }

    @Override
    public int getItemCount() {
        return hlist.size();
    }
}
