package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import java.util.Arrays;

final class Z0 extends H0 implements C0517z0 {
    Z0(long j10, IntFunction intFunction) {
        super(j10, intFunction);
    }

    public final /* synthetic */ void accept(double d10) {
        C0501v0.n0();
        throw null;
    }

    public final /* synthetic */ void accept(int i10) {
        C0501v0.u0();
        throw null;
    }

    public final /* synthetic */ void accept(long j10) {
        C0501v0.v0();
        throw null;
    }

    public final void accept(Object obj) {
        int i10 = this.f18629b;
        Object[] objArr = this.f18628a;
        if (i10 < objArr.length) {
            this.f18629b = i10 + 1;
            objArr[i10] = obj;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(this.f18628a.length)}));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final E0 build() {
        if (this.f18629b >= this.f18628a.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f18629b), Integer.valueOf(this.f18628a.length)}));
    }

    public final void end() {
        if (this.f18629b < this.f18628a.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f18629b), Integer.valueOf(this.f18628a.length)}));
        }
    }

    public final void f(long j10) {
        if (j10 == ((long) this.f18628a.length)) {
            this.f18629b = 0;
        } else {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j10), Integer.valueOf(this.f18628a.length)}));
        }
    }

    public final /* synthetic */ boolean h() {
        return false;
    }

    public final String toString() {
        return String.format("FixedNodeBuilder[%d][%s]", new Object[]{Integer.valueOf(this.f18628a.length - this.f18629b), Arrays.toString(this.f18628a)});
    }
}
