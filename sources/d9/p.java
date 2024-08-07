package d9;

import androidx.fragment.app.o;
import e9.e;

/* compiled from: PrimitiveConstructor */
public abstract class p<KeyT extends o, PrimitiveT> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<KeyT> f8796a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<PrimitiveT> f8797b;

    /* compiled from: PrimitiveConstructor */
    public interface a<KeyT extends o, PrimitiveT> {
        PrimitiveT f(KeyT keyt);
    }

    public p() {
        throw null;
    }

    public p(Class cls) {
        this.f8796a = cls;
        this.f8797b = e.class;
    }

    public abstract PrimitiveT a(KeyT keyt);
}
