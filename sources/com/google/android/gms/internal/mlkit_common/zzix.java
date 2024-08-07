package com.google.android.gms.internal.mlkit_common;

import android.support.v4.media.a;
import f0.b0;
import java.util.HashMap;
import sa.b;
import sa.c;
import sa.d;

/* compiled from: com.google.mlkit:common@@18.7.0 */
final class zzix implements c {
    public static final zzix zza = new zzix();
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
        zzbo g2 = a.g(1);
        HashMap hashMap = new HashMap();
        hashMap.put(g2.annotationType(), g2);
        zzb = new b("appId", b0.z(hashMap));
        zzbo g10 = a.g(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(g10.annotationType(), g10);
        zzc = new b("appVersion", b0.z(hashMap2));
        zzbo g11 = a.g(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(g11.annotationType(), g11);
        zzd = new b("firebaseProjectId", b0.z(hashMap3));
        zzbo g12 = a.g(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(g12.annotationType(), g12);
        zze = new b("mlSdkVersion", b0.z(hashMap4));
        zzbo g13 = a.g(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(g13.annotationType(), g13);
        zzf = new b("tfliteSchemaVersion", b0.z(hashMap5));
        zzbo g14 = a.g(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(g14.annotationType(), g14);
        zzg = new b("gcmSenderId", b0.z(hashMap6));
        zzbo g15 = a.g(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(g15.annotationType(), g15);
        zzh = new b("apiKey", b0.z(hashMap7));
        zzbo g16 = a.g(8);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(g16.annotationType(), g16);
        zzi = new b("languages", b0.z(hashMap8));
        zzbo g17 = a.g(9);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(g17.annotationType(), g17);
        zzj = new b("mlSdkInstanceId", b0.z(hashMap9));
        zzbo g18 = a.g(10);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(g18.annotationType(), g18);
        zzk = new b("isClearcutClient", b0.z(hashMap10));
        zzbo g19 = a.g(11);
        HashMap hashMap11 = new HashMap();
        hashMap11.put(g19.annotationType(), g19);
        zzl = new b("isStandaloneMlkit", b0.z(hashMap11));
        zzbo g20 = a.g(12);
        HashMap hashMap12 = new HashMap();
        hashMap12.put(g20.annotationType(), g20);
        zzm = new b("isJsonLogging", b0.z(hashMap12));
        zzbo g21 = a.g(13);
        HashMap hashMap13 = new HashMap();
        hashMap13.put(g21.annotationType(), g21);
        zzn = new b("buildLevel", b0.z(hashMap13));
        zzbo g22 = a.g(14);
        HashMap hashMap14 = new HashMap();
        hashMap14.put(g22.annotationType(), g22);
        zzo = new b("optionalModuleVersion", b0.z(hashMap14));
    }

    private zzix() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzob zzob = (zzob) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, (Object) zzob.zzg());
        dVar.add(zzc, (Object) zzob.zzh());
        dVar.add(zzd, (Object) null);
        dVar.add(zze, (Object) zzob.zzj());
        dVar.add(zzf, (Object) zzob.zzk());
        dVar.add(zzg, (Object) null);
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, (Object) zzob.zza());
        dVar.add(zzj, (Object) zzob.zzi());
        dVar.add(zzk, (Object) zzob.zzb());
        dVar.add(zzl, (Object) zzob.zzd());
        dVar.add(zzm, (Object) zzob.zzc());
        dVar.add(zzn, (Object) zzob.zze());
        dVar.add(zzo, (Object) zzob.zzf());
    }
}
