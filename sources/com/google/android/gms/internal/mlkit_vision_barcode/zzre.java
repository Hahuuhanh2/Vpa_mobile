package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
public final class zzre implements zzrb {
    public final List zza;

    public zzre(Context context, zzrd zzrd) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        if (zzrd.zzc()) {
            arrayList.add(new zzrt(context, zzrd));
        }
    }

    public final void zza(zzra zzra) {
        for (zzrb zza2 : this.zza) {
            zza2.zza(zzra);
        }
    }
}
