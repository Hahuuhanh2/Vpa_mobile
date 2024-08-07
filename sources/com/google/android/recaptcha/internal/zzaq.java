package com.google.android.recaptcha.internal;

import al.r;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public final /* synthetic */ class zzaq implements OnCompleteListener {
    public final /* synthetic */ r zza;

    public /* synthetic */ zzaq(r rVar) {
        this.zza = rVar;
    }

    public final void onComplete(Task task) {
        r rVar = this.zza;
        Exception exception = task.getException();
        if (exception != null) {
            rVar.z(exception);
        } else if (task.isCanceled()) {
            rVar.cancel((CancellationException) null);
        } else {
            rVar.B(task.getResult());
        }
    }
}
