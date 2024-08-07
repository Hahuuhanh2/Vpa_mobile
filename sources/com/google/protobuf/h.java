package com.google.protobuf;

import com.google.protobuf.h.a;
import com.google.protobuf.i;
import com.google.protobuf.k;
import com.google.protobuf.l;
import com.google.protobuf.u;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;
import tc.c;
import tc.c0;
import tc.d0;
import tc.p;
import tc.v;

/* compiled from: FieldSet */
public final class h<T extends a<T>> {

    /* renamed from: d  reason: collision with root package name */
    public static final h f7901d = new h(0);

    /* renamed from: a  reason: collision with root package name */
    public final b0<T, Object> f7902a = new a0(16);

    /* renamed from: b  reason: collision with root package name */
    public boolean f7903b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7904c;

    /* compiled from: FieldSet */
    public interface a<T extends a<T>> extends Comparable<T> {
        void a();

        void d();

        void e();

        d0 f();

        void g();

        i.a h(u.a aVar, u uVar);
    }

    public h() {
        int i10 = b0.f7870n;
    }

    public static int b(c0 c0Var, int i10, Object obj) {
        int b02 = CodedOutputStream.b0(i10);
        if (c0Var == c0.f14967e) {
            b02 *= 2;
        }
        return c(c0Var, obj) + b02;
    }

    public static int c(c0 c0Var, Object obj) {
        switch (c0Var.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                Logger logger = CodedOutputStream.f7863c;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                Logger logger2 = CodedOutputStream.f7863c;
                return 4;
            case 2:
                return CodedOutputStream.f0(((Long) obj).longValue());
            case 3:
                return CodedOutputStream.f0(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.S(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                Logger logger3 = CodedOutputStream.f7863c;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                Logger logger4 = CodedOutputStream.f7863c;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                Logger logger5 = CodedOutputStream.f7863c;
                return 1;
            case 8:
                if (!(obj instanceof c)) {
                    return CodedOutputStream.a0((String) obj);
                }
                Logger logger6 = CodedOutputStream.f7863c;
                int size = ((c) obj).size();
                return CodedOutputStream.d0(size) + size;
            case 9:
                Logger logger7 = CodedOutputStream.f7863c;
                return ((u) obj).c();
            case 10:
                if (obj instanceof l) {
                    return CodedOutputStream.U((l) obj);
                }
                Logger logger8 = CodedOutputStream.f7863c;
                int c10 = ((u) obj).c();
                return CodedOutputStream.d0(c10) + c10;
            case 11:
                if (obj instanceof c) {
                    Logger logger9 = CodedOutputStream.f7863c;
                    int size2 = ((c) obj).size();
                    return CodedOutputStream.d0(size2) + size2;
                }
                Logger logger10 = CodedOutputStream.f7863c;
                int length = ((byte[]) obj).length;
                return CodedOutputStream.d0(length) + length;
            case 12:
                return CodedOutputStream.d0(((Integer) obj).intValue());
            case 13:
                if (obj instanceof k.a) {
                    return CodedOutputStream.S(((k.a) obj).a());
                }
                return CodedOutputStream.S(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                Logger logger11 = CodedOutputStream.f7863c;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger12 = CodedOutputStream.f7863c;
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
        return b((c0) null, 0, obj);
    }

    public static int f(Map.Entry entry) {
        a aVar = (a) entry.getKey();
        Object value = entry.getValue();
        if (aVar.f() != d0.MESSAGE) {
            return d(aVar, value);
        }
        aVar.d();
        aVar.g();
        if (value instanceof l) {
            ((a) entry.getKey()).a();
            return CodedOutputStream.U((l) value) + CodedOutputStream.b0(3) + CodedOutputStream.c0(2, 0) + (CodedOutputStream.b0(1) * 2);
        }
        ((a) entry.getKey()).a();
        int c02 = CodedOutputStream.c0(2, 0) + (CodedOutputStream.b0(1) * 2);
        int b02 = CodedOutputStream.b0(3);
        int c10 = ((u) value).c();
        return CodedOutputStream.d0(c10) + c10 + b02 + c02;
    }

    public static <T extends a<T>> boolean j(Map.Entry<T, Object> entry) {
        a aVar = (a) entry.getKey();
        if (aVar.f() != d0.MESSAGE) {
            return true;
        }
        aVar.d();
        Object value = entry.getValue();
        if (value instanceof p) {
            return ((p) value).f();
        }
        if (value instanceof l) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static void o(a aVar, Object obj) {
        aVar.e();
        Charset charset = k.f7917a;
        obj.getClass();
        throw null;
    }

    public static void p(CodedOutputStream codedOutputStream, c0 c0Var, int i10, Object obj) {
        if (c0Var == c0.f14967e) {
            codedOutputStream.x0(i10, 3);
            ((u) obj).k(codedOutputStream);
            codedOutputStream.x0(i10, 4);
            return;
        }
        codedOutputStream.x0(i10, c0Var.f14970b);
        switch (c0Var.ordinal()) {
            case 0:
                codedOutputStream.o0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                codedOutputStream.m0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                codedOutputStream.B0(((Long) obj).longValue());
                return;
            case 3:
                codedOutputStream.B0(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.q0(((Integer) obj).intValue());
                return;
            case 5:
                codedOutputStream.o0(((Long) obj).longValue());
                return;
            case 6:
                codedOutputStream.m0(((Integer) obj).intValue());
                return;
            case 7:
                codedOutputStream.g0(((Boolean) obj).booleanValue() ? (byte) 1 : 0);
                return;
            case 8:
                if (obj instanceof c) {
                    codedOutputStream.k0((c) obj);
                    return;
                } else {
                    codedOutputStream.w0((String) obj);
                    return;
                }
            case 9:
                ((u) obj).k(codedOutputStream);
                return;
            case 10:
                codedOutputStream.s0((u) obj);
                return;
            case 11:
                if (obj instanceof c) {
                    codedOutputStream.k0((c) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                codedOutputStream.i0(bArr, bArr.length);
                return;
            case 12:
                codedOutputStream.z0(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof k.a) {
                    codedOutputStream.q0(((k.a) obj).a());
                    return;
                } else {
                    codedOutputStream.q0(((Integer) obj).intValue());
                    return;
                }
            case 14:
                codedOutputStream.m0(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.o0(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                codedOutputStream.z0((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                codedOutputStream.B0((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final h<T> clone() {
        h<T> hVar = new h<>();
        for (int i10 = 0; i10 < this.f7902a.e(); i10++) {
            Map.Entry<T, Object> d10 = this.f7902a.d(i10);
            hVar.n((a) d10.getKey(), d10.getValue());
        }
        for (Map.Entry next : this.f7902a.f()) {
            hVar.n((a) next.getKey(), next.getValue());
        }
        hVar.f7904c = this.f7904c;
        return hVar;
    }

    public final Object e(T t10) {
        Object obj = this.f7902a.get(t10);
        if (obj instanceof l) {
            return ((l) obj).a((u) null);
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return this.f7902a.equals(((h) obj).f7902a);
    }

    public final int g() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f7902a.e(); i11++) {
            Map.Entry<T, Object> d10 = this.f7902a.d(i11);
            i10 += d((a) d10.getKey(), d10.getValue());
        }
        for (Map.Entry next : this.f7902a.f()) {
            i10 += d((a) next.getKey(), next.getValue());
        }
        return i10;
    }

    public final boolean h() {
        return this.f7902a.isEmpty();
    }

    public final int hashCode() {
        return this.f7902a.hashCode();
    }

    public final boolean i() {
        for (int i10 = 0; i10 < this.f7902a.e(); i10++) {
            if (!j(this.f7902a.d(i10))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> j10 : this.f7902a.f()) {
            if (!j(j10)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<T, Object>> k() {
        if (this.f7904c) {
            return new l.b(this.f7902a.entrySet().iterator());
        }
        return this.f7902a.entrySet().iterator();
    }

    public final void l() {
        if (!this.f7903b) {
            for (int i10 = 0; i10 < this.f7902a.e(); i10++) {
                Map.Entry<T, Object> d10 = this.f7902a.d(i10);
                if (d10.getValue() instanceof i) {
                    i iVar = (i) d10.getValue();
                    iVar.getClass();
                    v vVar = v.f15013c;
                    vVar.getClass();
                    vVar.a(iVar.getClass()).c(iVar);
                    iVar.C();
                }
            }
            this.f7902a.h();
            this.f7903b = true;
        }
    }

    public final void m(Map.Entry<T, Object> entry) {
        a aVar = (a) entry.getKey();
        byte[] value = entry.getValue();
        if (value instanceof l) {
            value = ((l) value).a((u) null);
        }
        aVar.d();
        if (aVar.f() == d0.MESSAGE) {
            Object e10 = e(aVar);
            if (e10 == null) {
                b0<T, Object> b0Var = this.f7902a;
                if (value instanceof byte[]) {
                    byte[] bArr = (byte[]) value;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    value = bArr2;
                }
                b0Var.put(aVar, value);
                return;
            }
            this.f7902a.put(aVar, aVar.h(((u) e10).a(), (u) value).q());
            return;
        }
        b0<T, Object> b0Var2 = this.f7902a;
        if (value instanceof byte[]) {
            byte[] bArr3 = (byte[]) value;
            byte[] bArr4 = new byte[bArr3.length];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            value = bArr4;
        }
        b0Var2.put(aVar, value);
    }

    public final void n(T t10, Object obj) {
        t10.d();
        o(t10, obj);
        throw null;
    }

    public h(int i10) {
        int i11 = b0.f7870n;
        l();
        l();
    }
}
