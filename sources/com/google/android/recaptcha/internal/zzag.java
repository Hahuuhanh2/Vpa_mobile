package com.google.android.recaptcha.internal;

import al.d0;
import al.e0;
import android.content.Context;
import ik.d;
import java.nio.charset.StandardCharsets;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzag implements zzaa {
    private final zzdc zza;
    /* access modifiers changed from: private */
    public final zzap zzb;
    private boolean zzc = true;
    /* access modifiers changed from: private */
    public String zzd = "";
    private final int zze;

    public zzag(zzdc zzdc, Context context, d0 d0Var, zzap zzap, int i10) {
        this.zza = zzdc;
        this.zzb = zzap;
        this.zze = i10;
    }

    private static final String zzi(zziv zziv) {
        zzhz zzg = zzhz.zzg();
        byte[] zzl = zziv.zzl();
        byte[] zzd2 = zzhr.zza().zza(zzg.zzi(zzl, 0, zzl.length), StandardCharsets.UTF_8).zzd();
        zziv zzk = zziv.zzk(zzd2, 0, zzd2.length);
        zzhz zzh = zzhz.zzh();
        byte[] zzl2 = zzk.zzl();
        return zzh.zzi(zzl2, 0, zzl2.length);
    }

    public final int zza() {
        return 2;
    }

    public final zzdc zzb() {
        return this.zza;
    }

    public final Object zzc(String str, d dVar) {
        return e0.b(new zzae(this, str, (d) null), dVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0082, code lost:
        if (r12.zze(r0) != r1) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzd(com.google.android.recaptcha.internal.zzps r11, ik.d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.google.android.recaptcha.internal.zzaf
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.recaptcha.internal.zzaf r0 = (com.google.android.recaptcha.internal.zzaf) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzd = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzaf r0 = new com.google.android.recaptcha.internal.zzaf
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.zzb
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.zzd
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r5) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            java.lang.Object r11 = r0.zza
            com.google.android.recaptcha.internal.zzdf r11 = (com.google.android.recaptcha.internal.zzdf) r11
            p3.l0.Q0(r12)
            goto L_0x0085
        L_0x002f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0037:
            com.google.android.recaptcha.internal.zzdf r11 = r0.zze
            java.lang.Object r2 = r0.zza
            com.google.android.recaptcha.internal.zzag r2 = (com.google.android.recaptcha.internal.zzag) r2
            p3.l0.Q0(r12)
            goto L_0x0076
        L_0x0041:
            p3.l0.Q0(r12)
            com.google.android.recaptcha.internal.zzdf r12 = com.google.android.recaptcha.internal.zzab.zzc(r10)
            int r2 = r10.zze
            r6 = 3
            if (r2 != r6) goto L_0x008c
            long r6 = r11.zzf()
            r8 = 0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0058
            goto L_0x008c
        L_0x0058:
            com.google.android.recaptcha.internal.zziv r2 = r11.zzg()
            java.lang.String r2 = zzi(r2)
            r10.zzd = r2
            com.google.android.recaptcha.internal.zzap r2 = r10.zzb
            long r6 = r11.zzf()
            r0.zza = r10
            r0.zze = r12
            r0.zzd = r5
            java.lang.Object r11 = r2.zzd(r6, r0)
            if (r11 == r1) goto L_0x008b
            r2 = r10
            r11 = r12
        L_0x0076:
            com.google.android.recaptcha.internal.zzap r12 = r2.zzb
            r0.zza = r11
            r0.zze = r3
            r0.zzd = r4
            java.lang.Object r12 = r12.zze(r0)
            if (r12 != r1) goto L_0x0085
            goto L_0x008b
        L_0x0085:
            r11.zza()
            ek.i r11 = ek.i.f20112a
            return r11
        L_0x008b:
            return r1
        L_0x008c:
            r11 = 0
            r10.zzc = r11
            com.google.android.recaptcha.internal.zzbj r11 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbh r0 = com.google.android.recaptcha.internal.zzbh.zzb
            com.google.android.recaptcha.internal.zzbg r1 = com.google.android.recaptcha.internal.zzbg.zzac
            r11.<init>(r0, r1, r3)
            r12.zzb(r11)
            ek.i r11 = ek.i.f20112a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzag.zzd(com.google.android.recaptcha.internal.zzps, ik.d):java.lang.Object");
    }

    public final void zze(zzqf zzqf) {
        this.zzd = zzi(zzqf.zzf());
    }

    public final boolean zzf() {
        return this.zzc;
    }
}
