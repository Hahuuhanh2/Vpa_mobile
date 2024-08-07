package com.google.android.gms.internal.p001firebaseauthapi;

import f0.b0;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpa  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzpa {
    /* access modifiers changed from: private */
    public final Map zza;
    /* access modifiers changed from: private */
    public final Map zzb;
    /* access modifiers changed from: private */
    public final Map zzc;
    /* access modifiers changed from: private */
    public final Map zzd;

    public /* synthetic */ zzpa(zzou zzou, zzoz zzoz) {
        this.zza = new HashMap(zzou.zza);
        this.zzb = new HashMap(zzou.zzb);
        this.zzc = new HashMap(zzou.zzc);
        this.zzd = new HashMap(zzou.zzd);
    }

    public final zzbn zza(zzot zzot, zzcr zzcr) {
        zzow zzow = new zzow(zzot.getClass(), zzot.zzd(), (zzov) null);
        if (this.zzb.containsKey(zzow)) {
            return ((zzna) this.zzb.get(zzow)).zza(zzot, zzcr);
        }
        throw new GeneralSecurityException(b0.s("No Key Parser for requested key type ", zzow.toString(), " available"));
    }

    public final zzce zzb(zzot zzot) {
        zzow zzow = new zzow(zzot.getClass(), zzot.zzd(), (zzov) null);
        if (this.zzd.containsKey(zzow)) {
            return ((zznx) this.zzd.get(zzow)).zza(zzot);
        }
        throw new GeneralSecurityException(b0.s("No Parameters Parser for requested key type ", zzow.toString(), " available"));
    }

    public final zzot zzc(zzce zzce, Class cls) {
        zzoy zzoy = new zzoy(zzce.getClass(), cls, (zzox) null);
        if (this.zzc.containsKey(zzoy)) {
            return ((zzob) this.zzc.get(zzoy)).zza(zzce);
        }
        throw new GeneralSecurityException(b0.s("No Key Format serializer for ", zzoy.toString(), " available"));
    }

    public final boolean zzh(zzot zzot) {
        return this.zzb.containsKey(new zzow(zzot.getClass(), zzot.zzd(), (zzov) null));
    }

    public final boolean zzi(zzot zzot) {
        return this.zzd.containsKey(new zzow(zzot.getClass(), zzot.zzd(), (zzov) null));
    }
}
