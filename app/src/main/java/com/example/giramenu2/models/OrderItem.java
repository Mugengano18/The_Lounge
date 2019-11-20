package com.example.giramenu2.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OrderItem
{
    @SerializedName("item_id")
    @Expose
    public String order_item_id;

    @SerializedName("num_items")
    @Expose
    public int qnty;

    @SerializedName("precision")
    @Expose
    public String itemclass;

    @SerializedName("current_price")
    @Expose
    public float current_price;

    @SerializedName("special_request")
    public String special_request;

    public Items item;

    @SerializedName("item_name")
    @Expose
    public String item_name;


    @SerializedName("isTakeAway")
    @Expose
    public String isTakeAway;

    @SerializedName("excluded")
    @Expose
    public List<Component> excluded;

    @SerializedName("side_dishes")
    @Expose
    public List<Sidedish> side_dishes;

    public OrderItem() {

    }
}
