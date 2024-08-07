package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
final class zzbs extends AbstractCollection {
    public final /* synthetic */ zzbt zza;

    public zzbs(zzbt zzbt) {
        this.zza = zzbt;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final Iterator iterator() {
        zzbt zzbt = this.zza;
        Map zzj = zzbt.zzj();
        if (zzj != null) {
            return zzj.values().iterator();
        }
        return new zzbm(zzbt);
    }

    public final int size() {
        return this.zza.size();
    }
}
