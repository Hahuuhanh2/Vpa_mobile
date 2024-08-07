package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.p;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: AbstractProtobufList */
public abstract class c<E> extends AbstractList<E> implements p.c<E> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7333a = true;

    public final void a() {
        this.f7333a = false;
    }

    public boolean add(E e10) {
        g();
        return super.add(e10);
    }

    public boolean addAll(Collection<? extends E> collection) {
        g();
        return super.addAll(collection);
    }

    public void clear() {
        g();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!get(i10).equals(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        return this.f7333a;
    }

    public final void g() {
        if (!this.f7333a) {
            throw new UnsupportedOperationException();
        }
    }

    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    public abstract E remove(int i10);

    public final boolean remove(Object obj) {
        g();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        g();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        g();
        return super.retainAll(collection);
    }

    public boolean addAll(int i10, Collection<? extends E> collection) {
        g();
        return super.addAll(i10, collection);
    }
}
