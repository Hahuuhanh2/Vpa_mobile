package com.google.android.gms.internal.p001firebaseauthapi;

import aa.c;
import android.app.Activity;
import java.util.Map;
import java.util.concurrent.Executor;
import v0.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzafn {
    private static final Map zza = new b();

    public static c zza(String str, c cVar, zzaez zzaez) {
        zze(str, zzaez);
        return new zzafl(cVar, str);
    }

    public static void zzc() {
        zza.clear();
    }

    public static boolean zzd(String str, c cVar, Activity activity, Executor executor) {
        Map map = zza;
        if (map.containsKey(str)) {
            zzafm zzafm = (zzafm) map.get(str);
            if (System.currentTimeMillis() - zzafm.zzb < 120000) {
                zzaez zzaez = zzafm.zza;
                if (zzaez == null) {
                    return true;
                }
                zzaez.zzh(cVar, activity, executor, str);
                return true;
            }
            zze(str, (zzaez) null);
            return false;
        }
        zze(str, (zzaez) null);
        return false;
    }

    private static void zze(String str, zzaez zzaez) {
        zza.put(str, new zzafm(zzaez, System.currentTimeMillis()));
    }
}
