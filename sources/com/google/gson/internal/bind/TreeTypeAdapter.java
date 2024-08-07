package com.google.gson.internal.bind;

import bc.h;
import bc.k;
import bc.l;
import bc.m;
import bc.p;
import bc.u;
import bc.v;
import hc.b;
import java.lang.reflect.Type;
import p3.l0;

public final class TreeTypeAdapter<T> extends g<T> {

    /* renamed from: a  reason: collision with root package name */
    public final p<T> f7772a;

    /* renamed from: b  reason: collision with root package name */
    public final k<T> f7773b;

    /* renamed from: c  reason: collision with root package name */
    public final h f7774c;

    /* renamed from: d  reason: collision with root package name */
    public final gc.a<T> f7775d;

    /* renamed from: e  reason: collision with root package name */
    public final v f7776e = null;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f7777f;

    /* renamed from: g  reason: collision with root package name */
    public volatile u<T> f7778g;

    public static final class SingleTypeFactory implements v {
        public final <T> u<T> a(h hVar, gc.a<T> aVar) {
            Class<? super T> cls = aVar.f10437a;
            throw null;
        }
    }

    public final class a {
    }

    public TreeTypeAdapter(p pVar, k kVar, h hVar, gc.a aVar, boolean z10) {
        new a();
        this.f7772a = pVar;
        this.f7773b = kVar;
        this.f7774c = hVar;
        this.f7775d = aVar;
        this.f7777f = z10;
    }

    public final T a(hc.a aVar) {
        if (this.f7773b == null) {
            return d().a(aVar);
        }
        l o02 = l0.o0(aVar);
        if (this.f7777f) {
            o02.getClass();
            if (o02 instanceof m) {
                return null;
            }
        }
        k<T> kVar = this.f7773b;
        Type type = this.f7775d.f10438b;
        return kVar.a();
    }

    public final void b(b bVar, T t10) {
        p<T> pVar = this.f7772a;
        if (pVar == null) {
            d().b(bVar, t10);
        } else if (!this.f7777f || t10 != null) {
            Type type = this.f7775d.f10438b;
            TypeAdapters.f7804z.b(bVar, pVar.a());
        } else {
            bVar.B();
        }
    }

    public final u<T> c() {
        if (this.f7772a != null) {
            return this;
        }
        return d();
    }

    public final u<T> d() {
        u<T> uVar = this.f7778g;
        if (uVar != null) {
            return uVar;
        }
        u<T> g2 = this.f7774c.g(this.f7776e, this.f7775d);
        this.f7778g = g2;
        return g2;
    }
}
