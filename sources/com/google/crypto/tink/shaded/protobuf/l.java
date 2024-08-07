package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.l.a;
import com.google.crypto.tink.shaded.protobuf.n;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.q;
import com.google.crypto.tink.shaded.protobuf.x;
import j9.c;
import j9.d0;
import j9.e0;
import j9.q;
import j9.w;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* compiled from: FieldSet */
public final class l<T extends a<T>> {

    /* renamed from: d  reason: collision with root package name */
    public static final l f7398d = new l(0);

    /* renamed from: a  reason: collision with root package name */
    public final f0<T, Object> f7399a = new e0(16);

    /* renamed from: b  reason: collision with root package name */
    public boolean f7400b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7401c;

    /* compiled from: FieldSet */
    public interface a<T extends a<T>> extends Comparable<T> {
        void a();

        void d();

        void e();

        e0 f();

        void g();

        n.a l(x.a aVar, x xVar);
    }

    public l() {
        int i10 = f0.f7363n;
    }

    public static int b(d0 d0Var, int i10, Object obj) {
        int b02 = CodedOutputStream.b0(i10);
        if (d0Var == d0.f11750a) {
            b02 *= 2;
        }
        return c(d0Var, obj) + b02;
    }

    public static int c(d0 d0Var, Object obj) {
        switch (d0Var.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                Logger logger = CodedOutputStream.f7318c;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                Logger logger2 = CodedOutputStream.f7318c;
                return 4;
            case 2:
                return CodedOutputStream.f0(((Long) obj).longValue());
            case 3:
                return CodedOutputStream.f0(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.S(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                Logger logger3 = CodedOutputStream.f7318c;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                Logger logger4 = CodedOutputStream.f7318c;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                Logger logger5 = CodedOutputStream.f7318c;
                return 1;
            case 8:
                if (!(obj instanceof c)) {
                    return CodedOutputStream.a0((String) obj);
                }
                Logger logger6 = CodedOutputStream.f7318c;
                int size = ((c) obj).size();
                return CodedOutputStream.d0(size) + size;
            case 9:
                Logger logger7 = CodedOutputStream.f7318c;
                return ((x) obj).c();
            case 10:
                if (obj instanceof q) {
                    return CodedOutputStream.U((q) obj);
                }
                Logger logger8 = CodedOutputStream.f7318c;
                int c10 = ((x) obj).c();
                return CodedOutputStream.d0(c10) + c10;
            case 11:
                if (obj instanceof c) {
                    Logger logger9 = CodedOutputStream.f7318c;
                    int size2 = ((c) obj).size();
                    return CodedOutputStream.d0(size2) + size2;
                }
                Logger logger10 = CodedOutputStream.f7318c;
                int length = ((byte[]) obj).length;
                return CodedOutputStream.d0(length) + length;
            case 12:
                return CodedOutputStream.d0(((Integer) obj).intValue());
            case 13:
                if (obj instanceof p.a) {
                    return CodedOutputStream.S(((p.a) obj).a());
                }
                return CodedOutputStream.S(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                Logger logger11 = CodedOutputStream.f7318c;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger12 = CodedOutputStream.f7318c;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return CodedOutputStream.d0((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return CodedOutputStream.f0((longValue >> 63) ^ (longValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(a<?> aVar, Object obj) {
        aVar.e();
        aVar.a();
        aVar.d();
        return b((d0) null, 0, obj);
    }

    public static int f(Map.Entry entry) {
        a aVar = (a) entry.getKey();
        Object value = entry.getValue();
        if (aVar.f() != e0.MESSAGE) {
            return d(aVar, value);
        }
        aVar.d();
        aVar.g();
        if (value instanceof q) {
            ((a) entry.getKey()).a();
            return CodedOutputStream.U((q) value) + CodedOutputStream.b0(3) + CodedOutputStream.c0(2, 0) + (CodedOutputStream.b0(1) * 2);
        }
        ((a) entry.getKey()).a();
        int c02 = CodedOutputStream.c0(2, 0) + (CodedOutputStream.b0(1) * 2);
        int b02 = CodedOutputStream.b0(3);
        int c10 = ((x) value).c();
        return CodedOutputStream.d0(c10) + c10 + b02 + c02;
    }

    public static <T extends a<T>> boolean j(Map.Entry<T, Object> entry) {
        a aVar = (a) entry.getKey();
        if (aVar.f() != e0.MESSAGE) {
            return true;
        }
        aVar.d();
        Object value = entry.getValue();
        if (value instanceof q) {
            return ((q) value).f();
        }
        if (value instanceof q) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static void o(a aVar, Object obj) {
        aVar.e();
        Charset charset = p.f7415a;
        obj.getClass();
        throw null;
    }

    /* renamed from: a */
    public final l<T> clone() {
        l<T> lVar = new l<>();
        for (int i10 = 0; i10 < this.f7399a.e(); i10++) {
            Map.Entry<T, Object> d10 = this.f7399a.d(i10);
            lVar.n((a) d10.getKey(), d10.getValue());
        }
        for (Map.Entry next : this.f7399a.f()) {
            lVar.n((a) next.getKey(), next.getValue());
        }
        lVar.f7401c = this.f7401c;
        return lVar;
    }

    public final Object e(T t10) {
        Object obj = this.f7399a.get(t10);
        if (obj instanceof q) {
            return ((q) obj).a((x) null);
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        return this.f7399a.equals(((l) obj).f7399a);
    }

    public final int g() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f7399a.e(); i11++) {
            Map.Entry<T, Object> d10 = this.f7399a.d(i11);
            i10 += d((a) d10.getKey(), d10.getValue());
        }
        for (Map.Entry next : this.f7399a.f()) {
            i10 += d((a) next.getKey(), next.getValue());
        }
        return i10;
    }

    public final boolean h() {
        return this.f7399a.isEmpty();
    }

    public final int hashCode() {
        return this.f7399a.hashCode();
    }

    public final boolean i() {
        for (int i10 = 0; i10 < this.f7399a.e(); i10++) {
            if (!j(this.f7399a.d(i10))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> j10 : this.f7399a.f()) {
            if (!j(j10)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<T, Object>> k() {
        if (this.f7401c) {
            return new q.b(this.f7399a.entrySet().iterator());
        }
        return this.f7399a.entrySet().iterator();
    }

    public final void l() {
        if (!this.f7400b) {
            for (int i10 = 0; i10 < this.f7399a.e(); i10++) {
                Map.Entry<T, Object> d10 = this.f7399a.d(i10);
                if (d10.getValue() instanceof n) {
                    n nVar = (n) d10.getValue();
                    nVar.getClass();
                    w wVar = w.f11791c;
                    wVar.getClass();
                    wVar.a(nVar.getClass()).c(nVar);
                    nVar.x();
                }
            }
            this.f7399a.h();
            this.f7400b = true;
        }
    }

    public final void m(Map.Entry<T, Object> entry) {
        a aVar = (a) entry.getKey();
        byte[] value = entry.getValue();
        if (value instanceof q) {
            value = ((q) value).a((x) null);
        }
        aVar.d();
        if (aVar.f() == e0.MESSAGE) {
            Object e10 = e(aVar);
            if (e10 == null) {
                f0<T, Object> f0Var = this.f7399a;
                if (value instanceof byte[]) {
                    byte[] bArr = (byte[]) value;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    value = bArr2;
                }
                f0Var.put(aVar, value);
                return;
            }
            this.f7399a.put(aVar, aVar.l(((x) e10).a(), (x) value).build());
            return;
        }
        f0<T, Object> f0Var2 = this.f7399a;
        if (value instanceof byte[]) {
            byte[] bArr3 = (byte[]) value;
            byte[] bArr4 = new byte[bArr3.length];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            value = bArr4;
        }
        f0Var2.put(aVar, value);
    }

    public final void n(T t10, Object obj) {
        t10.d();
        o(t10, obj);
        throw null;
    }

    public l(int i10) {
        int i11 = f0.f7363n;
        l();
        l();
    }
}
