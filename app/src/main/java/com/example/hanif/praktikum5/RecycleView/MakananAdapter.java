package com.example.hanif.praktikum5.RecycleView;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.hanif.praktikum5.R;
import com.squareup.picasso.Picasso;

import java.util.List;



public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.ViewHolder> {

    private List<Makanan> makanansList;

    public MakananAdapter(List<Makanan> makanansList) {

        this.makanansList = makanansList;
    }

    @NonNull
    @Override
    public MakananAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View makananView = inflater.inflate(R.layout.item_makanan, viewGroup, false);

        return new MakananAdapter.ViewHolder(makananView);


    }
    @Override
    public void onBindViewHolder(@NonNull MakananAdapter.ViewHolder viewHolder, int i) {
        Makanan makanan = makanansList.get(i);

        if (makanan.getImg() != null) {
            Picasso.get().load(makanan.getImg()).into(viewHolder.imageView);
        } else {
            Picasso.get().load(makanan.getImg_local()).into(viewHolder.imageView);
        }

        viewHolder.textView.setText(makanan.getTitle());
        viewHolder.descView.setText(makanan.getDesc());
    }
    @Override
    public int getItemCount() {
        return makanansList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        TextView descView;
        Button btnPesan;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.item_makanan_img);
            textView = itemView.findViewById(R.id.item_makanan_title);
            descView = itemView.findViewById(R.id.item_makanan_price);
            btnPesan = itemView.findViewById(R.id.btnPesan);

        }
    }

}

