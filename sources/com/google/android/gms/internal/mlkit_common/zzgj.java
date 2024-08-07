package com.google.android.gms.internal.mlkit_common;

import android.support.v4.media.a;
import f0.b0;
import java.util.HashMap;
import sa.b;
import sa.c;
import sa.d;

/* compiled from: com.google.mlkit:common@@18.7.0 */
final class zzgj implements c {
    public static final zzgj zza = new zzgj();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;
    private static final b zzg;
    private static final b zzh;
    private static final b zzi;
    private static final b zzj;

    static {
        zzbo g2 = a.g(1);
        HashMap hashMap = new HashMap();
        hashMap.put(g2.annotationType(), g2);
        zzb = new b("name", b0.z(hashMap));
        zzbo g10 = a.g(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(g10.annotationType(), g10);
        zzc = new b("version", b0.z(hashMap2));
        zzbo g11 = a.g(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(g11.annotationType(), g11);
        zzd = new b("source", b0.z(hashMap3));
        zzbo g12 = a.g(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(g12.annotationType(), g12);
        zze = new b("uri", b0.z(hashMap4));
        zzbo g13 = a.g(5);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(g13.annotationType(), g13);
        zzf = new b("hash", b0.z(hashMap5));
        zzbo g14 = a.g(6);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(g14.annotationType(), g14);
        zzg = new b("modelType", b0.z(hashMap6));
        zzbo g15 = a.g(7);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(g15.annotationType(), g15);
        zzh = new b("size", b0.z(hashMap7));
        zzbo g16 = a.g(8);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(g16.annotationType(), g16);
        zzi = new b("hasLabelMap", b0.z(hashMap8));
        zzbo g17 = a.g(9);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(g17.annotationType(), g17);
        zzj = new b("isManifestModel", b0.z(hashMap9));
    }

    private zzgj() {
    }

    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlp zzlp = (zzlp) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, (Object) zzlp.zzd());
        dVar.add(zzc, (Object) null);
        dVar.add(zzd, (Object) zzlp.zzb());
        dVar.add(zze, (Object) null);
        dVar.add(zzf, (Object) zzlp.zzc());
        dVar.add(zzg, (Object) zzlp.zza());
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, (Object) null);
        dVar.add(zzj, (Object) null);
    }
}
