package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public class zzafc {
    public zzady zza;
    public Executor zzb;

    public final Task zzU(zzafb zzafb) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zzb.execute(new zzafa(this, zzafb, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
