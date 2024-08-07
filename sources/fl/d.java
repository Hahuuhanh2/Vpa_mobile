package fl;

import al.d0;
import android.support.v4.media.a;
import ik.f;

/* compiled from: Scopes.kt */
public final class d implements d0 {

    /* renamed from: a  reason: collision with root package name */
    public final f f20225a;

    public d(f fVar) {
        this.f20225a = fVar;
    }

    public final f s() {
        return this.f20225a;
    }

    public final String toString() {
        StringBuilder q10 = a.q("CoroutineScope(coroutineContext=");
        q10.append(this.f20225a);
        q10.append(')');
        return q10.toString();
    }
}
