package com.faislll.viewpager;

import java.util.ArrayList;

public class MenuMakanan {
    private String namaMenu;
    //    private String data;
    private ArrayList<Makanan> data;


    public MenuMakanan (String namaMenu, ArrayList<Makanan> data) {
        this.namaMenu = namaMenu;
        this.data = data;
    }
    public String getNamaMenu(){
        return namaMenu;
    }
    public ArrayList<Makanan> getData(){
        return data;
    }
}
