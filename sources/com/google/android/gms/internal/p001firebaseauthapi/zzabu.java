package com.google.android.gms.internal.p001firebaseauthapi;

import ba.g;
import com.google.firebase.auth.UserProfileChangeRequest;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzabu implements zzafe {
    public final /* synthetic */ UserProfileChangeRequest zza;
    public final /* synthetic */ zzadx zzb;
    public final /* synthetic */ zzabz zzc;

    public zzabu(zzabz zzabz, UserProfileChangeRequest userProfileChangeRequest, zzadx zzadx) {
        this.zzc = zzabz;
        this.zza = userProfileChangeRequest;
        this.zzb = zzadx;
    }

    public final void zza(String str) {
        this.zzb.zzh(g.a(str));
    }

    public final void zzb(Object obj) {
        zzahb zzahb = (zzahb) obj;
        zzahn zzahn = new zzahn();
        zzahn.zze(zzahb.zze());
        UserProfileChangeRequest userProfileChangeRequest = this.zza;
        if (userProfileChangeRequest.f7512c || userProfileChangeRequest.f7510a != null) {
            zzahn.zzc(userProfileChangeRequest.f7510a);
        }
        UserProfileChangeRequest userProfileChangeRequest2 = this.zza;
        if (userProfileChangeRequest2.f7513d || userProfileChangeRequest2.f7514e != null) {
            zzahn.zzh(userProfileChangeRequest2.f7511b);
        }
        zzabz.zze(this.zzc, this.zzb, zzahb, zzahn, this);
    }
}
