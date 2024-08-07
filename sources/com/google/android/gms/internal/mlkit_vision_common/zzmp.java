package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import c6.c;
import c6.d;
import c6.f;
import ca.o;
import d6.a;
import f6.t;
import f6.w;
import za.b;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
public final class zzmp implements zzmc {
    private b zza;
    private final b zzb;
    private final zzme zzc;

    public zzmp(Context context, zzme zzme) {
        this.zzc = zzme;
        a aVar = a.f8752e;
        w.b(context);
        t c10 = w.a().c(aVar);
        if (a.f8751d.contains(new c6.b("json"))) {
            this.zza = new o(new zzmm(c10));
        }
        this.zzb = new o(new zzmn(c10));
    }

    public static c zzb(zzme zzme, zzmb zzmb) {
        return new c6.a(zzmb.zzd(zzme.zza(), false), d.VERY_LOW);
    }

    public final void zza(zzmb zzmb) {
        if (this.zzc.zza() == 0) {
            b bVar = this.zza;
            if (bVar != null) {
                ((f) bVar.get()).a(zzb(this.zzc, zzmb));
                return;
            }
            return;
        }
        ((f) this.zzb.get()).a(zzb(this.zzc, zzmb));
    }
}
