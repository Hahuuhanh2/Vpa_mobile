package com.google.android.gms.internal.p001firebaseauthapi;

import ba.c0;
import com.google.android.gms.tasks.TaskCompletionSource;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzadp extends zzaez {
    private final String zza;

    public zzadp(String str) {
        super(2);
        j.d("password cannot be null or empty", str);
        this.zza = str;
    }

    public final String zza() {
        return "updatePassword";
    }

    public final void zzb() {
        ((c0) this.zzi).b(this.zzn, zzadv.zzS(this.zzg, this.zzo));
        zzm((Object) null);
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzady) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzady.zzc(this.zzh.zzf(), this.zza, this.zzf);
    }
}