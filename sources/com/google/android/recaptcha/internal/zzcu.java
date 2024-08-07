package com.google.android.recaptcha.internal;

import al.d0;
import com.google.android.recaptcha.RecaptchaAction;
import ik.d;
import kk.i;
import rk.p;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzcu extends i implements p {
    public final /* synthetic */ zzdc zza;
    public final /* synthetic */ zzcx zzb;
    public final /* synthetic */ RecaptchaAction zzc;
    public final /* synthetic */ zzpw zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzcu(zzdc zzdc, zzcx zzcx, RecaptchaAction recaptchaAction, zzpw zzpw, d dVar) {
        super(2, dVar);
        this.zza = zzdc;
        this.zzb = zzcx;
        this.zzc = recaptchaAction;
        this.zzd = zzpw;
    }

    public final d create(Object obj, d dVar) {
        return new zzcu(this.zza, this.zzb, this.zzc, this.zzd, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcu) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00bb, code lost:
        throw new com.google.android.recaptcha.internal.zzbj(com.google.android.recaptcha.internal.zzbh.zzb, com.google.android.recaptcha.internal.zzbg.zzG, (java.lang.String) null);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x00b2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            jk.a r0 = jk.a.COROUTINE_SUSPENDED
            p3.l0.Q0(r6)
            com.google.android.recaptcha.internal.zzdc r6 = r5.zza
            r0 = 28
            com.google.android.recaptcha.internal.zzdf r6 = r6.zzf(r0)
            com.google.android.recaptcha.internal.zzqc r0 = com.google.android.recaptcha.internal.zzqd.zzf()
            com.google.android.recaptcha.internal.zzcx r1 = r5.zzb
            java.lang.String r2 = r1.zze()
            r0.zzu(r2)
            com.google.android.recaptcha.RecaptchaAction r2 = r5.zzc
            java.lang.String r2 = r2.getAction()
            r0.zzd(r2)
            com.google.android.recaptcha.internal.zzpq r2 = r1.zzf
            java.lang.String r2 = r2.zzL()
            r0.zzp(r2)
            com.google.android.recaptcha.internal.zzpq r1 = r1.zzf
            java.lang.String r1 = r1.zzK()
            r0.zzq(r1)
            com.google.android.recaptcha.internal.zzpw r1 = r5.zzd
            java.lang.String r2 = r1.zzJ()
            r0.zzs(r2)
            java.lang.String r2 = r1.zzj()
            r0.zze(r2)
            java.lang.String r2 = r1.zzK()
            r0.zzr(r2)
            r0.zzt(r1)
            com.google.android.recaptcha.internal.zzks r0 = r0.zzj()
            com.google.android.recaptcha.internal.zzqd r0 = (com.google.android.recaptcha.internal.zzqd) r0
            r1 = 0
            com.google.android.recaptcha.internal.zzcx r2 = r5.zzb     // Catch:{ Exception -> 0x00e1 }
            com.google.android.recaptcha.internal.zzbv r2 = r2.zze     // Catch:{ Exception -> 0x00e1 }
            int r3 = com.google.android.recaptcha.internal.zzdt.zza     // Catch:{ Exception -> 0x00cf }
            java.lang.String r3 = r2.zzd()     // Catch:{ Exception -> 0x00cf }
            boolean r3 = com.google.android.recaptcha.internal.zzdt.zzb(r3)     // Catch:{ Exception -> 0x00cf }
            if (r3 == 0) goto L_0x00c5
            java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x00cf }
            java.lang.String r2 = r2.zzd()     // Catch:{ Exception -> 0x00cf }
            r3.<init>(r2)     // Catch:{ Exception -> 0x00cf }
            java.net.URLConnection r2 = r3.openConnection()     // Catch:{ Exception -> 0x00cf }
            java.lang.String r3 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            sk.j.d(r2, r3)     // Catch:{ Exception -> 0x00cf }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ Exception -> 0x00cf }
            java.lang.String r3 = "POST"
            r2.setRequestMethod(r3)     // Catch:{ Exception -> 0x00cf }
            r3 = 1
            r2.setDoOutput(r3)     // Catch:{ Exception -> 0x00cf }
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/x-protobuffer"
            r2.setRequestProperty(r3, r4)     // Catch:{ Exception -> 0x00cf }
            r2.connect()     // Catch:{ Exception -> 0x00cf }
            byte[] r0 = r0.zzd()     // Catch:{ Exception -> 0x00cf }
            java.io.OutputStream r3 = r2.getOutputStream()     // Catch:{ Exception -> 0x00cf }
            r3.write(r0)     // Catch:{ Exception -> 0x00cf }
            int r0 = r2.getResponseCode()     // Catch:{ Exception -> 0x00cf }
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 != r3) goto L_0x00bc
            java.io.InputStream r0 = r2.getInputStream()     // Catch:{ Exception -> 0x00cf }
            com.google.android.recaptcha.internal.zzqf r0 = com.google.android.recaptcha.internal.zzqf.zzi(r0)     // Catch:{ Exception -> 0x00b2 }
            r6.zza()
            return r0
        L_0x00b2:
            com.google.android.recaptcha.internal.zzbj r0 = new com.google.android.recaptcha.internal.zzbj     // Catch:{ Exception -> 0x00cf }
            com.google.android.recaptcha.internal.zzbh r2 = com.google.android.recaptcha.internal.zzbh.zzb     // Catch:{ Exception -> 0x00cf }
            com.google.android.recaptcha.internal.zzbg r3 = com.google.android.recaptcha.internal.zzbg.zzG     // Catch:{ Exception -> 0x00cf }
            r0.<init>(r2, r3, r1)     // Catch:{ Exception -> 0x00cf }
            throw r0     // Catch:{ Exception -> 0x00cf }
        L_0x00bc:
            int r0 = r2.getResponseCode()     // Catch:{ Exception -> 0x00cf }
            com.google.android.recaptcha.internal.zzbj r0 = com.google.android.recaptcha.internal.zzdr.zzb(r0)     // Catch:{ Exception -> 0x00cf }
            throw r0     // Catch:{ Exception -> 0x00cf }
        L_0x00c5:
            com.google.android.recaptcha.internal.zzbj r0 = new com.google.android.recaptcha.internal.zzbj     // Catch:{ Exception -> 0x00cf }
            com.google.android.recaptcha.internal.zzbh r2 = com.google.android.recaptcha.internal.zzbh.zzc     // Catch:{ Exception -> 0x00cf }
            com.google.android.recaptcha.internal.zzbg r3 = com.google.android.recaptcha.internal.zzbg.zzQ     // Catch:{ Exception -> 0x00cf }
            r0.<init>(r2, r3, r1)     // Catch:{ Exception -> 0x00cf }
            throw r0     // Catch:{ Exception -> 0x00cf }
        L_0x00cf:
            r0 = move-exception
            boolean r2 = r0 instanceof com.google.android.recaptcha.internal.zzbj     // Catch:{ Exception -> 0x00e1 }
            if (r2 == 0) goto L_0x00d7
            com.google.android.recaptcha.internal.zzbj r0 = (com.google.android.recaptcha.internal.zzbj) r0     // Catch:{ Exception -> 0x00e1 }
            goto L_0x00e0
        L_0x00d7:
            com.google.android.recaptcha.internal.zzbj r0 = new com.google.android.recaptcha.internal.zzbj     // Catch:{ Exception -> 0x00e1 }
            com.google.android.recaptcha.internal.zzbh r2 = com.google.android.recaptcha.internal.zzbh.zzc     // Catch:{ Exception -> 0x00e1 }
            com.google.android.recaptcha.internal.zzbg r3 = com.google.android.recaptcha.internal.zzbg.zzF     // Catch:{ Exception -> 0x00e1 }
            r0.<init>(r2, r3, r1)     // Catch:{ Exception -> 0x00e1 }
        L_0x00e0:
            throw r0     // Catch:{ Exception -> 0x00e1 }
        L_0x00e1:
            r0 = move-exception
            boolean r2 = r0 instanceof com.google.android.recaptcha.internal.zzbj
            if (r2 == 0) goto L_0x00e9
            com.google.android.recaptcha.internal.zzbj r0 = (com.google.android.recaptcha.internal.zzbj) r0
            goto L_0x00f2
        L_0x00e9:
            com.google.android.recaptcha.internal.zzbj r0 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbh r2 = com.google.android.recaptcha.internal.zzbh.zzb
            com.google.android.recaptcha.internal.zzbg r3 = com.google.android.recaptcha.internal.zzbg.zzZ
            r0.<init>(r2, r3, r1)
        L_0x00f2:
            r6.zzb(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
