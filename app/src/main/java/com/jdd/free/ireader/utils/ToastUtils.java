package com.jdd.free.ireader.utils;

import android.widget.Toast;

import com.jdd.free.ireader.App;

/**
 * Created by jdd on 17-5-11.
 */

public class ToastUtils {

    public static void show(String msg){
        Toast.makeText(App.getContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
