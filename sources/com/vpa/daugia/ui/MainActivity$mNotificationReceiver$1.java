package com.vpa.daugia.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import sk.j;

/* compiled from: MainActivity.kt */
public final class MainActivity$mNotificationReceiver$1 extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        j.f(context, "context");
        j.f(intent, "intent");
        j.a(intent.getStringExtra("ACTION_BROADCAST"), "NOTIFICATION");
    }
}
