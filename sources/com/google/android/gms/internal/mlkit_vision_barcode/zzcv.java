package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
final class zzcv extends zzcg {
    private final transient zzcf zza;
    private final transient zzcd zzb;

    public zzcv(zzcf zzcf, zzcd zzcd) {
        this.zza = zzcf;
        this.zzb = zzcd;
    }

    public final boolean contains(Object obj) {
        if (this.zza.get(obj) != null) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    public final int size() {
        return this.zza.size();
    }

    public final int zza(Object[] objArr, int i10) {
        return this.zzb.zza(objArr, i10);
    }

    public final zzdb zzd() {
        return this.zzb.listIterator(0);
    }
}
