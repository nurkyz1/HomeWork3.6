package com.example.homework36;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RVVHolder extends RecyclerView.ViewHolder {
    TextView textView;
    public RVVHolder(@NonNull View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.tv_two);
    }
    public void inBind(String data){
textView.setText(data);
    }
}
