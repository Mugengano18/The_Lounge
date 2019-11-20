package com.example.giramenu2.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Price
{
    public Price(String name, String price) {
        this.name = name;
        this.price = price;
    }

    @SerializedName("name")
    @Expose
    public String name;

    @SerializedName("price")
    @Expose
    public String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
