package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Arrays;
import y6.i;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zzmq {
    private final zzmo zza;
    private final Integer zzb;
    private final Integer zzc = null;
    private final Boolean zzd = null;

    public /* synthetic */ zzmq(zzmn zzmn, zzmp zzmp) {
        this.zza = zzmn.zza;
        this.zzb = zzmn.zzb;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzmq)) {
            return false;
        }
        zzmq zzmq = (zzmq) obj;
        if (!i.a(this.zza, zzmq.zza) || !i.a(this.zzb, zzmq.zzb) || !i.a((Object) null, (Object) null) || !i.a((Object) null, (Object) null)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, null, null});
    }

    @zzdk(zza = 1)
    public final zzmo zza() {
        return this.zza;
    }

    @zzdk(zza = 2)
    public final Integer zzb() {
        return this.zzb;
    }
}
