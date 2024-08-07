package com.google.android.gms.internal.mlkit_vision_common;

import android.support.v4.media.a;
import f0.b0;
import java.util.HashMap;
import sa.b;
import sa.c;
import sa.d;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
final class zzej implements c {
    public static final zzej zza = new zzej();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;
    private static final b zzg;
    private static final b zzh;

    static {
        zzai i10 = a.i(1);
        HashMap hashMap = new HashMap();
        hashMap.put(i10.annotationType(), i10);
        zzb = new b("durationMs", b0.z(hashMap));
        zzai i11 = a.i(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(i11.annotationType(), i11);
        zzc = new b("imageSource", b0.z(hashMap2));
        zzai i12 = a.i(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(i12.annotationType(), i12);
        zzd = new b("imageFormat", b0.z(hashMap3));
        zzai i13 = a.i(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(i13.annotationType(), i13);
        zze = new b("imageByteSize", b0.z(hashMap4));
        zzai i14 = a.i(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(i14.annotationType(), i14);
        zzf = new b("imageWidth", b0.z(hashMap5));
        zzai i15 = a.i(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(i15.annotationType(), i15);
        zzg = new b("imageHeight", b0.z(hashMap6));
        zzai i16 = a.i(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(i16.annotationType(), i16);
        zzh = new b("rotationDegrees", b0.z(hashMap7));
    }

    private zzej() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zziq zziq = (zziq) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, (Object) zziq.zzg());
        dVar.add(zzc, (Object) zziq.zzb());
        dVar.add(zzd, (Object) zziq.zza());
        dVar.add(zze, (Object) zziq.zzc());
        dVar.add(zzf, (Object) zziq.zze());
        dVar.add(zzg, (Object) zziq.zzd());
        dVar.add(zzh, (Object) zziq.zzf());
    }
}
