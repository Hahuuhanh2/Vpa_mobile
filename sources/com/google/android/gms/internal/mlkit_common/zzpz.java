package com.google.android.gms.internal.mlkit_common;

import android.os.SystemClock;
import android.util.Log;
import kc.b;
import lc.k;
import lc.m;
import y6.e;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public final class zzpz {
    private static final e zza = new e("RemoteModelUtils", "");

    public static zzlk zza(b bVar, m mVar, zzpp zzpp) {
        zzlm zzlm;
        String str;
        long j10;
        String str2;
        k zzb = zzpp.zzb();
        bVar.getClass();
        zzlq zzlq = new zzlq();
        zzll zzll = new zzll();
        zzll.zzc((String) b.f12459a.get((Object) null));
        zzll.zzd(zzln.CLOUD);
        zzll.zza(zzag.zzb((String) null));
        int ordinal = zzb.ordinal();
        if (ordinal == 2) {
            zzlm = zzlm.BASE_TRANSLATE;
        } else if (ordinal == 4) {
            zzlm = zzlm.CUSTOM;
        } else if (ordinal != 5) {
            zzlm = zzlm.TYPE_UNKNOWN;
        } else {
            zzlm = zzlm.BASE_DIGITAL_INK;
        }
        zzll.zzb(zzlm);
        zzlq.zzb(zzll.zzg());
        zzlt zzc = zzlq.zzc();
        zzlh zzlh = new zzlh();
        zzlh.zzd(zzpp.zzc());
        zzlh.zzc(zzpp.zzd());
        zzlh.zzb(Long.valueOf((long) zzpp.zza()));
        zzlh.zzf(zzc);
        if (zzpp.zzg()) {
            long b10 = mVar.b(bVar);
            if (b10 == 0) {
                e eVar = zza;
                if (Log.isLoggable(eVar.f17554a, 5) && (str2 = eVar.f17555b) != null) {
                    str2.concat("Model downloaded without its beginning time recorded.");
                }
            } else {
                synchronized (mVar) {
                    j10 = mVar.c().getLong(String.format("model_first_use_time_%s", new Object[]{b.a()}), 0);
                }
                if (j10 == 0) {
                    j10 = SystemClock.elapsedRealtime();
                    synchronized (mVar) {
                        mVar.c().edit().putLong(String.format("model_first_use_time_%s", new Object[]{b.a()}), j10).apply();
                    }
                }
                zzlh.zzg(Long.valueOf(j10 - b10));
            }
        }
        if (zzpp.zzf()) {
            long b11 = mVar.b(bVar);
            if (b11 == 0) {
                e eVar2 = zza;
                if (Log.isLoggable(eVar2.f17554a, 5) && (str = eVar2.f17555b) != null) {
                    str.concat("Model downloaded without its beginning time recorded.");
                }
            } else {
                zzlh.zze(Long.valueOf(SystemClock.elapsedRealtime() - b11));
            }
        }
        return zzlh.zzi();
    }
}
