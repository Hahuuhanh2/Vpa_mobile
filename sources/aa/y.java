package aa;

import android.text.TextUtils;
import ba.r;
import com.google.android.gms.internal.p001firebaseauthapi.zzadv;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import m9.d;
import y6.j;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class y extends r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f134a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f135b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ FirebaseUser f136c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f137d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ String f138e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f139f;

    public y(FirebaseAuth firebaseAuth, String str, boolean z10, FirebaseUser firebaseUser, String str2, String str3) {
        this.f139f = firebaseAuth;
        this.f134a = str;
        this.f135b = z10;
        this.f136c = firebaseUser;
        this.f137d = str2;
        this.f138e = str3;
    }

    public final Task a(String str) {
        if (!TextUtils.isEmpty(str)) {
            "Got reCAPTCHA token for login with email ".concat(String.valueOf(this.f134a));
        }
        if (this.f135b) {
            FirebaseAuth firebaseAuth = this.f139f;
            FirebaseUser firebaseUser = this.f136c;
            zzadv zzadv = firebaseAuth.f7475e;
            d dVar = firebaseAuth.f7471a;
            j.f(firebaseUser);
            return zzadv.zzt(dVar, firebaseUser, this.f134a, this.f137d, this.f138e, str, new i(this.f139f));
        }
        FirebaseAuth firebaseAuth2 = this.f139f;
        return firebaseAuth2.f7475e.zzE(firebaseAuth2.f7471a, this.f134a, this.f137d, this.f138e, str, new h(firebaseAuth2));
    }
}
