package com.google.android.recaptcha.internal;

import al.e0;
import fk.h;
import fk.r;
import ik.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m9.b;
import sk.e;
import sk.j;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzl {
    public zzdc zza;
    private final List zzb;

    public zzl() {
        this((List) null, 1, (e) null);
    }

    public zzl(List list, int i10, e eVar) {
        r rVar = r.f20213a;
        this.zzb = new ArrayList();
        zze[] zzeArr = (zze[]) b.b0(rVar, new zze[0]);
        zzg((zze[]) Arrays.copyOf(zzeArr, zzeArr.length));
    }

    private final void zzg(zze... zzeArr) {
        List list = this.zzb;
        j.f(list, "<this>");
        j.f(zzeArr, "elements");
        list.addAll(h.l0(zzeArr));
    }

    public final zzdc zza() {
        zzdc zzdc = this.zza;
        if (zzdc != null) {
            return zzdc;
        }
        return null;
    }

    public final Object zzb(String str, long j10, d dVar) {
        return e0.b(new zzh(this, str, j10, (d) null), dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzc(long r11, com.google.android.recaptcha.internal.zzpq r13, ik.d r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzi
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.google.android.recaptcha.internal.zzi r0 = (com.google.android.recaptcha.internal.zzi) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzi r0 = new com.google.android.recaptcha.internal.zzi
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.zza
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p3.l0.Q0(r14)
            goto L_0x0045
        L_0x0027:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x002f:
            p3.l0.Q0(r14)
            com.google.android.recaptcha.internal.zzk r14 = new com.google.android.recaptcha.internal.zzk
            r9 = 0
            r4 = r14
            r5 = r10
            r6 = r11
            r8 = r13
            r4.<init>(r5, r6, r8, r9)
            r0.zzc = r3
            java.lang.Object r14 = al.e0.b(r14, r0)
            if (r14 != r1) goto L_0x0045
            return r1
        L_0x0045:
            ek.f r14 = (ek.f) r14
            java.lang.Object r11 = r14.f20104a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzl.zzc(long, com.google.android.recaptcha.internal.zzpq, ik.d):java.lang.Object");
    }

    public final List zzd() {
        return this.zzb;
    }

    public final void zze(zze... zzeArr) {
        zzg((zze[]) Arrays.copyOf(zzeArr, 2));
    }

    public final void zzf(zzqf zzqf) {
        for (zze zzk : this.zzb) {
            zzk.zzk(zzqf);
        }
    }
}
