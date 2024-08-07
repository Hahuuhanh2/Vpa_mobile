package com.google.android.recaptcha.internal;

import al.r;
import android.webkit.JavascriptInterface;
import ek.i;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzgo {
    public final /* synthetic */ zzgv zza;
    private Long zzb;
    private final zzgz zzc = zzgz.zzb();

    public zzgo(zzgv zzgv) {
        this.zza = zzgv;
    }

    private final void zzb() {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(TimeUnit.MILLISECONDS));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzlce(String str) {
        zzgv zzgv = this.zza;
        if (zzgv.zzq().zzb == null) {
            zzdf zzo = zzgv.zzm;
            if (zzo != null) {
                zzo.zza();
            }
            this.zza.zzm = null;
        }
        zzb();
        zzop zzJ = zzop.zzJ(zzhz.zzh().zzj(str));
        zzrd zzi = zzre.zzi();
        zzi.zze(zzJ);
        this.zza.zzl.zze((zzre) zzi.zzj());
    }

    @JavascriptInterface
    public final void zzlsm(String str) {
        zzb();
        zzrd zzi = zzre.zzi();
        zzi.zzp(zzpe.zzi(zzhz.zzh().zzj(str)));
        this.zza.zzl.zze((zzre) zzi.zzj());
    }

    @JavascriptInterface
    public final void zzoid(String str) {
        zzb();
        zzqz zzg = zzqz.zzg(zzhz.zzh().zzj(str));
        zzg.zzi().name();
        if (zzg.zzi() == zzrc.JS_CODE_SUCCESS) {
            this.zza.zzu().hashCode();
            if (!this.zza.zzu().B(i.f20112a)) {
                this.zza.zzu().hashCode();
                return;
            }
            return;
        }
        zzg.zzi().name();
        int i10 = zzbj.zza;
        zzbj zza2 = zzbi.zza(zzg.zzi());
        this.zza.zzu().hashCode();
        this.zza.zzu().z(zza2);
    }

    @JavascriptInterface
    public final void zzrp(String str) {
        zzb();
        zzdv zzdv = this.zza.zzb;
        if (zzdv == null) {
            zzdv = null;
        }
        zzdv.zza(str);
    }

    @JavascriptInterface
    public final void zzscd(String str) {
        zzb();
        zzpw zzi = zzpw.zzi(zzhz.zzh().zzj(str));
        zzi.toString();
        r rVar = (r) this.zza.zzi.remove(zzi.zzk());
        if (rVar != null) {
            rVar.B(zzi);
        }
    }
}
