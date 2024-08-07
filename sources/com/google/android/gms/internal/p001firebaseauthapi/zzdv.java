package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzdv extends zzng {
    public zzdv() {
        super(zzso.class, new zzdt(zzzf.class));
    }

    public static final void zzh(zzso zzso) {
        zzzl.zzc(zzso.zza(), 0);
        zzzl.zzb(zzso.zzg().zzd());
        zzm(zzso.zzf());
    }

    /* access modifiers changed from: private */
    public static final void zzm(zzsu zzsu) {
        if (zzsu.zza() < 12 || zzsu.zza() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    public final zznf zza() {
        return new zzdu(this, zzsr.class);
    }

    public final zzwh zzb() {
        return zzwh.SYMMETRIC;
    }

    public final /* synthetic */ zzalp zzc(zzajf zzajf) {
        return zzso.zze(zzajf, zzajx.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzalp zzalp) {
        zzh((zzso) zzalp);
    }
}