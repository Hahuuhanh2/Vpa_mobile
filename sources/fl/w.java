package fl;

import al.y0;
import fl.x;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sk.j;

/* compiled from: ThreadSafeHeap.kt */
public class w<T extends x & Comparable<? super T>> {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f20271b = AtomicIntegerFieldUpdater.newUpdater(w.class, "_size");
    private volatile int _size;

    /* renamed from: a  reason: collision with root package name */
    public T[] f20272a;

    public final void a(y0.c cVar) {
        cVar.c((y0.d) this);
        T[] tArr = this.f20272a;
        if (tArr == null) {
            tArr = new x[4];
            this.f20272a = tArr;
        } else if (b() >= tArr.length) {
            T[] copyOf = Arrays.copyOf(tArr, b() * 2);
            j.e(copyOf, "copyOf(this, newSize)");
            tArr = (x[]) copyOf;
            this.f20272a = tArr;
        }
        int b10 = b();
        f20271b.set(this, b10 + 1);
        tArr[b10] = cVar;
        cVar.f19116b = b10;
        d(b10);
    }

    public final int b() {
        return f20271b.get(this);
    }

    public final T c(int i10) {
        T[] tArr = this.f20272a;
        j.c(tArr);
        f20271b.set(this, b() - 1);
        if (i10 < b()) {
            e(i10, b());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t10 = tArr[i10];
                j.c(t10);
                T t11 = tArr[i11];
                j.c(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    e(i10, i11);
                    d(i11);
                }
            }
            while (true) {
                int i12 = (i10 * 2) + 1;
                if (i12 >= b()) {
                    break;
                }
                T[] tArr2 = this.f20272a;
                j.c(tArr2);
                int i13 = i12 + 1;
                if (i13 < b()) {
                    T t12 = tArr2[i13];
                    j.c(t12);
                    T t13 = tArr2[i12];
                    j.c(t13);
                    if (((Comparable) t12).compareTo(t13) < 0) {
                        i12 = i13;
                    }
                }
                T t14 = tArr2[i10];
                j.c(t14);
                T t15 = tArr2[i12];
                j.c(t15);
                if (((Comparable) t14).compareTo(t15) <= 0) {
                    break;
                }
                e(i10, i12);
                i10 = i12;
            }
        }
        T t16 = tArr[b()];
        j.c(t16);
        t16.c((y0.d) null);
        t16.setIndex(-1);
        tArr[b()] = null;
        return t16;
    }

    public final void d(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f20272a;
            j.c(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            j.c(t10);
            T t11 = tArr[i10];
            j.c(t11);
            if (((Comparable) t10).compareTo(t11) > 0) {
                e(i10, i11);
                i10 = i11;
            } else {
                return;
            }
        }
    }

    public final void e(int i10, int i11) {
        T[] tArr = this.f20272a;
        j.c(tArr);
        T t10 = tArr[i11];
        j.c(t10);
        T t11 = tArr[i10];
        j.c(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.setIndex(i10);
        t11.setIndex(i11);
    }
}
