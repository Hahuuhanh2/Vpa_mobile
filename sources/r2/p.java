package r2;

import n.c;

/* compiled from: MutableLiveData */
public class p<T> extends androidx.lifecycle.p<T> {
    public p(T t10) {
        super(t10);
    }

    public void j(T t10) {
        super.j(t10);
    }

    public final void k(T t10) {
        boolean z10;
        synchronized (this.f2795a) {
            if (this.f2800f == androidx.lifecycle.p.f2794k) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f2800f = t10;
        }
        if (z10) {
            c.J().K(this.f2804j);
        }
    }

    public p() {
    }
}
