package com.google.android.gms.internal.p001firebaseauthapi;

import f0.b0;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzok  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzok {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzok(Class cls, Class cls2, zzoj zzoj) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzok)) {
            return false;
        }
        zzok zzok = (zzok) obj;
        if (!zzok.zza.equals(this.zza) || !zzok.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return b0.s(this.zza.getSimpleName(), " with primitive type: ", this.zzb.getSimpleName());
    }
}
