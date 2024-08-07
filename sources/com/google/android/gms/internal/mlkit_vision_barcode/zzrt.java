package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import c6.c;
import c6.d;
import c6.f;
import ca.o;
import d6.a;
import f6.t;
import f6.w;
import za.b;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zzrt implements zzrb {
    private b zza;
    private final b zzb;
    private final zzrd zzc;

    public zzrt(Context context, zzrd zzrd) {
        this.zzc = zzrd;
        a aVar = a.f8752e;
        w.b(context);
        t c10 = w.a().c(aVar);
        if (a.f8751d.contains(new c6.b("json"))) {
            this.zza = new o(new zzrq(c10));
        }
        this.zzb = new o(new zzrr(c10));
    }

    public static c zzb(zzrd zzrd, zzra zzra) {
        int zza2 = zzrd.zza();
        if (zzra.zza() != 0) {
            return new c6.a(zzra.zze(zza2, false), d.DEFAULT);
        }
        return new c6.a(zzra.zze(zza2, false), d.VERY_LOW);
    }

    public final void zza(zzra zzra) {
        if (this.zzc.zza() == 0) {
            b bVar = this.zza;
            if (bVar != null) {
                ((f) bVar.get()).a(zzb(this.zzc, zzra));
                return;
            }
            return;
        }
        ((f) this.zzb.get()).a(zzb(this.zzc, zzra));
    }
}
