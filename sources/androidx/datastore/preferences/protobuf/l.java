package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.l.a;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.q;
import androidx.datastore.preferences.protobuf.z;
import j2.a0;
import j2.c;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* compiled from: FieldSet */
public final class l<T extends a<T>> {

    /* renamed from: d  reason: collision with root package name */
    public static final l f2299d = new l(0);

    /* renamed from: a  reason: collision with root package name */
    public final i0<T, Object> f2300a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2301b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2302c;

    /* compiled from: FieldSet */
    public interface a<T extends a<T>> extends Comparable<T> {
        void a();

        void d();

        void e();

        a0 f();

        void g();

        n.a r(z.a aVar, z zVar);
    }

    public l() {
        int i10 = i0.f2276n;
        this.f2300a = new h0(16);
    }

    public static int b(j2.z zVar, int i10, Object obj) {
        int b02 = CodedOutputStream.b0(i10);
        if (zVar == j2.z.f11536d) {
            b02 *= 2;
        }
        return c(zVar, obj) + b02;
    }

    public static int c(j2.z zVar, Object obj) {
        switch (zVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                Logger logger = CodedOutputStream.f2201c;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                Logger logger2 = CodedOutputStream.f2201c;
                return 4;
            case 2:
                return CodedOutputStream.f0(((Long) obj).longValue());
            case 3:
                return CodedOutputStream.f0(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.S(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                Logger logger3 = CodedOutputStream.f2201c;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                Logger logger4 = CodedOutputStream.f2201c;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                Logger logger5 = CodedOutputStream.f2201c;
                return 1;
            case 8:
                if (!(obj instanceof c)) {
                    return CodedOutputStream.a0((String) obj);
                }
                Logger logger6 = CodedOutputStream.f2201c;
                int size = ((c) obj).size();
                return CodedOutputStream.d0(size) + size;
            case 9:
                Logger logger7 = CodedOutputStream.f2201c;
                return ((z) obj).c();
            case 10:
                if (obj instanceof q) {
                    return CodedOutputStream.U((q) obj);
                }
                Logger logger8 = CodedOutputStream.f2201c;
                int c10 = ((z) obj).c();
                return CodedOutputStream.d0(c10) + c10;
            case 11:
                if (obj instanceof c) {
                    Logger logger9 = CodedOutputStream.f2201c;
                    int size2 = ((c) obj).size();
                    return CodedOutputStream.d0(size2) + size2;
                }
                Logger logger10 = CodedOutputStream.f2201c;
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
                Logger logger11 = CodedOutputStream.f2201c;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger12 = CodedOutputStream.f2201c;
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
        return b((j2.z) null, 0, obj);
    }

    public static int f(Map.Entry entry) {
        a aVar = (a) entry.getKey();
        Object value = entry.getValue();
        if (aVar.f() != a0.MESSAGE) {
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
        int c10 = ((z) value).c();
        return CodedOutputStream.d0(c10) + c10 + b02 + c02;
    }

    public static <T extends a<T>> boolean j(Map.Entry<T, Object> entry) {
        a aVar = (a) entry.getKey();
        if (aVar.f() == a0.MESSAGE) {
            aVar.d();
            Object value = entry.getValue();
            if (value instanceof z) {
                if (!((z) value).f()) {
                    return false;
                }
            } else if (value instanceof q) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if ((r2 instanceof byte[]) == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if ((r2 instanceof androidx.datastore.preferences.protobuf.q) == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if ((r2 instanceof androidx.datastore.preferences.protobuf.p.a) == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void n(j2.z r1, java.lang.Object r2) {
        /*
            java.nio.charset.Charset r0 = androidx.datastore.preferences.protobuf.p.f2318a
            r2.getClass()
            j2.a0 r1 = r1.f11539a
            int r1 = r1.ordinal()
            r0 = 0
            switch(r1) {
                case 0: goto L_0x003c;
                case 1: goto L_0x0039;
                case 2: goto L_0x0036;
                case 3: goto L_0x0033;
                case 4: goto L_0x0030;
                case 5: goto L_0x002d;
                case 6: goto L_0x0022;
                case 7: goto L_0x0019;
                case 8: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x003e
        L_0x0010:
            boolean r1 = r2 instanceof androidx.datastore.preferences.protobuf.z
            if (r1 != 0) goto L_0x002a
            boolean r1 = r2 instanceof androidx.datastore.preferences.protobuf.q
            if (r1 == 0) goto L_0x003e
            goto L_0x002a
        L_0x0019:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 != 0) goto L_0x002a
            boolean r1 = r2 instanceof androidx.datastore.preferences.protobuf.p.a
            if (r1 == 0) goto L_0x003e
            goto L_0x002a
        L_0x0022:
            boolean r1 = r2 instanceof j2.c
            if (r1 != 0) goto L_0x002a
            boolean r1 = r2 instanceof byte[]
            if (r1 == 0) goto L_0x003e
        L_0x002a:
            r1 = 1
            r0 = r1
            goto L_0x003e
        L_0x002d:
            boolean r0 = r2 instanceof java.lang.String
            goto L_0x003e
        L_0x0030:
            boolean r0 = r2 instanceof java.lang.Boolean
            goto L_0x003e
        L_0x0033:
            boolean r0 = r2 instanceof java.lang.Double
            goto L_0x003e
        L_0x0036:
            boolean r0 = r2 instanceof java.lang.Float
            goto L_0x003e
        L_0x0039:
            boolean r0 = r2 instanceof java.lang.Long
            goto L_0x003e
        L_0x003c:
            boolean r0 = r2 instanceof java.lang.Integer
        L_0x003e:
            if (r0 == 0) goto L_0x0041
            return
        L_0x0041:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.l.n(j2.z, java.lang.Object):void");
    }

    public static void o(CodedOutputStream codedOutputStream, j2.z zVar, int i10, Object obj) {
        if (zVar == j2.z.f11536d) {
            codedOutputStream.y0(i10, 3);
            ((z) obj).j(codedOutputStream);
            codedOutputStream.y0(i10, 4);
            return;
        }
        codedOutputStream.y0(i10, zVar.f11540b);
        switch (zVar.ordinal()) {
            case 0:
                codedOutputStream.p0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                codedOutputStream.n0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                codedOutputStream.C0(((Long) obj).longValue());
                return;
            case 3:
                codedOutputStream.C0(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.r0(((Integer) obj).intValue());
                return;
            case 5:
                codedOutputStream.p0(((Long) obj).longValue());
                return;
            case 6:
                codedOutputStream.n0(((Integer) obj).intValue());
                return;
            case 7:
                codedOutputStream.h0(((Boolean) obj).booleanValue() ? (byte) 1 : 0);
                return;
            case 8:
                if (obj instanceof c) {
                    codedOutputStream.l0((c) obj);
                    return;
                } else {
                    codedOutputStream.x0((String) obj);
                    return;
                }
            case 9:
                ((z) obj).j(codedOutputStream);
                return;
            case 10:
                codedOutputStream.t0((z) obj);
                return;
            case 11:
                if (obj instanceof c) {
                    codedOutputStream.l0((c) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                codedOutputStream.j0(bArr, bArr.length);
                return;
            case 12:
                codedOutputStream.A0(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof p.a) {
                    codedOutputStream.r0(((p.a) obj).a());
                    return;
                } else {
                    codedOutputStream.r0(((Integer) obj).intValue());
                    return;
                }
            case 14:
                codedOutputStream.n0(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.p0(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                codedOutputStream.A0((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                codedOutputStream.C0((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final l<T> clone() {
        l<T> lVar = new l<>();
        for (int i10 = 0; i10 < this.f2300a.e(); i10++) {
            Map.Entry<T, Object> d10 = this.f2300a.d(i10);
            lVar.m((a) d10.getKey(), d10.getValue());
        }
        for (Map.Entry next : this.f2300a.f()) {
            lVar.m((a) next.getKey(), next.getValue());
        }
        lVar.f2302c = this.f2302c;
        return lVar;
    }

    public final Object e(T t10) {
        Object obj = this.f2300a.get(t10);
        if (obj instanceof q) {
            return ((q) obj).a((z) null);
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
        return this.f2300a.equals(((l) obj).f2300a);
    }

    public final int g() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f2300a.e(); i11++) {
            Map.Entry<T, Object> d10 = this.f2300a.d(i11);
            i10 += d((a) d10.getKey(), d10.getValue());
        }
        for (Map.Entry next : this.f2300a.f()) {
            i10 += d((a) next.getKey(), next.getValue());
        }
        return i10;
    }

    public final boolean h() {
        return this.f2300a.isEmpty();
    }

    public final int hashCode() {
        return this.f2300a.hashCode();
    }

    public final boolean i() {
        for (int i10 = 0; i10 < this.f2300a.e(); i10++) {
            if (!j(this.f2300a.d(i10))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> j10 : this.f2300a.f()) {
            if (!j(j10)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<T, Object>> k() {
        if (this.f2302c) {
            return new q.b(this.f2300a.entrySet().iterator());
        }
        return this.f2300a.entrySet().iterator();
    }

    public final void l(Map.Entry<T, Object> entry) {
        a aVar = (a) entry.getKey();
        byte[] value = entry.getValue();
        if (value instanceof q) {
            value = ((q) value).a((z) null);
        }
        aVar.d();
        if (aVar.f() == a0.MESSAGE) {
            Object e10 = e(aVar);
            if (e10 == null) {
                i0<T, Object> i0Var = this.f2300a;
                if (value instanceof byte[]) {
                    byte[] bArr = (byte[]) value;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    value = bArr2;
                }
                i0Var.put(aVar, value);
                return;
            }
            this.f2300a.put(aVar, aVar.r(((z) e10).a(), (z) value).k());
            return;
        }
        i0<T, Object> i0Var2 = this.f2300a;
        if (value instanceof byte[]) {
            byte[] bArr3 = (byte[]) value;
            byte[] bArr4 = new byte[bArr3.length];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            value = bArr4;
        }
        i0Var2.put(aVar, value);
    }

    public final void m(T t10, Object obj) {
        t10.d();
        t10.e();
        n((j2.z) null, obj);
        if (obj instanceof q) {
            this.f2302c = true;
        }
        this.f2300a.put(t10, obj);
    }

    public l(int i10) {
        int i11 = i0.f2276n;
        h0 h0Var = new h0(0);
        this.f2300a = h0Var;
        if (!this.f2301b) {
            h0Var.h();
            this.f2301b = true;
        }
        if (!this.f2301b) {
            h0Var.h();
            this.f2301b = true;
        }
    }
}
