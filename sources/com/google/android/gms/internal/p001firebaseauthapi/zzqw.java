package com.google.android.gms.internal.p001firebaseauthapi;

import android.support.v4.media.a;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqw  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzqw implements zzcm {
    private static final zzqw zza = new zzqw();
    private static final zzof zzb = zzof.zzb(zzqt.zza, zzni.class, zzcd.class);

    public static void zzd() {
        zzcq.zzh(zza);
        zznq.zza().zze(zzb);
    }

    public final Class zza() {
        return zzcd.class;
    }

    public final Class zzb() {
        return zzcd.class;
    }

    public final /* bridge */ /* synthetic */ Object zzc(zzcl zzcl) {
        for (List it : zzcl.zzd()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    zzch zzch = (zzch) it2.next();
                    if (zzch.zzb() instanceof zzqr) {
                        zzqr zzqr = (zzqr) zzch.zzb();
                        zzzo zzb2 = zzzo.zzb(zzch.zzg());
                        if (!zzb2.equals(zzqr.zzc())) {
                            String valueOf = String.valueOf(zzqr.zzb());
                            String zzzo = zzqr.zzc().toString();
                            throw new GeneralSecurityException(a.o(a.r("Mac Key with parameters ", valueOf, " has wrong output prefix (", zzzo, ") instead of ("), zzb2.toString(), ")"));
                        }
                    }
                }
            }
        }
        return new zzqv(zzcl, (zzqu) null);
    }
}
