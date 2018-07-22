package me.codeinside.utils;

import android.content.Context;
import android.widget.Toast;

public class Log {
    private Context mContext;

    public Log(Context context) {
        mContext = context;
    }

    public <T> void v(T s) {
        String msg = "VERBOSE: " + s.toString();
        android.util.Log.v(mContext.getClass().getSimpleName(), msg);
        Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
    }
}
