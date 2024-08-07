package com.google.android.recaptcha.internal;

import al.d0;
import al.r;
import android.content.Context;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import ek.i;
import il.a;
import il.d;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzap {
    public r zza;
    /* access modifiers changed from: private */
    public final d0 zzb;
    private final zzdc zzc;
    private final StandardIntegrityManager zzd;
    /* access modifiers changed from: private */
    public zzat zze = zzat.zza;
    private long zzf;
    private final a zzg = new d(false);
    private boolean zzh;

    public zzap(Context context, d0 d0Var, zzdc zzdc, StandardIntegrityManager standardIntegrityManager, long j10) {
        this.zzb = d0Var;
        this.zzc = zzdc;
        this.zzd = standardIntegrityManager;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzi(ik.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzai
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.recaptcha.internal.zzai r0 = (com.google.android.recaptcha.internal.zzai) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzai r0 = new com.google.android.recaptcha.internal.zzai
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.zza
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p3.l0.Q0(r7)
            goto L_0x0053
        L_0x0027:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x002f:
            p3.l0.Q0(r7)
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder r7 = com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.builder()
            long r4 = r6.zzf
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder r7 = r7.setCloudProjectNumber(r4)
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest r7 = r7.build()
            com.google.android.play.core.integrity.StandardIntegrityManager r2 = r6.zzd
            com.google.android.gms.tasks.Task r7 = r2.prepareIntegrityToken(r7)
            al.j0 r7 = com.google.android.recaptcha.internal.zzas.zza(r7)
            r0.zzc = r3
            java.lang.Object r7 = r7.await(r0)
            if (r7 != r1) goto L_0x0053
            return r1
        L_0x0053:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzap.zzi(ik.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r7 != r1) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        if (r7 != r1) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzj(java.lang.String r6, ik.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzaj
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.recaptcha.internal.zzaj r0 = (com.google.android.recaptcha.internal.zzaj) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzaj r0 = new com.google.android.recaptcha.internal.zzaj
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.zza
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p3.l0.Q0(r7)
            goto L_0x006b
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            java.lang.String r6 = r0.zzd
            p3.l0.Q0(r7)
            goto L_0x0049
        L_0x0038:
            p3.l0.Q0(r7)
            al.r r7 = r5.zzf()
            r0.zzd = r6
            r0.zzc = r4
            java.lang.Object r7 = r7.await(r0)
            if (r7 == r1) goto L_0x0072
        L_0x0049:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r7
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r2 = com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.builder()
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r6 = r2.setRequestHash(r6)
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest r6 = r6.build()
            com.google.android.gms.tasks.Task r6 = r7.request(r6)
            al.j0 r6 = com.google.android.recaptcha.internal.zzas.zza(r6)
            r7 = 0
            r0.zzd = r7
            r0.zzc = r3
            java.lang.Object r7 = r6.await(r0)
            if (r7 != r1) goto L_0x006b
            goto L_0x0072
        L_0x006b:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityToken r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken) r7
            java.lang.String r6 = r7.token()
            return r6
        L_0x0072:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzap.zzj(java.lang.String, ik.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        if (r2.zze(r0) != r1) goto L_0x0064;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzc(java.lang.String r7, ik.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzah
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.recaptcha.internal.zzah r0 = (com.google.android.recaptcha.internal.zzah) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzah r0 = new com.google.android.recaptcha.internal.zzah
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.zza
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r5) goto L_0x003d
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            p3.l0.Q0(r8)
            goto L_0x0072
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            java.lang.String r7 = r0.zze
            com.google.android.recaptcha.internal.zzap r2 = r0.zzd
            p3.l0.Q0(r8)
            goto L_0x0064
        L_0x003d:
            java.lang.String r7 = r0.zze
            com.google.android.recaptcha.internal.zzap r2 = r0.zzd
            p3.l0.Q0(r8)     // Catch:{ Exception -> 0x0057 }
            goto L_0x0072
        L_0x0045:
            p3.l0.Q0(r8)
            r0.zzd = r6     // Catch:{ Exception -> 0x0056 }
            r0.zze = r7     // Catch:{ Exception -> 0x0056 }
            r0.zzc = r5     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r7 = r6.zzj(r7, r0)     // Catch:{ Exception -> 0x0056 }
            if (r7 != r1) goto L_0x0055
            goto L_0x0071
        L_0x0055:
            return r7
        L_0x0056:
            r2 = r6
        L_0x0057:
            r0.zzd = r2
            r0.zze = r7
            r0.zzc = r4
            java.lang.Object r8 = r2.zze(r0)
            if (r8 != r1) goto L_0x0064
            goto L_0x0071
        L_0x0064:
            r8 = 0
            r0.zzd = r8
            r0.zze = r8
            r0.zzc = r3
            java.lang.Object r7 = r2.zzj(r7, r0)
            if (r7 != r1) goto L_0x0073
        L_0x0071:
            r8 = r1
        L_0x0072:
            return r8
        L_0x0073:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzap.zzc(java.lang.String, ik.d):java.lang.Object");
    }

    public final Object zzd(long j10, ik.d dVar) {
        this.zzf = j10;
        return i.f20112a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: il.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: il.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: il.a} */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a9, code lost:
        if (ek.i.f20112a == r1) goto L_0x00b4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058 A[Catch:{ all -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005e A[SYNTHETIC, Splitter:B:24:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zze(ik.d r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.google.android.recaptcha.internal.zzam
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.recaptcha.internal.zzam r0 = (com.google.android.recaptcha.internal.zzam) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzd = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzam r0 = new com.google.android.recaptcha.internal.zzam
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.zzb
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.zzd
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            p3.l0.Q0(r13)
            goto L_0x00ac
        L_0x002b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0033:
            java.lang.Object r2 = r0.zza
            com.google.android.recaptcha.internal.zzap r5 = r0.zze
            p3.l0.Q0(r13)
            goto L_0x004d
        L_0x003b:
            p3.l0.Q0(r13)
            il.a r2 = r12.zzg
            r0.zze = r12
            r0.zza = r2
            r0.zzd = r4
            java.lang.Object r13 = r2.a(r0)
            if (r13 == r1) goto L_0x00b4
            r5 = r12
        L_0x004d:
            r13 = 0
            com.google.android.recaptcha.internal.zzat r6 = r5.zze     // Catch:{ all -> 0x00af }
            com.google.android.recaptcha.internal.zzat r7 = com.google.android.recaptcha.internal.zzat.zza     // Catch:{ all -> 0x00af }
            boolean r6 = sk.j.a(r6, r7)     // Catch:{ all -> 0x00af }
            if (r6 != 0) goto L_0x005e
            ek.i r0 = ek.i.f20112a     // Catch:{ all -> 0x00af }
            r2.b(r13)
            return r0
        L_0x005e:
            com.google.android.recaptcha.internal.zzat r6 = com.google.android.recaptcha.internal.zzat.zzb     // Catch:{ all -> 0x00af }
            r5.zze = r6     // Catch:{ all -> 0x00af }
            ek.i r6 = ek.i.f20112a     // Catch:{ all -> 0x00af }
            r2.b(r13)
            com.google.android.recaptcha.internal.zzdc r2 = r5.zzc
            java.lang.String r6 = r2.zzd()
            r2.zzc(r6)
            r2.zzb(r3)
            r6 = 38
            com.google.android.recaptcha.internal.zzdf r2 = r2.zzf(r6)
            al.s r6 = p3.l0.c()
            r5.zza = r6
            al.d0 r6 = r5.zzb
            com.google.android.recaptcha.internal.zzao r7 = new com.google.android.recaptcha.internal.zzao
            r7.<init>(r5, r2, r13)
            r2 = 3
            p3.l0.j0(r6, r13, r7, r2)
            r0.zze = r13
            r0.zza = r13
            r0.zzd = r3
            boolean r13 = r5.zzh
            if (r13 != 0) goto L_0x00a7
            java.util.Timer r6 = new java.util.Timer
            r6.<init>()
            com.google.android.recaptcha.internal.zzak r7 = new com.google.android.recaptcha.internal.zzak
            r7.<init>(r5)
            r10 = 28800000(0x1b77400, double:1.42290906E-316)
            r8 = r10
            r6.schedule(r7, r8, r10)
            r5.zzh = r4
        L_0x00a7:
            ek.i r13 = ek.i.f20112a
            if (r13 != r1) goto L_0x00ac
            goto L_0x00b4
        L_0x00ac:
            ek.i r13 = ek.i.f20112a
            return r13
        L_0x00af:
            r0 = move-exception
            r2.b(r13)
            throw r0
        L_0x00b4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzap.zze(ik.d):java.lang.Object");
    }

    public final r zzf() {
        r rVar = this.zza;
        if (rVar != null) {
            return rVar;
        }
        return null;
    }
}
