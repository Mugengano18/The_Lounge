package com.example.giramenu2.ServiceReceiver;

import com.example.giramenu2.models.Auth;
import com.example.giramenu2.models.Category;
import com.example.giramenu2.models.Items;
import com.example.giramenu2.models.Offers;
import com.example.giramenu2.models.OrderItem;
import com.example.giramenu2.models.Related;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface MealOrderService {

    @GET("category.list")
    Call<List<Category>> listCategories();

    @GET("category.list/{catid}")
    Call<List<Category>> listSubCategories(@Path("catid")String catid);

    @GET("food.list/{subcatid}")
    Call<List<Items>> listItems(@Path("subcatid")String subcatid);

    @GET("items.recommended.list/{itemid}")
    Call<List<Related>> listAnythingElse(@Path("itemid")String itemid);

    @GET("deviceauth/{macid}")
    Call<String> getToken(@Path("macid") String macid);

    @POST("order.confirm.mobile/{option}/{token}")
    Call<String> confirm(@Body List<OrderItem> orderItems, @Path("token") String token, @Path("option") String option);

    @POST("user.signin.tablet")
    Call<String> authenticate(@Body Auth aut);

    @POST("device.disconnect")
    Call<String> disconnect(@Body Auth aut);

    @GET("offer.list/")
    Call<List<Offers>> listOffers();

    @GET("offer.list/{id}")
    Call<List<Related>> listMyOffers(@Path("id") String id);
}
