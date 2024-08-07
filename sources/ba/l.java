package ba;

import android.net.Uri;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.internal.GenericIdpActivity;
import com.google.firebase.auth.internal.RecaptchaActivity;
import s9.a;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final /* synthetic */ class l implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4118a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Uri f4119b;

    public /* synthetic */ l(Uri uri, int i10) {
        this.f4118a = i10;
        this.f4119b = uri;
    }

    public final Object then(Task task) {
        switch (this.f4118a) {
            case 0:
                a0 a0Var = GenericIdpActivity.J;
                Uri.Builder buildUpon = this.f4119b.buildUpon();
                if (task.isSuccessful()) {
                    a aVar = (a) task.getResult();
                    if (aVar.a() != null) {
                        "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(aVar.a()));
                    }
                    buildUpon.fragment("fac=".concat(String.valueOf(aVar.b())));
                } else {
                    "Unexpected error getting App Check token: ".concat(String.valueOf(task.getException().getMessage()));
                }
                return buildUpon.build();
            default:
                Uri uri = this.f4119b;
                a0 a0Var2 = RecaptchaActivity.J;
                Uri.Builder buildUpon2 = uri.buildUpon();
                if (task.isSuccessful()) {
                    a aVar2 = (a) task.getResult();
                    if (aVar2.a() != null) {
                        "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(aVar2.a()));
                    }
                    buildUpon2.fragment("fac=".concat(String.valueOf(aVar2.b())));
                } else {
                    "Unexpected error getting App Check token: ".concat(String.valueOf(task.getException().getMessage()));
                }
                return buildUpon2.build();
        }
    }
}
