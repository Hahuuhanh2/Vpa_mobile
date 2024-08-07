package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import il.a;
import il.d;
import java.util.List;
import java.util.UUID;
import p3.l0;
import sk.e;
import sk.j;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzco {
    public static final zzco zza = new zzco();
    private static zzcx zzb;
    private static final String zzc = UUID.randomUUID().toString();
    private static final a zzd = new d(false);
    private static final zzl zze = new zzl((List) null, 1, (e) null);
    private static final zzbo zzf = new zzbo();

    static {
        int i10 = zzbb.zza;
        zzba.zzb(new zzbc(915034663, new zzbf((List) null, 1, (e) null)), new zzbc(915034752, new zzeb()), new zzbc(915034668, new zzbk()));
    }

    private zzco() {
    }

    public static final /* synthetic */ zzcx zza(zzco zzco, String str) {
        zzcx zzcx = zzb;
        if (zzcx == null) {
            return null;
        }
        if (j.a(zzcx.zze(), str)) {
            return zzcx;
        }
        throw new zzbj(zzbh.zzd, zzbg.zzan, (String) null);
    }

    public static final Object zzg(Application application, String str, long j10, zzdq zzdq, ik.d dVar) {
        return l0.V0(dVar, zzf.zzb().s(), new zzcc(application, str, j10, (zzdq) null, (ik.d) null));
    }

    public static final Task zzh(Application application, String str, long j10) {
        return zzax.zza(l0.h(zzf.zza(), new zzch(application, str, j10, (ik.d) null)));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzi(java.lang.String r15, android.app.Application r16, rk.p r17, ik.d r18) {
        /*
            r14 = this;
            r0 = r18
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzcn
            if (r1 == 0) goto L_0x0016
            r1 = r0
            com.google.android.recaptcha.internal.zzcn r1 = (com.google.android.recaptcha.internal.zzcn) r1
            int r2 = r1.zzc
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0016
            int r2 = r2 - r3
            r1.zzc = r2
            r2 = r14
            goto L_0x001c
        L_0x0016:
            com.google.android.recaptcha.internal.zzcn r1 = new com.google.android.recaptcha.internal.zzcn
            r2 = r14
            r1.<init>(r14, r0)
        L_0x001c:
            java.lang.Object r0 = r1.zza
            jk.a r3 = jk.a.COROUTINE_SUSPENDED
            int r4 = r1.zzc
            r5 = 1
            if (r4 == 0) goto L_0x003a
            if (r4 != r5) goto L_0x0032
            com.google.android.recaptcha.internal.zzdf r1 = r1.zzd
            p3.l0.Q0(r0)     // Catch:{ zzbj -> 0x002f, Exception -> 0x002d }
            goto L_0x0084
        L_0x002d:
            r0 = move-exception
            goto L_0x008b
        L_0x002f:
            r0 = move-exception
            goto L_0x00a2
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003a:
            p3.l0.Q0(r0)
            com.google.android.recaptcha.internal.zzbv r0 = new com.google.android.recaptcha.internal.zzbv
            java.lang.String r4 = "https://www.recaptcha.net/recaptcha/api3"
            r0.<init>(r4)
            com.google.android.recaptcha.internal.zzbo r4 = zzf
            java.util.UUID r6 = java.util.UUID.randomUUID()
            java.lang.String r6 = r6.toString()
            com.google.android.recaptcha.internal.zzdk r12 = new com.google.android.recaptcha.internal.zzdk
            com.google.android.recaptcha.internal.zzdm r7 = new com.google.android.recaptcha.internal.zzdm
            java.lang.String r0 = r0.zzc()
            r7.<init>(r0)
            al.d0 r0 = r4.zza()
            r4 = r16
            r12.<init>(r4, r7, r0)
            java.lang.String r9 = zzc
            com.google.android.recaptcha.internal.zzdc r0 = new com.google.android.recaptcha.internal.zzdc
            r13 = 0
            r7 = r0
            r8 = r15
            r10 = r6
            r11 = r16
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0.zzc(r6)
            r4 = 6
            com.google.android.recaptcha.internal.zzdf r4 = r0.zzf(r4)
            r1.zzd = r4     // Catch:{ zzbj -> 0x00a0, Exception -> 0x0089 }
            r1.zzc = r5     // Catch:{ zzbj -> 0x00a0, Exception -> 0x0089 }
            r5 = r17
            java.lang.Object r0 = r5.invoke(r0, r1)     // Catch:{ zzbj -> 0x00a0, Exception -> 0x0089 }
            if (r0 == r3) goto L_0x0088
            r1 = r4
        L_0x0084:
            r1.zza()     // Catch:{ zzbj -> 0x002f, Exception -> 0x002d }
            return r0
        L_0x0088:
            return r3
        L_0x0089:
            r0 = move-exception
            r1 = r4
        L_0x008b:
            com.google.android.recaptcha.internal.zzbj r3 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbh r4 = com.google.android.recaptcha.internal.zzbh.zzb
            com.google.android.recaptcha.internal.zzbg r5 = com.google.android.recaptcha.internal.zzbg.zza
            java.lang.String r0 = r0.getMessage()
            r3.<init>(r4, r5, r0)
            r1.zzb(r3)
            com.google.android.recaptcha.RecaptchaException r0 = r3.zzc()
            throw r0
        L_0x00a0:
            r0 = move-exception
            r1 = r4
        L_0x00a2:
            r1.zzb(r0)
            com.google.android.recaptcha.RecaptchaException r0 = r0.zzc()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzco.zzi(java.lang.String, android.app.Application, rk.p, ik.d):java.lang.Object");
    }

    private final void zzj(String str) {
        try {
            zzpj zzj = zzpj.zzj(zzhz.zzh().zzj(str));
            int i10 = zzbb.zza;
            ((zzeb) j7.a.b0(zzci.zza).getValue()).zza(zzj);
        } catch (Exception e10) {
            throw new zzbj(zzbh.zzl, zzbg.zzao, e10.getMessage());
        }
    }

    private final boolean zzk(Application application) {
        int i10 = zzbb.zza;
        zzbk zzbk = (zzbk) j7.a.b0(zzcl.zza).getValue();
        return zzbk.zzb(application);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x025f, code lost:
        if (al.d.b(r1, r12) == r13) goto L_0x027e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzl(android.app.Application r33, java.lang.String r34, long r35, com.google.android.recaptcha.internal.zzdc r37, com.google.android.recaptcha.internal.zzbv r38, android.webkit.WebView r39, com.google.android.recaptcha.internal.zzdq r40, com.google.android.recaptcha.internal.zzbo r41, ik.d r42) {
        /*
            r32 = this;
            r0 = r32
            r11 = r33
            r1 = r42
            boolean r2 = r1 instanceof com.google.android.recaptcha.internal.zzcf
            if (r2 == 0) goto L_0x0019
            r2 = r1
            com.google.android.recaptcha.internal.zzcf r2 = (com.google.android.recaptcha.internal.zzcf) r2
            int r3 = r2.zzk
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0019
            int r3 = r3 - r4
            r2.zzk = r3
            goto L_0x001e
        L_0x0019:
            com.google.android.recaptcha.internal.zzcf r2 = new com.google.android.recaptcha.internal.zzcf
            r2.<init>(r0, r1)
        L_0x001e:
            r12 = r2
            java.lang.Object r1 = r12.zzi
            jk.a r13 = jk.a.COROUTINE_SUSPENDED
            int r2 = r12.zzk
            r14 = 3
            r15 = 4
            r10 = 1
            r9 = 2
            r8 = 0
            if (r2 == 0) goto L_0x00cd
            if (r2 == r10) goto L_0x009b
            if (r2 == r9) goto L_0x006d
            if (r2 == r14) goto L_0x0045
            if (r2 == r15) goto L_0x003c
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003c:
            java.lang.Object r2 = r12.zza
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            p3.l0.Q0(r1)
            goto L_0x0262
        L_0x0045:
            java.lang.Object r2 = r12.zzf
            com.google.android.recaptcha.internal.zzpq r2 = (com.google.android.recaptcha.internal.zzpq) r2
            java.lang.Object r3 = r12.zze
            com.google.android.recaptcha.internal.zzbo r3 = (com.google.android.recaptcha.internal.zzbo) r3
            java.lang.Object r4 = r12.zzd
            com.google.android.recaptcha.internal.zzbv r4 = (com.google.android.recaptcha.internal.zzbv) r4
            java.lang.Object r5 = r12.zzc
            com.google.android.recaptcha.internal.zzdc r5 = (com.google.android.recaptcha.internal.zzdc) r5
            java.lang.Object r6 = r12.zzb
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r12.zza
            android.app.Application r7 = (android.app.Application) r7
            p3.l0.Q0(r1)
            ek.f r1 = (ek.f) r1
            java.lang.Object r1 = r1.f20104a
            r9 = r5
            r5 = r6
            r0 = r8
            r8 = r2
            r6 = r3
            r3 = r7
            r7 = r4
            goto L_0x01ed
        L_0x006d:
            double r2 = r12.zzh
            java.lang.Object r4 = r12.zzg
            com.google.android.recaptcha.internal.zzpq r4 = (com.google.android.recaptcha.internal.zzpq) r4
            java.lang.Object r5 = r12.zzf
            com.google.android.recaptcha.internal.zzbl r5 = (com.google.android.recaptcha.internal.zzbl) r5
            java.lang.Object r6 = r12.zze
            com.google.android.recaptcha.internal.zzbo r6 = (com.google.android.recaptcha.internal.zzbo) r6
            java.lang.Object r7 = r12.zzd
            com.google.android.recaptcha.internal.zzbv r7 = (com.google.android.recaptcha.internal.zzbv) r7
            java.lang.Object r11 = r12.zzc
            com.google.android.recaptcha.internal.zzdc r11 = (com.google.android.recaptcha.internal.zzdc) r11
            java.lang.Object r9 = r12.zzb
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r15 = r12.zza
            android.app.Application r15 = (android.app.Application) r15
            p3.l0.Q0(r1)
            r23 = r5
            r19 = r10
            r5 = r11
            r14 = r15
            r30 = r2
            r2 = r4
            r3 = r30
            goto L_0x01a3
        L_0x009b:
            double r2 = r12.zzh
            com.google.android.recaptcha.internal.zzbl r4 = r12.zzl
            com.google.android.recaptcha.internal.zzbo r5 = r12.zzm
            java.lang.Object r6 = r12.zzg
            com.google.android.recaptcha.internal.zzdq r6 = (com.google.android.recaptcha.internal.zzdq) r6
            java.lang.Object r7 = r12.zzf
            android.webkit.WebView r7 = (android.webkit.WebView) r7
            java.lang.Object r9 = r12.zze
            com.google.android.recaptcha.internal.zzbv r9 = (com.google.android.recaptcha.internal.zzbv) r9
            java.lang.Object r11 = r12.zzd
            com.google.android.recaptcha.internal.zzdc r11 = (com.google.android.recaptcha.internal.zzdc) r11
            java.lang.Object r15 = r12.zzc
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r14 = r12.zzb
            android.app.Application r14 = (android.app.Application) r14
            java.lang.Object r10 = r12.zza
            com.google.android.recaptcha.internal.zzco r10 = (com.google.android.recaptcha.internal.zzco) r10
            p3.l0.Q0(r1)
            r8 = r4
            r16 = r6
            r0 = r9
            r4 = r10
            r19 = 1
            r9 = r2
            r3 = r7
            r2 = r1
            r1 = r5
            goto L_0x0148
        L_0x00cd:
            p3.l0.Q0(r1)
            r1 = r35
            double r1 = (double) r1
            com.google.android.recaptcha.internal.zzbl r14 = new com.google.android.recaptcha.internal.zzbl
            r14.<init>(r11)
            r12.zza = r0
            r12.zzb = r11
            r15 = r34
            r12.zzc = r15
            r10 = r37
            r12.zzd = r10
            r9 = r38
            r12.zze = r9
            r12.zzf = r8
            r7 = r40
            r12.zzg = r7
            r6 = r41
            r12.zzm = r6
            r12.zzl = r14
            r3 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r4 = r1 * r3
            r12.zzh = r4
            r3 = 1
            r12.zzk = r3
            al.d0 r16 = r41.zza()
            ik.f r10 = r16.s()
            r35 = r10
            com.google.android.recaptcha.internal.zzck r10 = new com.google.android.recaptcha.internal.zzck
            r16 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            double r1 = r1 * r16
            long r1 = (long) r1
            r16 = 0
            r17 = r1
            r1 = r10
            r19 = r3
            r2 = r17
            r17 = r4
            r4 = r33
            r5 = r34
            r6 = r37
            r7 = r14
            r8 = r40
            r0 = 2
            r0 = r35
            r11 = r10
            r10 = r16
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r1 = p3.l0.V0(r12, r0, r11)
            if (r1 == r13) goto L_0x027e
            r4 = r32
            r11 = r37
            r0 = r38
            r16 = r40
            r2 = r1
            r8 = r14
            r9 = r17
            r3 = 0
            r14 = r33
            r1 = r41
        L_0x0148:
            r7 = r2
            com.google.android.recaptcha.internal.zzpq r7 = (com.google.android.recaptcha.internal.zzpq) r7
            java.lang.String r2 = r7.zzM()
            r4.zzj(r2)
            com.google.android.recaptcha.internal.zzdc r6 = r11.zza()
            r12.zza = r14
            r12.zzb = r15
            r12.zzc = r11
            r12.zzd = r0
            r12.zze = r1
            r12.zzf = r8
            r12.zzg = r7
            r5 = 0
            r12.zzm = r5
            r12.zzl = r5
            r12.zzh = r9
            r2 = 2
            r12.zzk = r2
            al.d0 r2 = r1.zzb()
            ik.f r4 = r2.s()
            com.google.android.recaptcha.internal.zzcg r2 = new com.google.android.recaptcha.internal.zzcg
            r17 = 0
            r33 = r2
            r21 = r4
            r4 = r14
            r5 = r0
            r18 = r7
            r7 = r1
            r20 = r8
            r8 = r16
            r22 = r9
            r9 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r3 = r33
            r2 = r21
            java.lang.Object r2 = p3.l0.V0(r12, r2, r3)
            if (r2 == r13) goto L_0x027e
            r7 = r0
            r6 = r1
            r1 = r2
            r5 = r11
            r9 = r15
            r2 = r18
            r3 = r22
            r23 = r20
        L_0x01a3:
            com.google.android.recaptcha.internal.zzgv r1 = (com.google.android.recaptcha.internal.zzgv) r1
            com.google.android.recaptcha.internal.zzx r0 = new com.google.android.recaptcha.internal.zzx
            com.google.android.recaptcha.internal.zzdc r25 = r5.zza()
            r27 = 0
            r28 = 16
            r29 = 0
            r22 = r0
            r24 = r14
            r26 = r6
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            com.google.android.recaptcha.internal.zzl r8 = zze
            r10 = 2
            com.google.android.recaptcha.internal.zze[] r10 = new com.google.android.recaptcha.internal.zze[r10]
            r11 = 0
            r10[r11] = r0
            r10[r19] = r1
            r8.zze(r10)
            com.google.android.recaptcha.internal.zzdc r0 = r5.zza()
            r8.zza = r0
            r12.zza = r14
            r12.zzb = r9
            r12.zzc = r5
            r12.zzd = r7
            r12.zze = r6
            r12.zzf = r2
            r0 = 0
            r12.zzg = r0
            r1 = 3
            r12.zzk = r1
            long r3 = (long) r3
            java.lang.Object r1 = r8.zzc(r3, r2, r12)
            if (r1 == r13) goto L_0x027e
            r8 = r2
            r3 = r14
            r30 = r9
            r9 = r5
            r5 = r30
        L_0x01ed:
            java.lang.Throwable r2 = ek.f.a(r1)
            if (r2 != 0) goto L_0x0206
            com.google.android.recaptcha.internal.zzcx r0 = new com.google.android.recaptcha.internal.zzcx
            com.google.android.recaptcha.internal.zzl r4 = zze
            com.google.android.recaptcha.internal.zzbl r10 = new com.google.android.recaptcha.internal.zzbl
            r10.<init>(r3)
            com.google.android.recaptcha.internal.zzds r11 = new com.google.android.recaptcha.internal.zzds
            r11.<init>()
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x0206:
            al.d0 r1 = r6.zzd()
            ik.f r1 = r1.s()
            al.i1$b r3 = al.i1.b.f19045a
            ik.f$b r1 = r1.get(r3)
            al.i1 r1 = (al.i1) r1
            if (r1 == 0) goto L_0x0232
            xk.e r1 = r1.getChildren()
            if (r1 == 0) goto L_0x0232
            java.util.Iterator r1 = r1.iterator()
        L_0x0222:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0232
            java.lang.Object r3 = r1.next()
            al.i1 r3 = (al.i1) r3
            r3.cancel((java.util.concurrent.CancellationException) r0)
            goto L_0x0222
        L_0x0232:
            al.d0 r1 = r6.zzd()
            ik.f r1 = r1.s()
            al.i1$b r3 = al.i1.b.f19045a
            ik.f$b r3 = r1.get(r3)
            al.i1 r3 = (al.i1) r3
            if (r3 == 0) goto L_0x0263
            xk.e r1 = r3.getChildren()
            java.util.List r1 = xk.h.q1(r1)
            r12.zza = r2
            r12.zzb = r0
            r12.zzc = r0
            r12.zzd = r0
            r12.zze = r0
            r12.zzf = r0
            r0 = 4
            r12.zzk = r0
            java.lang.Object r0 = al.d.b(r1, r12)
            if (r0 != r13) goto L_0x0262
            goto L_0x027e
        L_0x0262:
            throw r2
        L_0x0263:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Current context doesn't contain Job in it: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x027e:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzco.zzl(android.app.Application, java.lang.String, long, com.google.android.recaptcha.internal.zzdc, com.google.android.recaptcha.internal.zzbv, android.webkit.WebView, com.google.android.recaptcha.internal.zzdq, com.google.android.recaptcha.internal.zzbo, ik.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: android.app.Application} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: android.app.Application} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: android.app.Application} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: android.app.Application} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: android.app.Application} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r13 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0072, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0080, code lost:
        throw new com.google.android.recaptcha.internal.zzbj(com.google.android.recaptcha.internal.zzbh.zzb, com.google.android.recaptcha.internal.zzbg.zza, r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0081, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0083, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0084, code lost:
        r2 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a1, code lost:
        throw new com.google.android.recaptcha.internal.zzbj(r3, com.google.android.recaptcha.internal.zzbg.zzap, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a2, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x002d, B:18:0x0040] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072 A[ExcHandler: Exception (r0v5 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:10:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0081 A[ExcHandler: RecaptchaException (r0v4 'e' com.google.android.recaptcha.RecaptchaException A[CUSTOM_DECLARE]), Splitter:B:10:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzm(android.app.Application r16, java.lang.String r17, long r18, com.google.android.recaptcha.internal.zzbv r20, android.webkit.WebView r21, com.google.android.recaptcha.internal.zzdq r22, com.google.android.recaptcha.internal.zzbo r23, com.google.android.recaptcha.internal.zzdc r24, ik.d r25) {
        /*
            r15 = this;
            r12 = r15
            r13 = r16
            r0 = r25
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzcm
            if (r1 == 0) goto L_0x0018
            r1 = r0
            com.google.android.recaptcha.internal.zzcm r1 = (com.google.android.recaptcha.internal.zzcm) r1
            int r2 = r1.zzd
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.zzd = r2
            goto L_0x001d
        L_0x0018:
            com.google.android.recaptcha.internal.zzcm r1 = new com.google.android.recaptcha.internal.zzcm
            r1.<init>(r15, r0)
        L_0x001d:
            r11 = r1
            java.lang.Object r0 = r11.zzb
            jk.a r14 = jk.a.COROUTINE_SUSPENDED
            int r1 = r11.zzd
            r2 = 1
            if (r1 == 0) goto L_0x003d
            if (r1 != r2) goto L_0x0035
            java.lang.Object r1 = r11.zza
            com.google.android.recaptcha.internal.zzco r2 = r11.zze
            p3.l0.Q0(r0)     // Catch:{ zzbj -> 0x0032, RecaptchaException -> 0x0081, Exception -> 0x0072 }
            r13 = r1
            goto L_0x006b
        L_0x0032:
            r0 = move-exception
            r13 = r1
            goto L_0x0085
        L_0x0035:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003d:
            p3.l0.Q0(r0)
            com.google.android.recaptcha.internal.zzbs r0 = new com.google.android.recaptcha.internal.zzbs     // Catch:{ zzbj -> 0x0083, RecaptchaException -> 0x0081, Exception -> 0x0072 }
            r0.<init>(r13)     // Catch:{ zzbj -> 0x0083, RecaptchaException -> 0x0081, Exception -> 0x0072 }
            com.google.android.recaptcha.internal.zzdo r1 = new com.google.android.recaptcha.internal.zzdo     // Catch:{ zzbj -> 0x0083, RecaptchaException -> 0x0081, Exception -> 0x0072 }
            r1.<init>()     // Catch:{ zzbj -> 0x0083, RecaptchaException -> 0x0081, Exception -> 0x0072 }
            com.google.android.recaptcha.internal.zzdq r9 = new com.google.android.recaptcha.internal.zzdq     // Catch:{ zzbj -> 0x0083, RecaptchaException -> 0x0081, Exception -> 0x0072 }
            r9.<init>(r0, r1)     // Catch:{ zzbj -> 0x0083, RecaptchaException -> 0x0081, Exception -> 0x0072 }
            r11.zze = r12     // Catch:{ zzbj -> 0x0083, RecaptchaException -> 0x0081, Exception -> 0x0072 }
            r11.zza = r13     // Catch:{ zzbj -> 0x0083, RecaptchaException -> 0x0081, Exception -> 0x0072 }
            r11.zzd = r2     // Catch:{ zzbj -> 0x0083, RecaptchaException -> 0x0081, Exception -> 0x0072 }
            r8 = 0
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r6 = r24
            r7 = r20
            r10 = r23
            java.lang.Object r0 = r1.zzl(r2, r3, r4, r6, r7, r8, r9, r10, r11)     // Catch:{ zzbj -> 0x0083, RecaptchaException -> 0x0081, Exception -> 0x0072 }
            if (r0 != r14) goto L_0x006a
            return r14
        L_0x006a:
            r2 = r12
        L_0x006b:
            com.google.android.recaptcha.internal.zzcx r0 = (com.google.android.recaptcha.internal.zzcx) r0     // Catch:{ zzbj -> 0x0070, RecaptchaException -> 0x0081, Exception -> 0x0072 }
            zzb = r0     // Catch:{ zzbj -> 0x0070, RecaptchaException -> 0x0081, Exception -> 0x0072 }
            return r0
        L_0x0070:
            r0 = move-exception
            goto L_0x0085
        L_0x0072:
            r0 = move-exception
            com.google.android.recaptcha.internal.zzbj r1 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbh r2 = com.google.android.recaptcha.internal.zzbh.zzb
            com.google.android.recaptcha.internal.zzbg r3 = com.google.android.recaptcha.internal.zzbg.zza
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r2, r3, r0)
            throw r1
        L_0x0081:
            r0 = move-exception
            throw r0
        L_0x0083:
            r0 = move-exception
            r2 = r12
        L_0x0085:
            com.google.android.recaptcha.internal.zzbh r1 = r0.zzb()
            com.google.android.recaptcha.internal.zzbh r3 = com.google.android.recaptcha.internal.zzbh.zzc
            boolean r1 = sk.j.a(r1, r3)
            if (r1 == 0) goto L_0x00a2
            android.app.Application r13 = (android.app.Application) r13
            boolean r1 = r2.zzk(r13)
            if (r1 != 0) goto L_0x00a2
            com.google.android.recaptcha.internal.zzbj r0 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbg r1 = com.google.android.recaptcha.internal.zzbg.zzap
            r2 = 0
            r0.<init>(r3, r1, r2)
            throw r0
        L_0x00a2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzco.zzm(android.app.Application, java.lang.String, long, com.google.android.recaptcha.internal.zzbv, android.webkit.WebView, com.google.android.recaptcha.internal.zzdq, com.google.android.recaptcha.internal.zzbo, com.google.android.recaptcha.internal.zzdc, ik.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: il.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: il.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: il.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: il.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zze(android.app.Application r23, java.lang.String r24, long r25, com.google.android.recaptcha.internal.zzbv r27, android.webkit.WebView r28, com.google.android.recaptcha.internal.zzdq r29, com.google.android.recaptcha.internal.zzbo r30, ik.d r31) {
        /*
            r22 = this;
            r0 = r31
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzcd
            if (r1 == 0) goto L_0x0017
            r1 = r0
            com.google.android.recaptcha.internal.zzcd r1 = (com.google.android.recaptcha.internal.zzcd) r1
            int r2 = r1.zzf
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.zzf = r2
            r2 = r22
            goto L_0x001e
        L_0x0017:
            com.google.android.recaptcha.internal.zzcd r1 = new com.google.android.recaptcha.internal.zzcd
            r2 = r22
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.zzd
            jk.a r3 = jk.a.COROUTINE_SUSPENDED
            int r4 = r1.zzf
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x005a
            if (r4 == r6) goto L_0x0041
            if (r4 != r5) goto L_0x0039
            java.lang.Object r1 = r1.zza
            il.a r1 = (il.a) r1
            p3.l0.Q0(r0)     // Catch:{ all -> 0x0036 }
            goto L_0x00b3
        L_0x0036:
            r0 = move-exception
            goto L_0x00b9
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0041:
            long r8 = r1.zzc
            java.lang.Object r4 = r1.zzb
            com.google.android.recaptcha.internal.zzbo r6 = r1.zzi
            com.google.android.recaptcha.internal.zzbv r10 = r1.zzh
            java.lang.String r11 = r1.zzg
            java.lang.Object r12 = r1.zza
            android.app.Application r12 = (android.app.Application) r12
            p3.l0.Q0(r0)
            r16 = r6
            r13 = r10
            r0 = r12
            r6 = r4
            r4 = r11
            r11 = r8
            goto L_0x0082
        L_0x005a:
            p3.l0.Q0(r0)
            il.a r4 = zzd
            r0 = r23
            r1.zza = r0
            r8 = r24
            r1.zzg = r8
            r9 = r27
            r1.zzh = r9
            r10 = r30
            r1.zzi = r10
            r1.zzb = r4
            r11 = r25
            r1.zzc = r11
            r1.zzf = r6
            java.lang.Object r6 = r4.a(r1)
            if (r6 == r3) goto L_0x00c0
            r6 = r4
            r4 = r8
            r13 = r9
            r16 = r10
        L_0x0082:
            com.google.android.recaptcha.internal.zzco r15 = zza     // Catch:{ all -> 0x00bb }
            com.google.android.recaptcha.internal.zzce r14 = new com.google.android.recaptcha.internal.zzce     // Catch:{ all -> 0x00bb }
            r17 = 0
            r18 = 0
            r19 = 0
            r8 = r14
            r9 = r4
            r10 = r0
            r20 = r14
            r14 = r17
            r21 = r15
            r15 = r18
            r17 = r19
            r8.<init>(r9, r10, r11, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x00bb }
            r1.zza = r6     // Catch:{ all -> 0x00bb }
            r1.zzg = r7     // Catch:{ all -> 0x00bb }
            r1.zzh = r7     // Catch:{ all -> 0x00bb }
            r1.zzi = r7     // Catch:{ all -> 0x00bb }
            r1.zzb = r7     // Catch:{ all -> 0x00bb }
            r1.zzf = r5     // Catch:{ all -> 0x00bb }
            r8 = r20
            r5 = r21
            java.lang.Object r0 = r5.zzi(r4, r0, r8, r1)     // Catch:{ all -> 0x00bb }
            if (r0 == r3) goto L_0x00c0
            r1 = r6
        L_0x00b3:
            com.google.android.recaptcha.internal.zzcx r0 = (com.google.android.recaptcha.internal.zzcx) r0     // Catch:{ all -> 0x0036 }
            r1.b(r7)
            return r0
        L_0x00b9:
            r6 = r1
            goto L_0x00bc
        L_0x00bb:
            r0 = move-exception
        L_0x00bc:
            r6.b(r7)
            throw r0
        L_0x00c0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzco.zze(android.app.Application, java.lang.String, long, com.google.android.recaptcha.internal.zzbv, android.webkit.WebView, com.google.android.recaptcha.internal.zzdq, com.google.android.recaptcha.internal.zzbo, ik.d):java.lang.Object");
    }
}
