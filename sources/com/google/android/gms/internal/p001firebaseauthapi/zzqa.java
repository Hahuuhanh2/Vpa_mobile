package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqa  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzqa implements zzcm {
    private static final zzqa zza = new zzqa();

    private zzqa() {
    }

    public static void zzd() {
        zzcq.zzh(zza);
    }

    public final Class zza() {
        return zzpx.class;
    }

    public final Class zzb() {
        return zzpx.class;
    }

    public final /* bridge */ /* synthetic */ Object zzc(zzcl zzcl) {
        if (zzcl.zza() != null) {
            for (List<zzch> it : zzcl.zzd()) {
                for (zzch zzd : it) {
                    zzpx zzpx = (zzpx) zzd.zzd();
                }
            }
            return new zzpz(zzcl, (zzpy) null);
        }
        throw new GeneralSecurityException("no primary in primitive set");
    }
}
