package com.iwebsapp.events.domain.profile.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.iwebsapp.events.R;
import com.iwebsapp.events.domain.profile.data.ProfileData;
import com.iwebsapp.events.domain.profile.presenter.ProfilePresenter;

import java.util.List;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ViewHolder> {
    private Context context;
    private ProfilePresenter presenter;
    private List<ProfileData> profileData;

    public ProfileAdapter(Context context, ProfilePresenter presenter, List<ProfileData> profileData) {
        this.context = context;
        this.presenter = presenter;
        this.profileData = profileData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_profile, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
        viewHolder.title.setText(profileData.get(i).getTitle());
        viewHolder.imgPhoto.setImageResource(profileData.get(i).getImage());
        viewHolder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((profileData.get(i).getId()) == 1){
                    presenter.goConfiguration();
                }
                if ((profileData.get(i).getId()) == 2){
                    presenter.goEvent();
                }
                if ((profileData.get(i).getId()) == 3){
                    presenter.goAboutUs();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return profileData.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        View mView;
        TextView title;
        ImageView imgPhoto;
        ViewHolder(@NonNull View itemView) {
            super(itemView);
            mView = itemView;
            title = itemView.findViewById(R.id.tvTitle);
            imgPhoto = itemView.findViewById(R.id.imgTitle);
        }
    }
}
