package com.google.android.recaptcha.internal;

import al.r;
import android.content.Context;
import android.webkit.WebView;
import ek.i;
import fk.p;
import ik.d;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.TimeoutCancellationException;
import sk.j;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzgv extends zze {
    public r zza;
    public zzdv zzb;
    private final WebView zzc;
    private final Context zzd;
    private final zzbv zze;
    private final zzdc zzf;
    private final zzdq zzg;
    /* access modifiers changed from: private */
    public final Map zzh = zzgw.zza();
    /* access modifiers changed from: private */
    public final Map zzi = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final zzgz zzj = zzgz.zzc();
    private final zzgo zzk;
    /* access modifiers changed from: private */
    public final zzdc zzl;
    /* access modifiers changed from: private */
    public zzdf zzm;
    /* access modifiers changed from: private */
    public final zzbo zzn;

    public zzgv(WebView webView, Context context, zzbv zzbv, zzdc zzdc, zzbo zzbo, zzdq zzdq) {
        this.zzc = webView;
        this.zzd = context;
        this.zze = zzbv;
        this.zzf = zzdc;
        this.zzn = zzbo;
        this.zzg = zzdq;
        zzgo zzgo = new zzgo(this);
        this.zzk = zzgo;
        zzdc zza2 = zzdc.zza();
        zza2.zzc(zzdc.zzd());
        this.zzl = zza2;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(zzgo, "RN");
        webView.setWebViewClient(new zzgp(this));
    }

    public static final /* synthetic */ void zzv(zzgv zzgv, String str) {
        zzgv.zzm = zzgv.zzl.zzf(26);
        try {
            zzgv.zzc.loadDataWithBaseURL(zzgv.zze.zza(), str, "text/html", "utf-8", (String) null);
        } catch (Exception unused) {
            zzbj zzbj = new zzbj(zzbh.zzb, zzbg.zzU, (String) null);
            zzdf zzdf = zzgv.zzm;
            if (zzdf != null) {
                zzdf.zzb(zzbj);
            }
            zzgv.zzm = null;
            zzgv.zzu().z(zzbj);
        }
    }

    public final zzdf zza(String str) {
        zzdc zzdc = this.zzf;
        zzdc.zzc(str);
        return zzdc.zzf(33);
    }

    public final zzdf zzb() {
        zzdc zzdc = this.zzf;
        zzdc.zzc(zzdc.zzd());
        return zzdc.zzf(32);
    }

    public final Object zzd(String str, d dVar) {
        zzpv zzf2 = zzpw.zzf();
        zzf2.zzd(str);
        return zzf2.zzj();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzf(java.lang.String r8, ik.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzgs
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.recaptcha.internal.zzgs r0 = (com.google.android.recaptcha.internal.zzgs) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzgs r0 = new com.google.android.recaptcha.internal.zzgs
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.zza
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.String r8 = r0.zze
            com.google.android.recaptcha.internal.zzgv r0 = r0.zzd
            p3.l0.Q0(r9)     // Catch:{ Exception -> 0x002b }
            goto L_0x007b
        L_0x002b:
            r9 = move-exception
            goto L_0x00ad
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
            p3.l0.Q0(r9)
            al.s r9 = p3.l0.c()     // Catch:{ Exception -> 0x00ab }
            java.util.Map r2 = r7.zzi     // Catch:{ Exception -> 0x00ab }
            r2.put(r8, r9)     // Catch:{ Exception -> 0x00ab }
            com.google.android.recaptcha.internal.zzqw r2 = com.google.android.recaptcha.internal.zzqx.zzf()     // Catch:{ Exception -> 0x00ab }
            r2.zzd(r8)     // Catch:{ Exception -> 0x00ab }
            com.google.android.recaptcha.internal.zzks r2 = r2.zzj()     // Catch:{ Exception -> 0x00ab }
            com.google.android.recaptcha.internal.zzqx r2 = (com.google.android.recaptcha.internal.zzqx) r2     // Catch:{ Exception -> 0x00ab }
            byte[] r2 = r2.zzd()     // Catch:{ Exception -> 0x00ab }
            com.google.android.recaptcha.internal.zzhz r4 = com.google.android.recaptcha.internal.zzhz.zzh()     // Catch:{ Exception -> 0x00ab }
            r5 = 0
            int r6 = r2.length     // Catch:{ Exception -> 0x00ab }
            java.lang.String r2 = r4.zzi(r2, r5, r6)     // Catch:{ Exception -> 0x00ab }
            com.google.android.recaptcha.internal.zzbo r4 = r7.zzn     // Catch:{ Exception -> 0x00ab }
            al.d0 r4 = r4.zzb()     // Catch:{ Exception -> 0x00ab }
            com.google.android.recaptcha.internal.zzgt r5 = new com.google.android.recaptcha.internal.zzgt     // Catch:{ Exception -> 0x00ab }
            r6 = 0
            r5.<init>(r7, r2, r6)     // Catch:{ Exception -> 0x00ab }
            r2 = 3
            p3.l0.j0(r4, r6, r5, r2)     // Catch:{ Exception -> 0x00ab }
            r0.zzd = r7     // Catch:{ Exception -> 0x00ab }
            r0.zze = r8     // Catch:{ Exception -> 0x00ab }
            r0.zzc = r3     // Catch:{ Exception -> 0x00ab }
            java.lang.Object r9 = r9.await(r0)     // Catch:{ Exception -> 0x00ab }
            if (r9 != r1) goto L_0x007a
            return r1
        L_0x007a:
            r0 = r7
        L_0x007b:
            com.google.android.recaptcha.internal.zzpw r9 = (com.google.android.recaptcha.internal.zzpw) r9     // Catch:{ Exception -> 0x002b }
            com.google.android.recaptcha.internal.zzkm r1 = r9.zzq()     // Catch:{ Exception -> 0x002b }
            com.google.android.recaptcha.internal.zzpv r1 = (com.google.android.recaptcha.internal.zzpv) r1     // Catch:{ Exception -> 0x002b }
            com.google.android.recaptcha.internal.zzpz r2 = com.google.android.recaptcha.internal.zzqa.zzf()     // Catch:{ Exception -> 0x002b }
            java.lang.String r3 = r9.zzJ()     // Catch:{ Exception -> 0x002b }
            r2.zzd(r3)     // Catch:{ Exception -> 0x002b }
            r1.zzp(r2)     // Catch:{ Exception -> 0x002b }
            com.google.android.recaptcha.internal.zzpx r2 = com.google.android.recaptcha.internal.zzpy.zzf()     // Catch:{ Exception -> 0x002b }
            java.lang.String r3 = r9.zzj()     // Catch:{ Exception -> 0x002b }
            r2.zzd(r3)     // Catch:{ Exception -> 0x002b }
            java.lang.String r9 = r9.zzK()     // Catch:{ Exception -> 0x002b }
            r2.zze(r9)     // Catch:{ Exception -> 0x002b }
            r1.zzq(r2)     // Catch:{ Exception -> 0x002b }
            com.google.android.recaptcha.internal.zzks r8 = r1.zzj()     // Catch:{ Exception -> 0x002b }
            goto L_0x00d3
        L_0x00ab:
            r9 = move-exception
            r0 = r7
        L_0x00ad:
            java.lang.Class r1 = r9.getClass()
            com.google.android.recaptcha.internal.zzbj r2 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbh r3 = com.google.android.recaptcha.internal.zzbh.zzb
            com.google.android.recaptcha.internal.zzbg r4 = com.google.android.recaptcha.internal.zzbg.zzW
            java.lang.String r1 = r1.getSimpleName()
            r2.<init>(r3, r4, r1)
            com.google.android.recaptcha.internal.zzbj r9 = com.google.android.recaptcha.internal.zzf.zza(r9, r2)
            java.util.Map r0 = r0.zzi
            java.lang.Object r8 = r0.remove(r8)
            al.r r8 = (al.r) r8
            if (r8 == 0) goto L_0x00cf
            r8.z(r9)
        L_0x00cf:
            ek.f$a r8 = p3.l0.A(r9)
        L_0x00d3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzgv.zzf(java.lang.String, ik.d):java.lang.Object");
    }

    public final Object zzg(zzbj zzbj, d dVar) {
        if (j.a(zzbj.zza(), zzbg.zzb)) {
            zzdf zzdf = this.zzm;
            if (zzdf != null) {
                zzdf.zzb(zzbj);
            }
            this.zzm = null;
        }
        return i.f20112a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zzh(com.google.android.recaptcha.internal.zzpq r6, ik.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzgu
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.recaptcha.internal.zzgu r0 = (com.google.android.recaptcha.internal.zzgu) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.internal.zzgu r0 = new com.google.android.recaptcha.internal.zzgu
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.zza
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p3.l0.Q0(r7)     // Catch:{ Exception -> 0x008b }
            goto L_0x0087
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002f:
            p3.l0.Q0(r7)
            com.google.android.recaptcha.internal.zzcb r7 = new com.google.android.recaptcha.internal.zzcb     // Catch:{ Exception -> 0x008b }
            com.google.android.recaptcha.internal.zziv r2 = r6.zzf()     // Catch:{ Exception -> 0x008b }
            r7.<init>(r2)     // Catch:{ Exception -> 0x008b }
            com.google.android.recaptcha.internal.zzea r7 = r5.zzy(r6, r7)     // Catch:{ Exception -> 0x008b }
            r5.zzb = r7     // Catch:{ Exception -> 0x008b }
            al.s r7 = p3.l0.c()     // Catch:{ Exception -> 0x008b }
            r5.zza = r7     // Catch:{ Exception -> 0x008b }
            al.r r7 = r5.zzu()     // Catch:{ Exception -> 0x008b }
            int r7 = r7.hashCode()     // Catch:{ Exception -> 0x008b }
            java.lang.Integer r2 = new java.lang.Integer     // Catch:{ Exception -> 0x008b }
            r2.<init>(r7)     // Catch:{ Exception -> 0x008b }
            com.google.android.recaptcha.internal.zzgz r7 = r5.zzj     // Catch:{ Exception -> 0x008b }
            r7.zzd()     // Catch:{ Exception -> 0x008b }
            com.google.android.recaptcha.internal.zzgz r7 = r5.zzj     // Catch:{ Exception -> 0x008b }
            r7.zze()     // Catch:{ Exception -> 0x008b }
            com.google.android.recaptcha.internal.zzbo r7 = r5.zzn     // Catch:{ Exception -> 0x008b }
            al.d0 r7 = r7.zza()     // Catch:{ Exception -> 0x008b }
            com.google.android.recaptcha.internal.zzgr r2 = new com.google.android.recaptcha.internal.zzgr     // Catch:{ Exception -> 0x008b }
            r4 = 0
            r2.<init>(r5, r6, r4)     // Catch:{ Exception -> 0x008b }
            r6 = 3
            p3.l0.j0(r7, r4, r2, r6)     // Catch:{ Exception -> 0x008b }
            al.r r6 = r5.zzu()     // Catch:{ Exception -> 0x008b }
            int r6 = r6.hashCode()     // Catch:{ Exception -> 0x008b }
            java.lang.Integer r7 = new java.lang.Integer     // Catch:{ Exception -> 0x008b }
            r7.<init>(r6)     // Catch:{ Exception -> 0x008b }
            al.r r6 = r5.zzu()     // Catch:{ Exception -> 0x008b }
            r0.zzc = r3     // Catch:{ Exception -> 0x008b }
            java.lang.Object r6 = r6.await(r0)     // Catch:{ Exception -> 0x008b }
            if (r6 == r1) goto L_0x008a
        L_0x0087:
            ek.i r6 = ek.i.f20112a     // Catch:{ Exception -> 0x008b }
            goto L_0x00a8
        L_0x008a:
            return r1
        L_0x008b:
            r6 = move-exception
            r6.getMessage()
            java.lang.Class r7 = r6.getClass()
            com.google.android.recaptcha.internal.zzbj r0 = new com.google.android.recaptcha.internal.zzbj
            com.google.android.recaptcha.internal.zzbh r1 = com.google.android.recaptcha.internal.zzbh.zzb
            com.google.android.recaptcha.internal.zzbg r2 = com.google.android.recaptcha.internal.zzbg.zzV
            java.lang.String r7 = r7.getSimpleName()
            r0.<init>(r1, r2, r7)
            com.google.android.recaptcha.internal.zzbj r6 = com.google.android.recaptcha.internal.zzf.zza(r6, r0)
            ek.f$a r6 = p3.l0.A(r6)
        L_0x00a8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzgv.zzh(com.google.android.recaptcha.internal.zzpq, ik.d):java.lang.Object");
    }

    public final Object zzi(String str, long j10, Exception exc, d dVar) {
        r rVar = (r) this.zzi.remove(str);
        if (rVar != null) {
            rVar.z(exc);
        }
        return i.f20112a;
    }

    public final Object zzj(Exception exc, d dVar) {
        Long zza2 = this.zzk.zza();
        if ((exc instanceof TimeoutCancellationException) && zza2 == null) {
            return new zzbj(zzbh.zzc, zzbg.zzH, (String) null);
        }
        return zzf.zza(exc, new zzbj(zzbh.zzb, zzbg.zzV, exc.getClass().getSimpleName()));
    }

    public final WebView zzm() {
        return this.zzc;
    }

    public final zzdq zzp() {
        return this.zzg;
    }

    public final zzgo zzq() {
        return this.zzk;
    }

    public final r zzu() {
        r rVar = this.zza;
        if (rVar != null) {
            return rVar;
        }
        return null;
    }

    public final zzea zzy(zzpq zzpq, zzcb zzcb) {
        zzed zzed = new zzed(this.zzc, this.zzn.zzb());
        zzgf zzgf = new zzgf();
        zzgf.zzb(p.a1(zzpq.zzN()));
        zzem zzem = new zzem(zzed, zzcb, new zzbu());
        zzgg zzgg = new zzgg(zzgf, new zzgd());
        zzem.zze(3, this.zzd);
        zzem.zze(5, zzgm.class.getMethod("cs", new Class[]{new Object[0].getClass()}));
        zzem.zze(6, new zzgh(this.zzd));
        zzem.zze(7, new zzgj());
        zzem.zze(8, new zzgn(this.zzd));
        zzem.zze(9, new zzgk(this.zzd));
        zzem.zze(10, new zzgi(this.zzd));
        return new zzea(this.zzn.zzd(), zzem, zzgg, zzdu.zza());
    }
}
