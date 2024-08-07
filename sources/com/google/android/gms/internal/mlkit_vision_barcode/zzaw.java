package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
final class zzaw extends zzco {
    public final transient Map zza;
    public final /* synthetic */ zzbe zzb;

    public zzaw(zzbe zzbe, Map map) {
        this.zzb = zzbe;
        this.zza = map;
    }

    public final void clear() {
        Map map = this.zza;
        zzbe zzbe = this.zzb;
        if (map == zzbe.zza) {
            zzbe.zzl();
        } else {
            zzch.zza(new zzav(this));
        }
    }

    public final boolean containsKey(Object obj) {
        return zzcp.zzb(this.zza, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj || this.zza.equals(obj)) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) zzcp.zza(this.zza, obj);
        if (collection == null) {
            return null;
        }
        return this.zzb.zzb(obj, collection);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final Set keySet() {
        return this.zzb.zzo();
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.zza.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection zza2 = this.zzb.zza();
        zza2.addAll(collection);
        zzbe zzbe = this.zzb;
        zzbe.zzb = zzbe.zzb - collection.size();
        collection.clear();
        return zza2;
    }

    public final int size() {
        return this.zza.size();
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final Set zza() {
        return new zzau(this);
    }
}
