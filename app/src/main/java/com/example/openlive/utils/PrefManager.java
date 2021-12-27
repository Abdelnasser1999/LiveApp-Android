package com.example.openlive.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.openlive.Constants;


public class PrefManager {
    public static SharedPreferences getPreferences(Context context) {
        return context.getSharedPreferences(Constants.PREF_NAME, Context.MODE_PRIVATE);
    }
}
