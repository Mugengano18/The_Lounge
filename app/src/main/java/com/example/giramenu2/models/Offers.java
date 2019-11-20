package com.example.giramenu2.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by vakinwande on 05/06/2017.
 */
public class Offers {

    @SerializedName("name")
    @Expose
    public  String name;

    @SerializedName("_id")
    @Expose
    public String _id;

    @Override
    public String toString() {
        return name;
    }
}