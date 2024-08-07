package com.google.android.gms.internal.p001firebaseauthapi;

import aa.b;
import android.app.PendingIntent;
import ba.c0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaci  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzaci extends zzaez {
    private final b zza;
    private final String zzb;
    private final String zzc;

    public zzaci(b bVar, String str, String str2) {
        super(2);
        j.f(bVar);
        this.zza = bVar;
        j.c(str);
        this.zzb = str;
        this.zzc = str2;
    }

    public final String zza() {
        return "finalizeMfaSignIn";
    }

    public final void zzb() {
        zzx zzS = zzadv.zzS(this.zzg, this.zzo);
        FirebaseUser firebaseUser = this.zzh;
        if (firebaseUser == null || firebaseUser.S0().equalsIgnoreCase(zzS.f7545b.f7536a)) {
            ((c0) this.zzi).b(this.zzn, zzS);
            zzm(new zzr(zzS));
            return;
        }
        zzl(new Status(17024, (String) null, (PendingIntent) null, (ConnectionResult) null));
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzady) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzady.zzi(this.zzb, this.zza, this.zzc, this.zzf);
    }
}
