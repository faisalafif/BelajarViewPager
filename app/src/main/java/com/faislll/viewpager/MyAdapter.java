package com.faislll.viewpager;

import android.content.Context;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class MyAdapter extends FragmentStatePagerAdapter {

    private static ArrayList<String> myTitles;
    private static ArrayList<String> myData;
    private static ArrayList<MenuMakanan> myMenu;
    private static Context ctx;

    private static int numOfitem;

    public static MyAdapter newInstance(FragmentManager fragmentManager, ArrayList<String> titles,ArrayList<String>data){
        MyAdapter myAdapter = new MyAdapter(fragmentManager);
        myTitles = titles;
        myData = data;
        numOfitem = data.size();
        return myAdapter;
    }
    public static MyAdapter newInstance(FragmentManager fragmentManager, ArrayList<MenuMakanan> kumpulanMenu, Context context){
        MyAdapter myAdapter = new MyAdapter(fragmentManager);
        myMenu = kumpulanMenu;
        numOfitem = myMenu.size();
        ctx = context;
        return myAdapter;

    }

    //contractor
    public MyAdapter(FragmentManager fragmentManager) {
        super(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

    }

    @NonNull
    @Override
    public Fragment getItem(int position) { //function slalu me return data
      //String text = myData.get(position);
        ArrayList<Makanan> makanans = myMenu.get(position).getData();


      //Fragmen1 fragmen1 = new Fragment1();

        Fragmen1 fragmen1 = new Fragmen1();
        fragmen1.setData(makanans);
        return fragmen1;
    }

    @Override
    public int getCount() {
        return numOfitem;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title ;
                try{
                title = myMenu.get(position).getNamaMenu();
    } catch (IndexOutOfBoundsException e) {
                    title = "Apa Saja";
                }
        return title;
    }
}