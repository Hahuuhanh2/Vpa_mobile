package com.google.android.recaptcha.internal;

import al.d0;
import ik.d;
import kk.i;
import rk.p;
import sk.r;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzan extends i implements p {
    public long zza;
    public boolean zzb;
    public int zzc;
    public final /* synthetic */ zzap zzd;
    public final /* synthetic */ zzdf zze;
    public final /* synthetic */ r zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzan(zzap zzap, zzdf zzdf, r rVar, d dVar) {
        super(2, dVar);
        this.zzd = zzap;
        this.zze = zzdf;
        this.zzf = rVar;
    }

    public final d create(Object obj, d dVar) {
        return new zzan(this.zzd, this.zze, this.zzf, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzan) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028 A[SYNTHETIC, Splitter:B:12:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            jk.a r0 = jk.a.COROUTINE_SUSPENDED
            int r1 = r8.zzc
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001f
            if (r1 == r3) goto L_0x0015
            boolean r1 = r8.zzb
            long r4 = r8.zza
            p3.l0.Q0(r9)
            r9 = r1
            r1 = r8
            goto L_0x0085
        L_0x0015:
            long r4 = r8.zza
            p3.l0.Q0(r9)     // Catch:{ Exception -> 0x001c }
            r1 = r8
            goto L_0x0034
        L_0x001c:
            r9 = move-exception
            r1 = r8
            goto L_0x0050
        L_0x001f:
            p3.l0.Q0(r9)
            r4 = 1000(0x3e8, double:4.94E-321)
            r1 = r8
            r9 = r3
        L_0x0026:
            if (r9 == 0) goto L_0x0089
            com.google.android.recaptcha.internal.zzap r9 = r1.zzd     // Catch:{ Exception -> 0x004d }
            r1.zza = r4     // Catch:{ Exception -> 0x004d }
            r1.zzc = r3     // Catch:{ Exception -> 0x004d }
            java.lang.Object r9 = r9.zzi(r1)     // Catch:{ Exception -> 0x004d }
            if (r9 == r0) goto L_0x004f
        L_0x0034:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r9 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r9     // Catch:{ Exception -> 0x004d }
            com.google.android.recaptcha.internal.zzap r6 = r1.zzd     // Catch:{ Exception -> 0x004d }
            al.r r6 = r6.zzf()     // Catch:{ Exception -> 0x004d }
            r6.B(r9)     // Catch:{ Exception -> 0x004d }
            com.google.android.recaptcha.internal.zzap r9 = r1.zzd     // Catch:{ Exception -> 0x004d }
            com.google.android.recaptcha.internal.zzat r6 = com.google.android.recaptcha.internal.zzat.zzc     // Catch:{ Exception -> 0x004d }
            r9.zze = r6     // Catch:{ Exception -> 0x004d }
            com.google.android.recaptcha.internal.zzdf r9 = r1.zze     // Catch:{ Exception -> 0x004d }
            r9.zza()     // Catch:{ Exception -> 0x004d }
            r9 = r2
            goto L_0x0026
        L_0x004d:
            r9 = move-exception
            goto L_0x0050
        L_0x004f:
            return r0
        L_0x0050:
            sk.r r6 = r1.zzf
            r6.f22931a = r9
            boolean r6 = r9 instanceof com.google.android.play.core.integrity.StandardIntegrityException
            if (r6 == 0) goto L_0x0074
            r6 = r9
            com.google.android.play.core.integrity.StandardIntegrityException r6 = (com.google.android.play.core.integrity.StandardIntegrityException) r6
            int r6 = r6.getErrorCode()
            r7 = -100
            if (r6 == r7) goto L_0x0072
            r7 = -18
            if (r6 == r7) goto L_0x0072
            r7 = -12
            if (r6 == r7) goto L_0x0072
            r7 = -8
            if (r6 == r7) goto L_0x0072
            r7 = -3
            if (r6 == r7) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            r6 = r3
            goto L_0x0075
        L_0x0074:
            r6 = r2
        L_0x0075:
            if (r6 == 0) goto L_0x0088
            r1.zza = r4
            r1.zzb = r3
            r9 = 2
            r1.zzc = r9
            java.lang.Object r9 = al.m0.a(r4, r1)
            if (r9 == r0) goto L_0x0087
            r9 = r6
        L_0x0085:
            long r4 = r4 + r4
            goto L_0x0026
        L_0x0087:
            return r0
        L_0x0088:
            throw r9
        L_0x0089:
            ek.i r9 = ek.i.f20112a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
