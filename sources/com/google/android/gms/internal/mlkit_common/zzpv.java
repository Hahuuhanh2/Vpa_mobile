package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import c6.c;
import c6.d;
import c6.f;
import ca.o;
import d6.a;
import f6.t;
import f6.w;
import za.b;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public final class zzpv implements zzpf {
    private b zza;
    private final b zzb;
    private final zzph zzc;

    public zzpv(Context context, zzph zzph) {
        this.zzc = zzph;
        a aVar = a.f8752e;
        w.b(context);
        t c10 = w.a().c(aVar);
        if (a.f8751d.contains(new c6.b("json"))) {
            this.zza = new o(new zzps(c10));
        }
        this.zzb = new o(new zzpt(c10));
    }

    public static c zzb(zzph zzph, zzpe zzpe) {
        return new c6.a(zzpe.zze(zzph.zza(), false), d.VERY_LOW);
    }

    public final void zza(zzpe zzpe) {
        if (this.zzc.zza() == 0) {
            b bVar = this.zza;
            if (bVar != null) {
                ((f) bVar.get()).a(zzb(this.zzc, zzpe));
                return;
            }
            return;
        }
        ((f) this.zzb.get()).a(zzb(this.zzc, zzpe));
    }
}
