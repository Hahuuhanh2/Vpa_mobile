package com.google.android.gms.internal.mlkit_common;

import y6.j;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public final class zzpq implements zzpe {
    private final zzle zza;
    private zznz zzb = new zznz();

    private zzpq(zzle zzle, int i10) {
        this.zza = zzle;
        zzqb.zza();
    }

    public static zzpe zzf(zzle zzle) {
        return new zzpq(zzle, 0);
    }

    public static zzpe zzg() {
        return new zzpq(new zzle(), 0);
    }

    public final zzpe zza(zzld zzld) {
        this.zza.zzf(zzld);
        return this;
    }

    public final zzpe zzb(zzlk zzlk) {
        this.zza.zzi(zzlk);
        return this;
    }

    public final zzpe zzc(zznz zznz) {
        this.zzb = zznz;
        return this;
    }

    public final String zzd() {
        zzob zzf = this.zza.zzk().zzf();
        if (zzf == null || zzag.zzc(zzf.zzk())) {
            return "NA";
        }
        String zzk = zzf.zzk();
        j.f(zzk);
        return zzk;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|9|10|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0059 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] zze(int r9, boolean r10) {
        /*
            r8 = this;
            r10 = r9 ^ 1
            com.google.android.gms.internal.mlkit_common.zznz r0 = r8.zzb
            r1 = 1
            if (r1 == r10) goto L_0x0009
            r10 = 0
            goto L_0x000a
        L_0x0009:
            r10 = r1
        L_0x000a:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r0.zzf(r10)
            com.google.android.gms.internal.mlkit_common.zznz r10 = r8.zzb
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r10.zze(r0)
            com.google.android.gms.internal.mlkit_common.zzle r10 = r8.zza
            com.google.android.gms.internal.mlkit_common.zznz r0 = r8.zzb
            com.google.android.gms.internal.mlkit_common.zzob r0 = r0.zzm()
            r10.zzj(r0)
            com.google.android.gms.internal.mlkit_common.zzqb.zza()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            if (r9 != 0) goto L_0x0064
            com.google.android.gms.internal.mlkit_common.zzle r9 = r8.zza     // Catch:{ UnsupportedEncodingException -> 0x007d }
            com.google.android.gms.internal.mlkit_common.zzlg r9 = r9.zzk()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            ua.e r10 = new ua.e     // Catch:{ UnsupportedEncodingException -> 0x007d }
            r10.<init>()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            ta.a r0 = com.google.android.gms.internal.mlkit_common.zzjh.zza     // Catch:{ UnsupportedEncodingException -> 0x007d }
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
            com.google.android.gms.internal.mlkit_common.zzle r9 = r8.zza     // Catch:{ UnsupportedEncodingException -> 0x007d }
            com.google.android.gms.internal.mlkit_common.zzlg r9 = r9.zzk()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            com.google.android.gms.internal.mlkit_common.zzbs r10 = new com.google.android.gms.internal.mlkit_common.zzbs     // Catch:{ UnsupportedEncodingException -> 0x007d }
            r10.<init>()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            ta.a r0 = com.google.android.gms.internal.mlkit_common.zzjh.zza     // Catch:{ UnsupportedEncodingException -> 0x007d }
            r0.configure(r10)     // Catch:{ UnsupportedEncodingException -> 0x007d }
            com.google.android.gms.internal.mlkit_common.zzbt r10 = r10.zza()     // Catch:{ UnsupportedEncodingException -> 0x007d }
            byte[] r9 = r10.zza(r9)     // Catch:{ UnsupportedEncodingException -> 0x007d }
            return r9
        L_0x007d:
            r9 = move-exception
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Failed to covert logging to UTF-8 byte array"
            r10.<init>(r0, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_common.zzpq.zze(int, boolean):byte[]");
    }
}
