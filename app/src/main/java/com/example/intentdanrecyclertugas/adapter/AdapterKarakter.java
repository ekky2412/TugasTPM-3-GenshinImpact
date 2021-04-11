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
import com.example.intentdanrecyclertugas.R;
import com.example.intentdanrecyclertugas.activity.DetailKarakterActivity;
import com.example.intentdanrecyclertugas.activity.KarakterActivity;
import com.example.intentdanrecyclertugas.model.ModelKarakter;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AdapterKarakter extends RecyclerView.Adapter<AdapterKarakter.ViewHolder> {
    public Context context;
    public ArrayList<ModelKarakter> modelKarakter = new ArrayList<>();
    public String namaElemen = null;

    public AdapterKarakter(Context context, ArrayList<ModelKarakter> modelKarakter, String namaElemen){
        this.context = context;
        this.modelKarakter = modelKarakter;
        this.namaElemen = namaElemen;
    }

    public ArrayList<ModelKarakter> getModelKarakter() {
        return modelKarakter;
    }

    @NonNull
    @Override
    public AdapterKarakter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View karakterRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_character, parent,false);
        return new AdapterKarakter.ViewHolder(karakterRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(context).load(getModelKarakter().get(position).getGambarKarakter()).into(holder.ivGambarKarakter);
        holder.tvNamaKarakter.setText(getModelKarakter().get(position).getNamaKarakter());
        holder.tvDeskripsiKarakter.setText(getModelKarakter().get(position).getDetailKarakter());
        holder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailKarakterActivity.class);
                intent.putExtra("namaKarakter",getModelKarakter().get(position).getNamaKarakter());
                intent.putExtra("rarityKarakter",getModelKarakter().get(position).getGambarRarity());
                intent.putExtra("iconWeapon",getModelKarakter().get(position).getIconWeapon());
                intent.putExtra("tipeWeapon",getModelKarakter().get(position).getTipeWeapon());
                intent.putExtra("fotoKarakter",getModelKarakter().get(position).getGambarKarakter());
                intent.putExtra("detailKarakter",getModelKarakter().get(position).getDetailKarakter());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelKarakter.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        Button btnDetail;

        TextView tvNamaKarakter, tvDeskripsiKarakter;
        ImageView ivGambarKarakter;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNamaKarakter = itemView.findViewById(R.id.tvNamaKarakter);
            tvDeskripsiKarakter = itemView.findViewById(R.id.tvDeskripsiKarakter);
            ivGambarKarakter = itemView.findViewById(R.id.ivGambarKarakter);

            btnDetail = itemView.findViewById(R.id.btnKarakterDetail);

        }
    }
}
