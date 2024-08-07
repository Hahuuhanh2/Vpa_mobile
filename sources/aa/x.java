package aa;

import ba.y;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p001firebaseauthapi.zzahb;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class x implements y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f133a;

    public x(FirebaseAuth firebaseAuth) {
        this.f133a = firebaseAuth;
    }

    public final void a(Status status) {
        int i10 = status.f5345a;
        if (i10 == 17011 || i10 == 17021 || i10 == 17005) {
            this.f133a.a();
        }
    }

    public final void b(zzahb zzahb, FirebaseUser firebaseUser) {
        FirebaseAuth.c(this.f133a, firebaseUser, zzahb, true, true);
    }
}
