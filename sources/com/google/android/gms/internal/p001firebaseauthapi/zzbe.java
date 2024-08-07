package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbe  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzbe {
    private final InputStream zza;

    private zzbe(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzbe zzc(byte[] bArr) {
        return new zzbe(new ByteArrayInputStream(bArr));
    }

    public final zzva zza() {
        try {
            return zzva.zzc(this.zza, zzajx.zza());
        } finally {
            this.zza.close();
        }
    }

    public final zzwv zzb() {
        try {
            return zzwv.zzf(this.zza, zzajx.zza());
        } finally {
            this.zza.close();
        }
    }
}
