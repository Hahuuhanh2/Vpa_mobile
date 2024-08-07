package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Arrays;
import y6.i;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zzdz {
    private final zznd zza;
    private final Boolean zzb = null;
    private final Boolean zzc;
    private final zzmq zzd;
    private final zzqv zze;
    private final zzcd zzf;
    private final zzcd zzg;

    public /* synthetic */ zzdz(zzdx zzdx, zzdy zzdy) {
        this.zza = zzdx.zza;
        this.zzc = zzdx.zzb;
        this.zzd = null;
        this.zze = zzdx.zzc;
        this.zzf = zzdx.zzd;
        this.zzg = zzdx.zze;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdz)) {
            return false;
        }
        zzdz zzdz = (zzdz) obj;
        if (!i.a(this.zza, zzdz.zza) || !i.a((Object) null, (Object) null) || !i.a(this.zzc, zzdz.zzc) || !i.a((Object) null, (Object) null) || !i.a(this.zze, zzdz.zze) || !i.a(this.zzf, zzdz.zzf) || !i.a(this.zzg, zzdz.zzg)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, null, this.zzc, null, this.zze, this.zzf, this.zzg});
    }

    @zzdk(zza = 6)
    public final zzcd zza() {
        return this.zzf;
    }

    @zzdk(zza = 7)
    public final zzcd zzb() {
        return this.zzg;
    }

    @zzdk(zza = 1)
    public final zznd zzc() {
        return this.zza;
    }

    @zzdk(zza = 5)
    public final zzqv zzd() {
        return this.zze;
    }

    @zzdk(zza = 3)
    public final Boolean zze() {
        return this.zzc;
    }
}
