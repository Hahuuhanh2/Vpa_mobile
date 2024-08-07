package ba;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.p001firebaseauthapi.zzadz;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuthException;
import y6.j;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class q implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f4124a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u f4125b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ RecaptchaAction f4126c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Continuation f4127d;

    public q(Continuation continuation, RecaptchaAction recaptchaAction, u uVar, String str) {
        this.f4124a = str;
        this.f4125b = uVar;
        this.f4126c = recaptchaAction;
        this.f4127d = continuation;
    }

    public final Object then(Task task) {
        if (task.isSuccessful()) {
            return task;
        }
        Exception exception = task.getException();
        j.f(exception);
        SparseArray sparseArray = zzadz.zza;
        if (!(exception instanceof FirebaseAuthException) || !((FirebaseAuthException) exception).f7490a.endsWith("INVALID_RECAPTCHA_TOKEN")) {
            return task;
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant ".concat(String.valueOf(this.f4124a));
        }
        return this.f4125b.a(this.f4124a, Boolean.TRUE, this.f4126c).continueWithTask(this.f4127d);
    }
}
