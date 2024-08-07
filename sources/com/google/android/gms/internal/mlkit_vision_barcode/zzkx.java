package com.google.android.gms.internal.mlkit_vision_barcode;

import android.support.v4.media.a;
import f0.b0;
import java.util.HashMap;
import sa.b;
import sa.c;
import sa.d;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
final class zzkx implements c {
    public static final zzkx zza = new zzkx();
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
    private static final b zzl;
    private static final b zzm;
    private static final b zzn;
    private static final b zzo;

    static {
        zzdk h10 = a.h(1);
        HashMap hashMap = new HashMap();
        hashMap.put(h10.annotationType(), h10);
        zzb = new b("appId", b0.z(hashMap));
        zzdk h11 = a.h(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(h11.annotationType(), h11);
        zzc = new b("appVersion", b0.z(hashMap2));
        zzdk h12 = a.h(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(h12.annotationType(), h12);
        zzd = new b("firebaseProjectId", b0.z(hashMap3));
        zzdk h13 = a.h(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(h13.annotationType(), h13);
        zze = new b("mlSdkVersion", b0.z(hashMap4));
        zzdk h14 = a.h(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(h14.annotationType(), h14);
        zzf = new b("tfliteSchemaVersion", b0.z(hashMap5));
        zzdk h15 = a.h(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(h15.annotationType(), h15);
        zzg = new b("gcmSenderId", b0.z(hashMap6));
        zzdk h16 = a.h(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(h16.annotationType(), h16);
        zzh = new b("apiKey", b0.z(hashMap7));
        zzdk h17 = a.h(8);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(h17.annotationType(), h17);
        zzi = new b("languages", b0.z(hashMap8));
        zzdk h18 = a.h(9);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(h18.annotationType(), h18);
        zzj = new b("mlSdkInstanceId", b0.z(hashMap9));
        zzdk h19 = a.h(10);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(h19.annotationType(), h19);
        zzk = new b("isClearcutClient", b0.z(hashMap10));
        zzdk h20 = a.h(11);
        HashMap hashMap11 = new HashMap();
        hashMap11.put(h20.annotationType(), h20);
        zzl = new b("isStandaloneMlkit", b0.z(hashMap11));
        zzdk h21 = a.h(12);
        HashMap hashMap12 = new HashMap();
        hashMap12.put(h21.annotationType(), h21);
        zzm = new b("isJsonLogging", b0.z(hashMap12));
        zzdk h22 = a.h(13);
        HashMap hashMap13 = new HashMap();
        hashMap13.put(h22.annotationType(), h22);
        zzn = new b("buildLevel", b0.z(hashMap13));
        zzdk h23 = a.h(14);
        HashMap hashMap14 = new HashMap();
        hashMap14.put(h23.annotationType(), h23);
        zzo = new b("optionalModuleVersion", b0.z(hashMap14));
    }

    private zzkx() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzpz zzpz = (zzpz) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, (Object) zzpz.zzg());
        dVar.add(zzc, (Object) zzpz.zzh());
        dVar.add(zzd, (Object) null);
        dVar.add(zze, (Object) zzpz.zzj());
        dVar.add(zzf, (Object) zzpz.zzk());
        dVar.add(zzg, (Object) null);
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, (Object) zzpz.zza());
        dVar.add(zzj, (Object) zzpz.zzi());
        dVar.add(zzk, (Object) zzpz.zzb());
        dVar.add(zzl, (Object) zzpz.zzd());
        dVar.add(zzm, (Object) zzpz.zzc());
        dVar.add(zzn, (Object) zzpz.zze());
        dVar.add(zzo, (Object) zzpz.zzf());
    }
}
