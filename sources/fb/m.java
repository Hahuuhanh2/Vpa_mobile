package fb;

import com.google.firebase.messaging.FirebaseMessaging;
import wa.a;
import wa.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging.a f10148a;

    public /* synthetic */ m(FirebaseMessaging.a aVar) {
        this.f10148a = aVar;
    }

    public final void a(a aVar) {
        boolean z10;
        FirebaseMessaging.a aVar2 = this.f10148a;
        synchronized (aVar2) {
            aVar2.a();
            Boolean bool = aVar2.f7599c;
            if (bool != null) {
                z10 = bool.booleanValue();
            } else {
                z10 = FirebaseMessaging.this.f7586a.j();
            }
        }
        if (z10) {
            FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
            com.google.firebase.messaging.a aVar3 = FirebaseMessaging.f7583m;
            firebaseMessaging.d();
        }
    }
}
