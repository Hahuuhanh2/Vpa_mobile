package com.google.android.gms.internal.p001firebaseauthapi;

import ba.c0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzadc extends zzaez {
    private final String zza;

    public zzadc(String str) {
        super(2);
        this.zza = str;
    }

    public final String zza() {
        return "signInAnonymously";
    }

    public final void zzb() {
        zzx zzS = zzadv.zzS(this.zzg, this.zzo);
        ((c0) this.zzi).b(this.zzn, zzS);
        zzm(new zzr(zzS));
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzady) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzady.zzv(this.zza, this.zzf);
    }
}
