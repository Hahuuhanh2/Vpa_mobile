package com.google.android.recaptcha.internal;

import al.d0;
import ik.d;
import kk.i;
import rk.p;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzdp extends i implements p {
    public final /* synthetic */ zzdq zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzqt zzc;
    public final /* synthetic */ zzdc zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdp(zzdq zzdq, String str, zzqt zzqt, zzdc zzdc, d dVar) {
        super(2, dVar);
        this.zza = zzdq;
        this.zzb = str;
        this.zzc = zzqt;
        this.zzd = zzdc;
    }

    public final d create(Object obj, d dVar) {
        return new zzdp(this.zza, this.zzb, this.zzc, this.zzd, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdp) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:35|36|37) */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f7, code lost:
        throw new com.google.android.recaptcha.internal.zzbj(com.google.android.recaptcha.internal.zzbh.zzb, com.google.android.recaptcha.internal.zzbg.zzG, (java.lang.String) null);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00ee */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r0 = "UTF-8"
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            p3.l0.Q0(r13)
            com.google.android.recaptcha.internal.zzdc r13 = r12.zzd
            r1 = 22
            com.google.android.recaptcha.internal.zzdf r13 = r13.zzf(r1)
            com.google.android.recaptcha.internal.zzqt r1 = r12.zzc
            java.lang.String r2 = r12.zzb
            boolean r3 = com.google.android.recaptcha.internal.zzdt.zzb(r2)     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            r4 = 0
            if (r3 == 0) goto L_0x0170
            java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x0161 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0161 }
            java.net.URLConnection r2 = r3.openConnection()     // Catch:{ Exception -> 0x0161 }
            java.lang.String r3 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            sk.j.d(r2, r3)     // Catch:{ Exception -> 0x0161 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ Exception -> 0x0161 }
            java.lang.String r3 = "POST"
            r2.setRequestMethod(r3)     // Catch:{ Exception -> 0x0161 }
            r3 = 1
            r2.setDoOutput(r3)     // Catch:{ Exception -> 0x0161 }
            java.lang.String r3 = "Accept"
            java.lang.String r5 = "application/x-protobuffer"
            r2.setRequestProperty(r3, r5)     // Catch:{ Exception -> 0x0161 }
            java.lang.String r3 = r1.zzL()     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r0)     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            java.lang.String r5 = r1.zzk()     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            java.lang.String r5 = java.net.URLEncoder.encode(r5, r0)     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            int r6 = r1.zzS()     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            r7 = 2
            if (r6 == r7) goto L_0x0066
            r7 = 3
            if (r6 == r7) goto L_0x0063
            r7 = 4
            if (r6 == r7) goto L_0x0060
            r7 = 5
            if (r6 == r7) goto L_0x005d
            java.lang.String r6 = "UNRECOGNIZED"
            goto L_0x0068
        L_0x005d:
            java.lang.String r6 = "IOS"
            goto L_0x0068
        L_0x0060:
            java.lang.String r6 = "ANDROID_OFFPLAY"
            goto L_0x0068
        L_0x0063:
            java.lang.String r6 = "ANDROID_ONPLAY"
            goto L_0x0068
        L_0x0066:
            java.lang.String r6 = "UNSPECIFIED"
        L_0x0068:
            java.lang.String r6 = java.net.URLEncoder.encode(r6, r0)     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            java.lang.String r7 = r1.zzJ()     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            java.lang.String r7 = java.net.URLEncoder.encode(r7, r0)     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            java.lang.String r8 = r1.zzK()     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            java.lang.String r8 = java.net.URLEncoder.encode(r8, r0)     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            java.lang.String r9 = r1.zzj()     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            java.lang.String r1 = r1.zzi()     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            r10.<init>()     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            java.lang.String r11 = "k="
            r10.append(r11)     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            r10.append(r3)     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            java.lang.String r3 = "&pk="
            r10.append(r3)     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            r10.append(r5)     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            java.lang.String r3 = "&mst="
            r10.append(r3)     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            r10.append(r6)     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            java.lang.String r3 = "&msv="
            r10.append(r3)     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            r10.append(r7)     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            java.lang.String r3 = "&msi="
            r10.append(r3)     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            r10.append(r8)     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            java.lang.String r3 = "&mov="
            r10.append(r3)     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            r10.append(r9)     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            java.lang.String r3 = "&mkc="
            r10.append(r3)     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            r10.append(r1)     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            java.lang.String r1 = r10.toString()     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            byte[] r0 = r1.getBytes(r0)     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            com.google.android.recaptcha.internal.zzdr.zza(r2)     // Catch:{ Exception -> 0x0146 }
            java.io.OutputStream r1 = com.google.android.recaptcha.internal.zzdr.zzd(r2)     // Catch:{ Exception -> 0x0146 }
            r1.write(r0)     // Catch:{ IOException -> 0x0135, Exception -> 0x0126 }
            int r0 = r2.getResponseCode()     // Catch:{ Exception -> 0x0146 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L_0x00f8
            java.io.InputStream r0 = com.google.android.recaptcha.internal.zzdr.zzc(r2)     // Catch:{ Exception -> 0x0146 }
            com.google.android.recaptcha.internal.zzpq r0 = com.google.android.recaptcha.internal.zzpq.zzi(r0)     // Catch:{ Exception -> 0x00ee }
            r2.disconnect()     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            r13.zza()     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            return r0
        L_0x00ee:
            com.google.android.recaptcha.internal.zzbj r0 = new com.google.android.recaptcha.internal.zzbj     // Catch:{ Exception -> 0x0146 }
            com.google.android.recaptcha.internal.zzbh r1 = com.google.android.recaptcha.internal.zzbh.zzb     // Catch:{ Exception -> 0x0146 }
            com.google.android.recaptcha.internal.zzbg r3 = com.google.android.recaptcha.internal.zzbg.zzG     // Catch:{ Exception -> 0x0146 }
            r0.<init>(r1, r3, r4)     // Catch:{ Exception -> 0x0146 }
            throw r0     // Catch:{ Exception -> 0x0146 }
        L_0x00f8:
            int r0 = r2.getResponseCode()     // Catch:{ Exception -> 0x011c }
            java.io.InputStream r1 = r2.getErrorStream()     // Catch:{ Exception -> 0x0146 }
            byte[] r1 = p3.l0.t0(r1)     // Catch:{ Exception -> 0x0146 }
            r3 = 400(0x190, float:5.6E-43)
            if (r0 != r3) goto L_0x0117
            com.google.android.recaptcha.internal.zzrb r0 = com.google.android.recaptcha.internal.zzrb.zzg(r1)     // Catch:{ Exception -> 0x0146 }
            int r1 = com.google.android.recaptcha.internal.zzbj.zza     // Catch:{ Exception -> 0x0146 }
            com.google.android.recaptcha.internal.zzrc r0 = r0.zzi()     // Catch:{ Exception -> 0x0146 }
            com.google.android.recaptcha.internal.zzbj r0 = com.google.android.recaptcha.internal.zzbi.zza(r0)     // Catch:{ Exception -> 0x0146 }
            goto L_0x0125
        L_0x0117:
            com.google.android.recaptcha.internal.zzbj r0 = com.google.android.recaptcha.internal.zzdr.zzb(r0)     // Catch:{ Exception -> 0x0146 }
            goto L_0x0125
        L_0x011c:
            com.google.android.recaptcha.internal.zzbj r0 = new com.google.android.recaptcha.internal.zzbj     // Catch:{ Exception -> 0x0146 }
            com.google.android.recaptcha.internal.zzbh r1 = com.google.android.recaptcha.internal.zzbh.zzc     // Catch:{ Exception -> 0x0146 }
            com.google.android.recaptcha.internal.zzbg r3 = com.google.android.recaptcha.internal.zzbg.zzai     // Catch:{ Exception -> 0x0146 }
            r0.<init>(r1, r3, r4)     // Catch:{ Exception -> 0x0146 }
        L_0x0125:
            throw r0     // Catch:{ Exception -> 0x0146 }
        L_0x0126:
            r0 = move-exception
            com.google.android.recaptcha.internal.zzbj r1 = new com.google.android.recaptcha.internal.zzbj     // Catch:{ Exception -> 0x0146 }
            com.google.android.recaptcha.internal.zzbh r3 = com.google.android.recaptcha.internal.zzbh.zzc     // Catch:{ Exception -> 0x0146 }
            com.google.android.recaptcha.internal.zzbg r4 = com.google.android.recaptcha.internal.zzbg.zzam     // Catch:{ Exception -> 0x0146 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x0146 }
            r1.<init>(r3, r4, r0)     // Catch:{ Exception -> 0x0146 }
            throw r1     // Catch:{ Exception -> 0x0146 }
        L_0x0135:
            r0 = move-exception
            com.google.android.recaptcha.internal.zzbj r1 = new com.google.android.recaptcha.internal.zzbj     // Catch:{ Exception -> 0x0146 }
            com.google.android.recaptcha.internal.zzbh r3 = com.google.android.recaptcha.internal.zzbh.zzc     // Catch:{ Exception -> 0x0146 }
            com.google.android.recaptcha.internal.zzbg r4 = com.google.android.recaptcha.internal.zzbg.zzah     // Catch:{ Exception -> 0x0146 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x0146 }
            r1.<init>(r3, r4, r0)     // Catch:{ Exception -> 0x0146 }
            throw r1     // Catch:{ Exception -> 0x0146 }
        L_0x0144:
            r0 = move-exception
            goto L_0x015d
        L_0x0146:
            r0 = move-exception
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzbj     // Catch:{ all -> 0x0144 }
            if (r1 == 0) goto L_0x014e
            com.google.android.recaptcha.internal.zzbj r0 = (com.google.android.recaptcha.internal.zzbj) r0     // Catch:{ all -> 0x0144 }
            goto L_0x015c
        L_0x014e:
            com.google.android.recaptcha.internal.zzbj r1 = new com.google.android.recaptcha.internal.zzbj     // Catch:{ all -> 0x0144 }
            com.google.android.recaptcha.internal.zzbh r3 = com.google.android.recaptcha.internal.zzbh.zzc     // Catch:{ all -> 0x0144 }
            com.google.android.recaptcha.internal.zzbg r4 = com.google.android.recaptcha.internal.zzbg.zzF     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0144 }
            r1.<init>(r3, r4, r0)     // Catch:{ all -> 0x0144 }
            r0 = r1
        L_0x015c:
            throw r0     // Catch:{ all -> 0x0144 }
        L_0x015d:
            r2.disconnect()     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            throw r0     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
        L_0x0161:
            r0 = move-exception
            com.google.android.recaptcha.internal.zzbj r1 = new com.google.android.recaptcha.internal.zzbj     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            com.google.android.recaptcha.internal.zzbh r2 = com.google.android.recaptcha.internal.zzbh.zzc     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            com.google.android.recaptcha.internal.zzbg r3 = com.google.android.recaptcha.internal.zzbg.zzaj     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            java.lang.String r0 = r0.getMessage()     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            r1.<init>(r2, r3, r0)     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            throw r1     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
        L_0x0170:
            com.google.android.recaptcha.internal.zzbj r0 = new com.google.android.recaptcha.internal.zzbj     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            com.google.android.recaptcha.internal.zzbh r1 = com.google.android.recaptcha.internal.zzbh.zzc     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            com.google.android.recaptcha.internal.zzbg r2 = com.google.android.recaptcha.internal.zzbg.zzQ     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            r0.<init>(r1, r2, r4)     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
            throw r0     // Catch:{ zzbj -> 0x018c, Exception -> 0x017a }
        L_0x017a:
            r0 = move-exception
            com.google.android.recaptcha.internal.zzbj r1 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbh r2 = com.google.android.recaptcha.internal.zzbh.zzb
            com.google.android.recaptcha.internal.zzbg r3 = com.google.android.recaptcha.internal.zzbg.zza
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r2, r3, r0)
            r13.zzb(r1)
            throw r1
        L_0x018c:
            r0 = move-exception
            r13.zzb(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdp.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
