package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.ActionCodeSettings;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzada  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzada extends zzaez {
    private final zzzx zza;
    private final String zzb;

    public zzada(String str, ActionCodeSettings actionCodeSettings, String str2, String str3, String str4) {
        super(4);
        j.d("email cannot be null or empty", str);
        this.zza = new zzzx(str, actionCodeSettings, str2, str3);
        this.zzb = str4;
    }

    public final String zza() {
        return this.zzb;
    }

    public final void zzb() {
        zzm((Object) null);
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzady) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzady.zzs(this.zza, this.zzf);
    }
}
