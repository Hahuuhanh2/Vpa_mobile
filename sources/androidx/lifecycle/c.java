package androidx.lifecycle;

import androidx.lifecycle.i;
import r2.l;
import z.d;

/* compiled from: CompositeGeneratedAdaptersObserver.kt */
public final class c implements n {

    /* renamed from: a  reason: collision with root package name */
    public final e[] f2746a;

    public c(e[] eVarArr) {
        this.f2746a = eVarArr;
    }

    public final void q(l lVar, i.a aVar) {
        new d(3);
        for (e a10 : this.f2746a) {
            a10.a();
        }
        for (e a11 : this.f2746a) {
            a11.a();
        }
    }
}
