package com.example.intentdanrecyclertugas.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
//import com.example.intentdanrecyclertugas.activity.KarakterActivity;
import com.example.intentdanrecyclertugas.activity.KarakterActivity;
import com.example.intentdanrecyclertugas.model.ModelElemen;
import com.example.intentdanrecyclertugas.R;

import java.util.ArrayList;

public class AdapterElemen extends RecyclerView.Adapter<AdapterElemen.ViewHolder>{

    public Context context;
    public ArrayList<ModelElemen> modelElemen = new ArrayList<>();

    public AdapterElemen(Context context, ArrayList<ModelElemen> modelElemen){
        this.context = context;
        this.modelElemen = modelElemen;
    }

    public ArrayList<ModelElemen> getModelElemen() {
        return modelElemen;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View elemenRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_elemen, parent,false);
        return new ViewHolder(elemenRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,final int position) {
        Glide.with(context).load(getModelElemen().get(position).getGambarElemen()).into(holder.ivGambarElemen);
        holder.tvNamaElemen.setText(getModelElemen().get(position).getNamaElemen());
        holder.tvDeskripsiElemen.setText(getModelElemen().get(position).getDeskripsiElemen());
        holder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, KarakterActivity.class);
                intent.putExtra("namaElemen",getModelElemen().get(position).getNamaElemen());
                context.startActivity(intent);
            }
        });

        holder.btnShare.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                String shareSubject = getModelElemen().get(position).getNamaElemen();
                String shareBody = getModelElemen().get(position).namaElemen+"\n"+getModelElemen().get(position).getDeskripsiElemen();
                share.putExtra(Intent.EXTRA_SUBJECT, shareSubject);
                share.putExtra(Intent.EXTRA_TEXT, shareBody);
                context.startActivity(Intent.createChooser(share, "Share using"));
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelElemen.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivGambarElemen;
        TextView tvNamaElemen, tvDeskripsiElemen;
        Button btnDetail, btnShare;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivGambarElemen = itemView.findViewById(R.id.ivGambarElemen);
            tvNamaElemen = itemView.findViewById(R.id.tvNamaElemen);
            tvDeskripsiElemen = itemView.findViewById(R.id.tvDeskripsiElemen);
            btnDetail = itemView.findViewById(R.id.btnElemenDetail);
            btnShare = itemView.findViewById(R.id.btnElemenShare);

        }
    }
}
