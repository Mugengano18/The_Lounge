package com.example.giramenu2.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by vakinwande on 04/06/2017.
 */
public class Sidedish {


    public Sidedish(String name, String _id) {
        this.name = name;
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @SerializedName("name")
    @Expose
    public String name;

    @SerializedName("cover")
    public String cover;

    @SerializedName("_id")
    @Expose
    public String _id;

    @SerializedName("quantity")
    @Expose
    public Integer quantity;
}

