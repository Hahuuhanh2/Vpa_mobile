package j$.util.stream;

import j$.util.function.IntFunction;

abstract class P0 extends G0 implements D0 {
    P0(D0 d02, D0 d03) {
        super(d02, d03);
    }

    public final Object b() {
        long count = count();
        if (count < 2147483639) {
            Object newArray = newArray((int) count);
            c(0, newArray);
            return newArray;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public final void c(int i10, Object obj) {
        ((D0) this.f18612a).c(i10, obj);
        ((D0) this.f18613b).c(i10 + ((int) ((D0) this.f18612a).count()), obj);
    }

    public final void d(Object obj) {
        ((D0) this.f18612a).d(obj);
        ((D0) this.f18613b).d(obj);
    }

    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return C0501v0.w0(this, intFunction);
    }

    public final String toString() {
        if (count() < 32) {
            return String.format("%s[%s.%s]", new Object[]{getClass().getName(), this.f18612a, this.f18613b});
        }
        return String.format("%s[size=%d]", new Object[]{getClass().getName(), Long.valueOf(count())});
    }
}
