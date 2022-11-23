package com.example.cafestore;

import android.view.View;
import android.widget.ImageView;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Myview_page_holder extends RecyclerView.ViewHolder {

    ImageView imageView,himage;
    TextView t1,t2,hname,hrating;


    public Myview_page_holder(@NonNull View itemView) {
        super(itemView);
        imageView =itemView.findViewById(R.id.image_id);
        t1 = itemView.findViewById(R.id.name_id);
        t2= itemView.findViewById(R.id.price_id);
        himage=itemView.findViewById(R.id.hotel_image_id);
        hname=itemView.findViewById(R.id.hotel_name_id);
        hrating=itemView.findViewById(R.id.hotel_rating_id);

    }
}
