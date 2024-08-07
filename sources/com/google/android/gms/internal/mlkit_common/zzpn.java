package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kc.b;
import lc.c;
import lc.g;
import lc.k;
import lc.m;
import lc.q;
import s1.f;
import s1.j;
import y6.e;
import y6.h;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public final class zzpn {
    private static zzar zza;
    private static final zzau zzb = zzau.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzpf zze;
    private final m zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzpn(Context context, m mVar, zzpf zzpf, String str) {
        int i10;
        this.zzc = context.getPackageName();
        this.zzd = c.a(context);
        this.zzf = mVar;
        this.zze = zzpf;
        zzqb.zza();
        this.zzi = str;
        g a10 = g.a();
        zzpj zzpj = new zzpj(this);
        a10.getClass();
        this.zzg = g.b(zzpj);
        g a11 = g.a();
        mVar.getClass();
        zzpk zzpk = new zzpk(mVar);
        a11.getClass();
        this.zzh = g.b(zzpk);
        zzau zzau = zzb;
        if (zzau.containsKey(str)) {
            i10 = DynamiteModule.d(context, (String) zzau.get(str), false);
        } else {
            i10 = -1;
        }
        this.zzj = i10;
    }

    private static synchronized zzar zzh() {
        synchronized (zzpn.class) {
            zzar zzar = zza;
            if (zzar != null) {
                return zzar;
            }
            j a10 = f.a(Resources.getSystem().getConfiguration());
            zzao zzao = new zzao();
            for (int i10 = 0; i10 < a10.e(); i10++) {
                Locale c10 = a10.c(i10);
                e eVar = c.f12908a;
                zzao.zzb(c10.toLanguageTag());
            }
            zzar zzc2 = zzao.zzc();
            zza = zzc2;
            return zzc2;
        }
    }

    private final zznz zzi(String str, String str2) {
        String str3;
        zznz zznz = new zznz();
        zznz.zzb(this.zzc);
        zznz.zzc(this.zzd);
        zznz.zzh(zzh());
        zznz.zzg(Boolean.TRUE);
        zznz.zzl(str);
        zznz.zzj(str2);
        if (this.zzh.isSuccessful()) {
            str3 = (String) this.zzh.getResult();
        } else {
            str3 = this.zzf.a();
        }
        zznz.zzi(str3);
        zznz.zzd(10);
        zznz.zzk(Integer.valueOf(this.zzj));
        return zznz;
    }

    private final String zzj() {
        if (this.zzg.isSuccessful()) {
            return (String) this.zzg.getResult();
        }
        return h.f17558c.a(this.zzi);
    }

    public final String zza() {
        return h.f17558c.a(this.zzi);
    }

    public final /* synthetic */ void zzb(zzpe zzpe, zzld zzld, String str) {
        zzpe.zza(zzld);
        zzpe.zzc(zzi(zzpe.zzd(), str));
        this.zze.zza(zzpe);
    }

    public final /* synthetic */ void zzc(zzpe zzpe, zzpp zzpp, b bVar) {
        zzpe.zza(zzld.MODEL_DOWNLOAD);
        zzpe.zzc(zzi(zzpp.zze(), zzj()));
        zzpe.zzb(zzpz.zza(bVar, this.zzf, zzpp));
        this.zze.zza(zzpe);
    }

    public final void zzd(zzpe zzpe, zzld zzld) {
        String zzj2 = zzj();
        Object obj = g.f12910b;
        q.f12936a.execute(new zzpl(this, zzpe, zzld, zzj2));
    }

    public final void zze(zzpe zzpe, b bVar, boolean z10, int i10) {
        zzpo zzh2 = zzpp.zzh();
        zzh2.zzf(false);
        bVar.getClass();
        zzh2.zzd((k) null);
        zzh2.zza(zzli.FAILED);
        zzh2.zzb(zzlc.DOWNLOAD_FAILED);
        zzh2.zzc(i10);
        zzg(zzpe, bVar, zzh2.zzh());
    }

    public final void zzf(zzpe zzpe, b bVar, zzlc zzlc, boolean z10, k kVar, zzli zzli) {
        zzpo zzh2 = zzpp.zzh();
        zzh2.zzf(z10);
        zzh2.zzd(kVar);
        zzh2.zzb(zzlc);
        zzh2.zza(zzli);
        zzg(zzpe, bVar, zzh2.zzh());
    }

    public final void zzg(zzpe zzpe, b bVar, zzpp zzpp) {
        Object obj = g.f12910b;
        q.f12936a.execute(new zzpm(this, zzpe, zzpp, bVar));
    }
}
