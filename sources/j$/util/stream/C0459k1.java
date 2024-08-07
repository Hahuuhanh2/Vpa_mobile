package j$.util.stream;

import j$.util.function.C0369d0;
import j$.util.function.C0375g0;
import j$.util.function.Consumer;
import java.util.Arrays;

/* renamed from: j$.util.stream.k1  reason: case insensitive filesystem */
final class C0459k1 extends C0455j1 implements C0513y0 {
    C0459k1(long j10) {
        super(j10);
    }

    public final /* synthetic */ void accept(double d10) {
        C0501v0.n0();
        throw null;
    }

    public final /* synthetic */ void accept(int i10) {
        C0501v0.u0();
        throw null;
    }

    public final void accept(long j10) {
        int i10 = this.f18813b;
        long[] jArr = this.f18812a;
        if (i10 < jArr.length) {
            this.f18813b = i10 + 1;
            jArr[i10] = j10;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(this.f18812a.length)}));
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final C0 build() {
        if (this.f18813b >= this.f18812a.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f18813b), Integer.valueOf(this.f18812a.length)}));
    }

    public final void end() {
        if (this.f18813b < this.f18812a.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f18813b), Integer.valueOf(this.f18812a.length)}));
        }
    }

    public final void f(long j10) {
        if (j10 == ((long) this.f18812a.length)) {
            this.f18813b = 0;
        } else {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j10), Integer.valueOf(this.f18812a.length)}));
        }
    }

    public final /* synthetic */ boolean h() {
        return false;
    }

    public final C0375g0 i(C0375g0 g0Var) {
        g0Var.getClass();
        return new C0369d0(this, g0Var);
    }

    public final /* synthetic */ void l(Long l10) {
        C0501v0.s0(this, l10);
    }

    public final String toString() {
        return String.format("LongFixedNodeBuilder[%d][%s]", new Object[]{Integer.valueOf(this.f18812a.length - this.f18813b), Arrays.toString(this.f18812a)});
    }
}
