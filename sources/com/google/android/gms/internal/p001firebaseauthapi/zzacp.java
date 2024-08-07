package com.google.android.gms.internal.p001firebaseauthapi;

import ba.c0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzacp extends zzaez {
    private final EmailAuthCredential zza;

    public zzacp(EmailAuthCredential emailAuthCredential) {
        super(2);
        if (emailAuthCredential != null) {
            this.zza = emailAuthCredential;
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
        FirebaseUser firebaseUser = this.zzh;
        emailAuthCredential.getClass();
        emailAuthCredential.f7468d = firebaseUser.zzf();
        emailAuthCredential.f7469e = true;
        zzady.zzz(new zzaaa(emailAuthCredential, (String) null), this.zzf);
    }
}
