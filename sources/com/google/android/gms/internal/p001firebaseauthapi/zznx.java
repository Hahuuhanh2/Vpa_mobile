package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public abstract class zznx {
    private final zzzo zza;
    private final Class zzb;

    public /* synthetic */ zznx(zzzo zzzo, Class cls, zznw zznw) {
        this.zza = zzzo;
        this.zzb = cls;
    }

    public static zznx zzb(zznv zznv, zzzo zzzo, Class cls) {
        return new zznu(zzzo, cls, zznv);
    }

    public abstract zzce zza(zzot zzot);

    public final zzzo zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
