package com.google.android.gms.internal.mlkit_common;

import android.support.v4.media.a;
import f0.b0;
import java.util.HashMap;
import sa.b;
import sa.c;
import sa.d;

/* compiled from: com.google.mlkit:common@@18.7.0 */
final class zzex implements c {
    public static final zzex zza = new zzex();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;

    static {
        zzbo g2 = a.g(1);
        HashMap hashMap = new HashMap();
        hashMap.put(g2.annotationType(), g2);
        zzb = new b("inferenceCommonLogEvent", b0.z(hashMap));
        zzbo g10 = a.g(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(g10.annotationType(), g10);
        zzc = new b("options", b0.z(hashMap2));
        zzbo g11 = a.g(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(g11.annotationType(), g11);
        zzd = new b("imageInfo", b0.z(hashMap3));
    }

    private zzex() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjp zzjp = (zzjp) obj;
        d dVar = (d) obj2;
        throw null;
    }
}