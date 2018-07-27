package com.mireya.eventsandroid.domain.profile.data;

public class ProfileData {
    private int id;
    private int photoId;
    private int title;

    public ProfileData(int id, int photoId, int title) {
        this.id = id;
        this.photoId = photoId;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhotoId() {
        return photoId;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }
}