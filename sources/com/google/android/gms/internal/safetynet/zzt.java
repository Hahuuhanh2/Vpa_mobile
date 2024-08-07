package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import o7.c;
import v6.e;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
abstract class zzt extends zze<c> {
    public final zzg zza = new zzs(this);

    public zzt(com.google.android.gms.common.api.c cVar) {
        super(cVar);
    }

    public final /* bridge */ /* synthetic */ e createFailedResult(Status status) {
        return new zzad(status, false);
    }
}
