package ba;

import a1.c;
import com.google.android.gms.internal.p001firebaseauthapi.zzaha;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import z.j;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public abstract class r {
    public abstract Task a(String str);

    public final Task b(FirebaseAuth firebaseAuth, String str, RecaptchaAction recaptchaAction) {
        u uVar;
        boolean z10;
        j jVar = new j(this, 11);
        synchronized (firebaseAuth) {
            uVar = firebaseAuth.f7480j;
        }
        if (uVar != null) {
            zzaha zzaha = uVar.f4132b;
            if (zzaha == null || !zzaha.zzc()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                Task a10 = uVar.a(str, Boolean.FALSE, recaptchaAction);
                return a10.continueWithTask(jVar).continueWithTask(new q(jVar, recaptchaAction, uVar, str));
            }
        }
        return a((String) null).continueWithTask(new c(recaptchaAction, firebaseAuth, str, jVar));
    }
}
