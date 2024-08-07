package com.google.android.recaptcha.internal;

import al.j0;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzax {
    public static final Task zza(j0 j0Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        j0Var.invokeOnCompletion(new zzaw(taskCompletionSource, j0Var));
        return taskCompletionSource.getTask();
    }
}
