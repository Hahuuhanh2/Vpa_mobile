package d2;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: WeakListener */
public final class n<T> extends WeakReference<l> {

    /* renamed from: a  reason: collision with root package name */
    public final j<T> f8567a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8568b;

    /* renamed from: c  reason: collision with root package name */
    public T f8569c;

    public n(l lVar, int i10, j<T> jVar, ReferenceQueue<l> referenceQueue) {
        super(lVar, referenceQueue);
        this.f8568b = i10;
        this.f8567a = jVar;
    }

    public final boolean a() {
        boolean z10;
        T t10 = this.f8569c;
        if (t10 != null) {
            this.f8567a.a(t10);
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8569c = null;
        return z10;
    }
}
