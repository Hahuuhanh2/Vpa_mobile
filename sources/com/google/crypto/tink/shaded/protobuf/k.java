package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.n;
import java.util.Map;

/* compiled from: ExtensionSchemaLite */
public final class k extends j<n.d> {
    public final void a(Map.Entry entry) {
        ((n.d) entry.getKey()).getClass();
    }

    public final n.e b(i iVar, x xVar, int i10) {
        return iVar.f7394a.get(new i.a(xVar, i10));
    }

    public final l<n.d> c(Object obj) {
        return ((n.c) obj).extensions;
    }

    public final l<n.d> d(Object obj) {
        n.c cVar = (n.c) obj;
        l<n.d> lVar = cVar.extensions;
        if (lVar.f7400b) {
            cVar.extensions = lVar.clone();
        }
        return cVar.extensions;
    }

    public final boolean e(x xVar) {
        return xVar instanceof n.c;
    }

    public final void f(Object obj) {
        ((n.c) obj).extensions.l();
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
