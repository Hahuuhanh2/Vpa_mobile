package com.google.android.gms.internal.p001firebaseauthapi;

import android.support.v4.media.a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzan  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzan {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzan(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        String valueOf = String.valueOf(obj3);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(obj3);
        String valueOf4 = String.valueOf(obj);
        StringBuilder r10 = a.r("Multiple entries with same key: ", valueOf, "=", valueOf2, " and ");
        r10.append(valueOf3);
        r10.append("=");
        r10.append(valueOf4);
        return new IllegalArgumentException(r10.toString());
    }
}
