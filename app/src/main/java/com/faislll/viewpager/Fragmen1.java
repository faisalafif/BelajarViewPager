package com.faislll.viewpager;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmen1 extends Fragment {

    private ArrayList<Makanan> foods;

    public void setData(ArrayList<Makanan> food){
        this.foods=food;
    }

    public static Fragmen1 newIntance(String text) {
        Fragmen1 fragmen1 = new Fragmen1();
        Bundle args = new Bundle();
        args.putString("text", text);
        fragmen1.setArguments(args);
        return fragmen1;

    }


    public Fragmen1() {
        // Required empty public constructor
    }

    private TextView TextData;
    private ListView listData;
    private UserAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_fragmen1, container, false);
        adapter = new UserAdapter(getActivity(), foods);
        listData = rootView.findViewById(R.id.ls_view);
        listData.setAdapter(adapter);
        detailMenu();
        return rootView;
    }

    public void detailMenu(){
        listData.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent detailPage = new Intent(getContext(), DetailMenu.class);
                detailPage.putExtra("Menu", adapter.getItem(position));

                startActivity(detailPage);
            }
        });
    }

}
