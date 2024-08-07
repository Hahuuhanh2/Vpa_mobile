package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public enum zzwh implements zzakm {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);
    
    private static final zzakn zzg = null;
    private final int zzi;

    /* access modifiers changed from: public */
    static {
        zzg = new zzwg();
    }

    private zzwh(int i10) {
        this.zzi = i10;
    }

    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzi;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}