package g5;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TranscoderRegistry */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f10369a = new ArrayList();

    /* compiled from: TranscoderRegistry */
    public static final class a<Z, R> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<Z> f10370a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f10371b;

        /* renamed from: c  reason: collision with root package name */
        public final b<Z, R> f10372c;

        public a(Class<Z> cls, Class<R> cls2, b<Z, R> bVar) {
            this.f10370a = cls;
            this.f10371b = cls2;
            this.f10372c = bVar;
        }
    }

    public final synchronized ArrayList a(Class cls, Class cls2) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f10369a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!aVar.f10370a.isAssignableFrom(cls) || !cls2.isAssignableFrom(aVar.f10371b)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 && !arrayList.contains(aVar.f10371b)) {
                arrayList.add(aVar.f10371b);
            }
        }
        return arrayList;
    }
}
