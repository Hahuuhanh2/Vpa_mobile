package j5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import s4.j;

/* compiled from: ResourceDecoderRegistry */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f11692a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f11693b = new HashMap();

    /* compiled from: ResourceDecoderRegistry */
    public static class a<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f11694a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<R> f11695b;

        /* renamed from: c  reason: collision with root package name */
        public final j<T, R> f11696c;

        public a(Class<T> cls, Class<R> cls2, j<T, R> jVar) {
            this.f11694a = cls;
            this.f11695b = cls2;
            this.f11696c = jVar;
        }
    }

    public final synchronized List<a<?, ?>> a(String str) {
        List<a<?, ?>> list;
        if (!this.f11692a.contains(str)) {
            this.f11692a.add(str);
        }
        list = (List) this.f11693b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f11693b.put(str, list);
        }
        return list;
    }

    public final synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList;
        boolean z10;
        arrayList = new ArrayList();
        Iterator it = this.f11692a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f11693b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (!aVar.f11694a.isAssignableFrom(cls) || !cls2.isAssignableFrom(aVar.f11695b)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10 && !arrayList.contains(aVar.f11695b)) {
                        arrayList.add(aVar.f11695b);
                    }
                }
            }
        }
        return arrayList;
    }
}
