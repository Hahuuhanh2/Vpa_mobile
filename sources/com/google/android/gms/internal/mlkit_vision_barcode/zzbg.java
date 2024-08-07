package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
abstract class zzbg implements zzcq {
    private transient Set zza;
    private transient Map zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzcq)) {
            return false;
        }
        return zzn().equals(((zzcq) obj).zzn());
    }

    public final int hashCode() {
        return zzn().hashCode();
    }

    public final String toString() {
        return zzn().toString();
    }

    public abstract Map zzh();

    public abstract Set zzi();

    public boolean zzm(Object obj, Object obj2) {
        throw null;
    }

    public final Map zzn() {
        Map map = this.zzb;
        if (map != null) {
            return map;
        }
        Map zzh = zzh();
        this.zzb = zzh;
        return zzh;
    }

    public final Set zzo() {
        Set set = this.zza;
        if (set != null) {
            return set;
        }
        Set zzi = zzi();
        this.zza = zzi;
        return zzi;
    }
}
