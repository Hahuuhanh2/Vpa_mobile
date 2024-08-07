package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p3.l0;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzs  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
final class zzs extends zzg {
    private final /* synthetic */ TaskCompletionSource zza;

    public zzs(zzn zzn, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zza(Status status, boolean z10) {
        l0.I0(status, Boolean.valueOf(z10), this.zza);
    }
}
