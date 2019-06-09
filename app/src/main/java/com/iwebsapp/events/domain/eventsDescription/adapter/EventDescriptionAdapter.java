package com.iwebsapp.events.domain.eventsDescription.adapter;

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
import com.iwebsapp.events.domain.eventsDescription.data.EventDescriptionData;
import com.iwebsapp.events.domain.eventsDescription.presenter.EventDescriptionPresenter;

import java.util.List;

public class EventDescriptionAdapter extends RecyclerView.Adapter<EventDescriptionAdapter.ViewHolder> {
    private Context context;
    private EventDescriptionPresenter presenter;
    private List<EventDescriptionData> eventDescriptionData;

    public EventDescriptionAdapter(Context context, EventDescriptionPresenter presenter, List<EventDescriptionData> eventDescriptionData) {
        this.context = context;
        this.presenter = presenter;
        this.eventDescriptionData = eventDescriptionData;
    }

    @NonNull
    @Override
    public EventDescriptionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_profile, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventDescriptionAdapter.ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
        viewHolder.title.setText(eventDescriptionData.get(i).getTitle());
        viewHolder.imgPhoto.setImageResource(eventDescriptionData.get(i).getImage());
        viewHolder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((eventDescriptionData.get(i).getId()) == 5){
                   presenter.goProducts();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return eventDescriptionData.size();
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
