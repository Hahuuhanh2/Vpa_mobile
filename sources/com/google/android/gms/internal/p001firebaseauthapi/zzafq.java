package com.google.android.gms.internal.p001firebaseauthapi;

import a7.a;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzafq extends zzadx {
    public final /* synthetic */ zzaft zza;
    private final String zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzafq(zzaft zzaft, zzadx zzadx, String str) {
        super(zzadx);
        this.zza = zzaft;
        this.zzb = str;
    }

    public final void zzb(String str) {
        a zza2 = zzaft.zza;
        boolean z10 = false;
        Object[] objArr = new Object[0];
        if (zza2.f109c <= 3) {
            z10 = true;
        }
        if (z10) {
            zza2.a("onCodeSent", objArr);
        }
        zzafs zzafs = (zzafs) this.zza.zzd.get(this.zzb);
        if (zzafs != null) {
            for (zzadx zzb2 : zzafs.zzb) {
                zzb2.zzb(str);
            }
            zzafs.zzg = true;
            zzafs.zzd = str;
            if (zzafs.zza <= 0) {
                this.zza.zzg(this.zzb);
            } else if (!zzafs.zzc) {
                this.zza.zzm(this.zzb);
            } else if (!zzac.zzd(zzafs.zze)) {
                zzaft.zzd(this.zza, this.zzb);
            }
        }
    }

    public final void zzh(Status status) {
        a zza2 = zzaft.zza;
        String a10 = v6.a.a(status.f5345a);
        String str = status.f5346b;
        zza2.a("SMS verification code request failed: " + a10 + " " + str, new Object[0]);
        zzafs zzafs = (zzafs) this.zza.zzd.get(this.zzb);
        if (zzafs != null) {
            for (zzadx zzh : zzafs.zzb) {
                zzh.zzh(status);
            }
            this.zza.zzi(this.zzb);
        }
    }
}
