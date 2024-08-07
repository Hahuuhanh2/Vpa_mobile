package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.ActionCodeSettings;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzacz extends zzaez {
    private final zzzw zza;

    public zzacz(String str, ActionCodeSettings actionCodeSettings) {
        super(6);
        j.d("token cannot be null or empty", str);
        this.zza = new zzzw(str, actionCodeSettings);
    }

    public final String zza() {
        return "sendEmailVerification";
    }

    public final void zzb() {
        zzm((Object) null);
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzady) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzady.zzr(this.zza, this.zzf);
    }
}
