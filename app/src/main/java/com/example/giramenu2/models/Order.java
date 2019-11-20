package com.example.giramenu2.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Order {
    public Order(String table_num, float total_price, String device_id, int time, String order_num, String status, String customer_name, List<Order> changes) {
        this.table_num = table_num;
        this.total_price = total_price;
        this.device_id = device_id;
        this.time = time;
        this.order_num = order_num;
        this.status = status;
        this.customer_name = customer_name;
        this.changes = changes;
    }

    public String getTable_num() {
        return table_num;
    }

    public void setTable_num(String table_num) {
        this.table_num = table_num;
    }

    public float getTotal_price() {
        return total_price;
    }

    public void setTotal_price(float total_price) {
        this.total_price = total_price;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getOrder_num() {
        return order_num;
    }

    public void setOrder_num(String order_num) {
        this.order_num = order_num;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public List<Order> getChanges() {
        return changes;
    }

    public void setChanges(List<Order> changes) {
        this.changes = changes;
    }

    @SerializedName("table_num")
    @Expose
    public String table_num;

    @SerializedName("total_price")
    @Expose
    public float total_price;

    @SerializedName("device_id")
    @Expose
    public String device_id;

    @SerializedName("time")
    @Expose
    public int time;

    @SerializedName("order_num")
    @Expose
    public String order_num;

    @SerializedName("status")
    @Expose
    public String status;

    @SerializedName("customer_name")
    @Expose
    public String customer_name;

    @SerializedName("changes")
    @Expose
    public List<Order> changes;

    @SerializedName("_id")
    @Expose
    public  String _id;

    public Order(String table_num, float total_price, String device_id, int time, String order_num, String status, String customer_name, List<Order> changes, String _id) {
        this.table_num = table_num;
        this.total_price = total_price;
        this.device_id = device_id;
        this.time = time;
        this.order_num = order_num;
        this.status = status;
        this.customer_name = customer_name;
        this.changes = changes;
        this._id = _id;
    }
}
