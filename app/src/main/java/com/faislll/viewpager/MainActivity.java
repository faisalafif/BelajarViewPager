package com.faislll.viewpager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private MyAdapter myAdapter;
    private TabLayout tabMenu;

    ArrayList<String> menuTitleData = new ArrayList<>();
    ArrayList<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateTitle();
        //generateData();


        viewPager = findViewById(R.id.view_pager);
        //myAdapter = new MyAdapter(getSupportFragmentManager());
        myAdapter = MyAdapter.newIntance(getSupportFragmentManager(), menuTitleData);
        viewPager.setAdapter(myAdapter);

        viewPager.setAdapter(myAdapter);

        tabMenu = findViewById(R.id.tab_menu);
        tabMenu.setupWithViewPager(viewPager);
    }
    //membuat data title data
    private void generateTitle(){
        menuTitleData.add("Rock");
        menuTitleData.add("Never");
        menuTitleData.add("Die");
    }

    /*private void generateData(){
        data.add("Data 1");
        data.add("Data 2");
        data.add("Data 3");

    }*/
}