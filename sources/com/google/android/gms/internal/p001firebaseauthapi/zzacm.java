package com.google.android.gms.internal.p001firebaseauthapi;

import ba.c0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzacm extends zzaez {
    private final EmailAuthCredential zza;

    public zzacm(EmailAuthCredential emailAuthCredential) {
        super(2);
        if (emailAuthCredential != null) {
            this.zza = emailAuthCredential;
            j.d("email cannot be null", emailAuthCredential.f7465a);
            j.d("password cannot be null", emailAuthCredential.f7466b);
            return;
        }
        throw new NullPointerException("credential cannot be null");
    }

    public final String zza() {
        return "linkEmailAuthCredential";
    }

    public final void zzb() {
        zzx zzS = zzadv.zzS(this.zzg, this.zzo);
        ((c0) this.zzi).b(this.zzn, zzS);
        zzm(new zzr(zzS));
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzady) {
        this.zzk = new zzaey(this, taskCompletionSource);
        EmailAuthCredential emailAuthCredential = this.zza;
        String str = emailAuthCredential.f7465a;
        String str2 = emailAuthCredential.f7466b;
        j.c(str2);
        zzady.zzn(str, str2, this.zzh.zzf(), this.zzf);
    }
}
