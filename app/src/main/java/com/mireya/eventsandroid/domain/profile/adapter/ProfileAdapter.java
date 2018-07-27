package com.mireya.eventsandroid.domain.profile.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mireya.eventsandroid.R;
import com.mireya.eventsandroid.domain.profile.data.ProfileData;
import com.mireya.eventsandroid.domain.profile.presenter.ProfilePresenter;

import java.util.List;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ViewHolder> {
    private Context context;
    private ProfilePresenter presenter;
    private List<ProfileData> teacherData;

    public ProfileAdapter(Context context, ProfilePresenter presenter, List<ProfileData> teacherData) {
        this.context = context;
        this.presenter = presenter;
        this.teacherData = teacherData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_profile, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.title.setText(teacherData.get(position).getTitle());
        //holder.photo.setDra
        //holder.photo.setText(teacherData.get(position).getPhotoId());
        holder.photo.setImageResource(teacherData.get(position).getPhotoId());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("this", "hola" + teacherData.get(position).getId());
                if ((teacherData.get(position).getId()) == 1){
                    Log.d("this", "uno");
                }if (teacherData.get(position).getId() == 2){
                    Log.d("this", "dos");
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return teacherData.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        View mView;
        TextView  title;
        ImageView photo;
        CardView cardView;

        ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            photo = itemView.findViewById(R.id.imgTitle);
            title = itemView.findViewById(R.id.tvTitle);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
