package com.google.android.recaptcha.internal;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzio extends zzip {
    public final /* synthetic */ zziv zza;
    private int zzb = 0;
    private final int zzc;

    public zzio(zziv zziv) {
        this.zza = zziv;
        this.zzc = zziv.zzd();
    }

    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    public final byte zza() {
        int i10 = this.zzb;
        if (i10 < this.zzc) {
            this.zzb = i10 + 1;
            return this.zza.zzb(i10);
        }
        throw new NoSuchElementException();
    }
}
