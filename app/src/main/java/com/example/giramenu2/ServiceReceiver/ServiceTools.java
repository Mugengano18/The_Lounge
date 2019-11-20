package com.example.giramenu2.ServiceReceiver;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;

import com.example.giramenu2.Util.Constants;

import java.util.List;

public class ServiceTools {
    private static String LOG_TAG = ServiceTools.class.getName();

    public static boolean isServiceRunning(Context context, Class<?> serviceClass){
        final ActivityManager activityManager = (ActivityManager)context.getSystemService(Context.ACTIVITY_SERVICE);
        final List<ActivityManager.RunningServiceInfo> services = activityManager.getRunningServices(Integer.MAX_VALUE);

        for (ActivityManager.RunningServiceInfo runningServiceInfo : services) {
            Log.d(Constants.TAG, String.format("Service:%s", runningServiceInfo.service.getClassName()));
            if (runningServiceInfo.service.getClassName().equals(serviceClass.getName())){
                return true;
            }
        }
        return false;
    }
}
