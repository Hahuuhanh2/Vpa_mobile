package com.google.android.gms.internal.p001firebaseauthapi;

import ba.c0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.PhoneAuthCredential;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzadq extends zzaez {
    private final PhoneAuthCredential zza;

    public zzadq(PhoneAuthCredential phoneAuthCredential) {
        super(2);
        j.f(phoneAuthCredential);
        this.zza = phoneAuthCredential;
    }

    public final String zza() {
        return "updatePhoneNumber";
    }

    public final void zzb() {
        ((c0) this.zzi).b(this.zzn, zzadv.zzS(this.zzg, this.zzo));
        zzm((Object) null);
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzady) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzady.zzp(new zzzv(this.zzh.zzf(), this.zza), this.zzf);
    }
}
