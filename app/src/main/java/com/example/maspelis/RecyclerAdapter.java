package com.example.maspelis;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter <RecyclerAdapter.CancionesViewHolder> {


    @NonNull
    @Override
    public RecyclerAdapter.CancionesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.CancionesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CancionesViewHolder extends RecyclerView.ViewHolder {
        public CancionesViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
