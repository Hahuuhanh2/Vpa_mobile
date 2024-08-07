package com.google.android.gms.internal.mlkit_vision_common;

import android.support.v4.media.a;
import f0.b0;
import java.util.HashMap;
import sa.b;
import sa.c;
import sa.d;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
final class zzca implements c {
    public static final zzca zza = new zzca();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;

    static {
        zzai i10 = a.i(1);
        HashMap hashMap = new HashMap();
        hashMap.put(i10.annotationType(), i10);
        zzb = new b("logEventKey", b0.z(hashMap));
        zzai i11 = a.i(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(i11.annotationType(), i11);
        zzc = new b("eventCount", b0.z(hashMap2));
        zzai i12 = a.i(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(i12.annotationType(), i12);
        zzd = new b("inferenceDurationStats", b0.z(hashMap3));
    }

    private zzca() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzax zzax = (zzax) obj;
        d dVar = (d) obj2;
        throw null;
    }
}
