package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
public class zzjv {
    private static final zzis zza = zzis.zza;
    private zzhu zzb;
    private volatile zzkr zzc;
    private volatile zzhu zzd;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjv)) {
            return false;
        }
        zzjv zzjv = (zzjv) obj;
        zzkr zzkr = this.zzc;
        zzkr zzkr2 = zzjv.zzc;
        if (zzkr == null && zzkr2 == null) {
            return zzc().equals(zzjv.zzc());
        }
        if (zzkr != null && zzkr2 != null) {
            return zzkr.equals(zzkr2);
        }
        if (zzkr != null) {
            return zzkr.equals(zzjv.zzb(zzkr.zzcf()));
        }
        return zzb(zzkr2.zzcf()).equals(zzkr2);
    }

    public int hashCode() {
        return 1;
    }

    public final zzkr zza(zzkr zzkr) {
        zzkr zzkr2 = this.zzc;
        this.zzb = null;
        this.zzd = null;
        this.zzc = zzkr;
        return zzkr2;
    }

    public final int zzb() {
        if (this.zzd != null) {
            return this.zzd.zzb();
        }
        if (this.zzc != null) {
            return this.zzc.zzbw();
        }
        return 0;
    }

    public final zzhu zzc() {
        if (this.zzd != null) {
            return this.zzd;
        }
        synchronized (this) {
            if (this.zzd != null) {
                zzhu zzhu = this.zzd;
                return zzhu;
            }
            if (this.zzc == null) {
                this.zzd = zzhu.zza;
            } else {
                this.zzd = this.zzc.zzbu();
            }
            zzhu zzhu2 = this.zzd;
            return zzhu2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.measurement.zzkr zzb(com.google.android.gms.internal.measurement.zzkr r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.zzkr r0 = r1.zzc
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.zzkr r0 = r1.zzc     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.zzc = r2     // Catch:{ zzjq -> 0x0012 }
            com.google.android.gms.internal.measurement.zzhu r0 = com.google.android.gms.internal.measurement.zzhu.zza     // Catch:{ zzjq -> 0x0012 }
            r1.zzd = r0     // Catch:{ zzjq -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.zzc = r2     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.measurement.zzhu r2 = com.google.android.gms.internal.measurement.zzhu.zza     // Catch:{ all -> 0x001a }
            r1.zzd = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            com.google.android.gms.internal.measurement.zzkr r2 = r1.zzc
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjv.zzb(com.google.android.gms.internal.measurement.zzkr):com.google.android.gms.internal.measurement.zzkr");
    }
}
