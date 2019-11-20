package com.example.giramenu2.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by vakinwande on 04/06/2017.
 */
public class Related {

    @SerializedName("price")
    @Expose
    public Integer price;

    @SerializedName("name")
    @Expose
    public  String name;

    @SerializedName("_id")
    @Expose
    public String _id;


}
