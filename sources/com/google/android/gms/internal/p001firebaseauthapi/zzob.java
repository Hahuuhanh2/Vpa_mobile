package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzob  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public abstract class zzob {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzob(Class cls, Class cls2, zzoa zzoa) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzob zzb(zznz zznz, Class cls, Class cls2) {
        return new zzny(cls, cls2, zznz);
    }

    public abstract zzot zza(zzce zzce);

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
