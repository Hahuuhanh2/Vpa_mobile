package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzkp implements zzkh {
    public final int zza;
    public final zznm zzb;

    public zzkp(zzkv zzkv, int i10, zznm zznm, boolean z10, boolean z11) {
        this.zza = i10;
        this.zzb = zznm;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zzkp) obj).zza;
    }

    public final int zza() {
        return this.zza;
    }

    public final zzlw zzb(zzlw zzlw, zzlx zzlx) {
        ((zzkm) zzlw).zzg((zzks) zzlx);
        return zzlw;
    }

    public final zzmc zzc(zzmc zzmc, zzmc zzmc2) {
        throw new UnsupportedOperationException();
    }

    public final zznm zzd() {
        return this.zzb;
    }

    public final zznn zze() {
        return this.zzb.zza();
    }

    public final boolean zzf() {
        return false;
    }

    public final boolean zzg() {
        return false;
    }
}
