package com.google.android.gms.internal.p001firebaseauthapi;

import ba.c0;
import com.google.android.gms.tasks.TaskCompletionSource;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzadl extends zzaez {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzadl(String str, String str2, String str3) {
        super(2);
        j.c(str);
        this.zza = str;
        j.c(str2);
        this.zzb = str2;
        this.zzc = str3;
    }

    public final String zza() {
        return "unenrollMfa";
    }

    public final void zzb() {
        ((c0) this.zzi).b(this.zzn, zzadv.zzS(this.zzg, this.zzo));
        zzm((Object) null);
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzady) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzady.zzE(this.zza, this.zzb, this.zzc, this.zzf);
    }
}
