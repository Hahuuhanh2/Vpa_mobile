package com.google.android.gms.internal.mlkit_common;

import android.support.v4.media.a;
import f0.b0;
import java.util.HashMap;
import sa.b;
import sa.c;
import sa.d;

/* compiled from: com.google.mlkit:common@@18.7.0 */
final class zzgm implements c {
    public static final zzgm zza = new zzgm();
    private static final b zzb;
    private static final b zzc;

    static {
        zzbo g2 = a.g(1);
        HashMap hashMap = new HashMap();
        hashMap.put(g2.annotationType(), g2);
        zzb = new b("eventType", b0.z(hashMap));
        zzbo g10 = a.g(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(g10.annotationType(), g10);
        zzc = new b("errorCode", b0.z(hashMap2));
    }

    private zzgm() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlu zzlu = (zzlu) obj;
        d dVar = (d) obj2;
        throw null;
    }
}