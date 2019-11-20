package com.example.giramenu2.Util;

import com.example.giramenu2.models.Category;
import com.example.giramenu2.models.Component;
import com.example.giramenu2.models.Items;
import com.example.giramenu2.models.Offers;
import com.example.giramenu2.models.Order;
import com.example.giramenu2.models.OrderItem;
import com.example.giramenu2.models.Sidedish;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by vakinwande on 12/04/2017.
 */

public class Constants {

    public static String baseUrl = "http://192.168.43.140:5600";
    public static String ip = "13.90.97.15";

    public static List<Items> items;
    public static List<Category> categories;
    public static List<Order> orders;
    public static List<OrderItem> orderitems;
    public  static Map<String, List<Items>> allitems;
    public  static Map<String, Component> excluded;
    public  static Map<String, Sidedish> addedsidedishes;
    public  static Map<Integer, Items> related;
    public static String orderId = "";
    public static int option = 1;
    public static boolean getReturn = false;
    public static int lang = 1;
    public static String currentcat;
    public static List<Category> subcategories;
    public static int currentpage = 0;
    public static int currentpageitems = 0;
    public static int currentpagecomp = 0;
    public static Items currentItem;
    public static boolean isCategories = true;
    public static OrderItem pendingOrderItem;
    public static String token = "";
    public static String table_num;
    public static List<Offers> offers;
    public static int volumedown;
    public static int clickct;
    public static int offersCount;
    public static boolean controlPicker;

    public void Init()
    {
        clickct = 0;
        Constants.items = new ArrayList<>();
        Constants.categories = new ArrayList<>();
        Constants.subcategories = new ArrayList<>();
        Constants.orders = new ArrayList<>();
        Constants.orderitems = new ArrayList<>();
        Constants.allitems = new HashMap<>();
        Constants.currentpage = 0;
        currentpageitems = 0;
        currentpagecomp = 0;
        isCategories = true;
        currentItem = new Items();
        pendingOrderItem = new OrderItem();
        excluded = new HashMap<>();
        addedsidedishes = new HashMap<>();
        related = new HashMap<>();
        orderId = "";
        volumedown = 0;
        offersCount = 0;
        controlPicker = false;
    }


    public static String TAG = "Lounge";
}

