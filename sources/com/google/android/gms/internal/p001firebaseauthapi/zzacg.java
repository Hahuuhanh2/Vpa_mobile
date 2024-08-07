package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import d4.b;
import java.util.List;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacg  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzacg extends zzaez {
    private final String zza;
    private final String zzb;

    public zzacg(String str, String str2) {
        super(3);
        j.d("email cannot be null or empty", str);
        this.zza = str;
        this.zzb = str2;
    }

    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }

    public final void zzb() {
        List list;
        if (this.zzp.zzb() == null) {
            list = zzam.zzi();
        } else {
            list = this.zzp.zzb();
            j.f(list);
        }
        zzm(new b(list));
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zzady zzady) {
        this.zzk = new zzaey(this, taskCompletionSource);
        zzady.zzl(this.zza, this.zzb, this.zzf);
    }
}
