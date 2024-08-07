package com.google.android.gms.internal.p001firebaseauthapi;

import f0.b0;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoy  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzoy {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzoy(Class cls, Class cls2, zzox zzox) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzoy)) {
            return false;
        }
        zzoy zzoy = (zzoy) obj;
        if (!zzoy.zza.equals(this.zza) || !zzoy.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return b0.s(this.zza.getSimpleName(), " with serialization type: ", this.zzb.getSimpleName());
    }
}
