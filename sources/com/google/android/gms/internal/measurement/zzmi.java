package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
abstract class zzmi<T, B> {
    public abstract int zza(T t10);

    public abstract B zza();

    public abstract T zza(T t10, T t11);

    public abstract void zza(B b10, int i10, int i11);

    public abstract void zza(B b10, int i10, long j10);

    public abstract void zza(B b10, int i10, zzhu zzhu);

    public abstract void zza(B b10, int i10, T t10);

    public abstract void zza(T t10, zzne zzne);

    public abstract boolean zza(zzlk zzlk);

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f A[LOOP:0: B:16:0x002f->B:19:0x003c, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(B r7, com.google.android.gms.internal.measurement.zzlk r8) {
        /*
            r6 = this;
            int r0 = r8.zzd()
            int r1 = r0 >>> 3
            r0 = r0 & 7
            r2 = 1
            if (r0 == 0) goto L_0x0061
            if (r0 == r2) goto L_0x0059
            r3 = 2
            if (r0 == r3) goto L_0x0051
            r3 = 4
            r4 = 3
            if (r0 == r4) goto L_0x0028
            if (r0 == r3) goto L_0x0026
            r3 = 5
            if (r0 != r3) goto L_0x0021
            int r8 = r8.zzf()
            r6.zza(r7, (int) r1, (int) r8)
            return r2
        L_0x0021:
            com.google.android.gms.internal.measurement.zzjp r7 = com.google.android.gms.internal.measurement.zzjq.zza()
            throw r7
        L_0x0026:
            r7 = 0
            return r7
        L_0x0028:
            java.lang.Object r0 = r6.zza()
            int r4 = r1 << 3
            r3 = r3 | r4
        L_0x002f:
            int r4 = r8.zzc()
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x003e
            boolean r4 = r6.zza(r0, (com.google.android.gms.internal.measurement.zzlk) r8)
            if (r4 != 0) goto L_0x002f
        L_0x003e:
            int r8 = r8.zzd()
            if (r3 != r8) goto L_0x004c
            java.lang.Object r8 = r6.zze(r0)
            r6.zza(r7, (int) r1, r8)
            return r2
        L_0x004c:
            com.google.android.gms.internal.measurement.zzjq r7 = com.google.android.gms.internal.measurement.zzjq.zzb()
            throw r7
        L_0x0051:
            com.google.android.gms.internal.measurement.zzhu r8 = r8.zzp()
            r6.zza(r7, (int) r1, (com.google.android.gms.internal.measurement.zzhu) r8)
            return r2
        L_0x0059:
            long r3 = r8.zzk()
            r6.zza(r7, (int) r1, (long) r3)
            return r2
        L_0x0061:
            long r3 = r8.zzl()
            r6.zzb(r7, r1, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzmi.zza(java.lang.Object, com.google.android.gms.internal.measurement.zzlk):boolean");
    }

    public abstract int zzb(T t10);

    public abstract void zzb(B b10, int i10, long j10);

    public abstract void zzb(T t10, zzne zzne);

    public abstract void zzb(Object obj, B b10);

    public abstract B zzc(Object obj);

    public abstract void zzc(Object obj, T t10);

    public abstract T zzd(Object obj);

    public abstract T zze(B b10);

    public abstract void zzf(Object obj);
}
