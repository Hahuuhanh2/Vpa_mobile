package aa;

import ba.c0;
import com.google.android.gms.internal.p001firebaseauthapi.zzahb;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import y6.j;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class h implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f126a;

    public h(FirebaseAuth firebaseAuth) {
        this.f126a = firebaseAuth;
    }

    public final void b(zzahb zzahb, FirebaseUser firebaseUser) {
        j.f(zzahb);
        j.f(firebaseUser);
        firebaseUser.Y0(zzahb);
        FirebaseAuth firebaseAuth = this.f126a;
        firebaseAuth.getClass();
        FirebaseAuth.c(firebaseAuth, firebaseUser, zzahb, true, false);
    }
}
