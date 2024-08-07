package el;

import ek.i;
import el.b;
import ik.d;
import java.util.Arrays;
import sk.j;

/* compiled from: AbstractSharedFlow.kt */
public abstract class a<S extends b<?>> {

    /* renamed from: a  reason: collision with root package name */
    public S[] f20115a;

    /* renamed from: b  reason: collision with root package name */
    public int f20116b;

    /* renamed from: c  reason: collision with root package name */
    public int f20117c;

    public final S c() {
        S s10;
        synchronized (this) {
            S[] sArr = this.f20115a;
            if (sArr == null) {
                sArr = f();
                this.f20115a = sArr;
            } else if (this.f20116b >= sArr.length) {
                S[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                j.e(copyOf, "copyOf(this, newSize)");
                this.f20115a = (b[]) copyOf;
                sArr = (b[]) copyOf;
            }
            int i10 = this.f20117c;
            do {
                s10 = sArr[i10];
                if (s10 == null) {
                    s10 = d();
                    sArr[i10] = s10;
                }
                i10++;
                if (i10 >= sArr.length) {
                    i10 = 0;
                }
                j.d(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            } while (!s10.a(this));
            this.f20117c = i10;
            this.f20116b++;
        }
        return s10;
    }

    public abstract S d();

    public abstract b[] f();

    public final void g(S s10) {
        int i10;
        d[] b10;
        synchronized (this) {
            int i11 = this.f20116b - 1;
            this.f20116b = i11;
            if (i11 == 0) {
                this.f20117c = 0;
            }
            j.d(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            b10 = s10.b(this);
        }
        for (d dVar : b10) {
            if (dVar != null) {
                dVar.resumeWith(i.f20112a);
            }
        }
    }
}
