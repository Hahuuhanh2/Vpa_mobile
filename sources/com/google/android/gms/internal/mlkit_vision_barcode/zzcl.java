package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
abstract class zzcl extends zzcy {
    public final void clear() {
        zza().clear();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object zza = zzcp.zza(zza(), key);
        if (!zzam.zza(zza, entry.getValue())) {
            return false;
        }
        if (zza != null) {
            return true;
        }
        if (!zzcp.zzb(((zzaw) zza()).zza, key)) {
            return false;
        }
        return true;
    }

    public final boolean isEmpty() {
        return zza().isEmpty();
    }

    public boolean remove(Object obj) {
        if (!contains(obj) || !(obj instanceof Map.Entry)) {
            return false;
        }
        return ((zzaw) zza()).zzb.zzo().remove(((Map.Entry) obj).getKey());
    }

    public final boolean removeAll(Collection collection) {
        collection.getClass();
        try {
            return zzcz.zzb(this, collection);
        } catch (UnsupportedOperationException unused) {
            return zzcz.zzc(this, collection.iterator());
        }
    }

    public final boolean retainAll(Collection collection) {
        int i10;
        collection.getClass();
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                zzbj.zza(size, "expectedSize");
                i10 = size + 1;
            } else if (size < 1073741824) {
                i10 = (int) Math.ceil(((double) size) / 0.75d);
            } else {
                i10 = Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i10);
            for (Object next : collection) {
                if (contains(next) && (next instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) next).getKey());
                }
            }
            return ((zzaw) zza()).zzb.zzo().retainAll(hashSet);
        }
    }

    public final int size() {
        return zza().size();
    }

    public abstract Map zza();
}
