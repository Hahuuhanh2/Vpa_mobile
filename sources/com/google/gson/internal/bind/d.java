package com.google.gson.internal.bind;

import bc.r;
import bc.s;
import bc.u;
import bc.v;
import com.google.gson.JsonSyntaxException;
import f0.b0;
import hc.a;
import hc.b;

/* compiled from: NumberTypeAdapter */
public final class d extends u<Number> {

    /* renamed from: b  reason: collision with root package name */
    public static final v f7830b = c();

    /* renamed from: a  reason: collision with root package name */
    public final s f7831a = r.f4164b;

    public static v c() {
        return new NumberTypeAdapter$1(new d());
    }

    public final Object a(a aVar) {
        int k02 = aVar.k0();
        int g2 = v.v.g(k02);
        if (g2 == 5 || g2 == 6) {
            return this.f7831a.b(aVar);
        }
        if (g2 == 8) {
            aVar.d0();
            return null;
        }
        StringBuilder q10 = android.support.v4.media.a.q("Expecting number, got: ");
        q10.append(b0.F(k02));
        q10.append("; at path ");
        q10.append(aVar.z());
        throw new JsonSyntaxException(q10.toString());
    }

    public final void b(b bVar, Object obj) {
        bVar.S((Number) obj);
    }
}
