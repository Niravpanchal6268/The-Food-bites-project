package com.example.cafestore;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link home_f#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class home_f extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment home_f.
     */
    // TODO: Rename and change types and number of parameters
    public static home_f newInstance(String param1, String param2) {
        home_f fragment = new home_f();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public home_f() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    RecyclerView recyclerView, recyclerView2;
    mylocationadapter mylocationadapter1;
    MYadapter mYadapter;
    LinearLayoutManager horizontal;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_home_f,container,false);


        recyclerView = view.findViewById(R.id.location_recyclerview_id);
        recyclerView2 = view.findViewById(R.id.recycle_id);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity()));
        mYadapter = new MYadapter(getAllData());
        recyclerView2.setAdapter(mYadapter);

        mylocationadapter1 = new mylocationadapter(getalllocation());

        horizontal = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(horizontal);
        recyclerView.setAdapter(mylocationadapter1);


        return view;
    }
    public ArrayList<model> getalllocation() {
        ArrayList<model> hlist = new ArrayList<>();

        model l1 = new model();
        l1.setH_imag(R.drawable.hotel1);
        l1.setH_name("R Kitchen");
        l1.setH_rating("3");
        hlist.add(l1);


        model l2 = new model();
        l2.setH_imag(R.drawable.cafe33);
        l2.setH_name("The Black Cafe");
        l2.setH_rating("3");
        hlist.add(l2);


        model l3 = new model();
        l3.setH_imag(R.drawable.cafe5);
        l3.setH_name("The cofee cafe");
        l3.setH_rating("5");
        hlist.add(l3);


        model l4 = new model();
        l4.setH_imag(R.drawable.hotel_2);
        l4.setH_name("The Dark Roaster");
        l4.setH_rating("2");
        hlist.add(l4);


        model l5 = new model();
        l5.setH_imag(R.drawable.outlate);
        l5.setH_name("The Swad Restaurant");
        l5.setH_rating("5");
        hlist.add(l5);


        return hlist;


    }
    public ArrayList<model> getAllData() {
        ArrayList<model> list = new ArrayList<>();

        model m1 = new model();
        m1.setImg(R.drawable.paneer_tikka);
        m1.setName("Paneer Tikka Masal");
        m1.setPrice("180₹");
        list.add(m1);

        model m2 = new model();
        m2.setImg(R.drawable.coffee_image_2);
        m2.setName("Cappuccino");
        m2.setPrice("120₹");
        list.add(m2);


        model m15 = new model();
        m15.setImg(R.drawable.idali);
        m15.setName("Idli with Sambhar");
        m15.setPrice("70₹");
        list.add(m15);


        model m11 = new model();
        m11.setImg(R.drawable.pizza);
        m11.setName("Paneer Pizza");
        m11.setPrice("250₹");
        list.add(m11);

        model m13 = new model();
        m13.setImg(R.drawable.vada_pav);
        m13.setName("Vada Pav");
        m13.setPrice("25₹");
        list.add(m13);


        model m8 = new model();
        m8.setImg(R.drawable.burger);
        m8.setName("Burger Mania.");
        m8.setPrice("80₹");
        list.add(m8);

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



        model m12 = new model();
        m12.setImg(R.drawable.momo);
        m12.setName("MoMos");
        m12.setPrice("90₹");
        list.add(m12);


        model m14 = new model();
        m14.setImg(R.drawable.meggie);
        m14.setName("Meggie ");
        m14.setPrice("25₹");
        list.add(m14);
        return list;


    }


}