package com.google.android.gms.internal.p001firebaseauthapi;

import ba.c0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzadf extends zzaez {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;

    public zzadf(String str, String str2, String str3, String str4) {
        super(2);
        j.d("email cannot be null or empty", str);
        j.d("password cannot be null or empty", str2);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
    }

    public final String zza() {
        return "signInWithEmailAndPassword";
    }

    public final void zzb() {
        zzx zzS = zzadv.zzS(this.zzg, this.zzo);
        ((c0) this.zzi).b(this.zzn, zzS);
        zzm(new zzr(zzS));
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzady) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzady.zzy(this.zza, this.zzb, this.zzc, this.zzd, this.zzf);
    }
}
