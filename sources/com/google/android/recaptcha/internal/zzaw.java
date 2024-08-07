package com.google.android.recaptcha.internal;

import al.j0;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import ek.i;
import java.util.concurrent.CancellationException;
import rk.l;
import sk.k;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
final class zzaw extends k implements l {
    public final /* synthetic */ TaskCompletionSource zza;
    public final /* synthetic */ j0 zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzaw(TaskCompletionSource taskCompletionSource, j0 j0Var) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = j0Var;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Exception exc;
        Throwable th2 = (Throwable) obj;
        if (th2 instanceof CancellationException) {
            this.zza.setException((Exception) th2);
        } else {
            Throwable completionExceptionOrNull = this.zzb.getCompletionExceptionOrNull();
            if (completionExceptionOrNull == null) {
                this.zza.setResult(this.zzb.getCompleted());
            } else {
                TaskCompletionSource taskCompletionSource = this.zza;
                if (completionExceptionOrNull instanceof Exception) {
                    exc = (Exception) completionExceptionOrNull;
                } else {
                    exc = null;
                }
                if (exc == null) {
                    exc = new RuntimeExecutionException(completionExceptionOrNull);
                }
                taskCompletionSource.setException(exc);
            }
        }
        return i.f20112a;
    }
}
