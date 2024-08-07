package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import lc.c;
import lc.g;
import lc.m;
import lc.q;
import s1.f;
import s1.j;
import y6.e;
import y6.h;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zzrl {
    private static zzcd zza;
    private static final zzcf zzb = zzcf.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzrb zze;
    private final m zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzrl(Context context, m mVar, zzrb zzrb, String str) {
        int i10;
        this.zzc = context.getPackageName();
        this.zzd = c.a(context);
        this.zzf = mVar;
        this.zze = zzrb;
        zzrx.zza();
        this.zzi = str;
        g a10 = g.a();
        zzrf zzrf = new zzrf(this);
        a10.getClass();
        this.zzg = g.b(zzrf);
        g a11 = g.a();
        mVar.getClass();
        zzrg zzrg = new zzrg(mVar);
        a11.getClass();
        this.zzh = g.b(zzrg);
        zzcf zzcf = zzb;
        if (zzcf.containsKey(str)) {
            i10 = DynamiteModule.d(context, (String) zzcf.get(str), false);
        } else {
            i10 = -1;
        }
        this.zzj = i10;
    }

    public static long zza(List list, double d10) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d10 / 100.0d) * ((double) list.size()))) - 1, 0))).longValue();
    }

    private static synchronized zzcd zzi() {
        synchronized (zzrl.class) {
            zzcd zzcd = zza;
            if (zzcd != null) {
                return zzcd;
            }
            j a10 = f.a(Resources.getSystem().getConfiguration());
            zzca zzca = new zzca();
            for (int i10 = 0; i10 < a10.e(); i10++) {
                Locale c10 = a10.c(i10);
                e eVar = c.f12908a;
                zzca.zzd(c10.toLanguageTag());
            }
            zzcd zzf2 = zzca.zzf();
            zza = zzf2;
            return zzf2;
        }
    }

    private final String zzj() {
        if (this.zzg.isSuccessful()) {
            return (String) this.zzg.getResult();
        }
        return h.f17558c.a(this.zzi);
    }

    private final boolean zzk(zzne zzne, long j10, long j11) {
        if (this.zzk.get(zzne) != null && j10 - ((Long) this.zzk.get(zzne)).longValue() <= TimeUnit.SECONDS.toMillis(30)) {
            return false;
        }
        return true;
    }

    public final String zzb() {
        return h.f17558c.a(this.zzi);
    }

    public final /* synthetic */ void zzc(zzra zzra, zzne zzne, String str) {
        String str2;
        zzra.zzb(zzne);
        String zzd2 = zzra.zzd();
        zzpx zzpx = new zzpx();
        zzpx.zzb(this.zzc);
        zzpx.zzc(this.zzd);
        zzpx.zzh(zzi());
        zzpx.zzg(Boolean.TRUE);
        zzpx.zzl(zzd2);
        zzpx.zzj(str);
        if (this.zzh.isSuccessful()) {
            str2 = (String) this.zzh.getResult();
        } else {
            str2 = this.zzf.a();
        }
        zzpx.zzi(str2);
        zzpx.zzd(10);
        zzpx.zzk(Integer.valueOf(this.zzj));
        zzra.zzc(zzpx);
        this.zze.zza(zzra);
    }

    public final void zzd(zzra zzra, zzne zzne) {
        zze(zzra, zzne, zzj());
    }

    public final void zze(zzra zzra, zzne zzne, String str) {
        Object obj = g.f12910b;
        q.f12936a.execute(new zzrh(this, zzra, zzne, str));
    }

    public final void zzf(zzrk zzrk, zzne zzne) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzne, elapsedRealtime, 30)) {
            this.zzk.put(zzne, Long.valueOf(elapsedRealtime));
            zze(zzrk.zza(), zzne, zzj());
        }
    }

    public final void zzg(zzne zzne, qc.g gVar) {
        zznc zznc;
        zzci zzci = (zzci) this.zzl.get(zzne);
        if (zzci != null) {
            for (Object next : zzci.zzo()) {
                ArrayList arrayList = new ArrayList(zzci.zzc(next));
                Collections.sort(arrayList);
                zzmh zzmh = new zzmh();
                Iterator it = arrayList.iterator();
                long j10 = 0;
                while (it.hasNext()) {
                    j10 += ((Long) it.next()).longValue();
                }
                zzmh.zza(Long.valueOf(j10 / ((long) arrayList.size())));
                zzmh.zzc(Long.valueOf(zza(arrayList, 100.0d)));
                zzmh.zzf(Long.valueOf(zza(arrayList, 75.0d)));
                zzmh.zzd(Long.valueOf(zza(arrayList, 50.0d)));
                zzmh.zzb(Long.valueOf(zza(arrayList, 25.0d)));
                zzmh.zze(Long.valueOf(zza(arrayList, 0.0d)));
                zzmj zzg2 = zzmh.zzg();
                int size = arrayList.size();
                qc.h hVar = gVar.f14420a;
                zzdz zzdz = (zzdz) next;
                hVar.getClass();
                zznf zznf = new zznf();
                if (hVar.f14428i) {
                    zznc = zznc.TYPE_THICK;
                } else {
                    zznc = zznc.TYPE_THIN;
                }
                zznf.zze(zznc);
                zzdw zzdw = new zzdw();
                zzdw.zza(Integer.valueOf(size));
                zzdw.zzc(zzdz);
                zzdw.zzb(zzg2);
                zznf.zzd(zzdw.zze());
                zze(zzro.zzf(zznf), zzne, zzj());
            }
            this.zzl.remove(zzne);
        }
    }

    public final /* synthetic */ void zzh(zzne zzne, Object obj, long j10, qc.g gVar) {
        if (!this.zzl.containsKey(zzne)) {
            this.zzl.put(zzne, zzbh.zzp());
        }
        ((zzci) this.zzl.get(zzne)).zzm(obj, Long.valueOf(j10));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzne, elapsedRealtime, 30)) {
            this.zzk.put(zzne, Long.valueOf(elapsedRealtime));
            Object obj2 = g.f12910b;
            q.f12936a.execute(new zzrj(this, zzne, gVar));
        }
    }
}
