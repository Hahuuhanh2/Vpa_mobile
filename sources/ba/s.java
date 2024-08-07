package ba;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p001firebaseauthapi.zzab;
import com.google.android.gms.internal.p001firebaseauthapi.zzac;
import com.google.android.gms.internal.p001firebaseauthapi.zzaha;
import com.google.android.gms.internal.p001firebaseauthapi.zzj;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.internal.zzbo;
import java.util.List;
import m9.d;
import y6.j;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class s implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f4128a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u f4129b;

    public s(u uVar, String str) {
        this.f4129b = uVar;
        this.f4128a = str;
    }

    public final Object then(Task task) {
        String str;
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            j.f(exception);
            String message = exception.getMessage();
            j.f(message);
            return Tasks.forException(new zzbo(message));
        }
        zzaha zzaha = (zzaha) task.getResult();
        String zzb = zzaha.zzb();
        if (zzac.zzd(zzb)) {
            return Tasks.forException(new zzbo("No Recaptcha Enterprise siteKey configured for tenant/project ".concat(String.valueOf(this.f4128a))));
        }
        List zzd = zzab.zzb(zzj.zzb('/')).zzd(zzb);
        if (zzd.size() != 4) {
            str = null;
        } else {
            str = (String) zzd.get(3);
        }
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception("Invalid siteKey format ".concat(String.valueOf(zzb))));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            "Successfully obtained site key for tenant ".concat(String.valueOf(this.f4128a));
        }
        u uVar = this.f4129b;
        uVar.f4132b = zzaha;
        d dVar = uVar.f4133c;
        dVar.a();
        Task<RecaptchaTasksClient> tasksClient = Recaptcha.getTasksClient((Application) dVar.f13218a, str);
        u uVar2 = this.f4129b;
        uVar2.f4131a.put(this.f4128a, tasksClient);
        return tasksClient;
    }
}
