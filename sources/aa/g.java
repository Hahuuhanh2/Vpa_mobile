package aa;

import android.text.TextUtils;
import ba.r;
import com.google.android.gms.internal.p001firebaseauthapi.zzadv;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import m9.d;
import y6.j;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class g extends r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f122a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FirebaseUser f123b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ EmailAuthCredential f124c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f125d;

    public g(FirebaseAuth firebaseAuth, boolean z10, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential) {
        this.f125d = firebaseAuth;
        this.f122a = z10;
        this.f123b = firebaseUser;
        this.f124c = emailAuthCredential;
    }

    public final Task a(String str) {
        TextUtils.isEmpty(str);
        if (this.f122a) {
            FirebaseAuth firebaseAuth = this.f125d;
            FirebaseUser firebaseUser = this.f123b;
            zzadv zzadv = firebaseAuth.f7475e;
            d dVar = firebaseAuth.f7471a;
            j.f(firebaseUser);
            return zzadv.zzr(dVar, firebaseUser, this.f124c, str, new i(this.f125d));
        }
        FirebaseAuth firebaseAuth2 = this.f125d;
        return firebaseAuth2.f7475e.zzF(firebaseAuth2.f7471a, this.f124c, str, new h(firebaseAuth2));
    }
}
