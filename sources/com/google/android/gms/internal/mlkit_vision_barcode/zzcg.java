package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public abstract class zzcg extends zzby implements Set {
    private transient zzcd zza;

    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return zzcz.zza(this);
    }

    /* renamed from: zzd */
    public abstract zzdb iterator();

    public final zzcd zzf() {
        zzcd zzcd = this.zza;
        if (zzcd != null) {
            return zzcd;
        }
        zzcd zzg = zzg();
        this.zza = zzg;
        return zzg;
    }

    public zzcd zzg() {
        Object[] array = toArray();
        int i10 = zzcd.zzd;
        return zzcd.zzg(array, array.length);
    }
}
