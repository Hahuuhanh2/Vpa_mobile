package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public class zzkn extends zzkm implements zzly {
    public zzkn(zzko zzko) {
        super(zzko);
    }

    /* renamed from: zzd */
    public final zzko zzk() {
        if (!((zzko) this.zza).zzI()) {
            return (zzko) this.zza;
        }
        ((zzko) this.zza).zzb.zzg();
        return (zzko) super.zzk();
    }

    public final void zzn() {
        super.zzn();
        if (((zzko) this.zza).zzb != zzki.zzd()) {
            zzko zzko = (zzko) this.zza;
            zzko.zzb = zzko.zzb.clone();
        }
    }
}
