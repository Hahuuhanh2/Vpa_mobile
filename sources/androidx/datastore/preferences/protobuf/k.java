package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.i;
import androidx.datastore.preferences.protobuf.n;
import java.util.Map;

/* compiled from: ExtensionSchemaLite */
public final class k extends j<n.d> {
    public final void a(Map.Entry entry) {
        ((n.d) entry.getKey()).getClass();
    }

    public final n.e b(i iVar, z zVar, int i10) {
        return iVar.f2273a.get(new i.a(zVar, i10));
    }

    public final l<n.d> c(Object obj) {
        return ((n.c) obj).extensions;
    }

    public final l<n.d> d(Object obj) {
        n.c cVar = (n.c) obj;
        l<n.d> lVar = cVar.extensions;
        if (lVar.f2301b) {
            cVar.extensions = lVar.clone();
        }
        return cVar.extensions;
    }

    public final boolean e(z zVar) {
        return zVar instanceof n.c;
    }

    public final void f(Object obj) {
        l<n.d> lVar = ((n.c) obj).extensions;
        if (!lVar.f2301b) {
            lVar.f2300a.h();
            lVar.f2301b = true;
        }
    }

    public final Object g(Object obj) {
        n.e eVar = (n.e) obj;
        throw null;
    }

    public final void h(Object obj) {
        n.e eVar = (n.e) obj;
        throw null;
    }

    public final void i(Object obj) {
        n.e eVar = (n.e) obj;
        throw null;
    }

    public final void j(Map.Entry entry) {
        ((n.d) entry.getKey()).getClass();
        throw null;
    }
}
