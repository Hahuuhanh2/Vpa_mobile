package com.google.android.gms.internal.p001firebaseauthapi;

import android.support.v4.media.a;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzgz extends zzcx {
    private final String zza;
    private final zzgx zzb;
    private final zzcx zzc;

    public /* synthetic */ zzgz(String str, zzgx zzgx, zzcx zzcx, zzgy zzgy) {
        this.zza = str;
        this.zzb = zzgx;
        this.zzc = zzcx;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgz)) {
            return false;
        }
        zzgz zzgz = (zzgz) obj;
        if (!zzgz.zzb.equals(this.zzb) || !zzgz.zzc.equals(this.zzc) || !zzgz.zza.equals(this.zza)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgz.class, this.zza, this.zzb, this.zzc});
    }

    public final String toString() {
        zzcx zzcx = this.zzc;
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(zzcx);
        StringBuilder q10 = a.q("LegacyKmsEnvelopeAead Parameters (kekUri: ");
        q10.append(this.zza);
        q10.append(", dekParsingStrategy: ");
        q10.append(valueOf);
        q10.append(", dekParametersForNewKeys: ");
        return a.o(q10, valueOf2, ")");
    }

    public final boolean zza() {
        return false;
    }

    public final zzcx zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zza;
    }
}
