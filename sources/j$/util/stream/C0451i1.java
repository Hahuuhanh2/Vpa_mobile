package j$.util.stream;

import j$.util.C0407m;
import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;

/* renamed from: j$.util.stream.i1  reason: case insensitive filesystem */
abstract class C0451i1 implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    E0 f18801a;

    /* renamed from: b  reason: collision with root package name */
    int f18802b;

    /* renamed from: c  reason: collision with root package name */
    Spliterator f18803c;

    /* renamed from: d  reason: collision with root package name */
    Spliterator f18804d;

    /* renamed from: e  reason: collision with root package name */
    ArrayDeque f18805e;

    C0451i1(E0 e02) {
        this.f18801a = e02;
    }

    protected static E0 f(ArrayDeque arrayDeque) {
        while (true) {
            E0 e02 = (E0) arrayDeque.pollFirst();
            if (e02 != null) {
                if (e02.j() != 0) {
                    int j10 = e02.j();
                    while (true) {
                        j10--;
                        if (j10 < 0) {
                            break;
                        }
                        arrayDeque.addFirst(e02.a(j10));
                    }
                } else if (e02.count() > 0) {
                    return e02;
                }
            } else {
                return null;
            }
        }
    }

    public final int characteristics() {
        return 64;
    }

    public final long estimateSize() {
        long j10 = 0;
        if (this.f18801a == null) {
            return 0;
        }
        Spliterator spliterator = this.f18803c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i10 = this.f18802b; i10 < this.f18801a.j(); i10++) {
            j10 += this.f18801a.a(i10).count();
        }
        return j10;
    }

    /* access modifiers changed from: protected */
    public final ArrayDeque g() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int j10 = this.f18801a.j();
        while (true) {
            j10--;
            if (j10 < this.f18802b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f18801a.a(j10));
        }
    }

    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0407m.i(this);
    }

    /* access modifiers changed from: protected */
    public final boolean h() {
        if (this.f18801a == null) {
            return false;
        }
        if (this.f18804d != null) {
            return true;
        }
        Spliterator spliterator = this.f18803c;
        if (spliterator == null) {
            ArrayDeque g2 = g();
            this.f18805e = g2;
            E0 f10 = f(g2);
            if (f10 != null) {
                spliterator = f10.spliterator();
            } else {
                this.f18801a = null;
                return false;
            }
        }
        this.f18804d = spliterator;
        return true;
    }

    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return C0407m.k(this, i10);
    }

    public final Spliterator trySplit() {
        E0 e02 = this.f18801a;
        if (e02 == null || this.f18804d != null) {
            return null;
        }
        Spliterator spliterator = this.f18803c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.f18802b < e02.j() - 1) {
            E0 e03 = this.f18801a;
            int i10 = this.f18802b;
            this.f18802b = i10 + 1;
            return e03.a(i10).spliterator();
        }
        E0 a10 = this.f18801a.a(this.f18802b);
        this.f18801a = a10;
        if (a10.j() == 0) {
            Spliterator spliterator2 = this.f18801a.spliterator();
            this.f18803c = spliterator2;
            return spliterator2.trySplit();
        }
        E0 e04 = this.f18801a;
        this.f18802b = 0 + 1;
        return e04.a(0).spliterator();
    }
}
