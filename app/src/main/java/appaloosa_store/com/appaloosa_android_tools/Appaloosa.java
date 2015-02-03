package appaloosa_store.com.appaloosa_android_tools;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.appaloosa_store.R;

import appaloosa_store.com.appaloosa_android_tools.analytics.AppaloosaAnalytics;

public class Appaloosa {

    private static final String TAG = Appaloosa.class.getSimpleName();

    private static Application application;
    private static Context applicationContext;

    /**
     * Starts the Appaloosa SDK.
     * You can access our SDK tools (Blacklist and Auto-update features) through the AppaloosaTools class
     * You can access our SDK analytics features through the AppaloosaAnalytics class.
     * @param application The Application object in which the SDK is imported.
     *                    It can be obtained in an activity with the this.getApplication()
     *                    method.
     * @param enableAnalytics Set it to true if you want to activate the analytics for your app,
     *                        false otherwise.
     */
    public static void start(Application application, boolean enableAnalytics) {
        Appaloosa.application = application;
        applicationContext = application.getApplicationContext();
        Log.d(TAG, applicationContext.getResources().getString(R.string.starting_sdk));

        if (enableAnalytics) {
            AppaloosaAnalytics.start();
        }
    }

    public static Application getApplication() {
        return application;
    }

    public static Context getApplicationContext() {
        return applicationContext;
    }
}