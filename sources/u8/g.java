package u8;

import java.util.NoSuchElementException;

/* compiled from: Iterators */
public final class g extends n<Object> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f15328a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15329b;

    public g(Object obj) {
        this.f15329b = obj;
    }

    public final boolean hasNext() {
        return !this.f15328a;
    }

    public final Object next() {
        if (!this.f15328a) {
            this.f15328a = true;
            return this.f15329b;
        }
        throw new NoSuchElementException();
    }
}
