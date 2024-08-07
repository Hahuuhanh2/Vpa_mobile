package com.ots.core.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import kf.h;
import sk.j;

/* compiled from: OTPReceiver.kt */
public final class OTPReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        Object obj;
        Status status;
        j.f(context, "context");
        j.f(intent, "intent");
        if (j.a("com.google.android.gms.auth.api.phone.SMS_RETRIEVED", intent.getAction())) {
            Bundle extras = intent.getExtras();
            Integer num = null;
            if (extras != null) {
                obj = extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            } else {
                obj = null;
            }
            if (obj instanceof Status) {
                status = (Status) obj;
            } else {
                status = null;
            }
            if (status != null) {
                num = Integer.valueOf(status.f5345a);
            }
            if (num != null && num.intValue() == 0) {
                Object obj2 = extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                }
                int i10 = h.f12560a;
            } else if (num != null) {
                num.intValue();
            }
        }
    }
}
