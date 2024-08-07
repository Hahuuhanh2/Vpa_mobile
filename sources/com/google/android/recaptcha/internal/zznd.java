package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zznd extends zznb {
    public final /* synthetic */ int zza(Object obj) {
        return ((zznc) obj).zza();
    }

    public final /* synthetic */ int zzb(Object obj) {
        return ((zznc) obj).zzb();
    }

    public final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzks zzks = (zzks) obj;
        zznc zznc = zzks.zzc;
        if (zznc != zznc.zzc()) {
            return zznc;
        }
        zznc zzf = zznc.zzf();
        zzks.zzc = zzf;
        return zzf;
    }

    public final /* synthetic */ Object zzd(Object obj) {
        return ((zzks) obj).zzc;
    }

    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (zznc.zzc().equals(obj2)) {
            return obj;
        }
        if (zznc.zzc().equals(obj)) {
            return zznc.zze((zznc) obj, (zznc) obj2);
        }
        ((zznc) obj).zzd((zznc) obj2);
        return obj;
    }

    public final /* synthetic */ Object zzf() {
        return zznc.zzf();
    }

    public final /* synthetic */ Object zzg(Object obj) {
        ((zznc) obj).zzh();
        return obj;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i10, int i11) {
        ((zznc) obj).zzj((i10 << 3) | 5, Integer.valueOf(i11));
    }

    public final /* bridge */ /* synthetic */ void zzi(Object obj, int i10, long j10) {
        ((zznc) obj).zzj((i10 << 3) | 1, Long.valueOf(j10));
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj, int i10, Object obj2) {
        ((zznc) obj).zzj((i10 << 3) | 3, obj2);
    }

    public final /* bridge */ /* synthetic */ void zzk(Object obj, int i10, zziv zziv) {
        ((zznc) obj).zzj((i10 << 3) | 2, zziv);
    }

    public final /* bridge */ /* synthetic */ void zzl(Object obj, int i10, long j10) {
        ((zznc) obj).zzj(i10 << 3, Long.valueOf(j10));
    }

    public final void zzm(Object obj) {
        ((zzks) obj).zzc.zzh();
    }

    public final /* synthetic */ void zzn(Object obj, Object obj2) {
        ((zzks) obj).zzc = (zznc) obj2;
    }

    public final /* synthetic */ void zzo(Object obj, Object obj2) {
        ((zzks) obj).zzc = (zznc) obj2;
    }

    public final /* synthetic */ void zzp(Object obj, zzno zzno) {
        ((zznc) obj).zzk(zzno);
    }

    public final /* synthetic */ void zzq(Object obj, zzno zzno) {
        ((zznc) obj).zzl(zzno);
    }

    public final boolean zzs(zzmj zzmj) {
        return false;
    }
}
