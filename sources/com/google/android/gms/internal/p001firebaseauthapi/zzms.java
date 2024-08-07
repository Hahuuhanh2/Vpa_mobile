package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzms  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzms {
    public final Map zza = new HashMap();
    public final Map zzb = new HashMap();

    private zzms() {
    }

    public final zzms zza(Enum enumR, Object obj) {
        this.zza.put(enumR, obj);
        this.zzb.put(obj, enumR);
        return this;
    }

    public final zzmu zzb() {
        return new zzmu(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), (zzmt) null);
    }

    public /* synthetic */ zzms(zzmr zzmr) {
    }
}
