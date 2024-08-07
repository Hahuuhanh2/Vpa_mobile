package com.google.android.gms.internal.p001firebaseauthapi;

import android.content.Context;
import u6.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaee  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzaee {
    private static Boolean zza;

    public static boolean zza(Context context) {
        if (zza == null) {
            int c10 = b.f15290b.c(context, 12451000);
            boolean z10 = true;
            if (!(c10 == 0 || c10 == 2)) {
                z10 = false;
            }
            zza = Boolean.valueOf(z10);
        }
        return zza.booleanValue();
    }
}
