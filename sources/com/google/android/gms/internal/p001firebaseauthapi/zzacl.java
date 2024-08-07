package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzacl extends zzaez {
    private final zzzu zza;

    public zzacl(String str, String str2) {
        super(10);
        j.c("RECAPTCHA_ENTERPRISE");
        this.zza = new zzzu(str, "RECAPTCHA_ENTERPRISE");
    }

    public final String zza() {
        return "getRecaptchaConfig";
    }

    public final void zzb() {
        zzm(this.zzx);
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzady) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzady.zzm(this.zza, this.zzf);
    }
}
