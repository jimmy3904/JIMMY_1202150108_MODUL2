package com.example.jm.jimmy_1202150108_modul2;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by JM on 2/18/2018.
 */

    class RecyclerAdapter extends  RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private ArrayList<String> rvData,rvHarga;
    private ArrayList<Integer> gambar;


    public RecyclerAdapter(ArrayList<String> inputData, ArrayList<String> dataHarga, ArrayList<Integer> gmbr) {
        rvData = inputData;
        rvHarga = dataHarga;
        gambar = gmbr;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvTitle;
        public TextView tvSubtitle;
        public ImageView b;
        private RelativeLayout ItemList;

        private Context context;

        public ViewHolder(View v) {
            super(v);

            //Untuk Menghubungkan dan Mendapakan Context dari MainActivity
            context = itemView.getContext();
            //melakukan inisiasi TextView, ImageView dan LinearLayoout
            tvTitle = (TextView) v.findViewById(R.id.tv_title);
            tvSubtitle = (TextView) v.findViewById(R.id.tv_subtitle);
            b = (ImageView) v.findViewById(R.id.icon);
            ItemList = v.findViewById(R.id.list);
            //agar isi dari array nya dapat pindah layout dengan membawa data sesuai dibawah
            ItemList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context,Main6Activity.class);
                    String ingredient ="";
                    switch (getAdapterPosition()){
                        case 0 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Daging,bawang,kecap,garam,gula";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 1 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Margarin,Kecap,Nasi,Garam,Bawang,Telur";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;

                        case 2 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Iga,Bawang Merah,Garam,Kecap";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 3 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Daging,Minyak,Kentang,Saus BBQ";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 4 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Daging,Minyak,Kentang,Saus BBQ";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 5 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Sawi,Bubuk Cabe,Garam";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 6 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Kulit lumpiah,Daging,Jamur,Bawang";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 7 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Mangga,Semangka,Buah naga,Susu";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 8 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Teh,Gula";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;

                        case 9 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",gambar.get(getAdapterPosition()));
                            ingredient = "Susu,Es";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                    }

                }
            });
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // membuat view baru
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - mengambil elemen dari dataset (ArrayList) pada posisi tertentu
        // - mengeset isi view dengan elemen dari dataset tersebut
        final String name = rvData.get(position);
        final String harga = rvHarga.get(position);
        final Integer test = gambar.get(position);
        holder.tvTitle.setText(name);
        holder.tvSubtitle.setText(harga);
        holder.b.setImageResource(test);
    }

    @Override
    public int getItemCount() {
        // menghitung ukuran dataset / jumlah data yang ditampilkan di RecyclerView
        return rvData.size();
    }
}


