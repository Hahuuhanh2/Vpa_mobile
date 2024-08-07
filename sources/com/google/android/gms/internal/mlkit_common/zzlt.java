package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;
import y6.i;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public final class zzlt {
    private final zzlp zza;
    private final zzlr zzb = null;
    private final zzlr zzc = null;
    private final Boolean zzd = null;

    public /* synthetic */ zzlt(zzlq zzlq, zzls zzls) {
        this.zza = zzlq.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzlt) && i.a(this.zza, ((zzlt) obj).zza) && i.a((Object) null, (Object) null) && i.a((Object) null, (Object) null) && i.a((Object) null, (Object) null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, null, null, null});
    }

    @zzbo(zza = 1)
    public final zzlp zza() {
        return this.zza;
    }
}
