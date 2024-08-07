package com.google.android.gms.internal.mlkit_common;

import android.support.v4.media.a;
import f0.b0;
import java.util.HashMap;
import sa.b;
import sa.c;
import sa.d;

/* compiled from: com.google.mlkit:common@@18.7.0 */
final class zzhn implements c {
    public static final zzhn zza = new zzhn();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;

    static {
        zzbo g2 = a.g(1);
        HashMap hashMap = new HashMap();
        hashMap.put(g2.annotationType(), g2);
        zzb = new b("inferenceCommonLogEvent", b0.z(hashMap));
        zzbo g10 = a.g(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(g10.annotationType(), g10);
        zzc = new b("imageInfo", b0.z(hashMap2));
        zzbo g11 = a.g(4);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(g11.annotationType(), g11);
        zzd = new b("captionCount", b0.z(hashMap3));
        zzbo g12 = a.g(5);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(g12.annotationType(), g12);
        zze = new b("highestScore", b0.z(hashMap4));
        zzbo g13 = a.g(6);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(g13.annotationType(), g13);
        zzf = new b("imageType", b0.z(hashMap5));
    }

    private zzhn() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmt zzmt = (zzmt) obj;
        d dVar = (d) obj2;
        throw null;
    }
}
