package com.google.android.recaptcha.internal;

import al.d0;
import android.content.Context;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import ik.d;
import j7.a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import sk.e;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzx extends zze {
    private final zzdc zza;
    /* access modifiers changed from: private */
    public final List zzb;
    /* access modifiers changed from: private */
    public zziv zzc;
    private final Map zzd = new LinkedHashMap();

    public /* synthetic */ zzx(zzbl zzbl, Context context, zzdc zzdc, zzbo zzbo, List list, int i10, e eVar) {
        zzdc zza2 = zzdc.zza();
        d0 zzc2 = zzbo.zzc();
        zzap zzap = new zzap(context, zzc2, zza2, IntegrityManagerFactory.createStandard(context), 28800000);
        List d02 = a.d0(new zzad(zzdc.zza()), new zzp(zzdc.zza(), zzbl), new zzm(zzdc.zza(), context.getContentResolver()), new zzn(zzdc.zza()), new zzag(zza2, context, zzc2, zzap, zzbz.zza(context)));
        this.zza = zzdc;
        this.zzb = d02;
    }

    public static final /* synthetic */ String zzo(zzx zzx, zzri zzri) {
        zziv zziv = zzx.zzc;
        if (zziv == null) {
            zziv = null;
        }
        byte[] zzd2 = zzri.zzd();
        return zzca.zza(zzhz.zzh().zzi(zzd2, 0, zzd2.length), zziv);
    }

    public static final /* synthetic */ String zzp(zzx zzx, zzrm zzrm) {
        zziv zziv = zzx.zzc;
        if (zziv == null) {
            zziv = null;
        }
        byte[] zzd2 = zzrm.zzd();
        return zzca.zza(zzhz.zzh().zzi(zzd2, 0, zzd2.length), zziv);
    }

    /* access modifiers changed from: private */
    public final zzpw zzt(String str) {
        zzqm zzqm = (zzqm) this.zzd.remove(str);
        zzpv zzf = zzpw.zzf();
        zzf.zzd(str);
        if (zzqm != null) {
            byte[] zzd2 = ((zzqn) zzqm.zzj()).zzd();
            String zzi = zzhz.zzh().zzi(zzd2, 0, zzd2.length);
            zzpt zzf2 = zzpu.zzf();
            zzf2.zzd(zzi);
            zzf.zze(zzf2);
        }
        return (zzpw) zzf.zzj();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzu(java.lang.String r5, com.google.android.recaptcha.internal.zzaa r6, ik.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzq
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.recaptcha.internal.zzq r0 = (com.google.android.recaptcha.internal.zzq) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzq r0 = new com.google.android.recaptcha.internal.zzq
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.zza
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p3.l0.Q0(r7)
            goto L_0x0041
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            p3.l0.Q0(r7)
            com.google.android.recaptcha.internal.zzr r7 = new com.google.android.recaptcha.internal.zzr
            r2 = 0
            r7.<init>(r6, r5, r4, r2)
            r0.zzc = r3
            java.lang.Object r7 = al.e0.b(r7, r0)
            if (r7 != r1) goto L_0x0041
            return r1
        L_0x0041:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzx.zzu(java.lang.String, com.google.android.recaptcha.internal.zzaa, ik.d):java.lang.Object");
    }

    public final zzdf zza(String str) {
        zzdc zzdc = this.zza;
        zzdc.zzc(str);
        return zzdc.zzf(35);
    }

    public final zzdf zzb() {
        zzdc zzdc = this.zza;
        zzdc.zzc(zzdc.zzd());
        return zzdc.zzf(34);
    }

    public final Object zzd(String str, d dVar) {
        return zzt(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzf(java.lang.String r5, ik.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzs
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.recaptcha.internal.zzs r0 = (com.google.android.recaptcha.internal.zzs) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzs r0 = new com.google.android.recaptcha.internal.zzs
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.zza
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p3.l0.Q0(r6)
            goto L_0x0041
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            p3.l0.Q0(r6)
            com.google.android.recaptcha.internal.zzu r6 = new com.google.android.recaptcha.internal.zzu
            r2 = 0
            r6.<init>(r5, r4, r2)
            r0.zzc = r3
            java.lang.Object r6 = al.e0.b(r6, r0)
            if (r6 != r1) goto L_0x0041
            return r1
        L_0x0041:
            ek.f r6 = (ek.f) r6
            java.lang.Object r5 = r6.f20104a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzx.zzf(java.lang.String, ik.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzh(com.google.android.recaptcha.internal.zzpq r5, ik.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzv
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.recaptcha.internal.zzv r0 = (com.google.android.recaptcha.internal.zzv) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzv r0 = new com.google.android.recaptcha.internal.zzv
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.zza
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p3.l0.Q0(r6)
            goto L_0x0041
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            p3.l0.Q0(r6)
            com.google.android.recaptcha.internal.zzw r6 = new com.google.android.recaptcha.internal.zzw
            r2 = 0
            r6.<init>(r5, r4, r2)
            r0.zzc = r3
            java.lang.Object r6 = al.e0.b(r6, r0)
            if (r6 != r1) goto L_0x0041
            return r1
        L_0x0041:
            ek.f r6 = (ek.f) r6
            java.lang.Object r5 = r6.f20104a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzx.zzh(com.google.android.recaptcha.internal.zzpq, ik.d):java.lang.Object");
    }

    public final void zzk(zzqf zzqf) {
        for (zzaa zze : this.zzb) {
            zze.zze(zzqf);
        }
    }

    public final Map zzr() {
        return this.zzd;
    }
}
