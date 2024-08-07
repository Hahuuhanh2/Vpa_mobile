package com.google.android.gms.internal.p001firebaseauthapi;

import android.app.PendingIntent;
import ba.c0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import m9.b;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzacr extends zzaez {
    private final zzaic zza;

    public zzacr(AuthCredential authCredential, String str) {
        super(2);
        if (authCredential != null) {
            zzaic k02 = b.k0(authCredential, str);
            k02.zzb(false);
            this.zza = k02;
            return;
        }
        throw new NullPointerException("credential cannot be null");
    }

    public final String zza() {
        return "reauthenticateWithCredentialWithData";
    }

    public final void zzb() {
        zzx zzS = zzadv.zzS(this.zzg, this.zzo);
        if (this.zzh.S0().equalsIgnoreCase(zzS.f7545b.f7536a)) {
            ((c0) this.zzi).b(this.zzn, zzS);
            zzm(new zzr(zzS));
            return;
        }
        zzl(new Status(17024, (String) null, (PendingIntent) null, (ConnectionResult) null));
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzady) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzady.zzw(this.zza, this.zzf);
    }
}
