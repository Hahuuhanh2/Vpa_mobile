package fk;

import java.util.AbstractList;

/* compiled from: AbstractMutableList.kt */
public abstract class d<E> extends AbstractList<E> {
    public abstract int g();

    public abstract E i(int i10);

    public final /* bridge */ E remove(int i10) {
        return i(i10);
    }

    public final /* bridge */ int size() {
        return g();
    }
}
