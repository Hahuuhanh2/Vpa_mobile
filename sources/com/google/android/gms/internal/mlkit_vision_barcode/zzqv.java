package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Arrays;
import y6.i;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zzqv {
    private final zzcd zza;

    public /* synthetic */ zzqv(zzqt zzqt, zzqu zzqu) {
        this.zza = zzqt.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzqv)) {
            return false;
        }
        return i.a(this.zza, ((zzqv) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    @zzdk(zza = 1)
    public final zzcd zza() {
        return this.zza;
    }
}
