package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.safetynet.SafeBrowsingData;
import v6.e;

/* compiled from: com.google.android.gms:play-services-safetynet@@17.0.1 */
abstract class zzz extends zze<Object> {
    public final zzg zze = new zzy(this);

    public zzz(c cVar) {
        super(cVar);
    }

    public final /* bridge */ /* synthetic */ e createFailedResult(Status status) {
        return new zzac(status, (SafeBrowsingData) null);
    }
}
