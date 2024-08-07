package com.google.android.gms.internal.p001firebaseauthapi;

import android.support.v4.media.a;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgo  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzgo extends zzcx {
    private final String zza;

    private zzgo(String str) {
        this.zza = str;
    }

    public static zzgo zzb(String str) {
        return new zzgo(str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgo)) {
            return false;
        }
        return ((zzgo) obj).zza.equals(this.zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{zzgo.class, this.zza});
    }

    public final String toString() {
        return a.o(a.q("LegacyKmsAead Parameters (keyUri: "), this.zza, ")");
    }

    public final boolean zza() {
        return false;
    }

    public final String zzc() {
        return this.zza;
    }
}
