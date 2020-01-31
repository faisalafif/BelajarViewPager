package com.faislll.viewpager;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class MyAdapter extends FragmentStatePagerAdapter {

    private static ArrayList<String> myTitles;
    private static ArrayList<String> myData;

    private static int numOfitem;

    public static MyAdapter newIntance(FragmentManager fragmentManager, ArrayList<String> titles){
        MyAdapter myAdapter = new MyAdapter(fragmentManager);
        myTitles = titles;
        numOfitem = titles.size();
        return myAdapter;
    }

    public MyAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);

    }

    @NonNull
    @Override
    public Fragment getItem(int position) { //function slalu me return data
        Fragmen1 fragmen1 = new Fragmen1();
        Fragment2 fragment2 = new Fragment2();

        Fragment item = null;

        switch (position) {
            case 0:
                item = fragmen1;
                break;

            case 1:
                item = fragmen1;
                break;

            default:
                item = fragmen1;
                break;
        }
        return item;
    }

    @Override
    public int getCount() {
        return numOfitem;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = myTitles.get(position);
        return title;
    }
}