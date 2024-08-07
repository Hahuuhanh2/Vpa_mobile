package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.p1  reason: case insensitive filesystem */
final class C0479p1 extends C0483q1 {

    /* renamed from: h  reason: collision with root package name */
    private final Object[] f18858h;

    C0479p1(Spliterator spliterator, C0501v0 v0Var, Object[] objArr) {
        super(objArr.length, spliterator, v0Var);
        this.f18858h = objArr;
    }

    C0479p1(C0479p1 p1Var, Spliterator spliterator, long j10, long j11) {
        super(p1Var, spliterator, j10, j11, p1Var.f18858h.length);
        this.f18858h = p1Var.f18858h;
    }

    /* access modifiers changed from: package-private */
    public final C0483q1 a(Spliterator spliterator, long j10, long j11) {
        return new C0479p1(this, spliterator, j10, j11);
    }

    public final void accept(Object obj) {
        int i10 = this.f18872f;
        if (i10 < this.f18873g) {
            Object[] objArr = this.f18858h;
            this.f18872f = i10 + 1;
            objArr[i10] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f18872f));
    }
}
