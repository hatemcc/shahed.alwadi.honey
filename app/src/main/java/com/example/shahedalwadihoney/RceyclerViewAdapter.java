package com.example.shahedalwadihoney;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RceyclerViewAdapter extends RecyclerView.Adapter<RceyclerViewAdapter.HoneyViewHolder> {

ArrayList<honey> honeys;

    public RceyclerViewAdapter(ArrayList<honey> honeys) {
        this.honeys = honeys;
    }

    @NonNull
    @Override
    public HoneyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.honey_custom_item, null, false);
        HoneyViewHolder viewHolder = new HoneyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HoneyViewHolder holder, int position) {
        honey h = honeys.get(position);
        holder.iv_image.setImageResource(h.getImg());
        holder.tv_name.setText(h.getName());


    }

    @Override
    public int getItemCount() {
        return honeys.size();
    }

    // holder class for recycler view
    class HoneyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name;
        ImageView iv_image;

        public HoneyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.honey_custom_tv);
            iv_image = itemView.findViewById(R.id.honey_custom_iv);
        }
    }
}
