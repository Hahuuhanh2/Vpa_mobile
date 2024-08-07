package com.google.protobuf;

import com.google.protobuf.h;
import com.google.protobuf.l;
import java.util.Iterator;
import java.util.Map;
import tc.d0;

/* compiled from: MessageSetSchema */
public final class x<T> implements tc.x<T> {

    /* renamed from: a  reason: collision with root package name */
    public final u f7954a;

    /* renamed from: b  reason: collision with root package name */
    public final c0<?, ?> f7955b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7956c;

    /* renamed from: d  reason: collision with root package name */
    public final f<?> f7957d;

    public x(c0<?, ?> c0Var, f<?> fVar, u uVar) {
        this.f7955b = c0Var;
        this.f7956c = fVar.d(uVar);
        this.f7957d = fVar;
        this.f7954a = uVar;
    }

    public final void a(T t10, T t11) {
        c0<?, ?> c0Var = this.f7955b;
        Class<?> cls = z.f7961a;
        c0Var.f(t10, c0Var.e(c0Var.a(t10), c0Var.a(t11)));
        if (this.f7956c) {
            z.A(this.f7957d, t10, t11);
        }
    }

    public final T b() {
        u uVar = this.f7954a;
        if (uVar instanceof i) {
            return (i) ((i) uVar).x();
        }
        return uVar.e().r();
    }

    public final void c(T t10) {
        this.f7955b.d(t10);
        this.f7957d.e(t10);
    }

    public final boolean d(T t10) {
        return this.f7957d.b(t10).i();
    }

    public final boolean e(T t10, T t11) {
        if (!this.f7955b.a(t10).equals(this.f7955b.a(t11))) {
            return false;
        }
        if (this.f7956c) {
            return this.f7957d.b(t10).equals(this.f7957d.b(t11));
        }
        return true;
    }

    public final int f(T t10) {
        c0<?, ?> c0Var = this.f7955b;
        int c10 = c0Var.c(c0Var.a(t10)) + 0;
        if (!this.f7956c) {
            return c10;
        }
        h<?> b10 = this.f7957d.b(t10);
        int i10 = 0;
        for (int i11 = 0; i11 < b10.f7902a.e(); i11++) {
            i10 += h.f(b10.f7902a.d(i11));
        }
        for (Map.Entry<T, Object> f10 : b10.f7902a.f()) {
            i10 += h.f(f10);
        }
        return c10 + i10;
    }

    public final int g(T t10) {
        int hashCode = this.f7955b.a(t10).hashCode();
        if (this.f7956c) {
            return (hashCode * 53) + this.f7957d.b(t10).hashCode();
        }
        return hashCode;
    }

    public final void h(Object obj, e eVar) {
        Iterator<Map.Entry<?, Object>> k10 = this.f7957d.b(obj).k();
        while (k10.hasNext()) {
            Map.Entry next = k10.next();
            h.a aVar = (h.a) next.getKey();
            if (aVar.f() == d0.MESSAGE) {
                aVar.d();
                aVar.g();
                if (next instanceof l.a) {
                    aVar.a();
                    eVar.l(0, ((l.a) next).f7919a.getValue().b());
                } else {
                    aVar.a();
                    eVar.l(0, next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        c0<?, ?> c0Var = this.f7955b;
        c0Var.g(c0Var.a(obj), eVar);
    }
}
