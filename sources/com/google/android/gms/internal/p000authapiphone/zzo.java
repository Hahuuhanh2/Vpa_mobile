package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.tasks.TaskCompletionSource;
import w6.m;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzo  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
final /* synthetic */ class zzo implements m {
    private final zzn zza;
    private final String zzb;

    public zzo(zzn zzn, String str) {
        this.zza = zzn;
        this.zzb = str;
    }

    public final void accept(Object obj, Object obj2) {
        zzn zzn = this.zza;
        ((zzj) ((zzv) obj).getService()).zza(this.zzb, (zzh) new zzs(zzn, (TaskCompletionSource) obj2));
    }
}
