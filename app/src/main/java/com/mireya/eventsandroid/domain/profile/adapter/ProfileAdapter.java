package com.mireya.eventsandroid.domain.profile.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.XmlResourceParser;
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

import org.xmlpull.v1.XmlPullParser;

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
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        holder.title.setText(teacherData.get(position).getTitle());
        holder.photo.setImageResource(teacherData.get(position).getPhotoId());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("this", "hola" + teacherData.get(position).getId());
                if ((teacherData.get(position).getId()) == 1)
                    presenter.goConfiguration();
                if (teacherData.get(position).getId() == 2)
                    Log.d("this", "dos");
                if (teacherData.get(position).getId() == 3)
                    Log.d("this", "tres");
                if (teacherData.get(position).getId() == 4)
                    Log.d("this", "cuatro");
                if (teacherData.get(position).getId() == 5)
                    Log.d("this", "cinco");
                if (teacherData.get(position).getId() == 6)
                    presenter.goPrivacy();
                if (teacherData.get(position).getId() == 7)
                    Log.d("this", "siete");
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
