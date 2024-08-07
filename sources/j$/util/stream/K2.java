package j$.util.stream;

import j$.util.F;
import j$.util.Spliterators;
import j$.util.function.Consumer;
import j$.util.function.I;
import j$.util.function.L;
import java.util.Arrays;
import java.util.Iterator;

class K2 extends O2 implements L {
    K2() {
    }

    K2(int i10) {
        super(i10);
    }

    public void accept(int i10) {
        w();
        int i11 = this.f18776b;
        this.f18776b = i11 + 1;
        ((int[]) this.f18671e)[i11] = i10;
    }

    public final void forEach(Consumer consumer) {
        if (consumer instanceof L) {
            d((L) consumer);
        } else if (!D3.f18597a) {
            spliterator().forEachRemaining(consumer);
        } else {
            D3.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
            throw null;
        }
    }

    public final Iterator iterator() {
        return Spliterators.g(spliterator());
    }

    public final L n(L l10) {
        l10.getClass();
        return new I(this, l10);
    }

    public final Object newArray(int i10) {
        return new int[i10];
    }

    /* access modifiers changed from: protected */
    public final void r(Object obj, int i10, int i11, Object obj2) {
        int[] iArr = (int[]) obj;
        L l10 = (L) obj2;
        while (i10 < i11) {
            l10.accept(iArr[i10]);
            i10++;
        }
    }

    /* access modifiers changed from: protected */
    public final int s(Object obj) {
        return ((int[]) obj).length;
    }

    public final String toString() {
        int[] iArr = (int[]) b();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", new Object[]{getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f18777c), Arrays.toString(iArr)});
        }
        return String.format("%s[length=%d, chunks=%d]%s...", new Object[]{getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f18777c), Arrays.toString(Arrays.copyOf(iArr, 200))});
    }

    /* access modifiers changed from: protected */
    public final Object[] v() {
        return new int[8][];
    }

    /* renamed from: x */
    public F spliterator() {
        return new J2(this, 0, this.f18777c, 0, this.f18776b);
    }
}
