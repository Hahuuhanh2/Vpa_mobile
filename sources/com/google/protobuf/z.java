package com.google.protobuf;

import com.google.protobuf.h;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import tc.c;
import tc.k;
import tc.x;

/* compiled from: SchemaUtil */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f7961a;

    /* renamed from: b  reason: collision with root package name */
    public static final c0<?, ?> f7962b = z(false);

    /* renamed from: c  reason: collision with root package name */
    public static final c0<?, ?> f7963c = z(true);

    /* renamed from: d  reason: collision with root package name */
    public static final tc.z f7964d = new tc.z();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f7961a = cls;
    }

    public static <T, FT extends h.a<FT>> void A(f<FT> fVar, T t10, T t11) {
        h<FT> b10 = fVar.b(t11);
        if (!b10.h()) {
            h<FT> c10 = fVar.c(t10);
            c10.getClass();
            for (int i10 = 0; i10 < b10.f7902a.e(); i10++) {
                c10.m(b10.f7902a.d(i10));
            }
            for (Map.Entry<T, Object> m10 : b10.f7902a.f()) {
                c10.m(m10);
            }
        }
    }

    public static boolean B(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public static void C(int i10, List list, e eVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                eVar.f7899a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Boolean) list.get(i13)).booleanValue();
                    Logger logger = CodedOutputStream.f7863c;
                    i12++;
                }
                eVar.f7899a.z0(i12);
                while (i11 < list.size()) {
                    eVar.f7899a.g0(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : 0);
                    i11++;
                }
                return;
            }
            eVar.getClass();
            while (i11 < list.size()) {
                eVar.f7899a.h0(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
        }
    }

    public static void D(int i10, List list, e eVar) {
        if (list != null && !list.isEmpty()) {
            eVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                eVar.f7899a.j0(i10, (c) list.get(i11));
            }
        }
    }

    public static void E(int i10, List list, e eVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                eVar.f7899a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Double) list.get(i13)).doubleValue();
                    Logger logger = CodedOutputStream.f7863c;
                    i12 += 8;
                }
                eVar.f7899a.z0(i12);
                while (i11 < list.size()) {
                    CodedOutputStream codedOutputStream = eVar.f7899a;
                    double doubleValue = ((Double) list.get(i11)).doubleValue();
                    codedOutputStream.getClass();
                    codedOutputStream.o0(Double.doubleToRawLongBits(doubleValue));
                    i11++;
                }
                return;
            }
            eVar.getClass();
            while (i11 < list.size()) {
                CodedOutputStream codedOutputStream2 = eVar.f7899a;
                double doubleValue2 = ((Double) list.get(i11)).doubleValue();
                codedOutputStream2.getClass();
                codedOutputStream2.n0(i10, Double.doubleToRawLongBits(doubleValue2));
                i11++;
            }
        }
    }

    public static void F(int i10, List list, e eVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                eVar.f7899a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += CodedOutputStream.S(((Integer) list.get(i13)).intValue());
                }
                eVar.f7899a.z0(i12);
                while (i11 < list.size()) {
                    eVar.f7899a.q0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            eVar.getClass();
            while (i11 < list.size()) {
                eVar.f7899a.p0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void G(int i10, List list, e eVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                eVar.f7899a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).intValue();
                    Logger logger = CodedOutputStream.f7863c;
                    i12 += 4;
                }
                eVar.f7899a.z0(i12);
                while (i11 < list.size()) {
                    eVar.f7899a.m0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            eVar.getClass();
            while (i11 < list.size()) {
                eVar.f7899a.l0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void H(int i10, List list, e eVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                eVar.f7899a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).longValue();
                    Logger logger = CodedOutputStream.f7863c;
                    i12 += 8;
                }
                eVar.f7899a.z0(i12);
                while (i11 < list.size()) {
                    eVar.f7899a.o0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            eVar.getClass();
            while (i11 < list.size()) {
                eVar.f7899a.n0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void I(int i10, List list, e eVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                eVar.f7899a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Float) list.get(i13)).floatValue();
                    Logger logger = CodedOutputStream.f7863c;
                    i12 += 4;
                }
                eVar.f7899a.z0(i12);
                while (i11 < list.size()) {
                    CodedOutputStream codedOutputStream = eVar.f7899a;
                    float floatValue = ((Float) list.get(i11)).floatValue();
                    codedOutputStream.getClass();
                    codedOutputStream.m0(Float.floatToRawIntBits(floatValue));
                    i11++;
                }
                return;
            }
            eVar.getClass();
            while (i11 < list.size()) {
                CodedOutputStream codedOutputStream2 = eVar.f7899a;
                float floatValue2 = ((Float) list.get(i11)).floatValue();
                codedOutputStream2.getClass();
                codedOutputStream2.l0(i10, Float.floatToRawIntBits(floatValue2));
                i11++;
            }
        }
    }

    public static void J(int i10, List list, e eVar, x xVar) {
        if (list != null && !list.isEmpty()) {
            eVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                eVar.h(i10, xVar, list.get(i11));
            }
        }
    }

    public static void K(int i10, List list, e eVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                eVar.f7899a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += CodedOutputStream.S(((Integer) list.get(i13)).intValue());
                }
                eVar.f7899a.z0(i12);
                while (i11 < list.size()) {
                    eVar.f7899a.q0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            eVar.getClass();
            while (i11 < list.size()) {
                eVar.f7899a.p0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void L(int i10, List list, e eVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                eVar.f7899a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += CodedOutputStream.f0(((Long) list.get(i13)).longValue());
                }
                eVar.f7899a.z0(i12);
                while (i11 < list.size()) {
                    eVar.f7899a.B0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            eVar.getClass();
            while (i11 < list.size()) {
                eVar.f7899a.A0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void M(int i10, List list, e eVar, x xVar) {
        if (list != null && !list.isEmpty()) {
            eVar.getClass();
            for (int i11 = 0; i11 < list.size(); i11++) {
                eVar.k(i10, xVar, list.get(i11));
            }
        }
    }

    public static void N(int i10, List list, e eVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                eVar.f7899a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Integer) list.get(i13)).intValue();
                    Logger logger = CodedOutputStream.f7863c;
                    i12 += 4;
                }
                eVar.f7899a.z0(i12);
                while (i11 < list.size()) {
                    eVar.f7899a.m0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            eVar.getClass();
            while (i11 < list.size()) {
                eVar.f7899a.l0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void O(int i10, List list, e eVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                eVar.f7899a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ((Long) list.get(i13)).longValue();
                    Logger logger = CodedOutputStream.f7863c;
                    i12 += 8;
                }
                eVar.f7899a.z0(i12);
                while (i11 < list.size()) {
                    eVar.f7899a.o0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            eVar.getClass();
            while (i11 < list.size()) {
                eVar.f7899a.n0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
        }
    }

    public static void P(int i10, List list, e eVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                eVar.f7899a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    int intValue = ((Integer) list.get(i13)).intValue();
                    i12 += CodedOutputStream.d0((intValue >> 31) ^ (intValue << 1));
                }
                eVar.f7899a.z0(i12);
                while (i11 < list.size()) {
                    CodedOutputStream codedOutputStream = eVar.f7899a;
                    int intValue2 = ((Integer) list.get(i11)).intValue();
                    codedOutputStream.z0((intValue2 >> 31) ^ (intValue2 << 1));
                    i11++;
                }
                return;
            }
            eVar.getClass();
            while (i11 < list.size()) {
                CodedOutputStream codedOutputStream2 = eVar.f7899a;
                int intValue3 = ((Integer) list.get(i11)).intValue();
                codedOutputStream2.y0(i10, (intValue3 >> 31) ^ (intValue3 << 1));
                i11++;
            }
        }
    }

    public static void Q(int i10, List list, e eVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                eVar.f7899a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    long longValue = ((Long) list.get(i13)).longValue();
                    i12 += CodedOutputStream.f0((longValue >> 63) ^ (longValue << 1));
                }
                eVar.f7899a.z0(i12);
                while (i11 < list.size()) {
                    CodedOutputStream codedOutputStream = eVar.f7899a;
                    long longValue2 = ((Long) list.get(i11)).longValue();
                    codedOutputStream.B0((longValue2 >> 63) ^ (longValue2 << 1));
                    i11++;
                }
                return;
            }
            eVar.getClass();
            while (i11 < list.size()) {
                CodedOutputStream codedOutputStream2 = eVar.f7899a;
                long longValue3 = ((Long) list.get(i11)).longValue();
                codedOutputStream2.A0(i10, (longValue3 >> 63) ^ (longValue3 << 1));
                i11++;
            }
        }
    }

    public static void R(int i10, List list, e eVar) {
        if (list != null && !list.isEmpty()) {
            eVar.getClass();
            int i11 = 0;
            if (list instanceof k) {
                k kVar = (k) list;
                while (i11 < list.size()) {
                    Object e10 = kVar.e(i11);
                    if (e10 instanceof String) {
                        eVar.f7899a.v0(i10, (String) e10);
                    } else {
                        eVar.f7899a.j0(i10, (c) e10);
                    }
                    i11++;
                }
                return;
            }
            while (i11 < list.size()) {
                eVar.f7899a.v0(i10, (String) list.get(i11));
                i11++;
            }
        }
    }

    public static void S(int i10, List list, e eVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                eVar.f7899a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += CodedOutputStream.d0(((Integer) list.get(i13)).intValue());
                }
                eVar.f7899a.z0(i12);
                while (i11 < list.size()) {
                    eVar.f7899a.z0(((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            eVar.getClass();
            while (i11 < list.size()) {
                eVar.f7899a.y0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
    }

    public static void T(int i10, List list, e eVar, boolean z10) {
        if (list != null && !list.isEmpty()) {
            int i11 = 0;
            if (z10) {
                eVar.f7899a.x0(i10, 2);
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    i12 += CodedOutputStream.f0(((Long) list.get(i13)).longValue());
                }
                eVar.f7899a.z0(i12);
                while (i11 < list.size()) {
                    eVar.f7899a.B0(((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            eVar.getClass();
            while (i11 < list.size()) {
                eVar.f7899a.A0(i10, ((Long) list.get(i11)).longValue());
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
        if (list instanceof j) {
            j jVar = (j) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.S(jVar.m(i11));
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

    public static int j(int i10, List<u> list, x xVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += CodedOutputStream.Q(i10, list.get(i12), xVar);
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
        if (list instanceof j) {
            j jVar = (j) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.S(jVar.m(i11));
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
        if (list instanceof p) {
            p pVar = (p) list;
            i10 = 0;
            while (i11 < size) {
                pVar.l(i11);
                i10 += CodedOutputStream.f0(pVar.f7927b[i11]);
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

    public static int o(int i10, x xVar, Object obj) {
        if (obj instanceof m) {
            return CodedOutputStream.U((m) obj) + CodedOutputStream.b0(i10);
        }
        int b02 = CodedOutputStream.b0(i10);
        int i11 = ((a) ((u) obj)).i(xVar);
        return CodedOutputStream.d0(i11) + i11 + b02;
    }

    public static int p(int i10, List<?> list, x xVar) {
        int i11;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int b02 = CodedOutputStream.b0(i10) * size;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            if (obj instanceof m) {
                i11 = CodedOutputStream.U((m) obj);
            } else {
                int i13 = ((a) ((u) obj)).i(xVar);
                i11 = i13 + CodedOutputStream.d0(i13);
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
        if (list instanceof j) {
            j jVar = (j) list;
            i10 = 0;
            while (i11 < size) {
                int m10 = jVar.m(i11);
                i10 += CodedOutputStream.d0((m10 >> 31) ^ (m10 << 1));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                int intValue = list.get(i11).intValue();
                i12 = i10 + CodedOutputStream.d0((intValue >> 31) ^ (intValue << 1));
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
        if (list instanceof p) {
            p pVar = (p) list;
            i10 = 0;
            while (i11 < size) {
                pVar.l(i11);
                long j10 = pVar.f7927b[i11];
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
        if (list instanceof k) {
            k kVar = (k) list;
            while (i13 < size) {
                Object e10 = kVar.e(i13);
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
        if (list instanceof j) {
            j jVar = (j) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.d0(jVar.m(i11));
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
        if (list instanceof p) {
            p pVar = (p) list;
            i10 = 0;
            while (i11 < size) {
                pVar.l(i11);
                i10 += CodedOutputStream.f0(pVar.f7927b[i11]);
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

    public static c0<?, ?> z(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (c0) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z10)});
        } catch (Throwable unused2) {
            return null;
        }
    }
}
