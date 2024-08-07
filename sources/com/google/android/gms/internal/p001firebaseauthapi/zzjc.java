package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzjc {
    public static final String zza = "type.googleapis.com/google.crypto.tink.AesSivKey";
    @Deprecated
    public static final zzxr zzb = zzxr.zzb();
    @Deprecated
    public static final zzxr zzc = zzxr.zzb();

    static {
        new zzir();
        try {
            zza();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void zza() {
        zzjg.zzd();
        if (!zzik.zzb()) {
            zzcq.zzg(new zzir(), true);
            int i10 = zzjb.zza;
            zzjb.zzd(zznt.zzc());
        }
    }
}
