package com.google.android.gms.internal.p001firebaseauthapi;

import ba.c0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import m9.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzadd extends zzaez {
    private final zzaic zza;

    public zzadd(AuthCredential authCredential, String str) {
        super(2);
        if (authCredential != null) {
            this.zza = b.k0(authCredential, str);
            return;
        }
        throw new NullPointerException("credential cannot be null");
    }

    public final String zza() {
        return "signInWithCredential";
    }

    public final void zzb() {
        zzx zzS = zzadv.zzS(this.zzg, this.zzo);
        ((c0) this.zzi).b(this.zzn, zzS);
        zzm(new zzr(zzS));
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzady) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzady.zzw(this.zza, this.zzf);
    }
}
