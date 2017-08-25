package com.example.lteixeira.myapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Lehi on 18/04/2017.
 */

public class City implements Serializable {
    @SerializedName("Nome")
    @Expose
    private String cidade;
    @SerializedName("Estado")
    @Expose
    private String estado;

    public City() {

    }

    public City(String cidade, String estado) {
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
