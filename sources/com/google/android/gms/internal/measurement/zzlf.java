package com.google.android.gms.internal.measurement;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
final class zzlf {
    private static final zzlf zza = new zzlf();
    private final zzlm zzb = new zzkf();
    private final ConcurrentMap<Class<?>, zzlj<?>> zzc = new ConcurrentHashMap();

    private zzlf() {
    }

    public static zzlf zza() {
        return zza;
    }

    public final <T> zzlj<T> zza(Class<T> cls) {
        zzjh.zza(cls, "messageType");
        zzlj<T> zzlj = this.zzc.get(cls);
        if (zzlj != null) {
            return zzlj;
        }
        zzlj<T> zza2 = this.zzb.zza(cls);
        zzjh.zza(cls, "messageType");
        zzjh.zza(zza2, "schema");
        zzlj<T> putIfAbsent = this.zzc.putIfAbsent(cls, zza2);
        return putIfAbsent != null ? putIfAbsent : zza2;
    }

    public final <T> zzlj<T> zza(T t10) {
        return zza(t10.getClass());
    }
}
