package com.mireya.eventsandroid.domain.profile.data;

public class ProfileData {
    int id;
    int photoId;
    String title;

    public ProfileData(int id, int photoId, String title) {
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

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}