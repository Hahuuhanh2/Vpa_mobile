package com.google.android.gms.internal.mlkit_common;

import java.util.AbstractMap;

/* compiled from: com.google.mlkit:common@@18.7.0 */
final class zzay extends zzar {
    public final /* synthetic */ zzaz zza;

    public zzay(zzaz zzaz) {
        this.zza = zzaz;
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzaf.zza(i10, this.zza.zzc, "index");
        zzaz zzaz = this.zza;
        int i11 = i10 + i10;
        Object obj = zzaz.zzb[i11];
        obj.getClass();
        Object obj2 = zzaz.zzb[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.zza.zzc;
    }
}