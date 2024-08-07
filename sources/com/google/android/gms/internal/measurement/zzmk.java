package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
final class zzmk extends zzmi<zzmh, zzmh> {
    public final /* synthetic */ int zza(Object obj) {
        return ((zzmh) obj).zza();
    }

    public final boolean zza(zzlk zzlk) {
        return false;
    }

    public final /* synthetic */ int zzb(Object obj) {
        return ((zzmh) obj).zzb();
    }

    public final /* synthetic */ Object zzc(Object obj) {
        zzmh zzmh = ((zzjf) obj).zzb;
        if (zzmh != zzmh.zzc()) {
            return zzmh;
        }
        zzmh zzd = zzmh.zzd();
        zza(obj, zzd);
        return zzd;
    }

    public final /* synthetic */ Object zzd(Object obj) {
        return ((zzjf) obj).zzb;
    }

    public final /* synthetic */ Object zze(Object obj) {
        zzmh zzmh = (zzmh) obj;
        zzmh.zze();
        return zzmh;
    }

    public final void zzf(Object obj) {
        ((zzjf) obj).zzb.zze();
    }

    public final /* synthetic */ Object zza(Object obj, Object obj2) {
        zzmh zzmh = (zzmh) obj;
        zzmh zzmh2 = (zzmh) obj2;
        if (zzmh.zzc().equals(zzmh2)) {
            return zzmh;
        }
        if (zzmh.zzc().equals(zzmh)) {
            return zzmh.zza(zzmh, zzmh2);
        }
        return zzmh.zza(zzmh2);
    }

    public final /* synthetic */ void zzb(Object obj, int i10, long j10) {
        ((zzmh) obj).zza(i10 << 3, (Object) Long.valueOf(j10));
    }

    public final /* synthetic */ void zzb(Object obj, Object obj2) {
        zza(obj, (zzmh) obj2);
    }

    public final /* synthetic */ void zzc(Object obj, Object obj2) {
        zza(obj, (zzmh) obj2);
    }

    public final /* synthetic */ void zzb(Object obj, zzne zzne) {
        ((zzmh) obj).zzb(zzne);
    }

    public final /* synthetic */ Object zza() {
        return zzmh.zzd();
    }

    public final /* synthetic */ void zza(Object obj, int i10, int i11) {
        ((zzmh) obj).zza((i10 << 3) | 5, (Object) Integer.valueOf(i11));
    }

    public final /* synthetic */ void zza(Object obj, int i10, long j10) {
        ((zzmh) obj).zza((i10 << 3) | 1, (Object) Long.valueOf(j10));
    }

    public final /* synthetic */ void zza(Object obj, int i10, Object obj2) {
        ((zzmh) obj).zza((i10 << 3) | 3, (Object) (zzmh) obj2);
    }

    public final /* synthetic */ void zza(Object obj, int i10, zzhu zzhu) {
        ((zzmh) obj).zza((i10 << 3) | 2, (Object) zzhu);
    }

    private static void zza(Object obj, zzmh zzmh) {
        ((zzjf) obj).zzb = zzmh;
    }

    public final /* synthetic */ void zza(Object obj, zzne zzne) {
        ((zzmh) obj).zza(zzne);
    }
}
