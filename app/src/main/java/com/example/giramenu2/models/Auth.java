package com.example.giramenu2.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Auth {

    @SerializedName("username")
    @Expose
    public String username;


    @SerializedName("password")
    @Expose
    public String password;


    @SerializedName("table_num")
    @Expose
    public String table_num;

    public Auth(String username, String password, String table_num) {
        this.username = username;
        this.password = password;
        this.table_num = table_num;
    }
}
