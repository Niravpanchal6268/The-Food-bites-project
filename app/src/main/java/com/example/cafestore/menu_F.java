package com.example.cafestore;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link menu_F#newInstance} factory method to
 * create an instance of this fragment.
 */
public class menu_F extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public menu_F() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment menu_F.
     */
    // TODO: Rename and change types and number of parameters
    public static menu_F newInstance(String param1, String param2) {
        menu_F fragment = new menu_F();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    RecyclerView recyclerView;
    MYadapter mYadapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_menu_,container,false);

        recyclerView=view.findViewById(R.id.recycle_id);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mYadapter = new MYadapter(getAllData());
        recyclerView.setAdapter(mYadapter);


        return view;
    }
    public ArrayList<model> getAllData ()
    {
        ArrayList<model> list = new ArrayList<>();

        model m1 = new model();
        m1.setImg(R.drawable.coffee_image_1);
        m1.setName("Black coffee");
        m1.setPrice("80₹");
        list.add(m1);

        model m2 = new model();
        m2.setImg(R.drawable.coffee_image_2);
        m2.setName("Cappuccino");
        m2.setPrice("120₹");
        list.add(m2);

        model m3 = new model();
        m3.setImg(R.drawable.coffee_image_3);
        m3.setName("Tea");
        m3.setPrice("50₹");
        list.add(m3);


        model m4 = new model();
        m4.setImg(R.drawable.coffee_image_4);
        m4.setName("Doppio");
        m4.setPrice("120₹");
        list.add(m4);


        model m5 = new model();
        m5.setImg(R.drawable.coffee_image_5);
        m5.setName("Cafe Special");
        m5.setPrice("180₹");
        list.add(m5);


        model m6 = new model();
        m6.setImg(R.drawable.coffee_image_6);
        m6.setName("Latte  Macchiato");
        m6.setPrice("100₹");
        list.add(m6);

        model m7 = new model();
        m7.setImg(R.drawable.bread);
        m7.setName("Garlic bread Bruschetta");
        m7.setPrice("50₹");
        list.add(m7);

        model m8 = new model();
        m8.setImg(R.drawable.burger);
        m8.setName("Burger Mania.");
        m8.setPrice("80₹");
        list.add(m8);

        model m9 = new model();
        m9.setImg(R.drawable.combo_pack);
        m9.setName("Burger Combo");
        m9.setPrice("150₹");
        list.add(m9);

        model m10 = new model();
        m10.setImg(R.drawable.combo_pake_cock);
        m10.setName("Combo Pake with cock");
        m10.setPrice("180₹");
        list.add(m10);

        model m11 = new model();
        m11.setImg(R.drawable.pizza);
        m11.setName("Paneer Pizza");
        m11.setPrice("250₹");
        list.add(m11);

        model m12 = new model();
        m12.setImg(R.drawable.momo);
        m12.setName("MoMos");
        m12.setPrice("90₹");
        list.add(m12);

        model m13 = new model();
        m13.setImg(R.drawable.vada_pav);
        m13.setName("Vada Pav");
        m13.setPrice("25₹");
        list.add(m13);

        model m14 = new model();
        m14.setImg(R.drawable.meggie);
        m14.setName("Meggie ");
        m14.setPrice("25₹");
        list.add(m14);
        return list;


    }
}