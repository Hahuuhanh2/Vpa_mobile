package com.google.android.gms.internal.mlkit_vision_barcode;

import android.support.v4.media.a;
import f0.b0;
import java.util.HashMap;
import sa.b;
import sa.c;
import sa.d;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
final class zzjo implements c {
    public static final zzjo zza = new zzjo();
    private static final b zzb;
    private static final b zzc;

    static {
        zzdk h10 = a.h(1);
        HashMap hashMap = new HashMap();
        hashMap.put(h10.annotationType(), h10);
        zzb = new b("errorCode", b0.z(hashMap));
        zzdk h11 = a.h(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(h11.annotationType(), h11);
        zzc = new b("durationMs", b0.z(hashMap2));
    }

    private zzjo() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzos zzos = (zzos) obj;
        d dVar = (d) obj2;
        throw null;
    }
}
