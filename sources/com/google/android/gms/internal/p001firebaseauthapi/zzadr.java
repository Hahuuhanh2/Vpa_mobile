package com.google.android.gms.internal.p001firebaseauthapi;

import ba.c0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.UserProfileChangeRequest;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzadr extends zzaez {
    private final UserProfileChangeRequest zza;

    public zzadr(UserProfileChangeRequest userProfileChangeRequest) {
        super(2);
        if (userProfileChangeRequest != null) {
            this.zza = userProfileChangeRequest;
            return;
        }
        throw new NullPointerException("request cannot be null");
    }

    public final String zza() {
        return "updateProfile";
    }

    public final void zzb() {
        ((c0) this.zzi).b(this.zzn, zzadv.zzS(this.zzg, this.zzo));
        zzm((Object) null);
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzady) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzady.zzH(this.zzh.zzf(), this.zza, this.zzf);
    }
}
