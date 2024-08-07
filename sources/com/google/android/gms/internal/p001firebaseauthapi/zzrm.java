package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzrm {
    private HashMap zza = new HashMap();

    public final zzro zza() {
        if (this.zza != null) {
            zzro zzro = new zzro(Collections.unmodifiableMap(this.zza), (zzrn) null);
            this.zza = null;
            return zzro;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
