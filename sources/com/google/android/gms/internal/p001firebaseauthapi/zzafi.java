package com.google.android.gms.internal.p001firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import h7.a;
import h7.d;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafi  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzafi {
    private final String zza;
    private final String zzb;

    public zzafi(Context context, String str) {
        j.f(context);
        j.c(str);
        this.zza = str;
        try {
            byte[] a10 = a.a(context, str);
            if (a10 == null) {
                "single cert required: ".concat(String.valueOf(str));
                this.zzb = null;
                return;
            }
            this.zzb = d.a(a10);
        } catch (PackageManager.NameNotFoundException unused) {
            "no pkg: ".concat(String.valueOf(str));
            this.zzb = null;
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
