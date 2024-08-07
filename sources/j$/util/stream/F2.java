package j$.util.stream;

import java.util.Arrays;
import java.util.Comparator;

final class F2 extends C0495t2 {

    /* renamed from: d  reason: collision with root package name */
    private Object[] f18609d;

    /* renamed from: e  reason: collision with root package name */
    private int f18610e;

    F2(C0440f2 f2Var, Comparator comparator) {
        super(f2Var, comparator);
    }

    public final void accept(Object obj) {
        Object[] objArr = this.f18609d;
        int i10 = this.f18610e;
        this.f18610e = i10 + 1;
        objArr[i10] = obj;
    }

    public final void end() {
        int i10 = 0;
        Arrays.sort(this.f18609d, 0, this.f18610e, this.f18899b);
        this.f18754a.f((long) this.f18610e);
        if (!this.f18900c) {
            while (i10 < this.f18610e) {
                this.f18754a.accept(this.f18609d[i10]);
                i10++;
            }
        } else {
            while (i10 < this.f18610e && !this.f18754a.h()) {
                this.f18754a.accept(this.f18609d[i10]);
                i10++;
            }
        }
        this.f18754a.end();
        this.f18609d = null;
    }

    public final void f(long j10) {
        if (j10 < 2147483639) {
            this.f18609d = new Object[((int) j10)];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
