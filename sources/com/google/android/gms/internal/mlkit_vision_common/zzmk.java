package com.google.android.gms.internal.mlkit_vision_common;

import y6.j;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
public final class zzmk implements zzmb {
    private final zziw zza;
    private zzky zzb = new zzky();

    private zzmk(zziw zziw, int i10) {
        this.zza = zziw;
        zzmw.zza();
    }

    public static zzmb zze(zziw zziw) {
        return new zzmk(zziw, 0);
    }

    public final zzmb zza(zziv zziv) {
        this.zza.zzc(zziv);
        return this;
    }

    public final zzmb zzb(zzky zzky) {
        this.zzb = zzky;
        return this;
    }

    public final String zzc() {
        zzla zzc = this.zza.zzf().zzc();
        if (zzc == null || zzg.zzb(zzc.zzk())) {
            return "NA";
        }
        String zzk = zzc.zzk();
        j.f(zzk);
        return zzk;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|10|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0059 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] zzd(int r9, boolean r10) {
        /*
            r8 = this;
            r10 = r9 ^ 1
            com.google.android.gms.internal.mlkit_vision_common.zzky r0 = r8.zzb
            r1 = 1
            if (r1 == r10) goto L_0x0009
            r10 = 0
            goto L_0x000a
        L_0x0009:
            r10 = r1
        L_0x000a:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r0.zzf(r10)
            com.google.android.gms.internal.mlkit_vision_common.zzky r10 = r8.zzb
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r10.zze(r0)
            com.google.android.gms.internal.mlkit_vision_common.zziw r10 = r8.zza
            com.google.android.gms.internal.mlkit_vision_common.zzky r0 = r8.zzb
            com.google.android.gms.internal.mlkit_vision_common.zzla r0 = r0.zzm()
            r10.zze(r0)
            com.google.android.gms.internal.mlkit_vision_common.zzmw.zza()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            if (r9 != 0) goto L_0x0064
            com.google.android.gms.internal.mlkit_vision_common.zziw r9 = r8.zza     // Catch:{ UnsupportedEncodingException -> 0x007d }
            com.google.android.gms.internal.mlkit_vision_common.zziy r9 = r9.zzf()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            ua.e r10 = new ua.e     // Catch:{ UnsupportedEncodingException -> 0x007d }
            r10.<init>()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            ta.a r0 = com.google.android.gms.internal.mlkit_vision_common.zzhe.zza     // Catch:{ UnsupportedEncodingException -> 0x007d }
            r0.configure(r10)     // Catch:{ UnsupportedEncodingException -> 0x007d }
            r10.f15414d = r1     // Catch:{ UnsupportedEncodingException -> 0x007d }
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch:{ UnsupportedEncodingException -> 0x007d }
            r0.<init>()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            ua.f r1 = new ua.f     // Catch:{ IOException -> 0x0059 }
            java.util.HashMap r4 = r10.f15411a     // Catch:{ IOException -> 0x0059 }
            java.util.HashMap r5 = r10.f15412b     // Catch:{ IOException -> 0x0059 }
            ua.a r6 = r10.f15413c     // Catch:{ IOException -> 0x0059 }
            boolean r7 = r10.f15414d     // Catch:{ IOException -> 0x0059 }
            r2 = r1
            r3 = r0
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x0059 }
            r1.a(r9)     // Catch:{ IOException -> 0x0059 }
            r1.c()     // Catch:{ IOException -> 0x0059 }
            android.util.JsonWriter r9 = r1.f15417b     // Catch:{ IOException -> 0x0059 }
            r9.flush()     // Catch:{ IOException -> 0x0059 }
        L_0x0059:
            java.lang.String r9 = r0.toString()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            java.lang.String r10 = "utf-8"
            byte[] r9 = r9.getBytes(r10)     // Catch:{ UnsupportedEncodingException -> 0x007d }
            return r9
        L_0x0064:
            com.google.android.gms.internal.mlkit_vision_common.zziw r9 = r8.zza     // Catch:{ UnsupportedEncodingException -> 0x007d }
            com.google.android.gms.internal.mlkit_vision_common.zziy r9 = r9.zzf()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            com.google.android.gms.internal.mlkit_vision_common.zzam r10 = new com.google.android.gms.internal.mlkit_vision_common.zzam     // Catch:{ UnsupportedEncodingException -> 0x007d }
            r10.<init>()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            ta.a r0 = com.google.android.gms.internal.mlkit_vision_common.zzhe.zza     // Catch:{ UnsupportedEncodingException -> 0x007d }
            r0.configure(r10)     // Catch:{ UnsupportedEncodingException -> 0x007d }
            com.google.android.gms.internal.mlkit_vision_common.zzan r10 = r10.zza()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            byte[] r9 = r10.zza(r9)     // Catch:{ UnsupportedEncodingException -> 0x007d }
            return r9
        L_0x007d:
            r9 = move-exception
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Failed to covert logging to UTF-8 byte array"
            r10.<init>(r0, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_common.zzmk.zzd(int, boolean):byte[]");
    }
}
