package com.genpro.safanalist.main;

import android.view.View;

import com.genpro.safanalist.model.Safana;

import java.util.ArrayList;

public interface MainContract {
    interface View {
        void initToolbars();
        void setListLayout(android.view.View view);
        void showRecyclerList();
        void showRecyclerGrid();
        void goToDetail(String nama, String detail, String foto);
    }
}
