package me.codeinside.utils;

import android.content.Context;
import android.widget.Toast;

public class Log {
    private Context mContext;

    public Log(Context context) {
        mContext = context;
    }

    public void v(String s) {
        android.util.Log.v(mContext.getClass().getSimpleName(), s);
        Toast.makeText(mContext, s, Toast.LENGTH_SHORT).show();
    }
}
