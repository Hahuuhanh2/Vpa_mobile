package u8;

import java.util.Objects;
import m9.b;

/* compiled from: RegularImmutableList */
public final class j<E> extends d<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final j f15374e = new j(new Object[0], 0);

    /* renamed from: c  reason: collision with root package name */
    public final transient Object[] f15375c;

    /* renamed from: d  reason: collision with root package name */
    public final transient int f15376d;

    public j(Object[] objArr, int i10) {
        this.f15375c = objArr;
        this.f15376d = i10;
    }

    public final int g(Object[] objArr) {
        System.arraycopy(this.f15375c, 0, objArr, 0, this.f15376d);
        return 0 + this.f15376d;
    }

    public final E get(int i10) {
        b.h(i10, this.f15376d);
        E e10 = this.f15375c[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    public final Object[] i() {
        return this.f15375c;
    }

    public final int l() {
        return this.f15376d;
    }

    public final int m() {
        return 0;
    }

    public final int size() {
        return this.f15376d;
    }
}
