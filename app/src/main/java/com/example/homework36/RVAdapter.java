package com.example.homework36;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class RVAdapter extends RecyclerView.Adapter<RVVHolder> {
    ArrayList<String> list;
    public  RVAdapter (){
        list= new ArrayList<>();
        for (int i = 1; i <50 ; i++) {
            list.add(String.valueOf(i));
        }
    }

    @NonNull
    @Override
    public RVVHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.number_list,parent,false);
        return new  RVVHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVVHolder holder, int position) {
holder.inBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
