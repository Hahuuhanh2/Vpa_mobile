package aa;

import ba.y;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p001firebaseauthapi.zzahb;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import y6.j;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class i implements y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f127a;

    public i(FirebaseAuth firebaseAuth) {
        this.f127a = firebaseAuth;
    }

    public final void a(Status status) {
        int i10 = status.f5345a;
        if (i10 == 17011 || i10 == 17021 || i10 == 17005 || i10 == 17091) {
            this.f127a.a();
        }
    }

    public final void b(zzahb zzahb, FirebaseUser firebaseUser) {
        j.f(zzahb);
        j.f(firebaseUser);
        firebaseUser.Y0(zzahb);
        FirebaseAuth.c(this.f127a, firebaseUser, zzahb, true, true);
    }
}
