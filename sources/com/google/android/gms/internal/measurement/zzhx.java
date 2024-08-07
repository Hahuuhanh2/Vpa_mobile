package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
final class zzhx extends zzhz {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zzhu zzc;

    public zzhx(zzhu zzhu) {
        this.zzc = zzhu;
        this.zzb = zzhu.zzb();
    }

    public final boolean hasNext() {
        if (this.zza < this.zzb) {
            return true;
        }
        return false;
    }

    public final byte zza() {
        int i10 = this.zza;
        if (i10 < this.zzb) {
            this.zza = i10 + 1;
            return this.zzc.zzb(i10);
        }
        throw new NoSuchElementException();
    }
}
