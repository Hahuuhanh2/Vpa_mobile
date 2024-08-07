package ba;

import com.google.android.gms.internal.p001firebaseauthapi.zzaha;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import m9.d;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f4131a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public zzaha f4132b;

    /* renamed from: c  reason: collision with root package name */
    public final d f4133c;

    /* renamed from: d  reason: collision with root package name */
    public final FirebaseAuth f4134d;

    public u(d dVar, FirebaseAuth firebaseAuth) {
        this.f4133c = dVar;
        this.f4134d = firebaseAuth;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.google.android.gms.tasks.Task} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.tasks.Task a(java.lang.String r4, java.lang.Boolean r5, com.google.android.recaptcha.RecaptchaAction r6) {
        /*
            r3 = this;
            boolean r0 = com.google.android.gms.internal.p001firebaseauthapi.zzac.zzd(r4)
            java.lang.String r1 = "*"
            if (r0 == 0) goto L_0x0009
            r4 = r1
        L_0x0009:
            java.util.HashMap r0 = r3.f4131a
            java.lang.Object r0 = r0.get(r4)
            com.google.android.gms.tasks.Task r0 = (com.google.android.gms.tasks.Task) r0
            boolean r2 = r5.booleanValue()
            if (r2 != 0) goto L_0x0019
            if (r0 != 0) goto L_0x0048
        L_0x0019:
            boolean r0 = com.google.android.gms.internal.p001firebaseauthapi.zzac.zzd(r4)
            if (r0 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r1 = r4
        L_0x0021:
            boolean r4 = r5.booleanValue()
            if (r4 != 0) goto L_0x0033
            java.util.HashMap r4 = r3.f4131a
            java.lang.Object r4 = r4.get(r1)
            r0 = r4
            com.google.android.gms.tasks.Task r0 = (com.google.android.gms.tasks.Task) r0
            if (r0 == 0) goto L_0x0033
            goto L_0x0048
        L_0x0033:
            com.google.firebase.auth.FirebaseAuth r4 = r3.f4134d
            com.google.android.gms.internal.firebase-auth-api.zzadv r5 = r4.f7475e
            java.lang.String r4 = r4.f7479i
            java.lang.String r0 = "RECAPTCHA_ENTERPRISE"
            com.google.android.gms.tasks.Task r4 = r5.zzm(r4, r0)
            ba.s r5 = new ba.s
            r5.<init>(r3, r1)
            com.google.android.gms.tasks.Task r0 = r4.continueWithTask(r5)
        L_0x0048:
            ba.t r4 = new ba.t
            r4.<init>(r6)
            com.google.android.gms.tasks.Task r4 = r0.continueWithTask(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.u.a(java.lang.String, java.lang.Boolean, com.google.android.recaptcha.RecaptchaAction):com.google.android.gms.tasks.Task");
    }
}
