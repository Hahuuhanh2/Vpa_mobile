package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import j7.a;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzacc extends zzaez {
    private final String zza;
    private final String zzb;

    public zzacc(String str, String str2) {
        super(4);
        j.d("code cannot be null or empty", str);
        this.zza = str;
        this.zzb = str2;
    }

    public final String zza() {
        return "checkActionCode";
    }

    public final void zzb() {
        zzm(new a(this.zzq));
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzady) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzady.zzd(this.zza, this.zzb, this.zzf);
    }
}
