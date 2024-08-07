package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.tasks.TaskCompletionSource;
import w6.m;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzw  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
final /* synthetic */ class zzw implements m {
    private final zzu zza;
    private final String zzb;

    public zzw(zzu zzu, String str) {
        this.zza = zzu;
        this.zzb = str;
    }

    public final void accept(Object obj, Object obj2) {
        zzu zzu = this.zza;
        ((zzj) ((zzv) obj).getService()).zza(this.zzb, (zzl) new zzy(zzu, (TaskCompletionSource) obj2));
    }
}
