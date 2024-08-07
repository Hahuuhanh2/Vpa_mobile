package j$.util.stream;

import j$.util.Collection;
import j$.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

final class B2 extends C0495t2 {

    /* renamed from: d  reason: collision with root package name */
    private ArrayList f18583d;

    B2(C0440f2 f2Var, Comparator comparator) {
        super(f2Var, comparator);
    }

    public final void accept(Object obj) {
        this.f18583d.add(obj);
    }

    public final void end() {
        List.EL.sort(this.f18583d, this.f18899b);
        this.f18754a.f((long) this.f18583d.size());
        if (!this.f18900c) {
            ArrayList arrayList = this.f18583d;
            C0440f2 f2Var = this.f18754a;
            f2Var.getClass();
            Collection.EL.a(arrayList, new C0413a(3, f2Var));
        } else {
            Iterator it = this.f18583d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f18754a.h()) {
                    break;
                }
                this.f18754a.accept(next);
            }
        }
        this.f18754a.end();
        this.f18583d = null;
    }

    public final void f(long j10) {
        if (j10 < 2147483639) {
            this.f18583d = j10 >= 0 ? new ArrayList((int) j10) : new ArrayList();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
