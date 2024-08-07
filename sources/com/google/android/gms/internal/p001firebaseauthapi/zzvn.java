package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public enum zzvn implements zzakm {
    AEAD_UNKNOWN(0),
    AES_128_GCM(1),
    AES_256_GCM(2),
    CHACHA20_POLY1305(3),
    UNRECOGNIZED(-1);
    
    private static final zzakn zzf = null;
    private final int zzh;

    /* access modifiers changed from: public */
    static {
        zzf = new zzvm();
    }

    private zzvn(int i10) {
        this.zzh = i10;
    }

    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzh;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}