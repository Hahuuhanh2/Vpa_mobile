package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafa  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final /* synthetic */ class zzafa implements Runnable {
    public final /* synthetic */ zzafc zza;
    public final /* synthetic */ zzafb zzb;
    public final /* synthetic */ TaskCompletionSource zzc;

    public /* synthetic */ zzafa(zzafc zzafc, zzafb zzafb, TaskCompletionSource taskCompletionSource) {
        this.zza = zzafc;
        this.zzb = zzafb;
        this.zzc = taskCompletionSource;
    }

    public final void run() {
        this.zzb.zzc(this.zzc, this.zza.zza);
    }
}
