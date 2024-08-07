package com.google.android.gms.internal.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import k1.a;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zao extends a {
    @Deprecated
    public static Intent zaa(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i10;
        if (!zan.zaa()) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        if (true != zan.zaa()) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, i10);
    }
}
