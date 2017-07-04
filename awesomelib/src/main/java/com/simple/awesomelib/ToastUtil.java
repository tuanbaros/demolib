package com.simple.awesomelib;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by FRAMGIA\nguyen.thanh.tuan on 04/07/2017.
 */

public class ToastUtil {
    public Toast toast(Context context, String content) {
        return Toast.makeText(context, content, Toast.LENGTH_SHORT);
    }

    public Toast toast(Context context, String content, int time) {
        return Toast.makeText(context, content, time);
    }
}
