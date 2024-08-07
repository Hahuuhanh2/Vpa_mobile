package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzbv {
    private final zzce zza;

    private zzbv(zzce zzce) {
        this.zza = zzce;
    }

    public static zzbv zza(zzce zzce) {
        return new zzbv(zzce);
    }

    public final zzwn zzb() {
        zzce zzce = this.zza;
        if (zzce instanceof zznj) {
            return ((zznj) zzce).zzb().zzc();
        }
        return ((zzop) zznt.zzc().zzd(zzce, zzop.class)).zzc();
    }
}
