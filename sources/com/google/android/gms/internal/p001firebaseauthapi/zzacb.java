package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzacb extends zzaez {
    private final String zza;
    private final String zzb;

    public zzacb(String str, String str2) {
        super(7);
        j.d("code cannot be null or empty", str);
        this.zza = str;
        this.zzb = str2;
    }

    public final String zza() {
        return "applyActionCode";
    }

    public final void zzb() {
        zzm((Object) null);
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzady) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzady.zza(this.zza, this.zzb, this.zzf);
    }
}
