package j$.util.stream;

import j$.util.function.C0382k;
import j$.util.function.C0388n;
import j$.util.function.Consumer;
import java.util.Arrays;

final class S0 extends R0 implements C0505w0 {
    S0(long j10) {
        super(j10);
    }

    public final void accept(double d10) {
        int i10 = this.f18681b;
        double[] dArr = this.f18680a;
        if (i10 < dArr.length) {
            this.f18681b = i10 + 1;
            dArr[i10] = d10;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(this.f18680a.length)}));
    }

    public final /* synthetic */ void accept(int i10) {
        C0501v0.u0();
        throw null;
    }

    public final /* synthetic */ void accept(long j10) {
        C0501v0.v0();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final A0 build() {
        if (this.f18681b >= this.f18680a.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f18681b), Integer.valueOf(this.f18680a.length)}));
    }

    public final void end() {
        if (this.f18681b < this.f18680a.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f18681b), Integer.valueOf(this.f18680a.length)}));
        }
    }

    public final void f(long j10) {
        if (j10 == ((long) this.f18680a.length)) {
            this.f18681b = 0;
        } else {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j10), Integer.valueOf(this.f18680a.length)}));
        }
    }

    public final /* synthetic */ boolean h() {
        return false;
    }

    public final C0388n m(C0388n nVar) {
        nVar.getClass();
        return new C0382k(this, nVar);
    }

    public final /* synthetic */ void p(Double d10) {
        C0501v0.o0(this, d10);
    }

    public final String toString() {
        return String.format("DoubleFixedNodeBuilder[%d][%s]", new Object[]{Integer.valueOf(this.f18680a.length - this.f18681b), Arrays.toString(this.f18680a)});
    }
}
