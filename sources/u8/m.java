package u8;

/* compiled from: SingletonImmutableSet */
public final class m<E> extends f<E> {

    /* renamed from: d  reason: collision with root package name */
    public final transient E f15398d;

    public m(E e10) {
        this.f15398d = e10;
    }

    public final boolean contains(Object obj) {
        return this.f15398d.equals(obj);
    }

    public final int g(Object[] objArr) {
        objArr[0] = this.f15398d;
        return 1;
    }

    public final int hashCode() {
        return this.f15398d.hashCode();
    }

    /* renamed from: n */
    public final n<E> iterator() {
        return new g(this.f15398d);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.f15398d.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2);
        sb2.append('[');
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }
}
