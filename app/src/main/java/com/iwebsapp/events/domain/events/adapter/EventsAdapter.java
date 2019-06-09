package com.iwebsapp.events.domain.events.adapter;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.iwebsapp.events.R;
import com.iwebsapp.events.domain.events.data.EventsData;
import com.iwebsapp.events.domain.events.presenter.EventsPresenter;

import java.util.List;

public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.ViewHolder> {
    private Context context;
    private EventsPresenter presenter;
    private List<EventsData> eventsData;

    public EventsAdapter(Context context, EventsPresenter presenter, List<EventsData> eventsData) {
        this.context = context;
        this.presenter = presenter;
        this.eventsData = eventsData;
    }

    @NonNull
    @Override
    public EventsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_events, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventsAdapter.ViewHolder viewHolder, int i) {
        viewHolder.titleEvent.setText(eventsData.get(i).getTitleEvent());
        viewHolder.dateEvent.setText(eventsData.get(i).getDateEvent());
        viewHolder.imgPhoto.setImageResource(eventsData.get(i).getImage());
        viewHolder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.goEventDescription();
            }
        });

    }

    @Override
    public int getItemCount() {
        return eventsData.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        View mView;
        TextView titleEvent, dateEvent;
        ImageView imgPhoto;
        ViewHolder(@NonNull View itemView) {
            super(itemView);
            mView = itemView;
            titleEvent = itemView.findViewById(R.id.tvTitleEvent);
            dateEvent = itemView.findViewById(R.id.txtDateEvent);
            imgPhoto = itemView.findViewById(R.id.imgTitle);
        }
    }
}
