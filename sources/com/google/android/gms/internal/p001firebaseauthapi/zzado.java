package com.google.android.gms.internal.p001firebaseauthapi;

import ba.c0;
import com.google.android.gms.tasks.TaskCompletionSource;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzado  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzado extends zzaez {
    private final String zza;

    public zzado(String str) {
        super(2);
        j.d("email cannot be null or empty", str);
        this.zza = str;
    }

    public final String zza() {
        return "updateEmail";
    }

    public final void zzb() {
        ((c0) this.zzi).b(this.zzn, zzadv.zzS(this.zzg, this.zzo));
        zzm((Object) null);
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzady) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzady.zzb(this.zzh.zzf(), this.zza, this.zzf);
    }
}
