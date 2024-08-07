package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.l;
import com.google.crypto.tink.shaded.protobuf.p;
import j9.a0;
import j9.c;
import j9.d;
import j9.j;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* compiled from: SchemaUtil */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f7338a;

    /* renamed from: b  reason: collision with root package name */
    public static final g0<?, ?> f7339b = A(false);

    /* renamed from: c  reason: collision with root package name */
    public static final g0<?, ?> f7340c = A(true);

    /* renamed from: d  reason: collision with root package name */
    public static final a0 f7341d = new a0();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f7338a = cls;
    }

    public static g0<?, ?> A(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (g0) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z10)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static <T, FT extends l.a<FT>> void B(j<FT> jVar, T t10, T t11) {
        l<FT> c10 = jVar.c(t11);
        if (!c10.h()) {
            l<FT> d10 = jVar.d(t10);
            d10.getClass();
            for (int i10 = 0; i10 < c10.f7399a.e(); i10++) {
                d10.m(c10.f7399a.d(i10));
            }
            for (Map.Entry<T, Object> m10 : c10.f7399a.f()) {
                d10.m(m10);
            }
        }
    }

    public static boolean C(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public static <UT, UB> UB D(Object obj, int i10, int i11, UB ub2, g0<UT, UB> g0Var) {
        if (ub2 == null) {
            ub2 = g0Var.f(obj);
        }
        g0Var.e(ub2, i10, (long) i11);
        return ub2;
    }

    public static void E(int i10, List list, d dVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                dVar.f11749a.t0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Boolean) list.get(i13)).booleanValue();
                    Logger logger = CodedOutputStream.f7318c;
                    i12++;
                }
                dVar.f11749a.v0(i12);
                while (i11 < list.size()) {
                    dVar.f11749a.g0(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : 0);
                    i11++;
                }
                return;
            }
            dVar.getClass();
            while (i11 < list.size()) {
                dVar.f11749a.h0(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
        }
    }

    public static void F(int i10, List list, d dVar) {
        if (list != null && !list.isEmpty()) {
            dVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                dVar.f11749a.i0(i10, (c) list.get(i11));
            }
        }
    }

    public static void G(int i10, List list, d dVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                dVar.f11749a.t0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Double) list.get(i13)).doubleValue();
                    Logger logger = CodedOutputStream.f7318c;
                    i12 += 8;
                }
                dVar.f11749a.v0(i12);
                while (i11 < list.size()) {
                    CodedOutputStream codedOutputStream = dVar.f11749a;
                    double doubleValue = ((Double) list.get(i11)).doubleValue();
                    codedOutputStream.getClass();
                    codedOutputStream.m0(Double.doubleToRawLongBits(doubleValue));
                    i11++;
                }
                return;
            }
            dVar.getClass();
            while (i11 < list.size()) {
                CodedOutputStream codedOutputStream2 = dVar.f11749a;
                double doubleValue2 = ((Double) list.get(i11)).doubleValue();
                codedOutputStream2.getClass();
                codedOutputStream2.l0(i10, Double.doubleToRawLongBits(doubleValue2));
                i11++;
            }
        }
    }

    public static void H(int i10, List list, d dVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                dVar.f11749a.t0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += CodedOutputStream.S(((Integer) list.get(i13)).intValue());
                }
                dVar.f11749a.v0(i12);
                while (i11 < list.size()) {
                    dVar.f11749a.o0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            dVar.getClass();
            while (i11 < list.size()) {
                dVar.f11749a.n0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void I(int i10, List list, d dVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                dVar.f11749a.t0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).intValue();
                    Logger logger = CodedOutputStream.f7318c;
                    i12 += 4;
                }
                dVar.f11749a.v0(i12);
                while (i11 < list.size()) {
                    dVar.f11749a.k0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            dVar.getClass();
            while (i11 < list.size()) {
                dVar.f11749a.j0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void J(int i10, List list, d dVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                dVar.f11749a.t0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).longValue();
                    Logger logger = CodedOutputStream.f7318c;
                    i12 += 8;
                }
                dVar.f11749a.v0(i12);
                while (i11 < list.size()) {
                    dVar.f11749a.m0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            dVar.getClass();
            while (i11 < list.size()) {
                dVar.f11749a.l0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void K(int i10, List list, d dVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                dVar.f11749a.t0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Float) list.get(i13)).floatValue();
                    Logger logger = CodedOutputStream.f7318c;
                    i12 += 4;
                }
                dVar.f11749a.v0(i12);
                while (i11 < list.size()) {
                    CodedOutputStream codedOutputStream = dVar.f11749a;
                    float floatValue = ((Float) list.get(i11)).floatValue();
                    codedOutputStream.getClass();
                    codedOutputStream.k0(Float.floatToRawIntBits(floatValue));
                    i11++;
                }
                return;
            }
            dVar.getClass();
            while (i11 < list.size()) {
                CodedOutputStream codedOutputStream2 = dVar.f11749a;
                float floatValue2 = ((Float) list.get(i11)).floatValue();
                codedOutputStream2.getClass();
                codedOutputStream2.j0(i10, Float.floatToRawIntBits(floatValue2));
                i11++;
            }
        }
    }

    public static void L(int i10, List list, d dVar, c0 c0Var) {
        if (list != null && !list.isEmpty()) {
            dVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                dVar.h(i10, c0Var, list.get(i11));
            }
        }
    }

    public static void M(int i10, List list, d dVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                dVar.f11749a.t0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += CodedOutputStream.S(((Integer) list.get(i13)).intValue());
                }
                dVar.f11749a.v0(i12);
                while (i11 < list.size()) {
                    dVar.f11749a.o0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            dVar.getClass();
            while (i11 < list.size()) {
                dVar.f11749a.n0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void N(int i10, List list, d dVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                dVar.f11749a.t0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += CodedOutputStream.f0(((Long) list.get(i13)).longValue());
                }
                dVar.f11749a.v0(i12);
                while (i11 < list.size()) {
                    dVar.f11749a.x0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            dVar.getClass();
            while (i11 < list.size()) {
                dVar.f11749a.w0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void O(int i10, List list, d dVar, c0 c0Var) {
        if (list != null && !list.isEmpty()) {
            dVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                dVar.k(i10, c0Var, list.get(i11));
            }
        }
    }

    public static void P(int i10, List list, d dVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                dVar.f11749a.t0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).intValue();
                    Logger logger = CodedOutputStream.f7318c;
                    i12 += 4;
                }
                dVar.f11749a.v0(i12);
                while (i11 < list.size()) {
                    dVar.f11749a.k0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            dVar.getClass();
            while (i11 < list.size()) {
                dVar.f11749a.j0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void Q(int i10, List list, d dVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                dVar.f11749a.t0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).longValue();
                    Logger logger = CodedOutputStream.f7318c;
                    i12 += 8;
                }
                dVar.f11749a.v0(i12);
                while (i11 < list.size()) {
                    dVar.f11749a.m0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            dVar.getClass();
            while (i11 < list.size()) {
                dVar.f11749a.l0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void R(int i10, List list, d dVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                dVar.f11749a.t0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    int intValue = ((Integer) list.get(i13)).intValue();
                    i12 += CodedOutputStream.d0((intValue >> 31) ^ (intValue << 1));
                }
                dVar.f11749a.v0(i12);
                while (i11 < list.size()) {
                    CodedOutputStream codedOutputStream = dVar.f11749a;
                    int intValue2 = ((Integer) list.get(i11)).intValue();
                    codedOutputStream.v0((intValue2 >> 31) ^ (intValue2 << 1));
                    i11++;
                }
                return;
            }
            dVar.getClass();
            while (i11 < list.size()) {
                CodedOutputStream codedOutputStream2 = dVar.f11749a;
                int intValue3 = ((Integer) list.get(i11)).intValue();
                codedOutputStream2.u0(i10, (intValue3 >> 31) ^ (intValue3 << 1));
                i11++;
            }
        }
    }

    public static void S(int i10, List list, d dVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                dVar.f11749a.t0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    long longValue = ((Long) list.get(i13)).longValue();
                    i12 += CodedOutputStream.f0((longValue >> 63) ^ (longValue << 1));
                }
                dVar.f11749a.v0(i12);
                while (i11 < list.size()) {
                    CodedOutputStream codedOutputStream = dVar.f11749a;
                    long longValue2 = ((Long) list.get(i11)).longValue();
                    codedOutputStream.x0((longValue2 >> 63) ^ (longValue2 << 1));
                    i11++;
                }
                return;
            }
            dVar.getClass();
            while (i11 < list.size()) {
                CodedOutputStream codedOutputStream2 = dVar.f11749a;
                long longValue3 = ((Long) list.get(i11)).longValue();
                codedOutputStream2.w0(i10, (longValue3 >> 63) ^ (longValue3 << 1));
                i11++;
            }
        }
    }

    public static void T(int i10, List list, d dVar) {
        if (list != null && !list.isEmpty()) {
            dVar.getClass();
            int i11 = 0;
            if (list instanceof j) {
                j jVar = (j) list;
                while (i11 < list.size()) {
                    Object e10 = jVar.e(i11);
                    if (e10 instanceof String) {
                        dVar.f11749a.s0(i10, (String) e10);
                    } else {
                        dVar.f11749a.i0(i10, (c) e10);
                    }
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                dVar.f11749a.s0(i10, (String) list.get(i11));
                i11++;
            }
        }
    }

    public static void U(int i10, List list, d dVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                dVar.f11749a.t0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += CodedOutputStream.d0(((Integer) list.get(i13)).intValue());
                }
                dVar.f11749a.v0(i12);
                while (i11 < list.size()) {
                    dVar.f11749a.v0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            dVar.getClass();
            while (i11 < list.size()) {
                dVar.f11749a.u0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void V(int i10, List list, d dVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                dVar.f11749a.t0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += CodedOutputStream.f0(((Long) list.get(i13)).longValue());
                }
                dVar.f11749a.v0(i12);
                while (i11 < list.size()) {
                    dVar.f11749a.x0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            dVar.getClass();
            while (i11 < list.size()) {
                dVar.f11749a.w0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static int a(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.J(i10) * size;
    }

    public static int b(List<?> list) {
        return list.size();
    }

    public static int c(int i10, List<c> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int b02 = CodedOutputStream.b0(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int size2 = list.get(i11).size();
            b02 += CodedOutputStream.d0(size2) + size2;
        }
        return b02;
    }

    public static int d(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.b0(i10) * size) + e(list);
    }

    public static int e(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o) {
            o oVar = (o) list;
            i10 = 0;
            while (i11 < size) {
                oVar.l(i11);
                i10 += CodedOutputStream.S(oVar.f7413b[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + CodedOutputStream.S(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int f(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.N(i10) * size;
    }

    public static int g(List<?> list) {
        return list.size() * 4;
    }

    public static int h(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.O(i10) * size;
    }

    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static int j(int i10, List<x> list, c0 c0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += CodedOutputStream.Q(i10, list.get(i12), c0Var);
        }
        return i11;
    }

    public static int k(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.b0(i10) * size) + l(list);
    }

    public static int l(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o) {
            o oVar = (o) list;
            i10 = 0;
            while (i11 < size) {
                oVar.l(i11);
                i10 += CodedOutputStream.S(oVar.f7413b[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + CodedOutputStream.S(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int m(int i10, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (CodedOutputStream.b0(i10) * list.size()) + n(list);
    }

    public static int n(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof u) {
            u uVar = (u) list;
            i10 = 0;
            while (i11 < size) {
                uVar.l(i11);
                i10 += CodedOutputStream.f0(uVar.f7425b[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + CodedOutputStream.f0(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int o(int i10, c0 c0Var, Object obj) {
        if (obj instanceof r) {
            return CodedOutputStream.U((r) obj) + CodedOutputStream.b0(i10);
        }
        int b02 = CodedOutputStream.b0(i10);
        int h10 = ((a) ((x) obj)).h(c0Var);
        return CodedOutputStream.d0(h10) + h10 + b02;
    }

    public static int p(int i10, List<?> list, c0 c0Var) {
        int i11;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int b02 = CodedOutputStream.b0(i10) * size;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            if (obj instanceof r) {
                i11 = CodedOutputStream.U((r) obj);
            } else {
                int h10 = ((a) ((x) obj)).h(c0Var);
                i11 = h10 + CodedOutputStream.d0(h10);
            }
            b02 += i11;
        }
        return b02;
    }

    public static int q(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.b0(i10) * size) + r(list);
    }

    public static int r(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o) {
            o oVar = (o) list;
            i10 = 0;
            while (i11 < size) {
                oVar.l(i11);
                int i12 = oVar.f7413b[i11];
                i10 += CodedOutputStream.d0((i12 >> 31) ^ (i12 << 1));
                i11++;
            }
        } else {
            int i13 = 0;
            while (i11 < size) {
                int intValue = list.get(i11).intValue();
                i13 = i10 + CodedOutputStream.d0((intValue >> 31) ^ (intValue << 1));
                i11++;
            }
        }
        return i10;
    }

    public static int s(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.b0(i10) * size) + t(list);
    }

    public static int t(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof u) {
            u uVar = (u) list;
            i10 = 0;
            while (i11 < size) {
                uVar.l(i11);
                long j10 = uVar.f7425b[i11];
                i10 += CodedOutputStream.f0((j10 >> 63) ^ (j10 << 1));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                long longValue = list.get(i11).longValue();
                i12 = i10 + CodedOutputStream.f0((longValue >> 63) ^ (longValue << 1));
                i11++;
            }
        }
        return i10;
    }

    public static int u(int i10, List<?> list) {
        int i11;
        int i12;
        int size = list.size();
        int i13 = 0;
        if (size == 0) {
            return 0;
        }
        int b02 = CodedOutputStream.b0(i10) * size;
        if (list instanceof j) {
            j jVar = (j) list;
            while (i13 < size) {
                Object e10 = jVar.e(i13);
                if (e10 instanceof c) {
                    int size2 = ((c) e10).size();
                    i12 = CodedOutputStream.d0(size2) + size2;
                } else {
                    i12 = CodedOutputStream.a0((String) e10);
                }
                b02 += i12;
                i13++;
            }
        } else {
            while (i13 < size) {
                Object obj = list.get(i13);
                if (obj instanceof c) {
                    int size3 = ((c) obj).size();
                    i11 = CodedOutputStream.d0(size3) + size3;
                } else {
                    i11 = CodedOutputStream.a0((String) obj);
                }
                b02 += i11;
                i13++;
            }
        }
        return b02;
    }

    public static int v(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.b0(i10) * size) + w(list);
    }

    public static int w(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o) {
            o oVar = (o) list;
            i10 = 0;
            while (i11 < size) {
                oVar.l(i11);
                i10 += CodedOutputStream.d0(oVar.f7413b[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + CodedOutputStream.d0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int x(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.b0(i10) * size) + y(list);
    }

    public static int y(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof u) {
            u uVar = (u) list;
            i10 = 0;
            while (i11 < size) {
                uVar.l(i11);
                i10 += CodedOutputStream.f0(uVar.f7425b[i11]);
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + CodedOutputStream.f0(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static <UT, UB> UB z(Object obj, int i10, List<Integer> list, p.b bVar, UB ub2, g0<UT, UB> g0Var) {
        if (bVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (bVar.a()) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = D(obj, i10, intValue, ub2, g0Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!bVar.a()) {
                    ub2 = D(obj, i10, intValue2, ub2, g0Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }
}
