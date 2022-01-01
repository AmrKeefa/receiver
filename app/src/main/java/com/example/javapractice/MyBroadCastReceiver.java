package com.example.javapractice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadCastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Intent i = new Intent(context.getApplicationContext(),MainActivity.class);
        i.addFlags(
                Intent.FLAG_ACTIVITY_NEW_TASK
                        | Intent.FLAG_ACTIVITY_CLEAR_TOP
                        | Intent.FLAG_ACTIVITY_SINGLE_TOP);

        context.getApplicationContext().startActivity(i);
        Toast.makeText(context,"Welcome to  second app",Toast.LENGTH_SHORT).show();

    }
}
