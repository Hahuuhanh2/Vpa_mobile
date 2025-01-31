package com.google.android.gms.internal.p001firebaseauthapi;

import ba.c0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import m9.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzacn extends zzaez {
    private final zzaic zza;

    public zzacn(AuthCredential authCredential) {
        super(2);
        if (authCredential != null) {
            this.zza = b.k0(authCredential, (String) null);
            return;
        }
        throw new NullPointerException("credential cannot be null");
    }

    public final String zza() {
        return "linkFederatedCredential";
    }

    public final void zzb() {
        zzx zzS = zzadv.zzS(this.zzg, this.zzo);
        ((c0) this.zzi).b(this.zzn, zzS);
        zzm(new zzr(zzS));
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzady) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzady.zzo(this.zzh.zzf(), this.zza, this.zzf);
    }
}
