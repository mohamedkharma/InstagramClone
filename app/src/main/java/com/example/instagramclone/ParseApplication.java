package com.example.instagramclone;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);
//        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("FzxPMppvSH5Ta47woShkH4euvnyNVH9RS2jcsGdE")
                .clientKey("IxMRAokQE9mkQPh7EBQh58GrTK5HQO7L7slDx63h")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
