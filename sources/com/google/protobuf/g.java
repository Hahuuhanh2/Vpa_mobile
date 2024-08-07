package com.google.protobuf;

import com.google.protobuf.i;
import java.util.Map;

/* compiled from: ExtensionSchemaLite */
public final class g extends f<i.d> {
    public final void a(Map.Entry entry) {
        ((i.d) entry.getKey()).getClass();
    }

    public final h<i.d> b(Object obj) {
        return ((i.c) obj).extensions;
    }

    public final h<i.d> c(Object obj) {
        i.c cVar = (i.c) obj;
        h<i.d> hVar = cVar.extensions;
        if (hVar.f7903b) {
            cVar.extensions = hVar.clone();
        }
        return cVar.extensions;
    }

    public final boolean d(u uVar) {
        return uVar instanceof i.c;
    }

    public final void e(Object obj) {
        ((i.c) obj).extensions.l();
    }

    public final void f(Map.Entry entry) {
        ((i.d) entry.getKey()).getClass();
        throw null;
    }
}
