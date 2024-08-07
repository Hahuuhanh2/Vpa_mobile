package j5;

import java.util.ArrayList;
import s4.k;

/* compiled from: ResourceEncoderRegistry */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f11697a = new ArrayList();

    /* compiled from: ResourceEncoderRegistry */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f11698a;

        /* renamed from: b  reason: collision with root package name */
        public final k<T> f11699b;

        public a(Class<T> cls, k<T> kVar) {
            this.f11698a = cls;
            this.f11699b = kVar;
        }
    }

    public final synchronized <Z> k<Z> a(Class<Z> cls) {
        int size = this.f11697a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) this.f11697a.get(i10);
            if (aVar.f11698a.isAssignableFrom(cls)) {
                return aVar.f11699b;
            }
        }
        return null;
    }
}
