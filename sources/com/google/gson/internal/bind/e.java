package com.google.gson.internal.bind;

import bc.h;
import bc.s;
import bc.u;
import bc.v;
import dc.p;
import f0.b0;
import hc.a;
import hc.b;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: ObjectTypeAdapter */
public final class e extends u<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final v f7832c = new ObjectTypeAdapter$1();

    /* renamed from: a  reason: collision with root package name */
    public final h f7833a;

    /* renamed from: b  reason: collision with root package name */
    public final s f7834b;

    public e(h hVar, s sVar) {
        this.f7833a = hVar;
        this.f7834b = sVar;
    }

    public static Serializable d(a aVar, int i10) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 == 0) {
                aVar.d();
                return new ArrayList();
            } else if (i11 != 2) {
                return null;
            } else {
                aVar.h();
                return new p();
            }
        } else {
            throw null;
        }
    }

    public final Object a(a aVar) {
        boolean z10;
        Serializable serializable;
        int k02 = aVar.k0();
        Object d10 = d(aVar, k02);
        if (d10 == null) {
            return c(aVar, k02);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.K()) {
                String str = null;
                if (d10 instanceof Map) {
                    str = aVar.a0();
                }
                int k03 = aVar.k0();
                Serializable d11 = d(aVar, k03);
                if (d11 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (d11 == null) {
                    serializable = c(aVar, k03);
                } else {
                    serializable = d11;
                }
                if (d10 instanceof List) {
                    ((List) d10).add(serializable);
                } else {
                    ((Map) d10).put(str, serializable);
                }
                if (z10) {
                    arrayDeque.addLast(d10);
                    d10 = serializable;
                }
            } else {
                if (d10 instanceof List) {
                    aVar.s();
                } else {
                    aVar.v();
                }
                if (arrayDeque.isEmpty()) {
                    return d10;
                }
                d10 = arrayDeque.removeLast();
            }
        }
    }

    public final void b(b bVar, Object obj) {
        if (obj == null) {
            bVar.B();
            return;
        }
        h hVar = this.f7833a;
        Class<?> cls = obj.getClass();
        hVar.getClass();
        u f10 = hVar.f(new gc.a(cls));
        if (f10 instanceof e) {
            bVar.i();
            bVar.v();
            return;
        }
        f10.b(bVar, obj);
    }

    public final Serializable c(a aVar, int i10) {
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 == 5) {
                return aVar.g0();
            }
            if (i11 == 6) {
                return this.f7834b.b(aVar);
            }
            if (i11 == 7) {
                return Boolean.valueOf(aVar.R());
            }
            if (i11 == 8) {
                aVar.d0();
                return null;
            }
            StringBuilder q10 = android.support.v4.media.a.q("Unexpected token: ");
            q10.append(b0.F(i10));
            throw new IllegalStateException(q10.toString());
        }
        throw null;
    }
}
