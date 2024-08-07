package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzalb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzalb extends zzald {
    private zzalb() {
        super((zzalc) null);
    }

    public /* synthetic */ zzalb(zzala zzala) {
        super((zzalc) null);
    }

    public final List zza(Object obj, long j10) {
        int i10;
        zzakp zzakp = (zzakp) zzanf.zzf(obj, j10);
        if (zzakp.zzc()) {
            return zzakp;
        }
        int size = zzakp.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        zzakp zzd = zzakp.zzd(i10);
        zzanf.zzs(obj, j10, zzd);
        return zzd;
    }

    public final void zzb(Object obj, long j10) {
        ((zzakp) zzanf.zzf(obj, j10)).zzb();
    }

    public final void zzc(Object obj, Object obj2, long j10) {
        zzakp zzakp = (zzakp) zzanf.zzf(obj, j10);
        zzakp zzakp2 = (zzakp) zzanf.zzf(obj2, j10);
        int size = zzakp.size();
        int size2 = zzakp2.size();
        if (size > 0 && size2 > 0) {
            if (!zzakp.zzc()) {
                zzakp = zzakp.zzd(size2 + size);
            }
            zzakp.addAll(zzakp2);
        }
        if (size > 0) {
            zzakp2 = zzakp;
        }
        zzanf.zzs(obj, j10, zzakp2);
    }
}
