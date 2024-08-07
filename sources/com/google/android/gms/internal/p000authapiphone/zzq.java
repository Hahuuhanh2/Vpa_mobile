package com.google.android.gms.internal.p000authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p3.l0;
import w6.e;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzq  reason: invalid package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
final class zzq extends e.a {
    private final /* synthetic */ TaskCompletionSource zza;

    public zzq(zzn zzn, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void onResult(Status status) {
        if (status.f5345a == 6) {
            this.zza.trySetException(l0.V(status));
        } else {
            l0.I0(status, (Object) null, this.zza);
        }
    }
}
