package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import java.util.List;
import y6.h;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzael  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzael {
    private final int zza;

    public zzael(String str) {
        int i10 = -1;
        try {
            List zzd = zzab.zzc("[.-]").zzd(str);
            if (zzd.size() == 1) {
                i10 = Integer.parseInt(str);
            } else if (zzd.size() >= 3) {
                i10 = (Integer.parseInt((String) zzd.get(1)) * 1000) + (Integer.parseInt((String) zzd.get(0)) * 1000000) + Integer.parseInt((String) zzd.get(2));
            }
        } catch (IllegalArgumentException e10) {
            if (Log.isLoggable("LibraryVersionContainer", 3)) {
                String.format("Version code parsing failed for: %s with exception %s.", new Object[]{str, e10});
            }
        }
        this.zza = i10;
    }

    public static zzael zza() {
        String a10 = h.f17558c.a("firebase-auth");
        if (TextUtils.isEmpty(a10) || a10.equals("UNKNOWN")) {
            a10 = "-1";
        }
        return new zzael(a10);
    }

    public final String zzb() {
        return String.format("X%s", new Object[]{Integer.toString(this.zza)});
    }
}
