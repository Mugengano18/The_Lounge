package com.example.giramenu2.models;

import androidx.annotation.Nullable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Category {

    public Category(String id, String name, String description, String cover, String parent_category, @Nullable int count, @Nullable boolean hasSubCat) {
        this._id = id;
        this.name = name;
        this.description = description;
        this.cover = cover;
        this.parent_category = parent_category;
        this.number = count;
        this.hasSubCats = hasSubCat;
    }

    @SerializedName("_id")
    @Expose
    public String _id;

    @SerializedName("hasSubCats")
    @Expose
    public boolean hasSubCats;

    @SerializedName("__v")
    @Expose
    public int number = 1;

    @SerializedName("name")
    @Expose
    public String name;

    @SerializedName("description")
    @Expose
    public String description;

    @SerializedName("cover")
    @Expose
    public String cover;

    @SerializedName("parent_category")
    @Expose
    public String parent_category;

    public String getId() {
        return _id;
    }

    public void setId(String id) {
        this._id = id;
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

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getParent_category() {
        return parent_category;
    }

    public void setParent_category(String parent_category) {
        this.parent_category = parent_category;
    }
}
