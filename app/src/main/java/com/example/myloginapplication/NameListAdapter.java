package com.example.myloginapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NameListAdapter extends RecyclerView.Adapter<NameListAdapter.myViewHolder> {
    public NameListAdapter(@NonNull Context context) {
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class myViewHolder extends RecyclerView.ViewHolder {
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
