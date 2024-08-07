package com.google.android.recaptcha.internal;

import al.e0;
import ik.d;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzdq {
    private final zzav zza;

    public zzdq(zzav zzav, zzdo zzdo) {
        this.zza = zzav;
    }

    public final Object zza(String str, zzqt zzqt, zzdc zzdc, d dVar) {
        return e0.b(new zzdp(this, str, zzqt, zzdc, (d) null), dVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:41|42|43) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.zzb(new com.google.android.recaptcha.internal.zzbj(com.google.android.recaptcha.internal.zzbh.zzk, com.google.android.recaptcha.internal.zzbg.zzR, (java.lang.String) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e6, code lost:
        throw new com.google.android.recaptcha.internal.zzbj(com.google.android.recaptcha.internal.zzbh.zzc, com.google.android.recaptcha.internal.zzbg.zzP, (java.lang.String) null);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00d0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00dd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0026 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041 A[Catch:{ Exception -> 0x011c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzb(com.google.android.recaptcha.internal.zzpq r10, com.google.android.recaptcha.internal.zzdc r11) {
        /*
            r9 = this;
            java.lang.String r0 = "gzip"
            r1 = 0
            java.lang.String r2 = r10.zzJ()     // Catch:{ Exception -> 0x011c }
            java.lang.String r3 = r10.zzK()     // Catch:{ Exception -> 0x011c }
            com.google.android.recaptcha.internal.zzav r4 = r9.zza     // Catch:{ Exception -> 0x011c }
            boolean r4 = r4.zzd(r3)     // Catch:{ Exception -> 0x011c }
            r5 = 1
            if (r4 != r5) goto L_0x003e
            r4 = 25
            com.google.android.recaptcha.internal.zzdf r4 = r11.zzf(r4)     // Catch:{ Exception -> 0x011c }
            com.google.android.recaptcha.internal.zzav r6 = r9.zza     // Catch:{ Exception -> 0x0026 }
            java.lang.String r6 = r6.zza(r3)     // Catch:{ Exception -> 0x0026 }
            if (r6 == 0) goto L_0x0032
            r4.zza()     // Catch:{ Exception -> 0x0026 }
            goto L_0x003f
        L_0x0026:
            com.google.android.recaptcha.internal.zzbj r6 = new com.google.android.recaptcha.internal.zzbj     // Catch:{ Exception -> 0x011c }
            com.google.android.recaptcha.internal.zzbh r7 = com.google.android.recaptcha.internal.zzbh.zzk     // Catch:{ Exception -> 0x011c }
            com.google.android.recaptcha.internal.zzbg r8 = com.google.android.recaptcha.internal.zzbg.zzR     // Catch:{ Exception -> 0x011c }
            r6.<init>(r7, r8, r1)     // Catch:{ Exception -> 0x011c }
            r4.zzb(r6)     // Catch:{ Exception -> 0x011c }
        L_0x0032:
            com.google.android.recaptcha.internal.zzbj r6 = new com.google.android.recaptcha.internal.zzbj     // Catch:{ Exception -> 0x011c }
            com.google.android.recaptcha.internal.zzbh r7 = com.google.android.recaptcha.internal.zzbh.zzk     // Catch:{ Exception -> 0x011c }
            com.google.android.recaptcha.internal.zzbg r8 = com.google.android.recaptcha.internal.zzbg.zzS     // Catch:{ Exception -> 0x011c }
            r6.<init>(r7, r8, r1)     // Catch:{ Exception -> 0x011c }
            r4.zzb(r6)     // Catch:{ Exception -> 0x011c }
        L_0x003e:
            r6 = r1
        L_0x003f:
            if (r6 != 0) goto L_0x0111
            com.google.android.recaptcha.internal.zzav r4 = r9.zza     // Catch:{ Exception -> 0x011c }
            r4.zzb()     // Catch:{ Exception -> 0x011c }
            r4 = 23
            com.google.android.recaptcha.internal.zzdf r4 = r11.zzf(r4)     // Catch:{ Exception -> 0x011c }
            java.net.URL r6 = new java.net.URL     // Catch:{ Exception -> 0x0102 }
            r6.<init>(r2)     // Catch:{ Exception -> 0x0102 }
            java.net.URLConnection r2 = r6.openConnection()     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r6 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            sk.j.d(r2, r6)     // Catch:{ Exception -> 0x00f8 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r6 = "GET"
            r2.setRequestMethod(r6)     // Catch:{ Exception -> 0x00f8 }
            r2.setDoInput(r5)     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r5 = "Accept"
            java.lang.String r6 = "application/x-protobuffer"
            r2.setRequestProperty(r5, r6)     // Catch:{ Exception -> 0x00f8 }
            java.lang.String r5 = "Accept-Encoding"
            r2.setRequestProperty(r5, r0)     // Catch:{ Exception -> 0x00f8 }
            r2.connect()     // Catch:{ Exception -> 0x00f8 }
            int r5 = r2.getResponseCode()     // Catch:{ zzbj -> 0x010c }
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 != r6) goto L_0x00e7
            java.lang.String r5 = r2.getContentEncoding()     // Catch:{ Exception -> 0x00dd }
            boolean r0 = sk.j.a(r0, r5)     // Catch:{ Exception -> 0x00dd }
            if (r0 == 0) goto L_0x0094
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00dd }
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch:{ Exception -> 0x00dd }
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ Exception -> 0x00dd }
            r5.<init>(r2)     // Catch:{ Exception -> 0x00dd }
            r0.<init>(r5)     // Catch:{ Exception -> 0x00dd }
            goto L_0x009d
        L_0x0094:
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00dd }
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ Exception -> 0x00dd }
            r0.<init>(r2)     // Catch:{ Exception -> 0x00dd }
        L_0x009d:
            java.io.StringWriter r2 = new java.io.StringWriter     // Catch:{ Exception -> 0x00dd }
            r2.<init>()     // Catch:{ Exception -> 0x00dd }
            r5 = 8192(0x2000, float:1.14794E-41)
            char[] r5 = new char[r5]     // Catch:{ Exception -> 0x00dd }
            int r6 = r0.read(r5)     // Catch:{ Exception -> 0x00dd }
        L_0x00aa:
            if (r6 < 0) goto L_0x00b5
            r7 = 0
            r2.write(r5, r7, r6)     // Catch:{ Exception -> 0x00dd }
            int r6 = r0.read(r5)     // Catch:{ Exception -> 0x00dd }
            goto L_0x00aa
        L_0x00b5:
            java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x00dd }
            java.lang.String r0 = "buffer.toString()"
            sk.j.e(r6, r0)     // Catch:{ Exception -> 0x00dd }
            r4.zza()     // Catch:{ zzbj -> 0x010c }
            r0 = 24
            com.google.android.recaptcha.internal.zzdf r11 = r11.zzf(r0)     // Catch:{ Exception -> 0x011c }
            com.google.android.recaptcha.internal.zzav r0 = r9.zza     // Catch:{ Exception -> 0x00d0 }
            r0.zzc(r3, r6)     // Catch:{ Exception -> 0x00d0 }
            r11.zza()     // Catch:{ Exception -> 0x00d0 }
            goto L_0x0111
        L_0x00d0:
            com.google.android.recaptcha.internal.zzbj r0 = new com.google.android.recaptcha.internal.zzbj     // Catch:{ Exception -> 0x011c }
            com.google.android.recaptcha.internal.zzbh r2 = com.google.android.recaptcha.internal.zzbh.zzk     // Catch:{ Exception -> 0x011c }
            com.google.android.recaptcha.internal.zzbg r3 = com.google.android.recaptcha.internal.zzbg.zzT     // Catch:{ Exception -> 0x011c }
            r0.<init>(r2, r3, r1)     // Catch:{ Exception -> 0x011c }
            r11.zzb(r0)     // Catch:{ Exception -> 0x011c }
            goto L_0x0111
        L_0x00dd:
            com.google.android.recaptcha.internal.zzbj r10 = new com.google.android.recaptcha.internal.zzbj     // Catch:{ zzbj -> 0x010c }
            com.google.android.recaptcha.internal.zzbh r11 = com.google.android.recaptcha.internal.zzbh.zzc     // Catch:{ zzbj -> 0x010c }
            com.google.android.recaptcha.internal.zzbg r0 = com.google.android.recaptcha.internal.zzbg.zzP     // Catch:{ zzbj -> 0x010c }
            r10.<init>(r11, r0, r1)     // Catch:{ zzbj -> 0x010c }
            throw r10     // Catch:{ zzbj -> 0x010c }
        L_0x00e7:
            com.google.android.recaptcha.internal.zzbj r10 = new com.google.android.recaptcha.internal.zzbj     // Catch:{ zzbj -> 0x010c }
            com.google.android.recaptcha.internal.zzbh r11 = com.google.android.recaptcha.internal.zzbh.zzc     // Catch:{ zzbj -> 0x010c }
            com.google.android.recaptcha.internal.zzbg r0 = new com.google.android.recaptcha.internal.zzbg     // Catch:{ zzbj -> 0x010c }
            int r2 = r2.getResponseCode()     // Catch:{ zzbj -> 0x010c }
            r0.<init>(r2)     // Catch:{ zzbj -> 0x010c }
            r10.<init>(r11, r0, r1)     // Catch:{ zzbj -> 0x010c }
            throw r10     // Catch:{ zzbj -> 0x010c }
        L_0x00f8:
            com.google.android.recaptcha.internal.zzbj r10 = new com.google.android.recaptcha.internal.zzbj     // Catch:{ zzbj -> 0x010c }
            com.google.android.recaptcha.internal.zzbh r11 = com.google.android.recaptcha.internal.zzbh.zzc     // Catch:{ zzbj -> 0x010c }
            com.google.android.recaptcha.internal.zzbg r0 = com.google.android.recaptcha.internal.zzbg.zzO     // Catch:{ zzbj -> 0x010c }
            r10.<init>(r11, r0, r1)     // Catch:{ zzbj -> 0x010c }
            throw r10     // Catch:{ zzbj -> 0x010c }
        L_0x0102:
            com.google.android.recaptcha.internal.zzbj r10 = new com.google.android.recaptcha.internal.zzbj     // Catch:{ zzbj -> 0x010c }
            com.google.android.recaptcha.internal.zzbh r11 = com.google.android.recaptcha.internal.zzbh.zzb     // Catch:{ zzbj -> 0x010c }
            com.google.android.recaptcha.internal.zzbg r0 = com.google.android.recaptcha.internal.zzbg.zzN     // Catch:{ zzbj -> 0x010c }
            r10.<init>(r11, r0, r1)     // Catch:{ zzbj -> 0x010c }
            throw r10     // Catch:{ zzbj -> 0x010c }
        L_0x010c:
            r10 = move-exception
            r4.zzb(r10)     // Catch:{ Exception -> 0x011c }
            throw r10     // Catch:{ Exception -> 0x011c }
        L_0x0111:
            java.lang.String r10 = r10.zzk()     // Catch:{ Exception -> 0x011c }
            java.lang.String r11 = "JAVASCRIPT_TAG"
            java.lang.String r10 = yk.h.J0(r10, r11, r6)     // Catch:{ Exception -> 0x011c }
            return r10
        L_0x011c:
            r10 = move-exception
            boolean r11 = r10 instanceof com.google.android.recaptcha.internal.zzbj
            if (r11 == 0) goto L_0x0122
            throw r10
        L_0x0122:
            com.google.android.recaptcha.internal.zzbj r10 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbh r11 = com.google.android.recaptcha.internal.zzbh.zzb
            com.google.android.recaptcha.internal.zzbg r0 = com.google.android.recaptcha.internal.zzbg.zzL
            r10.<init>(r11, r0, r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdq.zzb(com.google.android.recaptcha.internal.zzpq, com.google.android.recaptcha.internal.zzdc):java.lang.String");
    }
}
