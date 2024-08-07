package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public class zzli {
    public volatile zzlx zza;
    private volatile zziv zzb;

    static {
        zzkd zzkd = zzkd.zza;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzli)) {
            return false;
        }
        zzli zzli = (zzli) obj;
        zzlx zzlx = this.zza;
        zzlx zzlx2 = zzli.zza;
        if (zzlx == null && zzlx2 == null) {
            return zzb().equals(zzli.zzb());
        }
        if (zzlx != null && zzlx2 != null) {
            return zzlx.equals(zzlx2);
        }
        if (zzlx != null) {
            zzli.zzd(zzlx.zzac());
            return zzlx.equals(zzli.zza);
        }
        zzd(zzlx2.zzac());
        return this.zza.equals(zzlx2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((zziu) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzn();
        }
        return 0;
    }

    public final zziv zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            if (this.zzb != null) {
                zziv zziv = this.zzb;
                return zziv;
            }
            if (this.zza == null) {
                this.zzb = zziv.zzb;
            } else {
                this.zzb = this.zza.zzb();
            }
            zziv zziv2 = this.zzb;
            return zziv2;
        }
    }

    public final zzlx zzc(zzlx zzlx) {
        zzlx zzlx2 = this.zza;
        this.zzb = null;
        this.zza = zzlx;
        return zzlx2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0013 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(com.google.android.recaptcha.internal.zzlx r2) {
        /*
            r1 = this;
            com.google.android.recaptcha.internal.zzlx r0 = r1.zza
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.recaptcha.internal.zzlx r0 = r1.zza     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x000c:
            r1.zza = r2     // Catch:{ zzlc -> 0x0013 }
            com.google.android.recaptcha.internal.zziv r0 = com.google.android.recaptcha.internal.zziv.zzb     // Catch:{ zzlc -> 0x0013 }
            r1.zzb = r0     // Catch:{ zzlc -> 0x0013 }
            goto L_0x0019
        L_0x0013:
            r1.zza = r2     // Catch:{ all -> 0x001b }
            com.google.android.recaptcha.internal.zziv r2 = com.google.android.recaptcha.internal.zziv.zzb     // Catch:{ all -> 0x001b }
            r1.zzb = r2     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzli.zzd(com.google.android.recaptcha.internal.zzlx):void");
    }
}
