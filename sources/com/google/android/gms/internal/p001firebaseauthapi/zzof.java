package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzof  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public abstract class zzof {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzof(Class cls, Class cls2, zzoe zzoe) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzof zzb(zzod zzod, Class cls, Class cls2) {
        return new zzoc(cls, cls2, zzod);
    }

    public abstract Object zza(zzbn zzbn);

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
