package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzpc extends RuntimeException {
    public zzpc(String str) {
        super(str);
    }

    public static Object zza(zzpb zzpb) {
        try {
            return zzpb.zza();
        } catch (Exception e10) {
            throw new zzpc((Throwable) e10);
        }
    }

    public zzpc(String str, Throwable th2) {
        super("Creating a protokey serialization failed", th2);
    }

    public zzpc(Throwable th2) {
        super(th2);
    }
}