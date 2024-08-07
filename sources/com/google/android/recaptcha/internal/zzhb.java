package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzhb extends zzhf implements Serializable {
    public final int zza;
    private final Queue zzb;

    private zzhb(int i10) {
        if (i10 >= 0) {
            this.zzb = new ArrayDeque(i10);
            this.zza = i10;
            return;
        }
        throw new IllegalArgumentException(zzha.zza("maxSize (%s) must >= 0", Integer.valueOf(i10)));
    }

    public static zzhb zza(int i10) {
        return new zzhb(i10);
    }

    public final boolean add(Object obj) {
        obj.getClass();
        if (this.zza == 0) {
            return true;
        }
        if (size() == this.zza) {
            this.zzb.remove();
        }
        this.zzb.add(obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        boolean z10;
        int size = collection.size();
        if (size < this.zza) {
            return zzhi.zza(this, collection.iterator());
        }
        clear();
        int i10 = size - this.zza;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzgx.zzb(z10, "number to skip cannot be negative");
        return zzhi.zza(this, new zzhh(collection, i10).iterator());
    }

    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    public final /* synthetic */ Object zzb() {
        return this.zzb;
    }

    public final /* synthetic */ Collection zzc() {
        return this.zzb;
    }

    public final Queue zzd() {
        return this.zzb;
    }
}
