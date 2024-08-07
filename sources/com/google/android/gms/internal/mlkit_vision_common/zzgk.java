package com.google.android.gms.internal.mlkit_vision_common;

import android.support.v4.media.a;
import f0.b0;
import java.util.HashMap;
import sa.b;
import sa.c;
import sa.d;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
final class zzgk implements c {
    public static final zzgk zza = new zzgk();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;

    static {
        zzai i10 = a.i(3);
        HashMap hashMap = new HashMap();
        hashMap.put(i10.annotationType(), i10);
        zzb = new b("languageOption", b0.z(hashMap));
        zzai i11 = a.i(4);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(i11.annotationType(), i11);
        zzc = new b("isUsingLegacyApi", b0.z(hashMap2));
        zzai i12 = a.i(5);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(i12.annotationType(), i12);
        zzd = new b("sdkVersion", b0.z(hashMap3));
    }

    private zzgk() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzks zzks = (zzks) obj;
        d dVar = (d) obj2;
        throw null;
    }
}
