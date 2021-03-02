package com.example.homework36;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RVViewHolder> {
ArrayList <String> list;


public  RecyclerViewAdapter (){
    list= new ArrayList<>();
list.add("Нуракбар Чекиров");
list.add("Юсупов Алим");
list.add("Ахматов Максат");
    list.add("Эсен Нуркожоевич");
    list.add("Амантур Жумашев");
    list.add("Санжар Акымбетов");
    list.add("Кубаныч Усенбеков");
    list.add("Садыр Жапаров");
    list.add("Алмазбек Атамбаев");
    list.add("Женищ Маратов");
    list.add("Ордо Абдылдаев");
    list.add("Эсенгулов Нурсултан");
    list.add("Исмаилов Эркибек");
    list.add("Кулпунай Акматова");
    list.add("Алексей Дмитреевич");
    list.add("Эльнура Эркинбекова");
    list.add("Данил Мелихов");

}


    @NonNull
    @Override
    public RVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view =inflater.inflate(R.layout.title_list,parent,false);
        return  new RVViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVViewHolder holder, int position) {
holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
