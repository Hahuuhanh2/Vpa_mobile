package com.google.android.recaptcha.internal;

import al.g0;
import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import fk.j;
import ik.d;
import j7.a;
import java.util.LinkedHashMap;
import java.util.List;
import p3.l0;
import yk.c;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzcx implements RecaptchaClient, RecaptchaTasksClient {
    private static final c zza = new c("^[a-zA-Z0-9/_]{0,100}$");
    private final Application zzb;
    private final zzl zzc;
    private final String zzd;
    /* access modifiers changed from: private */
    public final zzbv zze;
    /* access modifiers changed from: private */
    public final zzpq zzf;
    private final zzdc zzg;
    private final zzbl zzh;
    private final zzbo zzi;

    public zzcx(Application application, zzl zzl, String str, zzbo zzbo, zzbv zzbv, zzpq zzpq, zzdc zzdc, zzbl zzbl, zzds zzds) {
        this.zzb = application;
        this.zzc = zzl;
        this.zzd = str;
        this.zzi = zzbo;
        this.zze = zzbv;
        this.zzf = zzpq;
        this.zzg = zzdc;
        this.zzh = zzbl;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzf(long r5, java.lang.String r7, com.google.android.recaptcha.internal.zzdc r8, ik.d r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzcp
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.recaptcha.internal.zzcp r0 = (com.google.android.recaptcha.internal.zzcp) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzcp r0 = new com.google.android.recaptcha.internal.zzcp
            r0.<init>(r4, r9)
        L_0x0018:
            java.lang.Object r9 = r0.zza
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            com.google.android.recaptcha.internal.zzdf r5 = r0.zzd
            p3.l0.Q0(r9)     // Catch:{ Exception -> 0x0029 }
            goto L_0x0049
        L_0x0029:
            r6 = move-exception
            goto L_0x0053
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            p3.l0.Q0(r9)
            r9 = 27
            com.google.android.recaptcha.internal.zzdf r8 = r8.zzf(r9)
            com.google.android.recaptcha.internal.zzl r9 = r4.zzc     // Catch:{ Exception -> 0x0050 }
            r0.zzd = r8     // Catch:{ Exception -> 0x0050 }
            r0.zzc = r3     // Catch:{ Exception -> 0x0050 }
            java.lang.Object r9 = r9.zzb(r7, r5, r0)     // Catch:{ Exception -> 0x0050 }
            if (r9 == r1) goto L_0x004f
            r5 = r8
        L_0x0049:
            com.google.android.recaptcha.internal.zzpw r9 = (com.google.android.recaptcha.internal.zzpw) r9     // Catch:{ Exception -> 0x0029 }
            r5.zza()     // Catch:{ Exception -> 0x0029 }
            return r9
        L_0x004f:
            return r1
        L_0x0050:
            r5 = move-exception
            r6 = r5
            r5 = r8
        L_0x0053:
            boolean r7 = r6 instanceof com.google.android.recaptcha.internal.zzbj
            if (r7 == 0) goto L_0x005a
            com.google.android.recaptcha.internal.zzbj r6 = (com.google.android.recaptcha.internal.zzbj) r6
            goto L_0x0064
        L_0x005a:
            com.google.android.recaptcha.internal.zzbj r6 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbh r7 = com.google.android.recaptcha.internal.zzbh.zzb
            com.google.android.recaptcha.internal.zzbg r8 = com.google.android.recaptcha.internal.zzbg.zzaa
            r9 = 0
            r6.<init>(r7, r8, r9)
        L_0x0064:
            r5.zzb(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcx.zzf(long, java.lang.String, com.google.android.recaptcha.internal.zzdc, ik.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: com.google.android.recaptcha.internal.zzdf} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzg(com.google.android.recaptcha.RecaptchaAction r25, long r26, ik.d r28) {
        /*
            r24 = this;
            r7 = r24
            r0 = r26
            r2 = r28
            boolean r3 = r2 instanceof com.google.android.recaptcha.internal.zzcs
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.google.android.recaptcha.internal.zzcs r3 = (com.google.android.recaptcha.internal.zzcs) r3
            int r4 = r3.zzf
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.zzf = r4
            goto L_0x001e
        L_0x0019:
            com.google.android.recaptcha.internal.zzcs r3 = new com.google.android.recaptcha.internal.zzcs
            r3.<init>(r7, r2)
        L_0x001e:
            r8 = r3
            java.lang.Object r2 = r8.zzd
            jk.a r9 = jk.a.COROUTINE_SUSPENDED
            int r3 = r8.zzf
            r4 = 1
            r10 = 0
            r11 = 2
            if (r3 == 0) goto L_0x0062
            if (r3 == r4) goto L_0x0049
            if (r3 != r11) goto L_0x0041
            java.lang.Object r0 = r8.zzb
            r1 = r0
            com.google.android.recaptcha.internal.zzdf r1 = (com.google.android.recaptcha.internal.zzdf) r1
            java.lang.Object r0 = r8.zza
            com.google.android.recaptcha.internal.zzdc r0 = (com.google.android.recaptcha.internal.zzdc) r0
            com.google.android.recaptcha.internal.zzcx r3 = r8.zzg
            p3.l0.Q0(r2)     // Catch:{ Exception -> 0x003e }
            goto L_0x0118
        L_0x003e:
            r0 = move-exception
            goto L_0x0125
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0049:
            double r0 = r8.zzc
            com.google.android.recaptcha.internal.zzdf r3 = r8.zzh
            java.lang.Object r4 = r8.zzb
            com.google.android.recaptcha.internal.zzdc r4 = (com.google.android.recaptcha.internal.zzdc) r4
            java.lang.Object r5 = r8.zza
            com.google.android.recaptcha.RecaptchaAction r5 = (com.google.android.recaptcha.RecaptchaAction) r5
            com.google.android.recaptcha.internal.zzcx r6 = r8.zzg
            p3.l0.Q0(r2)     // Catch:{ Exception -> 0x005f }
            r12 = r4
            r21 = r5
            goto L_0x00e6
        L_0x005f:
            r0 = move-exception
            goto L_0x0130
        L_0x0062:
            p3.l0.Q0(r2)
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r5 = r2.toString()
            com.google.android.recaptcha.internal.zzdc r2 = r7.zzg
            com.google.android.recaptcha.internal.zzdc r12 = r2.zza()
            r12.zzc(r5)
            r2 = 9
            com.google.android.recaptcha.internal.zzdf r13 = r12.zzf(r2)
            double r2 = (double) r0
            r6 = 7
            com.google.android.recaptcha.internal.zzdf r6 = r12.zzf(r6)     // Catch:{ Exception -> 0x012d }
            yk.c r14 = zza     // Catch:{ Exception -> 0x012d }
            java.lang.String r15 = r25.getAction()     // Catch:{ Exception -> 0x012d }
            r14.getClass()     // Catch:{ Exception -> 0x012d }
            java.lang.String r11 = "input"
            sk.j.f(r15, r11)     // Catch:{ Exception -> 0x012d }
            java.util.regex.Pattern r11 = r14.f23595a     // Catch:{ Exception -> 0x012d }
            java.util.regex.Matcher r11 = r11.matcher(r15)     // Catch:{ Exception -> 0x012d }
            boolean r11 = r11.matches()     // Catch:{ Exception -> 0x012d }
            if (r11 != 0) goto L_0x00a6
            com.google.android.recaptcha.internal.zzbj r11 = new com.google.android.recaptcha.internal.zzbj     // Catch:{ Exception -> 0x012d }
            com.google.android.recaptcha.internal.zzbh r14 = com.google.android.recaptcha.internal.zzbh.zzg     // Catch:{ Exception -> 0x012d }
            com.google.android.recaptcha.internal.zzbg r15 = com.google.android.recaptcha.internal.zzbg.zzh     // Catch:{ Exception -> 0x012d }
            r11.<init>(r14, r15, r10)     // Catch:{ Exception -> 0x012d }
            goto L_0x00a7
        L_0x00a6:
            r11 = r10
        L_0x00a7:
            r14 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b6
            com.google.android.recaptcha.internal.zzbj r11 = new com.google.android.recaptcha.internal.zzbj     // Catch:{ Exception -> 0x012d }
            com.google.android.recaptcha.internal.zzbh r0 = com.google.android.recaptcha.internal.zzbh.zzb     // Catch:{ Exception -> 0x012d }
            com.google.android.recaptcha.internal.zzbg r1 = com.google.android.recaptcha.internal.zzbg.zzI     // Catch:{ Exception -> 0x012d }
            r11.<init>(r0, r1, r10)     // Catch:{ Exception -> 0x012d }
        L_0x00b6:
            if (r11 != 0) goto L_0x0129
            r6.zza()     // Catch:{ Exception -> 0x012d }
            r0 = 4601778099247172813(0x3fdccccccccccccd, double:0.45)
            double r0 = r0 * r2
            r8.zzg = r7     // Catch:{ Exception -> 0x012d }
            r11 = r25
            r8.zza = r11     // Catch:{ Exception -> 0x012d }
            r8.zzb = r12     // Catch:{ Exception -> 0x012d }
            r8.zzh = r13     // Catch:{ Exception -> 0x012d }
            r14 = 4603129179135383962(0x3fe199999999999a, double:0.55)
            double r14 = r14 * r2
            r8.zzc = r14     // Catch:{ Exception -> 0x012d }
            r8.zzf = r4     // Catch:{ Exception -> 0x012d }
            long r2 = (long) r0     // Catch:{ Exception -> 0x012d }
            r1 = r24
            r4 = r5
            r5 = r12
            r6 = r8
            java.lang.Object r2 = r1.zzf(r2, r4, r5, r6)     // Catch:{ Exception -> 0x012d }
            if (r2 == r9) goto L_0x0128
            r6 = r7
            r21 = r11
            r3 = r13
            r0 = r14
        L_0x00e6:
            r22 = r2
            com.google.android.recaptcha.internal.zzpw r22 = (com.google.android.recaptcha.internal.zzpw) r22     // Catch:{ Exception -> 0x005f }
            long r0 = (long) r0     // Catch:{ Exception -> 0x005f }
            r8.zzg = r6     // Catch:{ Exception -> 0x005f }
            r8.zza = r12     // Catch:{ Exception -> 0x005f }
            r8.zzb = r3     // Catch:{ Exception -> 0x005f }
            r8.zzh = r10     // Catch:{ Exception -> 0x005f }
            r2 = 2
            r8.zzf = r2     // Catch:{ Exception -> 0x005f }
            com.google.android.recaptcha.internal.zzbo r2 = r6.zzi     // Catch:{ Exception -> 0x005f }
            al.d0 r2 = r2.zza()     // Catch:{ Exception -> 0x005f }
            ik.f r2 = r2.s()     // Catch:{ Exception -> 0x005f }
            com.google.android.recaptcha.internal.zzcv r4 = new com.google.android.recaptcha.internal.zzcv     // Catch:{ Exception -> 0x005f }
            r23 = 0
            r16 = r4
            r17 = r0
            r19 = r12
            r20 = r6
            r16.<init>(r17, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x005f }
            java.lang.Object r2 = p3.l0.V0(r8, r2, r4)     // Catch:{ Exception -> 0x005f }
            if (r2 == r9) goto L_0x0128
            r1 = r3
            r3 = r6
            r0 = r12
        L_0x0118:
            com.google.android.recaptcha.internal.zzqf r2 = (com.google.android.recaptcha.internal.zzqf) r2     // Catch:{ Exception -> 0x003e }
            r3.zzh(r2, r0)     // Catch:{ Exception -> 0x003e }
            r1.zza()     // Catch:{ Exception -> 0x003e }
            java.lang.String r0 = r2.zzj()     // Catch:{ Exception -> 0x003e }
            goto L_0x016f
        L_0x0125:
            r6 = r3
            r3 = r1
            goto L_0x0130
        L_0x0128:
            return r9
        L_0x0129:
            r6.zzb(r11)     // Catch:{ Exception -> 0x012d }
            throw r11     // Catch:{ Exception -> 0x012d }
        L_0x012d:
            r0 = move-exception
            r6 = r7
            r3 = r13
        L_0x0130:
            boolean r1 = r0 instanceof com.google.android.recaptcha.internal.zzbj
            if (r1 == 0) goto L_0x0152
            com.google.android.recaptcha.internal.zzbj r0 = (com.google.android.recaptcha.internal.zzbj) r0
            com.google.android.recaptcha.internal.zzbh r1 = r0.zzb()
            com.google.android.recaptcha.internal.zzbh r2 = com.google.android.recaptcha.internal.zzbh.zzc
            boolean r1 = sk.j.a(r1, r2)
            if (r1 == 0) goto L_0x0164
            android.app.Application r1 = r6.zzb
            boolean r1 = r6.zzi(r1)
            if (r1 != 0) goto L_0x0164
            com.google.android.recaptcha.internal.zzbj r0 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbg r1 = com.google.android.recaptcha.internal.zzbg.zzap
            r0.<init>(r2, r1, r10)
            goto L_0x0164
        L_0x0152:
            java.lang.Class r0 = r0.getClass()
            com.google.android.recaptcha.internal.zzbj r1 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbh r2 = com.google.android.recaptcha.internal.zzbh.zzb
            com.google.android.recaptcha.internal.zzbg r4 = com.google.android.recaptcha.internal.zzbg.zzX
            java.lang.String r0 = r0.getSimpleName()
            r1.<init>(r2, r4, r0)
            r0 = r1
        L_0x0164:
            r3.zzb(r0)
            com.google.android.recaptcha.RecaptchaException r0 = r0.zzc()
            ek.f$a r0 = p3.l0.A(r0)
        L_0x016f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcx.zzg(com.google.android.recaptcha.RecaptchaAction, long, ik.d):java.lang.Object");
    }

    private final void zzh(zzqf zzqf, zzdc zzdc) {
        zzbj zzbj;
        zzdf zzf2 = zzdc.zzf(29);
        try {
            List<zzqh> zzk = zzqf.zzk();
            int d02 = g0.d0(j.H0(zzk));
            if (d02 < 16) {
                d02 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(d02);
            for (zzqh zzqh : zzk) {
                linkedHashMap.put(zzqh.zzg(), zzqh.zzi());
            }
            this.zzh.zzb(linkedHashMap);
            this.zzc.zzf(zzqf);
            zzf2.zza();
        } catch (Exception e10) {
            if (e10 instanceof zzbj) {
                zzbj = (zzbj) e10;
            } else {
                zzbj = new zzbj(zzbh.zzb, zzbg.zzaa, (String) null);
            }
            zzf2.zzb(zzbj);
            throw zzbj;
        }
    }

    private final boolean zzi(Application application) {
        int i10 = zzbb.zza;
        zzbk zzbk = (zzbk) a.b0(zzcw.zza).getValue();
        return zzbk.zzb(application);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: execute-0E7RQCE  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m8execute0E7RQCE(com.google.android.recaptcha.RecaptchaAction r5, long r6, ik.d<? super ek.f<java.lang.String>> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzcq
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.recaptcha.internal.zzcq r0 = (com.google.android.recaptcha.internal.zzcq) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzcq r0 = new com.google.android.recaptcha.internal.zzcq
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.zza
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            p3.l0.Q0(r8)
            ek.f r8 = (ek.f) r8
            java.lang.Object r5 = r8.f20104a
            goto L_0x003f
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            p3.l0.Q0(r8)
            r0.zzc = r3
            java.lang.Object r5 = r4.zzg(r5, r6, r0)
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcx.m8execute0E7RQCE(com.google.android.recaptcha.RecaptchaAction, long, ik.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: execute-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m9executegIAlus(com.google.android.recaptcha.RecaptchaAction r5, ik.d<? super ek.f<java.lang.String>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzcr
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.recaptcha.internal.zzcr r0 = (com.google.android.recaptcha.internal.zzcr) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzcr r0 = new com.google.android.recaptcha.internal.zzcr
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.zza
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            p3.l0.Q0(r6)
            ek.f r6 = (ek.f) r6
            java.lang.Object r5 = r6.f20104a
            goto L_0x0041
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            p3.l0.Q0(r6)
            r0.zzc = r3
            r2 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r5 = r4.m8execute0E7RQCE(r5, r2, r0)
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcx.m9executegIAlus(com.google.android.recaptcha.RecaptchaAction, ik.d):java.lang.Object");
    }

    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        return zzax.zza(l0.h(this.zzi.zzb(), new zzct(this, recaptchaAction, 10000, (d) null)));
    }

    public final String zze() {
        return this.zzd;
    }

    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j10) {
        return zzax.zza(l0.h(this.zzi.zzb(), new zzct(this, recaptchaAction, j10, (d) null)));
    }
}
