package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdg  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzdg extends zznf {
    public final /* synthetic */ zzdh zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdg(zzdh zzdh, Class cls) {
        super(cls);
        this.zza = zzdh;
    }

    public final /* bridge */ /* synthetic */ zzalp zza(zzalp zzalp) {
        zzsl zzsl = (zzsl) zzalp;
        new zzdv();
        zzso zzf = zzdu.zzf(zzsl.zzd());
        zzalp zza2 = new zzqj().zza().zza(zzsl.zze());
        zzsh zzb = zzsi.zzb();
        zzb.zza(zzf);
        zzb.zzb((zzvf) zza2);
        zzb.zzc(0);
        return (zzsi) zzb.zzi();
    }

    public final /* synthetic */ zzalp zzb(zzajf zzajf) {
        return zzsl.zzc(zzajf, zzajx.zza());
    }

    public final Map zzc() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", zzhl.zze);
        zzdj zzdj = new zzdj((zzdi) null);
        zzdj.zza(16);
        zzdj.zzc(32);
        zzdj.zze(16);
        zzdj.zzd(16);
        zzdk zzdk = zzdk.zzc;
        zzdj.zzb(zzdk);
        zzdl zzdl = zzdl.zzc;
        zzdj.zzf(zzdl);
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzdj.zzg());
        hashMap.put("AES256_CTR_HMAC_SHA256", zzhl.zzf);
        zzdj zzdj2 = new zzdj((zzdi) null);
        zzdj2.zza(32);
        zzdj2.zzc(32);
        zzdj2.zze(32);
        zzdj2.zzd(16);
        zzdj2.zzb(zzdk);
        zzdj2.zzf(zzdl);
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzdj2.zzg());
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzalp zzalp) {
        zzsl zzsl = (zzsl) zzalp;
        ((zzdu) new zzdv().zza()).zzd(zzsl.zzd());
        new zzqj().zza().zzd(zzsl.zze());
        zzzl.zzb(zzsl.zzd().zza());
    }
}
