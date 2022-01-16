package com.example.pleas_pleas;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.content.Context;

public class Call extends MainActivity{
    private final Context mContext;

    public Call(Context context){
        mContext = context;
    }

    public void calling(){
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:01022148994"));
        try {
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}