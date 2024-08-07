package com.google.android.recaptcha.internal;

import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzlf implements Map.Entry {
    private final Map.Entry zza;

    public /* synthetic */ zzlf(Map.Entry entry, zzle zzle) {
        this.zza = entry;
    }

    public final Object getKey() {
        return this.zza.getKey();
    }

    public final Object getValue() {
        if (((zzlh) this.zza.getValue()) == null) {
            return null;
        }
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzlx) {
            return ((zzlh) this.zza.getValue()).zzc((zzlx) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzlh zza() {
        return (zzlh) this.zza.getValue();
    }
}
