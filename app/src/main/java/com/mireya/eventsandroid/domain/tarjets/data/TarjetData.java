package com.mireya.eventsandroid.domain.tarjets.data;

public class TarjetData {
    private int id;
    private String clave;
    private String date;
    private String name;

    public TarjetData(int id, String clave, String date, String name) {
        this.id = id;
        this.clave = clave;
        this.date = date;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
