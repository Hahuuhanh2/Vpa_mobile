package com.google.android.gms.internal.mlkit_vision_common;

import android.support.v4.media.a;
import f0.b0;
import java.util.HashMap;
import sa.b;
import sa.c;
import sa.d;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
final class zzeb implements c {
    public static final zzeb zza = new zzeb();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;
    private static final b zzg;

    static {
        zzai i10 = a.i(1);
        HashMap hashMap = new HashMap();
        hashMap.put(i10.annotationType(), i10);
        zzb = new b("mode", b0.z(hashMap));
        zzai i11 = a.i(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(i11.annotationType(), i11);
        zzc = new b("landmark", b0.z(hashMap2));
        zzai i12 = a.i(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(i12.annotationType(), i12);
        zzd = new b("classification", b0.z(hashMap3));
        zzai i13 = a.i(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(i13.annotationType(), i13);
        zze = new b("prominentFaceOnly", b0.z(hashMap4));
        zzai i14 = a.i(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(i14.annotationType(), i14);
        zzf = new b("tracking", b0.z(hashMap5));
        zzai i15 = a.i(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(i15.annotationType(), i15);
        zzg = new b("minFaceSize", b0.z(hashMap6));
    }

    private zzeb() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlu zzlu = (zzlu) obj;
        d dVar = (d) obj2;
        throw null;
    }
}
