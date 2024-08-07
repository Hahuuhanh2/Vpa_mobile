package lk;

import f0.b0;
import fk.c;
import java.io.Serializable;
import java.lang.Enum;
import sk.j;

/* compiled from: EnumEntries.kt */
public final class b<T extends Enum<T>> extends c<T> implements a<T>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final T[] f20857a;

    public b(T[] tArr) {
        j.f(tArr, "entries");
        this.f20857a = tArr;
    }

    public final boolean contains(Object obj) {
        T t10;
        if (!(obj instanceof Enum)) {
            return false;
        }
        T t11 = (Enum) obj;
        j.f(t11, "element");
        T[] tArr = this.f20857a;
        int ordinal = t11.ordinal();
        j.f(tArr, "<this>");
        if (ordinal < 0 || ordinal > tArr.length - 1) {
            t10 = null;
        } else {
            t10 = tArr[ordinal];
        }
        if (t10 == t11) {
            return true;
        }
        return false;
    }

    public final int g() {
        return this.f20857a.length;
    }

    public final Object get(int i10) {
        T[] tArr = this.f20857a;
        int length = tArr.length;
        if (i10 >= 0 && i10 < length) {
            return tArr[i10];
        }
        throw new IndexOutOfBoundsException(b0.p("index: ", i10, ", size: ", length));
    }

    public final int indexOf(Object obj) {
        T t10;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        T t11 = (Enum) obj;
        j.f(t11, "element");
        int ordinal = t11.ordinal();
        T[] tArr = this.f20857a;
        j.f(tArr, "<this>");
        if (ordinal < 0 || ordinal > tArr.length - 1) {
            t10 = null;
        } else {
            t10 = tArr[ordinal];
        }
        if (t10 == t11) {
            return ordinal;
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum enumR = (Enum) obj;
        j.f(enumR, "element");
        return indexOf(enumR);
    }
}
