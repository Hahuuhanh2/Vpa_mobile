package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import eb.b;
import java.util.Iterator;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f7515a;

    public a(FirebaseAuth firebaseAuth, b bVar) {
        this.f7515a = firebaseAuth;
    }

    public final void run() {
        Iterator it = this.f7515a.f7473c.iterator();
        while (it.hasNext()) {
            ((ba.a) it.next()).a();
        }
        Iterator it2 = this.f7515a.f7472b.iterator();
        while (it2.hasNext()) {
            ((FirebaseAuth.b) it2.next()).a();
        }
    }
}
