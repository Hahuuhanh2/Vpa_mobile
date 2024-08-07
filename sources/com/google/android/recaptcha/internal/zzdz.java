package com.google.android.recaptcha.internal;

import al.d0;
import ik.d;
import kk.i;
import rk.p;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzdz extends i implements p {
    public Object zza;
    public Object zzb;
    public int zzc;
    public final /* synthetic */ zzek zzd;
    public final /* synthetic */ zzea zze;
    public final /* synthetic */ String zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdz(zzek zzek, zzea zzea, String str, d dVar) {
        super(2, dVar);
        this.zzd = zzek;
        this.zze = zzea;
        this.zzf = str;
    }

    public final d create(Object obj, d dVar) {
        return new zzdz(this.zzd, this.zze, this.zzf, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdz) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0081, code lost:
        if (r1.zzh(r7, r2, r6) != r0) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            jk.a r0 = jk.a.COROUTINE_SUSPENDED
            int r1 = r6.zzc
            r2 = 1
            if (r1 == 0) goto L_0x0016
            if (r1 == r2) goto L_0x000e
            p3.l0.Q0(r7)
            goto L_0x0084
        L_0x000e:
            java.lang.Object r1 = r6.zzb
            java.lang.Object r2 = r6.zza
            p3.l0.Q0(r7)     // Catch:{ Exception -> 0x0070 }
            goto L_0x0057
        L_0x0016:
            p3.l0.Q0(r7)
            com.google.android.recaptcha.internal.zzek r7 = r6.zzd
            com.google.android.recaptcha.internal.zzbt r1 = new com.google.android.recaptcha.internal.zzbt
            r1.<init>()
            r7.zza = r1
            java.lang.String r7 = r6.zzf     // Catch:{ Exception -> 0x0070 }
            com.google.android.recaptcha.internal.zzhz r1 = com.google.android.recaptcha.internal.zzhz.zzh()     // Catch:{ Exception -> 0x0070 }
            byte[] r7 = r1.zzj(r7)     // Catch:{ Exception -> 0x0070 }
            com.google.android.recaptcha.internal.zzro r7 = com.google.android.recaptcha.internal.zzro.zzi(r7)     // Catch:{ Exception -> 0x0070 }
            r7.zzf()     // Catch:{ Exception -> 0x0070 }
            com.google.android.recaptcha.internal.zzea r1 = r6.zze     // Catch:{ Exception -> 0x0070 }
            com.google.android.recaptcha.internal.zzge r1 = r1.zzc     // Catch:{ Exception -> 0x0070 }
            com.google.android.recaptcha.internal.zzrg r1 = r1.zza(r7)     // Catch:{ Exception -> 0x0070 }
            com.google.android.recaptcha.internal.zzgz r3 = com.google.android.recaptcha.internal.zzgz.zzb()     // Catch:{ Exception -> 0x0070 }
            com.google.android.recaptcha.internal.zzea r4 = r6.zze     // Catch:{ Exception -> 0x0070 }
            java.util.List r1 = r1.zzi()     // Catch:{ Exception -> 0x0070 }
            com.google.android.recaptcha.internal.zzek r5 = r6.zzd     // Catch:{ Exception -> 0x0070 }
            r6.zza = r7     // Catch:{ Exception -> 0x0070 }
            r6.zzb = r3     // Catch:{ Exception -> 0x0070 }
            r6.zzc = r2     // Catch:{ Exception -> 0x0070 }
            java.lang.Object r1 = r4.zzg(r1, r5, r6)     // Catch:{ Exception -> 0x0070 }
            if (r1 == r0) goto L_0x0083
            r2 = r7
            r1 = r3
        L_0x0057:
            r7 = r1
            com.google.android.recaptcha.internal.zzgz r7 = (com.google.android.recaptcha.internal.zzgz) r7     // Catch:{ Exception -> 0x0070 }
            r7.zzf()     // Catch:{ Exception -> 0x0070 }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ Exception -> 0x0070 }
            com.google.android.recaptcha.internal.zzgz r1 = (com.google.android.recaptcha.internal.zzgz) r1     // Catch:{ Exception -> 0x0070 }
            long r3 = r1.zza(r7)     // Catch:{ Exception -> 0x0070 }
            java.lang.Long r7 = new java.lang.Long     // Catch:{ Exception -> 0x0070 }
            r7.<init>(r3)     // Catch:{ Exception -> 0x0070 }
            com.google.android.recaptcha.internal.zzro r2 = (com.google.android.recaptcha.internal.zzro) r2     // Catch:{ Exception -> 0x0070 }
            r2.zzf()     // Catch:{ Exception -> 0x0070 }
            goto L_0x0084
        L_0x0070:
            r7 = move-exception
            com.google.android.recaptcha.internal.zzea r1 = r6.zze
            com.google.android.recaptcha.internal.zzek r2 = r6.zzd
            r3 = 0
            r6.zza = r3
            r6.zzb = r3
            r3 = 2
            r6.zzc = r3
            java.lang.Object r7 = r1.zzh(r7, r2, r6)
            if (r7 != r0) goto L_0x0084
        L_0x0083:
            return r0
        L_0x0084:
            ek.i r7 = ek.i.f20112a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
