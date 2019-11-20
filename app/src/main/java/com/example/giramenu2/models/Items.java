package com.example.giramenu2.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Items {

    public Items() {
    }


    public Items(String name, List<Price> prices, String _id) {
        this.name = name;
        this.prices = prices;
        this._id = _id;
    }

    public Items(String name, String description, List<Price> prices, String parent_category, String health, String category_id, String subcategory_id, List<Component> components, int time, String cover, List<Object> related) {
        this.name = name;
        this.description = description;
        this.prices = prices;
        this.parent_category = parent_category;
        this.health = health;
        this.category_id = category_id;
        this.subcategory_id = subcategory_id;
        this.components = components;
        this.time = time;
        this.cover = cover;
        this.related = related;
    }

    public Items(String name, String description, List<Price> prices, String parent_category, String health, String category_id, String subcategory_id, List<Component> components, int time, String cover, String _id, List<Object> related) {
        this.name = name;
        this.description = description;
        this.prices = prices;
        this.parent_category = parent_category;
        this.health = health;
        this.category_id = category_id;
        this.subcategory_id = subcategory_id;
        this.components = components;
        this.time = time;
        this.cover = cover;
        this._id = _id;
        this.related = related;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Price> getPrices() {
        return prices;
    }

    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    public String getParent_category() {
        return parent_category;
    }

    public void setParent_category(String parent_category) {
        this.parent_category = parent_category;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getSubcategory_id() {
        return subcategory_id;
    }

    public void setSubcategory_id(String subcategory_id) {
        this.subcategory_id = subcategory_id;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
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

    @SerializedName("description")
    @Expose
    public String description;

    @SerializedName("prices")
    @Expose
    public List<Price> prices;

    @SerializedName("parent_category")
    @Expose
    public String parent_category;

    @SerializedName("health")
    @Expose
    public String health;

    @SerializedName("category_id")
    @Expose
    public  String category_id;

    @SerializedName("subcategory_id")
    @Expose
    public  String subcategory_id;

    @SerializedName("components")
    @Expose
    public  List<Component> components;

    @SerializedName("related")
    @Expose
    public  List<Object> related;

    @SerializedName("side_dishes")
    @Expose
    public  List<Sidedish> side_dishes;


    @SerializedName("time")
    @Expose
    public  int time;

    @SerializedName("cover")
    @Expose
    public  String cover;

    @SerializedName("_id")
    @Expose
    public  String _id;

}
