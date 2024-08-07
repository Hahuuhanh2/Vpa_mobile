package com.google.android.gms.internal.mlkit_vision_common;

import android.support.v4.media.a;
import f0.b0;
import java.util.HashMap;
import sa.b;
import sa.c;
import sa.d;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
final class zzgu implements c {
    public static final zzgu zza = new zzgu();
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
        zzai i10 = a.i(1);
        HashMap hashMap = new HashMap();
        hashMap.put(i10.annotationType(), i10);
        zzb = new b("appId", b0.z(hashMap));
        zzai i11 = a.i(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(i11.annotationType(), i11);
        zzc = new b("appVersion", b0.z(hashMap2));
        zzai i12 = a.i(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(i12.annotationType(), i12);
        zzd = new b("firebaseProjectId", b0.z(hashMap3));
        zzai i13 = a.i(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(i13.annotationType(), i13);
        zze = new b("mlSdkVersion", b0.z(hashMap4));
        zzai i14 = a.i(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(i14.annotationType(), i14);
        zzf = new b("tfliteSchemaVersion", b0.z(hashMap5));
        zzai i15 = a.i(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(i15.annotationType(), i15);
        zzg = new b("gcmSenderId", b0.z(hashMap6));
        zzai i16 = a.i(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(i16.annotationType(), i16);
        zzh = new b("apiKey", b0.z(hashMap7));
        zzai i17 = a.i(8);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(i17.annotationType(), i17);
        zzi = new b("languages", b0.z(hashMap8));
        zzai i18 = a.i(9);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(i18.annotationType(), i18);
        zzj = new b("mlSdkInstanceId", b0.z(hashMap9));
        zzai i19 = a.i(10);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(i19.annotationType(), i19);
        zzk = new b("isClearcutClient", b0.z(hashMap10));
        zzai i20 = a.i(11);
        HashMap hashMap11 = new HashMap();
        hashMap11.put(i20.annotationType(), i20);
        zzl = new b("isStandaloneMlkit", b0.z(hashMap11));
        zzai i21 = a.i(12);
        HashMap hashMap12 = new HashMap();
        hashMap12.put(i21.annotationType(), i21);
        zzm = new b("isJsonLogging", b0.z(hashMap12));
        zzai i22 = a.i(13);
        HashMap hashMap13 = new HashMap();
        hashMap13.put(i22.annotationType(), i22);
        zzn = new b("buildLevel", b0.z(hashMap13));
        zzai i23 = a.i(14);
        HashMap hashMap14 = new HashMap();
        hashMap14.put(i23.annotationType(), i23);
        zzo = new b("optionalModuleVersion", b0.z(hashMap14));
    }

    private zzgu() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzla zzla = (zzla) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, (Object) zzla.zzg());
        dVar.add(zzc, (Object) zzla.zzh());
        dVar.add(zzd, (Object) null);
        dVar.add(zze, (Object) zzla.zzj());
        dVar.add(zzf, (Object) zzla.zzk());
        dVar.add(zzg, (Object) null);
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, (Object) zzla.zza());
        dVar.add(zzj, (Object) zzla.zzi());
        dVar.add(zzk, (Object) zzla.zzb());
        dVar.add(zzl, (Object) zzla.zzd());
        dVar.add(zzm, (Object) zzla.zzc());
        dVar.add(zzn, (Object) zzla.zze());
        dVar.add(zzo, (Object) zzla.zzf());
    }
}
