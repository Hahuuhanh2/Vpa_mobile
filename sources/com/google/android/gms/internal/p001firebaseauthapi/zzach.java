package com.google.android.gms.internal.p001firebaseauthapi;

import aa.b;
import ba.c0;
import com.google.android.gms.tasks.TaskCompletionSource;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzach  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzach extends zzaez {
    private final b zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;

    public zzach(b bVar, String str, String str2, String str3) {
        super(2);
        j.f(bVar);
        this.zza = bVar;
        j.c(str);
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
    }

    public final String zza() {
        return "finalizeMfaEnrollment";
    }

    public final void zzb() {
        ((c0) this.zzi).b(this.zzn, zzadv.zzS(this.zzg, this.zzo));
        zzm((Object) null);
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzady) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzady.zzh(this.zza, this.zzb, this.zzc, this.zzd, this.zzf);
    }
}
