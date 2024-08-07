package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

final class y3 extends U2 {
    y3(C0501v0 v0Var, Spliterator spliterator, boolean z10) {
        super(v0Var, spliterator, z10);
    }

    y3(C0501v0 v0Var, C0413a aVar, boolean z10) {
        super(v0Var, aVar, z10);
    }

    public final boolean a(Consumer consumer) {
        Object obj;
        consumer.getClass();
        boolean f10 = f();
        if (f10) {
            P2 p22 = (P2) this.f18728h;
            long j10 = this.f18727g;
            if (p22.f18777c == 0) {
                if (j10 < ((long) p22.f18776b)) {
                    obj = p22.f18675e[(int) j10];
                } else {
                    throw new IndexOutOfBoundsException(Long.toString(j10));
                }
            } else if (j10 < p22.count()) {
                int i10 = 0;
                while (i10 <= p22.f18777c) {
                    long j11 = p22.f18778d[i10];
                    Object[] objArr = p22.f18676f[i10];
                    if (j10 < ((long) objArr.length) + j11) {
                        obj = objArr[(int) (j10 - j11)];
                    } else {
                        i10++;
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j10));
            } else {
                throw new IndexOutOfBoundsException(Long.toString(j10));
            }
            consumer.accept(obj);
        }
        return f10;
    }

    public final void forEachRemaining(Consumer consumer) {
        if (this.f18728h != null || this.f18729i) {
            do {
            } while (a(consumer));
            return;
        }
        consumer.getClass();
        h();
        this.f18722b.u1(this.f18724d, new x3(consumer, 1));
        this.f18729i = true;
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        P2 p22 = new P2();
        this.f18728h = p22;
        this.f18725e = this.f18722b.v1(new x3(p22, 0));
        this.f18726f = new C0413a(7, this);
    }

    /* access modifiers changed from: package-private */
    public final U2 k(Spliterator spliterator) {
        return new y3(this.f18722b, spliterator, this.f18721a);
    }
}
