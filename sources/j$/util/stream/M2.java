package j$.util.stream;

import j$.util.I;
import j$.util.Spliterators;
import j$.util.function.C0369d0;
import j$.util.function.C0375g0;
import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Iterator;

class M2 extends O2 implements C0375g0 {
    M2() {
    }

    M2(int i10) {
        super(i10);
    }

    public void accept(long j10) {
        w();
        int i10 = this.f18776b;
        this.f18776b = i10 + 1;
        ((long[]) this.f18671e)[i10] = j10;
    }

    public final void forEach(Consumer consumer) {
        if (consumer instanceof C0375g0) {
            d((C0375g0) consumer);
        } else if (!D3.f18597a) {
            spliterator().forEachRemaining(consumer);
        } else {
            D3.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
            throw null;
        }
    }

    public final C0375g0 i(C0375g0 g0Var) {
        g0Var.getClass();
        return new C0369d0(this, g0Var);
    }

    public final Iterator iterator() {
        return Spliterators.h(spliterator());
    }

    public final Object newArray(int i10) {
        return new long[i10];
    }

    /* access modifiers changed from: protected */
    public final void r(Object obj, int i10, int i11, Object obj2) {
        long[] jArr = (long[]) obj;
        C0375g0 g0Var = (C0375g0) obj2;
        while (i10 < i11) {
            g0Var.accept(jArr[i10]);
            i10++;
        }
    }

    /* access modifiers changed from: protected */
    public final int s(Object obj) {
        return ((long[]) obj).length;
    }

    public final String toString() {
        long[] jArr = (long[]) b();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", new Object[]{getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f18777c), Arrays.toString(jArr)});
        }
        return String.format("%s[length=%d, chunks=%d]%s...", new Object[]{getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f18777c), Arrays.toString(Arrays.copyOf(jArr, 200))});
    }

    /* access modifiers changed from: protected */
    public final Object[] v() {
        return new long[8][];
    }

    /* renamed from: x */
    public I spliterator() {
        return new L2(this, 0, this.f18777c, 0, this.f18776b);
    }
}
