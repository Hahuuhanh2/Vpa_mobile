package j$.util.stream;

import j$.util.C;
import j$.util.Spliterators;
import j$.util.function.C0382k;
import j$.util.function.C0388n;
import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Iterator;

class I2 extends O2 implements C0388n {
    I2() {
    }

    I2(int i10) {
        super(i10);
    }

    public void accept(double d10) {
        w();
        int i10 = this.f18776b;
        this.f18776b = i10 + 1;
        ((double[]) this.f18671e)[i10] = d10;
    }

    public final void forEach(Consumer consumer) {
        if (consumer instanceof C0388n) {
            d((C0388n) consumer);
        } else if (!D3.f18597a) {
            spliterator().forEachRemaining(consumer);
        } else {
            D3.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
            throw null;
        }
    }

    public final Iterator iterator() {
        return Spliterators.f(spliterator());
    }

    public final C0388n m(C0388n nVar) {
        nVar.getClass();
        return new C0382k(this, nVar);
    }

    public final Object newArray(int i10) {
        return new double[i10];
    }

    /* access modifiers changed from: protected */
    public final void r(Object obj, int i10, int i11, Object obj2) {
        double[] dArr = (double[]) obj;
        C0388n nVar = (C0388n) obj2;
        while (i10 < i11) {
            nVar.accept(dArr[i10]);
            i10++;
        }
    }

    /* access modifiers changed from: protected */
    public final int s(Object obj) {
        return ((double[]) obj).length;
    }

    public final String toString() {
        double[] dArr = (double[]) b();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", new Object[]{getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f18777c), Arrays.toString(dArr)});
        }
        return String.format("%s[length=%d, chunks=%d]%s...", new Object[]{getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f18777c), Arrays.toString(Arrays.copyOf(dArr, 200))});
    }

    /* access modifiers changed from: protected */
    public final Object[] v() {
        return new double[8][];
    }

    /* renamed from: x */
    public C spliterator() {
        return new H2(this, 0, this.f18777c, 0, this.f18776b);
    }
}
