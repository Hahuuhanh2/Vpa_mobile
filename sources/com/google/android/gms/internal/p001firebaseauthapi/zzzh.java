package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzzh extends ThreadLocal {
    public final /* synthetic */ zzzi zza;

    public zzzh(zzzi zzzi) {
        this.zza = zzzi;
    }

    /* renamed from: zza */
    public final Mac initialValue() {
        try {
            Mac mac = (Mac) zzyv.zzb.zza(this.zza.zzb);
            mac.init(this.zza.zzc);
            return mac;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
