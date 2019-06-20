package com.genpro.safanalist.detail;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.genpro.safanalist.R;
import com.genpro.safanalist.model.Safana;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity implements DetailContract.View {
    ImageView imgSafana;
    TextView txtNama, txtDetail;
    Button btnMaps, btnDial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgSafana = findViewById(R.id.img_item_view_detail);
        txtNama = findViewById(R.id.txt_nama_detail);
        txtDetail = findViewById(R.id.txt_detail_detail);

        btnMaps = findViewById(R.id.btn_lihat_di_maps);
        btnDial = findViewById(R.id.btn_pesan_lewat_wa);

        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMaps();
            }
        });
        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDial();
            }
        });

        showProductData();
    }

    @Override
    public void showProductData() {
        String nama = getIntent().getStringExtra("NAMA");
        String detail = getIntent().getStringExtra("DETAIL");
        String foto = getIntent().getStringExtra("FOTO");

        txtNama.setText(nama);
        txtDetail.setText(detail);
        Glide.with(this).load(foto).into(imgSafana);

    }

    @Override
    public void goToDial() {
        Intent intentDial = new Intent(Intent.ACTION_DIAL);
        intentDial.setData(Uri.parse("tel:08998660315"));
        startActivity(intentDial);
    }

    @Override
    public void goToMaps() {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=Safana+susu+kurma+depok");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }else{
            Toast.makeText(this, "Pastikan Handphone kamu terdapat Google Maps..", Toast.LENGTH_SHORT).show();
        }
    }
}
