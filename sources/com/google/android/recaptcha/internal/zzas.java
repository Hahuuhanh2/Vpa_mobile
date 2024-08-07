package com.google.android.recaptcha.internal;

import al.j0;
import al.s;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p3.l0;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final class zzas {
    public static final j0 zza(Task task) {
        s c10 = l0.c();
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception != null) {
                c10.z(exception);
            } else if (task.isCanceled()) {
                c10.cancel((CancellationException) null);
            } else {
                c10.U(task.getResult());
            }
        } else {
            task.addOnCompleteListener((Executor) zzo.zza, new zzaq(c10));
        }
        return new zzar(c10);
    }
}
