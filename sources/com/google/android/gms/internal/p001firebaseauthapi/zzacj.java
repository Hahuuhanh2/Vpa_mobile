package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import ba.c0;
import ba.m;
import com.google.android.gms.tasks.TaskCompletionSource;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzacj extends zzaez {
    private final String zza;

    public zzacj(String str) {
        super(1);
        j.d("refresh token cannot be null", str);
        this.zza = str;
    }

    public final String zza() {
        return "getAccessToken";
    }

    public final void zzb() {
        if (TextUtils.isEmpty(this.zzn.zzf())) {
            this.zzn.zzi(this.zza);
        }
        ((c0) this.zzi).b(this.zzn, this.zzh);
        zzm(m.a(this.zzn.zze()));
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzady) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzady.zzj(this.zza, this.zzf);
    }
}
