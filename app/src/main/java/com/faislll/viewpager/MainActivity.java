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

    ArrayList<MenuMakanan> kumpulanMenu = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //generateTitle();
        //generateData();
        generateMenu();


        viewPager = findViewById(R.id.view_pager);
        myAdapter = new MyAdapter(getSupportFragmentManager());
        //myAdapter = MyAdapter.newIntance(getSupportFragmentManager(), menuTitleData, data);
        myAdapter = MyAdapter.newInstance(getSupportFragmentManager(), kumpulanMenu, getApplicationContext());
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

    private void generateData(){
        data.add("Data 1");
        data.add("Data 2");
        data.add("Data 3");

    }

    public void generateMenu() {
        ArrayList<Makanan> menuAyam = new ArrayList<>();
        menuAyam.add(new Makanan("Ayam Goreng"," Rp.10000","Ayam1", R.drawable.ayamgg));
        menuAyam.add(new Makanan("Ayam Bakar", " Rp.15000", "Ayam2", R.drawable.ayambk));
        menuAyam.add(new Makanan("Ayam Rendang", " Rp.20000", "Ayam3", R.drawable.ayamrn));
        kumpulanMenu.add(new MenuMakanan("Ayam", menuAyam));

        ArrayList<Makanan> menuMie = new ArrayList<>();
        menuMie.add(new Makanan("Mie Goreng", " Rp.10000", "Mie1", R.drawable.miegr));
        menuMie.add(new Makanan("Mie Soto", " Rp.15000", "Mie2", R.drawable.miest));
        menuMie.add(new Makanan("Mie Rendang", " Rp.20000","Mie3", R.drawable.miern));
        kumpulanMenu.add(new MenuMakanan("Mie", menuMie));

        ArrayList<Makanan> menuNasi = new ArrayList<>();
        menuNasi.add(new Makanan("Nasi Uduk", " Rp.10000","Nasi Uduk khas Betawi", R.drawable.nasiuduk));
        menuNasi.add(new Makanan("Nasi Goreng", " Rp.15000", "Nasi Goreng khas Betawi", R.drawable.nasigr));
        menuNasi.add(new Makanan("Nasi Kebuli", " Rp.20000", "Nasi Kebuli khas Betawi", R.drawable.nasikb));
        kumpulanMenu.add(new MenuMakanan("Nasi", menuNasi));
    }
}