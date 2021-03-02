package com.example.homework36;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RVViewHolder extends RecyclerView.ViewHolder {
    TextView text;
    public RVViewHolder(@NonNull View itemView) {
        super(itemView);
        text= itemView.findViewById(R.id.tv_one);
    }
    public void onBind(String data){
text.setText(data);
    }
}
