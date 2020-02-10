package com.faislll.viewpager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {

    TextView detailText;
    TextView textSatu;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        Makanan detMakanan = getIntent().getParcelableExtra("Menu");
        String detail = detMakanan.getDeskripsi();
        String nama = detMakanan.getNama();
        image = findViewById(R.id.img);

        textSatu = findViewById(R.id.tv_dt1);
        textSatu.setText(nama);
        detailText = findViewById(R.id.tv_detail);
        detailText.setText(detail);
        image.setImageResource(detMakanan.getImage());
    }
}
