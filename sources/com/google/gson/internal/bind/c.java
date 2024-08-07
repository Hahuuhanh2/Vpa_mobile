package com.google.gson.internal.bind;

import bc.j;
import bc.l;
import bc.m;
import bc.n;
import bc.o;
import hc.b;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: JsonTreeWriter */
public final class c extends b {

    /* renamed from: w  reason: collision with root package name */
    public static final a f7825w = new a();

    /* renamed from: x  reason: collision with root package name */
    public static final o f7826x = new o("closed");

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f7827t = new ArrayList();

    /* renamed from: u  reason: collision with root package name */
    public String f7828u;

    /* renamed from: v  reason: collision with root package name */
    public l f7829v = m.f4160a;

    /* compiled from: JsonTreeWriter */
    public class a extends Writer {
        public final void close() {
            throw new AssertionError();
        }

        public final void flush() {
            throw new AssertionError();
        }

        public final void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public c() {
        super(f7825w);
    }

    public final b B() {
        d0(m.f4160a);
        return this;
    }

    public final void L(double d10) {
        if (this.f10734f || (!Double.isNaN(d10) && !Double.isInfinite(d10))) {
            d0(new o((Number) Double.valueOf(d10)));
            return;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
    }

    public final void N(long j10) {
        d0(new o((Number) Long.valueOf(j10)));
    }

    public final void R(Boolean bool) {
        if (bool == null) {
            d0(m.f4160a);
        } else {
            d0(new o(bool));
        }
    }

    public final void S(Number number) {
        if (number == null) {
            d0(m.f4160a);
            return;
        }
        if (!this.f10734f) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        d0(new o(number));
    }

    public final void U(String str) {
        if (str == null) {
            d0(m.f4160a);
        } else {
            d0(new o(str));
        }
    }

    public final void W(boolean z10) {
        d0(new o(Boolean.valueOf(z10)));
    }

    public final l c0() {
        ArrayList arrayList = this.f7827t;
        return (l) arrayList.get(arrayList.size() - 1);
    }

    public final void close() {
        if (this.f7827t.isEmpty()) {
            this.f7827t.add(f7826x);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public final void d0(l lVar) {
        if (this.f7828u != null) {
            lVar.getClass();
            if (!(lVar instanceof m) || this.f10737p) {
                ((n) c0()).f4161a.put(this.f7828u, lVar);
            }
            this.f7828u = null;
        } else if (this.f7827t.isEmpty()) {
            this.f7829v = lVar;
        } else {
            l c02 = c0();
            if (c02 instanceof j) {
                j jVar = (j) c02;
                if (lVar == null) {
                    jVar.getClass();
                    lVar = m.f4160a;
                }
                jVar.f4159a.add(lVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final void flush() {
    }

    public final void h() {
        j jVar = new j();
        d0(jVar);
        this.f7827t.add(jVar);
    }

    public final void i() {
        n nVar = new n();
        d0(nVar);
        this.f7827t.add(nVar);
    }

    public final void s() {
        if (this.f7827t.isEmpty() || this.f7828u != null) {
            throw new IllegalStateException();
        } else if (c0() instanceof j) {
            ArrayList arrayList = this.f7827t;
            arrayList.remove(arrayList.size() - 1);
        } else {
            throw new IllegalStateException();
        }
    }

    public final void v() {
        if (this.f7827t.isEmpty() || this.f7828u != null) {
            throw new IllegalStateException();
        } else if (c0() instanceof n) {
            ArrayList arrayList = this.f7827t;
            arrayList.remove(arrayList.size() - 1);
        } else {
            throw new IllegalStateException();
        }
    }

    public final void x(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f7827t.isEmpty() || this.f7828u != null) {
            throw new IllegalStateException();
        } else if (c0() instanceof n) {
            this.f7828u = str;
        } else {
            throw new IllegalStateException();
        }
    }
}
