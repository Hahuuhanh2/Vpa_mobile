package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzna  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public abstract class zzna {
    private final zzzo zza;
    private final Class zzb;

    public /* synthetic */ zzna(zzzo zzzo, Class cls, zzmz zzmz) {
        this.zza = zzzo;
        this.zzb = cls;
    }

    public static zzna zzb(zzmy zzmy, zzzo zzzo, Class cls) {
        return new zzmx(zzzo, cls, zzmy);
    }

    public abstract zzbn zza(zzot zzot, zzcr zzcr);

    public final zzzo zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
