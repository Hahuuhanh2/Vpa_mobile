package com.google.android.gms.internal.p001firebaseauthapi;

import android.app.PendingIntent;
import ba.c0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzact  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzact extends zzaez {
    private final zzaaa zza;

    public zzact(EmailAuthCredential emailAuthCredential, String str) {
        super(2);
        if (emailAuthCredential != null) {
            this.zza = new zzaaa(emailAuthCredential, str);
            return;
        }
        throw new NullPointerException("credential cannot be null or empty");
    }

    public final String zza() {
        return "reauthenticateWithEmailLinkWithData";
    }

    public final void zzb() {
        zzx zzS = zzadv.zzS(this.zzg, this.zzo);
        if (this.zzh.S0().equalsIgnoreCase(zzS.f7545b.f7536a)) {
            ((c0) this.zzi).b(this.zzn, zzS);
            zzm(new zzr(zzS));
            return;
        }
        zzl(new Status(17024, (String) null, (PendingIntent) null, (ConnectionResult) null));
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzady) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzady.zzz(this.zza, this.zzf);
    }
}
