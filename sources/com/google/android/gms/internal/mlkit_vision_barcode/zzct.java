package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractMap;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
final class zzct extends zzcd {
    public final /* synthetic */ zzcu zza;

    public zzct(zzcu zzcu) {
        this.zza = zzcu;
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzaq.zza(i10, this.zza.zzc, "index");
        zzcu zzcu = this.zza;
        int i11 = i10 + i10;
        Object obj = zzcu.zzb[i11];
        obj.getClass();
        Object obj2 = zzcu.zzb[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.zza.zzc;
    }
}
