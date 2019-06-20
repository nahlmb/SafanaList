package com.genpro.safanalist.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.genpro.safanalist.InfoActivity;
import com.genpro.safanalist.detail.DetailActivity;
import com.genpro.safanalist.R;
import com.genpro.safanalist.adapter.AdapterList;
import com.genpro.safanalist.model.Safana;
import com.genpro.safanalist.model.SafanaData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MainContract.View, PopupMenu.OnMenuItemClickListener {
    RecyclerView recyclerView;
    ArrayList<Safana> safana;
    ImageButton moreButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolbars();

        safana = new ArrayList<>();
        recyclerView = findViewById(R.id.recycleview);
        safana.addAll(SafanaData.getSafanaListData());

        moreButton = findViewById(R.id.more_botton_main);
        moreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setListLayout(v);
            }
        });

        showRecyclerList();


    }

    @Override
    public void initToolbars() {

    }

    @Override
    public void setListLayout(android.view.View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.main_menu);
        popupMenu.show();

    }

    @Override
    public void showRecyclerList() {
        AdapterList adapterList = new AdapterList(this, safana, this);
        adapterList.setListSafana(safana);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapterList);


    }

    @Override
    public void showRecyclerGrid() {
        AdapterList adapterGrid = new AdapterList(this, safana, this);
        adapterGrid.setListSafana(safana);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(adapterGrid);

    }

    @Override
    public void goToDetail(String nama, String detail, String foto) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("NAMA", nama);
        intent.putExtra("DETAIL", detail);
        intent.putExtra("FOTO", foto);
        startActivity(intent);
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.list_view_menu :
                showRecyclerList();
                break;

            case R.id.grid_view_menu :
                showRecyclerGrid();
                break;

            case R.id.info_menu :
                Intent goToInfo = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(goToInfo);
                Toast.makeText(this, "Aplikasi submit Android pemula dari Nahl Munif Basalamah..", Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }
}
