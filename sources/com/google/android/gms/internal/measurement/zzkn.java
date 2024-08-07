package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
final class zzkn implements zzko {
    public final int zza(int i10, Object obj, Object obj2) {
        zzkl zzkl = (zzkl) obj;
        zzkj zzkj = (zzkj) obj2;
        if (zzkl.isEmpty()) {
            return 0;
        }
        Iterator it = zzkl.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    public final Object zzb(Object obj) {
        return zzkl.zza().zzb();
    }

    public final Object zzc(Object obj) {
        ((zzkl) obj).zzc();
        return obj;
    }

    public final Map<?, ?> zzd(Object obj) {
        return (zzkl) obj;
    }

    public final Map<?, ?> zze(Object obj) {
        return (zzkl) obj;
    }

    public final boolean zzf(Object obj) {
        if (!((zzkl) obj).zzd()) {
            return true;
        }
        return false;
    }

    public final zzkm<?, ?> zza(Object obj) {
        zzkj zzkj = (zzkj) obj;
        throw new NoSuchMethodError();
    }

    public final Object zza(Object obj, Object obj2) {
        zzkl zzkl = (zzkl) obj;
        zzkl zzkl2 = (zzkl) obj2;
        if (!zzkl2.isEmpty()) {
            if (!zzkl.zzd()) {
                zzkl = zzkl.zzb();
            }
            zzkl.zza(zzkl2);
        }
        return zzkl;
    }
}
