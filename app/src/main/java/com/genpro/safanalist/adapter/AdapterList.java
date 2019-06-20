package com.genpro.safanalist.adapter;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.genpro.safanalist.R;
import com.genpro.safanalist.main.MainContract;
import com.genpro.safanalist.model.Safana;

import java.util.ArrayList;

public class AdapterList extends RecyclerView.Adapter<AdapterList.ViewHolder> {
    Context context;
    ArrayList<Safana> safana;
    MainContract.View view;

    public AdapterList(Context context, ArrayList<Safana> safana, MainContract.View mainView) {
        this.context = context;
        this.safana = safana;
        this.view = mainView;
    }

    public ArrayList<Safana> getListSafana() {
        return safana;
    }
    public void setListSafana(ArrayList<Safana> safana) {
        this.safana = safana;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_view_safana, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.nama.setText(safana.get(i).getNama());
        viewHolder.detail.setText(safana.get(i).getDetail());
        Glide.with(context).load(safana.get(i).getPhoto()).into(viewHolder.gambar);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.goToDetail(safana.get(i).getNama(), safana.get(i).getDetail(), safana.get(i).getPhoto());
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListSafana().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nama, detail;
        ImageView gambar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.txt_nama_item);
            detail = itemView.findViewById(R.id.txt_detail_item);
            gambar = itemView.findViewById(R.id.img_item_view);
        }
    }
}
