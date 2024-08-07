package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public final class zzpi implements zzpf {
    public final List zza;

    public zzpi(Context context, zzph zzph) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        if (zzph.zzc()) {
            arrayList.add(new zzpv(context, zzph));
        }
    }

    public final void zza(zzpe zzpe) {
        for (zzpf zza2 : this.zza) {
            zza2.zza(zzpe);
        }
    }
}