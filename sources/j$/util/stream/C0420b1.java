package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.I;
import j$.util.function.L;
import java.util.Arrays;

/* renamed from: j$.util.stream.b1  reason: case insensitive filesystem */
final class C0420b1 extends C0415a1 implements C0509x0 {
    C0420b1(long j10) {
        super(j10);
    }

    public final /* synthetic */ void accept(double d10) {
        C0501v0.n0();
        throw null;
    }

    public final void accept(int i10) {
        int i11 = this.f18750b;
        int[] iArr = this.f18749a;
        if (i11 < iArr.length) {
            this.f18750b = i11 + 1;
            iArr[i11] = i10;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(this.f18749a.length)}));
    }

    public final /* synthetic */ void accept(long j10) {
        C0501v0.v0();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        g((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final B0 build() {
        if (this.f18750b >= this.f18749a.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f18750b), Integer.valueOf(this.f18749a.length)}));
    }

    public final void end() {
        if (this.f18750b < this.f18749a.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f18750b), Integer.valueOf(this.f18749a.length)}));
        }
    }

    public final void f(long j10) {
        if (j10 == ((long) this.f18749a.length)) {
            this.f18750b = 0;
        } else {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j10), Integer.valueOf(this.f18749a.length)}));
        }
    }

    public final /* synthetic */ void g(Integer num) {
        C0501v0.q0(this, num);
    }

    public final /* synthetic */ boolean h() {
        return false;
    }

    public final L n(L l10) {
        l10.getClass();
        return new I(this, l10);
    }

    public final String toString() {
        return String.format("IntFixedNodeBuilder[%d][%s]", new Object[]{Integer.valueOf(this.f18749a.length - this.f18750b), Arrays.toString(this.f18749a)});
    }
}
