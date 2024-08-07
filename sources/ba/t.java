package ba;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.internal.zzbo;
import y6.j;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class t implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecaptchaAction f4130a;

    public t(RecaptchaAction recaptchaAction) {
        this.f4130a = recaptchaAction;
    }

    public final /* bridge */ /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return ((RecaptchaTasksClient) task.getResult()).executeTask(this.f4130a);
        }
        Exception exception = task.getException();
        j.f(exception);
        if (!(exception instanceof zzbo)) {
            return Tasks.forException(exception);
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            "Ignoring error related to fetching recaptcha config - ".concat(String.valueOf(exception.getMessage()));
        }
        return Tasks.forResult("");
    }
}
