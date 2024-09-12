package com.moviles.broadcastwifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

import java.net.URI;

public class BroadcastWiFi extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Boolean llamada = intent.getBooleanExtra("connected", false);

        if(llamada)
        {
            Intent i2 = new Intent(Intent.ACTION_CALL);
            i2.setData(Uri.parse("tel:2664553747"));
            context.startActivity(i2);
        }

    }
}