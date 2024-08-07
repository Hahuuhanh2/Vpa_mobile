package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public enum zzvp implements zzakm {
    KDF_UNKNOWN(0),
    HKDF_SHA256(1),
    HKDF_SHA384(2),
    HKDF_SHA512(3),
    UNRECOGNIZED(-1);
    
    private static final zzakn zzf = null;
    private final int zzh;

    /* access modifiers changed from: public */
    static {
        zzf = new zzvo();
    }

    private zzvp(int i10) {
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