package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f7516a;

    public b(FirebaseAuth firebaseAuth) {
        this.f7516a = firebaseAuth;
    }

    public final void run() {
        Iterator it = this.f7516a.f7474d.iterator();
        while (it.hasNext()) {
            ((FirebaseAuth.a) it.next()).a();
        }
    }
}
