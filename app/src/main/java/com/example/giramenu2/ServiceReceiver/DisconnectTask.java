package com.example.giramenu2.ServiceReceiver;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

import com.example.giramenu2.Activity.ActivateActivity;
import com.example.giramenu2.Util.Constants;
import com.example.giramenu2.models.Auth;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by GiraICT PC on 19-Dec-18.
 */

public class DisconnectTask extends AsyncTask<Object, Object, Boolean> {
    private String username;
    private String password;
    private Context cxt;

    public DisconnectTask(Context context, String username, String password) {
        this.username = username;
        this.password = password;
        this.cxt = context;
    }

    @Override
    protected Boolean doInBackground(Object... params) {

        class AuthTokenController implements Callback<String> {
            public void start() {
                Gson gson = new GsonBuilder().setLenient().create();
                GsonConverterFactory factory = GsonConverterFactory.create(gson);
                Retrofit retrofit = new Retrofit.Builder().baseUrl(Constants.baseUrl)
                        .addConverterFactory(factory).build();

                MealOrderService mealOrderService = retrofit.create(MealOrderService.class);

                Call<String> call = mealOrderService.disconnect(new Auth(username, password, Constants.table_num));

                call.enqueue(this);
            }

            @Override
            public void onResponse(Call<String> call, Response<String> response) {

                boolean responseStatus = response.isSuccessful();

                if (responseStatus) {
                    Constants.option = 0;
                    Constants.lang = 1;
                    Constants.token = "";

                    Intent intent = new Intent(cxt, ActivateActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    cxt.startActivity(intent);
                    // finish();

                }

            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

                System.out.print("failure");

                return;

            }
        }

        try {
            AuthTokenController controller = new AuthTokenController();
            controller.start();

        } catch (Exception e) {
            return false;
        }
        return null;
    }
}
