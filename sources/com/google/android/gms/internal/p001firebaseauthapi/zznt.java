package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznt  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zznt {
    private static final zznt zza = ((zznt) zzpc.zza(zznr.zza));
    private final AtomicReference zzb = new AtomicReference(new zzpa(new zzou(), (zzoz) null));

    public static zznt zzc() {
        return zza;
    }

    public final zzbn zza(zzoo zzoo, zzcr zzcr) {
        if (!((zzpa) this.zzb.get()).zzh(zzoo)) {
            return new zzni(zzoo, zzcr);
        }
        return ((zzpa) this.zzb.get()).zza(zzoo, zzcr);
    }

    public final zzce zzb(zzot zzot) {
        return ((zzpa) this.zzb.get()).zzb(zzot);
    }

    public final zzot zzd(zzce zzce, Class cls) {
        return ((zzpa) this.zzb.get()).zzc(zzce, cls);
    }

    public final synchronized void zze(zzna zzna) {
        zzou zzou = new zzou((zzpa) this.zzb.get());
        zzou.zza(zzna);
        this.zzb.set(new zzpa(zzou, (zzoz) null));
    }

    public final synchronized void zzf(zzne zzne) {
        zzou zzou = new zzou((zzpa) this.zzb.get());
        zzou.zzb(zzne);
        this.zzb.set(new zzpa(zzou, (zzoz) null));
    }

    public final synchronized void zzg(zznx zznx) {
        zzou zzou = new zzou((zzpa) this.zzb.get());
        zzou.zzc(zznx);
        this.zzb.set(new zzpa(zzou, (zzoz) null));
    }

    public final synchronized void zzh(zzob zzob) {
        zzou zzou = new zzou((zzpa) this.zzb.get());
        zzou.zzd(zzob);
        this.zzb.set(new zzpa(zzou, (zzoz) null));
    }

    public final boolean zzi(zzot zzot) {
        return ((zzpa) this.zzb.get()).zzi(zzot);
    }
}
