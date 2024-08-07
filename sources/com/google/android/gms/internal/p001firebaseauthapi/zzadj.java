package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzag;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzadj extends zzaez {
    private final zzahx zza;

    public zzadj(zzag zzag, String str) {
        super(12);
        j.f(zzag);
        String str2 = zzag.f7523a;
        j.c(str2);
        this.zza = zzahx.zzb(str2, str);
    }

    public final String zza() {
        return "startMfaEnrollment";
    }

    public final void zzb() {
        zzm(this.zzz);
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzady) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzady.zzD(this.zza, this.zzf);
    }
}
