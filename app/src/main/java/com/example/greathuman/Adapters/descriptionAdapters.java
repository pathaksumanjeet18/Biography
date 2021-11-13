package com.example.greathuman.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.greathuman.Models.descriptionModel;
import com.example.greathuman.R;

import java.util.ArrayList;

public class descriptionAdapters extends RecyclerView.Adapter<descriptionAdapters.viewHolder>{

    ArrayList<descriptionModel> list;
    Context context;

    public descriptionAdapters(ArrayList<descriptionModel> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View view = LayoutInflater.from(context).inflate(R.layout.sample,parent,false);
         return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        descriptionModel model = list.get(position);

        holder.imageView.setImageResource(model.getPic());
        holder.tv1.setText(model.getText1());
        holder.tv2.setText(model.getText2());

    }

    @Override
    public int getItemCount(){
        return list.size();
    }


    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView tv1;
        TextView tv2;
        CardView cardView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            tv1 = itemView.findViewById(R.id.textView);
            tv2 = itemView.findViewById(R.id.textView2);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
