package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.safetynet.zzd;
import v6.e;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
abstract class zzv extends zze<Object> {
    public final zzg zza = new zzu(this);

    public zzv(c cVar) {
        super(cVar);
    }

    public final /* bridge */ /* synthetic */ e createFailedResult(Status status) {
        return new zzaa(status, (zzd) null);
    }
}
