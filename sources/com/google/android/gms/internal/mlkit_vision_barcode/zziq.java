package com.google.android.gms.internal.mlkit_vision_barcode;

import android.support.v4.media.a;
import f0.b0;
import java.util.HashMap;
import sa.b;
import sa.c;
import sa.d;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
final class zziq implements c {
    public static final zziq zza = new zziq();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;

    static {
        zzdk h10 = a.h(1);
        HashMap hashMap = new HashMap();
        hashMap.put(h10.annotationType(), h10);
        zzb = new b("category", b0.z(hashMap));
        zzdk h11 = a.h(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(h11.annotationType(), h11);
        zzc = new b("classificationConfidence", b0.z(hashMap2));
        zzdk h12 = a.h(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(h12.annotationType(), h12);
        zzd = new b("trackingId", b0.z(hashMap3));
        zzdk h13 = a.h(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(h13.annotationType(), h13);
        zze = new b("labelCount", b0.z(hashMap4));
    }

    private zziq() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzno zzno = (zzno) obj;
        d dVar = (d) obj2;
        throw null;
    }
}
