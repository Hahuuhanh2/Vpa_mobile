package com.google.android.recaptcha.internal;

import al.d0;
import ik.d;
import kk.i;
import rk.p;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzw extends i implements p {
    public Object zza;
    public Object zzb;
    public int zzc;
    public final /* synthetic */ zzpq zzd;
    public final /* synthetic */ zzx zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzw(zzpq zzpq, zzx zzx, d dVar) {
        super(2, dVar);
        this.zzd = zzpq;
        this.zze = zzx;
    }

    public final d create(Object obj, d dVar) {
        return new zzw(this.zzd, this.zze, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzw) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.google.android.recaptcha.internal.zzps} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.google.android.recaptcha.internal.zzps} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.util.Iterator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            jk.a r0 = jk.a.COROUTINE_SUSPENDED
            int r1 = r4.zzc
            if (r1 == 0) goto L_0x000e
            java.lang.Object r1 = r4.zzb
            java.lang.Object r2 = r4.zza
            p3.l0.Q0(r5)
            goto L_0x0046
        L_0x000e:
            p3.l0.Q0(r5)
            com.google.android.recaptcha.internal.zzpq r5 = r4.zzd
            boolean r5 = r5.zzO()
            if (r5 != 0) goto L_0x002d
            com.google.android.recaptcha.internal.zzbj r5 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbh r0 = com.google.android.recaptcha.internal.zzbh.zzb
            com.google.android.recaptcha.internal.zzbg r1 = com.google.android.recaptcha.internal.zzbg.zzac
            r2 = 0
            r5.<init>(r0, r1, r2)
            ek.f$a r5 = p3.l0.A(r5)
            ek.f r0 = new ek.f
            r0.<init>(r5)
            return r0
        L_0x002d:
            com.google.android.recaptcha.internal.zzpq r5 = r4.zzd
            com.google.android.recaptcha.internal.zzx r1 = r4.zze
            com.google.android.recaptcha.internal.zzps r2 = r5.zzj()
            com.google.android.recaptcha.internal.zziv r5 = r2.zzi()
            r1.zzc = r5
            com.google.android.recaptcha.internal.zzx r5 = r4.zze
            java.util.List r5 = r5.zzb
            java.util.Iterator r1 = r5.iterator()
        L_0x0046:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0063
            java.lang.Object r5 = r1.next()
            com.google.android.recaptcha.internal.zzaa r5 = (com.google.android.recaptcha.internal.zzaa) r5
            r4.zza = r2
            r4.zzb = r1
            r3 = 1
            r4.zzc = r3
            r3 = r2
            com.google.android.recaptcha.internal.zzps r3 = (com.google.android.recaptcha.internal.zzps) r3
            java.lang.Object r5 = r5.zzd(r3, r4)
            if (r5 != r0) goto L_0x0046
            return r0
        L_0x0063:
            ek.i r5 = ek.i.f20112a
            ek.f r0 = new ek.f
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
