package d2;

import java.io.Serializable;

/* compiled from: ObservableField */
public class i<T> extends b implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public T f8545b;

    public i(T t10) {
        this.f8545b = t10;
    }

    public final void g(T t10) {
        if (t10 != this.f8545b) {
            this.f8545b = t10;
            synchronized (this) {
                k kVar = this.f8538a;
                if (kVar != null) {
                    kVar.b(0, this);
                }
            }
        }
    }

    public i() {
    }
}
