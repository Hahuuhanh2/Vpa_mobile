package com.google.android.recaptcha.internal;

import ek.i;
import ik.d;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public abstract class zze {
    private boolean zza;

    public zzdf zza(String str) {
        throw null;
    }

    public zzdf zzb() {
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b A[Catch:{ Exception -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d7 A[PHI: r0 
      PHI: (r0v2 java.lang.Object) = (r0v3 java.lang.Object), (r0v12 java.lang.Object), (r0v12 java.lang.Object), (r0v1 java.lang.Object) binds: [B:42:0x00d4, B:29:0x0089, B:30:0x008b, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzc(java.lang.String r19, long r20, ik.d r22) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r3 = r20
            r0 = r22
            boolean r5 = r0 instanceof com.google.android.recaptcha.internal.zza
            if (r5 == 0) goto L_0x001b
            r5 = r0
            com.google.android.recaptcha.internal.zza r5 = (com.google.android.recaptcha.internal.zza) r5
            int r6 = r5.zze
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001b
            int r6 = r6 - r7
            r5.zze = r6
            goto L_0x0020
        L_0x001b:
            com.google.android.recaptcha.internal.zza r5 = new com.google.android.recaptcha.internal.zza
            r5.<init>(r1, r0)
        L_0x0020:
            java.lang.Object r0 = r5.zzc
            jk.a r12 = jk.a.COROUTINE_SUSPENDED
            int r6 = r5.zze
            r13 = 3
            r7 = 2
            r8 = 1
            r14 = 0
            if (r6 == 0) goto L_0x0063
            if (r6 == r8) goto L_0x0048
            if (r6 == r7) goto L_0x003f
            if (r6 != r13) goto L_0x0037
            p3.l0.Q0(r0)
            goto L_0x00d7
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003f:
            java.lang.String r2 = r5.zzf
            java.lang.Object r3 = r5.zza
            p3.l0.Q0(r0)
            goto L_0x00c8
        L_0x0048:
            long r2 = r5.zzb
            com.google.android.recaptcha.internal.zzdf r4 = r5.zzg
            java.lang.String r6 = r5.zzf
            java.lang.Object r8 = r5.zza
            p3.l0.Q0(r0)     // Catch:{ Exception -> 0x005a }
            r16 = r6
            r6 = r4
            r3 = r2
            r2 = r16
            goto L_0x0080
        L_0x005a:
            r0 = move-exception
            r10 = r0
            r16 = r2
            r2 = r6
        L_0x005f:
            r3 = r8
            r8 = r16
            goto L_0x009b
        L_0x0063:
            p3.l0.Q0(r0)
            com.google.android.recaptcha.internal.zzdf r6 = r18.zza(r19)
            com.google.android.recaptcha.internal.zzb r0 = new com.google.android.recaptcha.internal.zzb     // Catch:{ Exception -> 0x0096 }
            r0.<init>(r1, r2, r14)     // Catch:{ Exception -> 0x0096 }
            r5.zza = r1     // Catch:{ Exception -> 0x0096 }
            r5.zzf = r2     // Catch:{ Exception -> 0x0096 }
            r5.zzg = r6     // Catch:{ Exception -> 0x0096 }
            r5.zzb = r3     // Catch:{ Exception -> 0x0096 }
            r5.zze = r8     // Catch:{ Exception -> 0x0096 }
            java.lang.Object r0 = p3.l0.W0(r3, r0, r5)     // Catch:{ Exception -> 0x0096 }
            if (r0 == r12) goto L_0x0095
            r8 = r1
        L_0x0080:
            ek.f r0 = (ek.f) r0     // Catch:{ Exception -> 0x008f }
            java.lang.Object r0 = r0.f20104a     // Catch:{ Exception -> 0x008f }
            p3.l0.Q0(r0)     // Catch:{ Exception -> 0x008f }
            com.google.android.recaptcha.internal.zzpw r0 = (com.google.android.recaptcha.internal.zzpw) r0     // Catch:{ Exception -> 0x008f }
            if (r6 == 0) goto L_0x00d7
            r6.zza()     // Catch:{ Exception -> 0x008f }
            goto L_0x00d7
        L_0x008f:
            r0 = move-exception
            r10 = r0
            r16 = r3
            r4 = r6
            goto L_0x005f
        L_0x0095:
            return r12
        L_0x0096:
            r0 = move-exception
            r10 = r0
            r8 = r3
            r4 = r6
            r3 = r1
        L_0x009b:
            java.lang.Class r0 = r10.getClass()
            com.google.android.recaptcha.internal.zzbj r6 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbh r11 = com.google.android.recaptcha.internal.zzbh.zzb
            com.google.android.recaptcha.internal.zzbg r15 = com.google.android.recaptcha.internal.zzbg.zzaq
            java.lang.String r0 = r0.getSimpleName()
            r6.<init>(r11, r15, r0)
            com.google.android.recaptcha.internal.zzbj r0 = com.google.android.recaptcha.internal.zzf.zza(r10, r6)
            if (r4 == 0) goto L_0x00b5
            r4.zzb(r0)
        L_0x00b5:
            r5.zza = r3
            r5.zzf = r2
            r5.zzg = r14
            r5.zze = r7
            r6 = r3
            com.google.android.recaptcha.internal.zze r6 = (com.google.android.recaptcha.internal.zze) r6
            r7 = r2
            r11 = r5
            java.lang.Object r0 = r6.zzi(r7, r8, r10, r11)
            if (r0 == r12) goto L_0x00d8
        L_0x00c8:
            r5.zza = r14
            r5.zzf = r14
            r5.zze = r13
            com.google.android.recaptcha.internal.zze r3 = (com.google.android.recaptcha.internal.zze) r3
            java.lang.Object r0 = r3.zzd(r2, r5)
            if (r0 != r12) goto L_0x00d7
            return r12
        L_0x00d7:
            return r0
        L_0x00d8:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zzc(java.lang.String, long, ik.d):java.lang.Object");
    }

    public abstract Object zzd(String str, d dVar);

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0099, code lost:
        if (r12 == r1) goto L_0x00b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0084 A[Catch:{ Exception -> 0x004f }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zze(long r9, com.google.android.recaptcha.internal.zzpq r11, ik.d r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.google.android.recaptcha.internal.zzc
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.recaptcha.internal.zzc r0 = (com.google.android.recaptcha.internal.zzc) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzd = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzc r0 = new com.google.android.recaptcha.internal.zzc
            r0.<init>(r8, r12)
        L_0x0018:
            java.lang.Object r12 = r0.zzb
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.zzd
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0051
            if (r2 == r6) goto L_0x0045
            if (r2 == r5) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            java.lang.Object r9 = r0.zza
            com.google.android.recaptcha.internal.zzbj r9 = (com.google.android.recaptcha.internal.zzbj) r9
            p3.l0.Q0(r12)
            goto L_0x00b0
        L_0x0033:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003b:
            com.google.android.recaptcha.internal.zzdf r9 = r0.zze
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zze r10 = (com.google.android.recaptcha.internal.zze) r10
            p3.l0.Q0(r12)
            goto L_0x009b
        L_0x0045:
            com.google.android.recaptcha.internal.zzdf r9 = r0.zze
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zze r10 = (com.google.android.recaptcha.internal.zze) r10
            p3.l0.Q0(r12)     // Catch:{ Exception -> 0x004f }
            goto L_0x0077
        L_0x004f:
            r11 = move-exception
            goto L_0x008c
        L_0x0051:
            p3.l0.Q0(r12)
            com.google.android.recaptcha.internal.zzdf r12 = r8.zzb()
            boolean r2 = r8.zza
            if (r2 == 0) goto L_0x0062
            r12.zza()
            ek.i r9 = ek.i.f20112a
            return r9
        L_0x0062:
            com.google.android.recaptcha.internal.zzd r2 = new com.google.android.recaptcha.internal.zzd     // Catch:{ Exception -> 0x0088 }
            r2.<init>(r8, r11, r3)     // Catch:{ Exception -> 0x0088 }
            r0.zza = r8     // Catch:{ Exception -> 0x0088 }
            r0.zze = r12     // Catch:{ Exception -> 0x0088 }
            r0.zzd = r6     // Catch:{ Exception -> 0x0088 }
            java.lang.Object r9 = p3.l0.W0(r9, r2, r0)     // Catch:{ Exception -> 0x0088 }
            if (r9 == r1) goto L_0x00b5
            r10 = r8
            r7 = r12
            r12 = r9
            r9 = r7
        L_0x0077:
            ek.f r12 = (ek.f) r12     // Catch:{ Exception -> 0x004f }
            java.lang.Object r11 = r12.f20104a     // Catch:{ Exception -> 0x004f }
            p3.l0.Q0(r11)     // Catch:{ Exception -> 0x004f }
            ek.i r11 = ek.i.f20112a     // Catch:{ Exception -> 0x004f }
            r10.zza = r6     // Catch:{ Exception -> 0x004f }
            if (r9 == 0) goto L_0x0087
            r9.zza()     // Catch:{ Exception -> 0x004f }
        L_0x0087:
            return r11
        L_0x0088:
            r9 = move-exception
            r11 = r9
            r10 = r8
            r9 = r12
        L_0x008c:
            r12 = 0
            r10.zza = r12
            r0.zza = r10
            r0.zze = r9
            r0.zzd = r5
            java.lang.Object r12 = r10.zzj(r11, r0)
            if (r12 == r1) goto L_0x00b5
        L_0x009b:
            r11 = r12
            com.google.android.recaptcha.internal.zzbj r11 = (com.google.android.recaptcha.internal.zzbj) r11
            if (r9 == 0) goto L_0x00a3
            r9.zzb(r11)
        L_0x00a3:
            r0.zza = r11
            r0.zze = r3
            r0.zzd = r4
            java.lang.Object r9 = r10.zzg(r11, r0)
            if (r9 == r1) goto L_0x00b5
            r9 = r11
        L_0x00b0:
            ek.f$a r9 = p3.l0.A(r9)
            return r9
        L_0x00b5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zze(long, com.google.android.recaptcha.internal.zzpq, ik.d):java.lang.Object");
    }

    public abstract Object zzf(String str, d dVar);

    public Object zzg(zzbj zzbj, d dVar) {
        return i.f20112a;
    }

    public abstract Object zzh(zzpq zzpq, d dVar);

    public Object zzi(String str, long j10, Exception exc, d dVar) {
        return i.f20112a;
    }

    public Object zzj(Exception exc, d dVar) {
        return zzf.zza(exc, new zzbj(zzbh.zzb, zzbg.zzaq, exc.getClass().getSimpleName()));
    }

    public void zzk(zzqf zzqf) {
    }

    public final boolean zzl() {
        return this.zza;
    }
}
