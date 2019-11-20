package com.example.giramenu2;

import android.app.Application;
import android.content.Intent;
import android.util.Log;

import com.example.giramenu2.ServiceReceiver.KeepActiveService;

/**
 * Created by vakinwande on 10/04/2017.
 */

public class MealorderApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {

            @Override
            public void uncaughtException(Thread arg0, Throwable arg1) {

                Log.d("Exception", "Uncaught exception");

            }
        });




        //  Parse.enableLocalDatastore(this);

//        Parse.initialize(new Parse.Configuration.Builder(this).applicationId(
//                getString(R.string.parse_app_id))
//                .clientKey("")
//                .server(getString(R.string.parse_server_url)).build());

    }

    private void startKioskService() { // ... and this method
        startService(new Intent(this, KeepActiveService.class));
    }
}
