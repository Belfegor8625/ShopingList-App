package com.bartoszlewandowski.shoppinglist.app;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Bartosz Lewandowski on 01.03.2019.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("nv2T6fOuzbDdhYQV2ul1OF1hsoD6NxIwLA50JfbA")
                .clientKey("EmBBdoDGID9dcw9THl6SwCQ714bgZzTTmmp1K8su")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
