package com.iwebsapp.events.domain.events.data;

public class EventsData {
    private int id;
    private int image;
    private String titleEvent;
    private String dateEvent;

    public EventsData(int id, int image, String titleEvent, String dateEvent) {
        this.id = id;
        this.image = image;
        this.titleEvent = titleEvent;
        this.dateEvent = dateEvent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitleEvent() {
        return titleEvent;
    }

    public void setTitleEvent(String titleEvent) {
        this.titleEvent = titleEvent;
    }

    public String getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(String dateEvent) {
        this.dateEvent = dateEvent;
    }
}
