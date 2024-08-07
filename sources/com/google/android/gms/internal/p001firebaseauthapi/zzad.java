package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzad  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
abstract class zzad extends zzba {
    private final int zza;
    private int zzb;

    public zzad(int i10, int i11) {
        zzu.zzb(i11, i10, "index");
        this.zza = i10;
        this.zzb = i11;
    }

    public final boolean hasNext() {
        return this.zzb < this.zza;
    }

    public final boolean hasPrevious() {
        return this.zzb > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i10 = this.zzb;
            this.zzb = i10 + 1;
            return zza(i10);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.zzb;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.zzb - 1;
            this.zzb = i10;
            return zza(i10);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.zzb - 1;
    }

    public abstract Object zza(int i10);
}