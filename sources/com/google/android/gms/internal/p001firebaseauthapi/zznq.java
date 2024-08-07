package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zznq {
    private static final zznq zza = new zznq();
    private final AtomicReference zzb = new AtomicReference(new zzom(new zzoi((zzoh) null), (zzol) null));

    public static zznq zza() {
        return zza;
    }

    public final Class zzb(Class cls) {
        return ((zzom) this.zzb.get()).zza(cls);
    }

    public final Object zzc(zzbn zzbn, Class cls) {
        return ((zzom) this.zzb.get()).zzb(zzbn, cls);
    }

    public final Object zzd(zzcl zzcl, Class cls) {
        return ((zzom) this.zzb.get()).zzc(zzcl, cls);
    }

    public final synchronized void zze(zzof zzof) {
        zzoi zzoi = new zzoi((zzom) this.zzb.get(), (zzoh) null);
        zzoi.zza(zzof);
        this.zzb.set(new zzom(zzoi, (zzol) null));
    }

    public final synchronized void zzf(zzcm zzcm) {
        zzoi zzoi = new zzoi((zzom) this.zzb.get(), (zzoh) null);
        zzoi.zzb(zzcm);
        this.zzb.set(new zzom(zzoi, (zzol) null));
    }
}
