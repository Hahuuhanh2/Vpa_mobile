package com.google.android.recaptcha.internal;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzmg {
    public static final /* synthetic */ int zza = 0;
    private static final zzmg zzb = new zzmg();
    private final zzml zzc = new zzlp();
    private final ConcurrentMap zzd = new ConcurrentHashMap();

    private zzmg() {
    }

    public static zzmg zza() {
        return zzb;
    }

    public final zzmk zzb(Class cls) {
        zzla.zzc(cls, "messageType");
        zzmk zzmk = (zzmk) this.zzd.get(cls);
        if (zzmk == null) {
            zzmk = this.zzc.zza(cls);
            zzla.zzc(cls, "messageType");
            zzmk zzmk2 = (zzmk) this.zzd.putIfAbsent(cls, zzmk);
            if (zzmk2 == null) {
                return zzmk;
            }
            return zzmk2;
        }
        return zzmk;
    }
}
