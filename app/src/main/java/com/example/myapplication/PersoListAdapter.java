package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersoListAdapter extends RecyclerView.Adapter<PersoListAdapter.PersoViewHolder> {

    private ArrayList<User> persoList;

    public static class PersoViewHolder extends RecyclerView.ViewHolder {

        TextView itemPersoNom;
        TextView itemPersoPrenom;

        public PersoViewHolder(@NonNull View itemView) {
            super(itemView);
            itemPersoNom = itemView.findViewById(R.id.itemPersoNom);
            itemPersoPrenom = itemView.findViewById(R.id.itemPersoPrenom);
        }
    }

    public PersoListAdapter(ArrayList<User> persoList) {
        this.persoList = persoList;
    }

    @NonNull
    @Override
    public PersoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_perso,parent,false);

        PersoViewHolder viewHolder = new PersoViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PersoViewHolder holder, int position) {
        holder.itemPersoNom.setText(persoList.get(position).getNom());
        holder.itemPersoPrenom.setText(persoList.get(position).getPrenom());
    }

    @Override
    public int getItemCount() {
        return persoList.size();
    }
}
