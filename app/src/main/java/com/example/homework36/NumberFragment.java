package com.example.homework36;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class NumberFragment extends Fragment {
    RecyclerView recyclerView;
    RVAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_number, container, false);
        recyclerView= view.findViewById(R.id.rv_number);
        adapter = new RVAdapter();
        recyclerView.setAdapter(adapter);


        RecyclerView.LayoutManager manager= new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(manager);
        return view;

    }
}