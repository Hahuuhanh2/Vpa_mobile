package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzacd extends zzaez {
    private final zzzs zza;

    public zzacd(String str, String str2, String str3) {
        super(4);
        j.d("code cannot be null or empty", str);
        j.d("new password cannot be null or empty", str2);
        this.zza = new zzzs(str, str2, str3);
    }

    public final String zza() {
        return "confirmPasswordReset";
    }

    public final void zzb() {
        zzm((Object) null);
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzady) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzady.zze(this.zza, this.zzf);
    }
}
