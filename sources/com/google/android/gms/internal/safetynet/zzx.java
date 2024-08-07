package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.safetynet.zzf;
import v6.e;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
abstract class zzx extends zze<Object> {
    public final zzg zzb = new zzw(this);

    public zzx(c cVar) {
        super(cVar);
    }

    public final /* bridge */ /* synthetic */ e createFailedResult(Status status) {
        return new zzab(status, (zzf) null);
    }
}
