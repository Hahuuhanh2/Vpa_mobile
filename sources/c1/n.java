package c1;

import a1.c;
import java.util.ArrayList;

/* compiled from: WidgetContainer */
public class n extends e {

    /* renamed from: w0  reason: collision with root package name */
    public ArrayList<e> f4510w0 = new ArrayList<>();

    public void G() {
        this.f4510w0.clear();
        super.G();
    }

    public final void J(c cVar) {
        super.J(cVar);
        int size = this.f4510w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4510w0.get(i10).J(cVar);
        }
    }

    public void U() {
        ArrayList<e> arrayList = this.f4510w0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = this.f4510w0.get(i10);
                if (eVar instanceof n) {
                    ((n) eVar).U();
                }
            }
        }
    }
}
