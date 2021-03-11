package fr.iut.projet.view.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import fr.iut.projet.R;

public class MyAdapter extends RecyclerView.Adapter {

    private List<Object> laListe;

    public MyAdapter(List<Object> laListe){
        this.laListe = laListe;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LinearLayout layout =  (LinearLayout)LayoutInflater.from(parent.getContext()).inflate(R.layout.cellule, parent,false);
        return new MyViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        //((MyViewHolder)holder).getTextView().setText(); (juste mit en commentaire pour pouvoir compiler)
    }

    @Override
    public int getItemCount() {
        return laListe.size();
    }
}
