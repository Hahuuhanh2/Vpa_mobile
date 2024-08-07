package j$.util.stream;

import j$.util.concurrent.u;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.C0;
import j$.util.function.C0372f;
import j$.util.function.C0381j0;
import j$.util.function.C0400z;
import j$.util.function.D;
import j$.util.function.F0;
import j$.util.function.Function;
import j$.util.function.IntFunction;
import j$.util.function.K0;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import j$.util.function.W;
import j$.util.function.t0;
import j$.util.function.w0;
import j$.util.function.z0;
import java.util.List;
import java.util.Set;

/* renamed from: j$.util.stream.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0418b implements IntFunction, Function, C0372f, z0, BiConsumer, C0400z, K0, ToDoubleFunction, ToIntFunction, W, C0, w0, ToLongFunction, F0, C0381j0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18753a;

    public /* synthetic */ C0418b(int i10) {
        this.f18753a = i10;
    }

    public final BiFunction a(Function function) {
        function.getClass();
        return new u(this, function);
    }

    /* renamed from: a  reason: collision with other method in class */
    public final Function m39a(Function function) {
        function.getClass();
        return new D(this, function, 0);
    }

    public final void accept(Object obj, double d10) {
        switch (this.f18753a) {
            case 4:
                double[] dArr = (double[]) obj;
                int i10 = C.f18584s;
                Collectors.a(dArr, d10);
                dArr[2] = dArr[2] + d10;
                return;
            default:
                double[] dArr2 = (double[]) obj;
                int i11 = C.f18584s;
                dArr2[2] = dArr2[2] + 1.0d;
                Collectors.a(dArr2, d10);
                dArr2[3] = dArr2[3] + d10;
                return;
        }
    }

    public final void accept(Object obj, int i10) {
        long[] jArr = (long[]) obj;
        int i11 = C0429d0.f18774s;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + ((long) i10);
    }

    public final void accept(Object obj, long j10) {
        long[] jArr = (long[]) obj;
        int i10 = C0454j0.f18811s;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + j10;
    }

    public final void accept(Object obj, Object obj2) {
        switch (this.f18753a) {
            case 5:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                int i10 = C.f18584s;
                Collectors.a(dArr, dArr2[0]);
                Collectors.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                return;
            case 9:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                int i11 = C.f18584s;
                Collectors.a(dArr3, dArr4[0]);
                Collectors.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                return;
            case 21:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                int i12 = C0429d0.f18774s;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                return;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                int i13 = C0454j0.f18811s;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                return;
        }
    }

    public final Object apply(int i10) {
        switch (this.f18753a) {
            case 0:
                return new Object[i10];
            case 3:
                int i11 = C.f18584s;
                return new Double[i10];
            case 16:
                int i12 = U.f18713h;
                return new Object[i10];
            case 22:
                int i13 = C0429d0.f18774s;
                return new Integer[i10];
            default:
                int i14 = C0454j0.f18811s;
                return new Long[i10];
        }
    }

    public final Object apply(long j10) {
        return C0501v0.V0(j10);
    }

    public final Object apply(Object obj) {
        Set set = Collectors.f18590a;
        return obj;
    }

    public final Object apply(Object obj, Object obj2) {
        List list = (List) obj;
        Set set = Collectors.f18590a;
        list.addAll((List) obj2);
        return list;
    }

    public final double applyAsDouble(Object obj) {
        int i10 = C.f18584s;
        return ((Double) obj).doubleValue();
    }

    public final int applyAsInt(Object obj) {
        int i10 = C0429d0.f18774s;
        return ((Integer) obj).intValue();
    }

    public final long applyAsLong(double d10) {
        int i10 = C.f18584s;
        return 1;
    }

    public final long applyAsLong(int i10) {
        int i11 = C0429d0.f18774s;
        return 1;
    }

    public final long applyAsLong(long j10) {
        int i10 = C0454j0.f18811s;
        return 1;
    }

    public final long applyAsLong(Object obj) {
        int i10 = C0454j0.f18811s;
        return ((Long) obj).longValue();
    }

    public final w0 b(w0 w0Var) {
        w0Var.getClass();
        return new t0(this, w0Var, 1);
    }

    public final BiConsumer c(BiConsumer biConsumer) {
        switch (this.f18753a) {
            case 5:
                biConsumer.getClass();
                return new u(1, this, biConsumer);
            case 9:
                biConsumer.getClass();
                return new u(1, this, biConsumer);
            case 21:
                biConsumer.getClass();
                return new u(1, this, biConsumer);
            default:
                biConsumer.getClass();
                return new u(1, this, biConsumer);
        }
    }

    public final Function d(Function function) {
        function.getClass();
        return new D(this, function, 1);
    }

    public final w0 e(w0 w0Var) {
        w0Var.getClass();
        return new t0(this, w0Var, 0);
    }

    public final Object get() {
        switch (this.f18753a) {
            case 7:
                int i10 = C.f18584s;
                return new double[4];
            case 11:
                int i11 = C.f18584s;
                return new double[3];
            case 12:
                return new I();
            case 13:
                return new K();
            case 14:
                return new L();
            case 15:
                return new J();
            case 19:
                int i12 = C0429d0.f18774s;
                return new long[2];
            default:
                int i13 = C0454j0.f18811s;
                return new long[2];
        }
    }
}
