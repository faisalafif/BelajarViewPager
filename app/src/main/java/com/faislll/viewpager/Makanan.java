package com.faislll.viewpager;

import android.media.Image;
import android.os.Parcel;
import android.os.Parcelable;

public class Makanan implements Parcelable {
    public String getNama() {
        return nama;
    }

    public String getHarga() {
        return harga;
    }

    public String getDeskripsi(){
        return deskripsi;
    }
    public int getImage(){
        return Image;
    }

    private String nama, harga, deskripsi;
    private int Image;

    public Makanan (String nm, String price, String desk, int img){
        this.nama = nm;
        this.harga = price;
        this.deskripsi = desk;
        this.Image = img;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.harga);
        dest.writeString(this.deskripsi);
        dest.writeInt(this.Image);
    }

    protected Makanan(Parcel in) {
        this.nama = in.readString();
        this.harga = in.readString();
        this.deskripsi = in.readString();
        this.Image = in.readInt();
    }

    public static final Parcelable.Creator<Makanan> CREATOR = new Parcelable.Creator<Makanan>() {
        @Override
        public Makanan createFromParcel(Parcel source) {
            return new Makanan(source);
        }

        @Override
        public Makanan[] newArray(int size) {
            return new Makanan[size];
        }
    };
}
