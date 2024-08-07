package com.google.android.gms.internal.mlkit_common;

import android.support.v4.media.a;

/* compiled from: com.google.mlkit:common@@18.7.0 */
final class zzas {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzas(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        String valueOf3 = String.valueOf(this.zza);
        String valueOf4 = String.valueOf(this.zzc);
        StringBuilder r10 = a.r("Multiple entries with same key: ", valueOf, "=", valueOf2, " and ");
        r10.append(valueOf3);
        r10.append("=");
        r10.append(valueOf4);
        return new IllegalArgumentException(r10.toString());
    }
}
