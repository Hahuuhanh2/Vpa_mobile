package com.google.android.gms.internal.mlkit_vision_barcode;

import android.support.v4.media.a;
import f0.b0;
import java.util.HashMap;
import sa.b;
import sa.c;
import sa.d;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
final class zzia implements c {
    public static final zzia zza = new zzia();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;
    private static final b zzg;
    private static final b zzh;
    private static final b zzi;
    private static final b zzj;
    private static final b zzk;

    static {
        zzdk h10 = a.h(1);
        HashMap hashMap = new HashMap();
        hashMap.put(h10.annotationType(), h10);
        zzb = new b("durationMs", b0.z(hashMap));
        zzdk h11 = a.h(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(h11.annotationType(), h11);
        zzc = new b("errorCode", b0.z(hashMap2));
        zzdk h12 = a.h(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(h12.annotationType(), h12);
        zzd = new b("isColdCall", b0.z(hashMap3));
        zzdk h13 = a.h(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(h13.annotationType(), h13);
        zze = new b("autoManageModelOnBackground", b0.z(hashMap4));
        zzdk h14 = a.h(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(h14.annotationType(), h14);
        zzf = new b("autoManageModelOnLowMemory", b0.z(hashMap5));
        zzdk h15 = a.h(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(h15.annotationType(), h15);
        zzg = new b("isNnApiEnabled", b0.z(hashMap6));
        zzdk h16 = a.h(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(h16.annotationType(), h16);
        zzh = new b("eventsCount", b0.z(hashMap7));
        zzdk h17 = a.h(8);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(h17.annotationType(), h17);
        zzi = new b("otherErrors", b0.z(hashMap8));
        zzdk h18 = a.h(9);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(h18.annotationType(), h18);
        zzj = new b("remoteConfigValueForAcceleration", b0.z(hashMap9));
        zzdk h19 = a.h(10);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(h19.annotationType(), h19);
        zzk = new b("isAccelerated", b0.z(hashMap10));
    }

    private zzia() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmw zzmw = (zzmw) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, (Object) zzmw.zze());
        dVar.add(zzc, (Object) zzmw.zza());
        dVar.add(zzd, (Object) zzmw.zzd());
        dVar.add(zze, (Object) zzmw.zzb());
        dVar.add(zzf, (Object) zzmw.zzc());
        dVar.add(zzg, (Object) null);
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, (Object) null);
        dVar.add(zzj, (Object) null);
        dVar.add(zzk, (Object) null);
    }
}
