package com.google.android.gms.internal.measurement;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
final class zzju<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzjr> zza;

    private zzju(Map.Entry<K, zzjr> entry) {
        this.zza = entry;
    }

    public final K getKey() {
        return this.zza.getKey();
    }

    public final Object getValue() {
        if (this.zza.getValue() == null) {
            return null;
        }
        return zzjr.zza();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzkr) {
            return this.zza.getValue().zza((zzkr) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzjr zza() {
        return this.zza.getValue();
    }
}
