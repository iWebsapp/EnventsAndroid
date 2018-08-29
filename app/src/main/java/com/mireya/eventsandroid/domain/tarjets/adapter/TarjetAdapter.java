package com.mireya.eventsandroid.domain.tarjets.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mireya.eventsandroid.R;
import com.mireya.eventsandroid.domain.tarjets.data.TarjetData;
import com.mireya.eventsandroid.domain.tarjets.presenter.TarjetPresenter;

import java.util.List;

public class TarjetAdapter extends RecyclerView.Adapter<TarjetAdapter.ViewHolder> {
    private Context context;
    private TarjetPresenter presenter;
    private List<TarjetData> teacherData;

    public TarjetAdapter(Context context, TarjetPresenter presenter, List<TarjetData> teacherData) {
        this.context = context;
        this.presenter = presenter;
        this.teacherData = teacherData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tarjet, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        holder.clave.setText(teacherData.get(position).getClave());
        holder.date.setText(teacherData.get(position).getDate());
        holder.name.setText(teacherData.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return teacherData.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        View mView;
        TextView clave, date, name;

        ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            clave = itemView.findViewById(R.id.tvClave);
            date = itemView.findViewById(R.id.tvNum);
            name = itemView.findViewById(R.id.tvName);
        }
    }
}