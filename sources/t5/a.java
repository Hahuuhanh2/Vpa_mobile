package t5;

import java.util.LinkedHashSet;
import sk.j;
import t5.b;

/* compiled from: BasePermissionRequest.kt */
public abstract class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f14834a = new LinkedHashSet();

    public final void b(b.a aVar) {
        this.f14834a.remove(aVar);
    }

    public final void c(b.a aVar) {
        j.f(aVar, "listener");
        this.f14834a.add(aVar);
    }
}
