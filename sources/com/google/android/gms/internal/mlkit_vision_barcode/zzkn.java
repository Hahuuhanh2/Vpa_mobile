package com.google.android.gms.internal.mlkit_vision_barcode;

import android.support.v4.media.a;
import f0.b0;
import java.util.HashMap;
import sa.b;
import sa.c;
import sa.d;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
final class zzkn implements c {
    public static final zzkn zza = new zzkn();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;

    static {
        zzdk h10 = a.h(3);
        HashMap hashMap = new HashMap();
        hashMap.put(h10.annotationType(), h10);
        zzb = new b("languageOption", b0.z(hashMap));
        zzdk h11 = a.h(4);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(h11.annotationType(), h11);
        zzc = new b("isUsingLegacyApi", b0.z(hashMap2));
        zzdk h12 = a.h(5);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(h12.annotationType(), h12);
        zzd = new b("sdkVersion", b0.z(hashMap3));
    }

    private zzkn() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzpr zzpr = (zzpr) obj;
        d dVar = (d) obj2;
        throw null;
    }
}
