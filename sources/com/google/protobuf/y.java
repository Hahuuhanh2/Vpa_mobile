package com.google.protobuf;

import com.google.protobuf.k;
import f0.b0;
import java.util.Arrays;
import java.util.RandomAccess;
import n0.l;

/* compiled from: ProtobufArrayList */
public final class y<E> extends c<E> implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    public static final y<Object> f7958d;

    /* renamed from: b  reason: collision with root package name */
    public E[] f7959b;

    /* renamed from: c  reason: collision with root package name */
    public int f7960c;

    static {
        y<Object> yVar = new y<>(new Object[0], 0);
        f7958d = yVar;
        yVar.f7887a = false;
    }

    public y(E[] eArr, int i10) {
        this.f7959b = eArr;
        this.f7960c = i10;
    }

    public final boolean add(E e10) {
        g();
        int i10 = this.f7960c;
        E[] eArr = this.f7959b;
        if (i10 == eArr.length) {
            this.f7959b = Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f7959b;
        int i11 = this.f7960c;
        this.f7960c = i11 + 1;
        eArr2[i11] = e10;
        this.modCount++;
        return true;
    }

    public final k.c b(int i10) {
        if (i10 >= this.f7960c) {
            return new y(Arrays.copyOf(this.f7959b, i10), this.f7960c);
        }
        throw new IllegalArgumentException();
    }

    public final E get(int i10) {
        i(i10);
        return this.f7959b[i10];
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f7960c) {
            StringBuilder l10 = l.l("Index:", i10, ", Size:");
            l10.append(this.f7960c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
    }

    public final E remove(int i10) {
        g();
        i(i10);
        E[] eArr = this.f7959b;
        E e10 = eArr[i10];
        int i11 = this.f7960c;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f7960c--;
        this.modCount++;
        return e10;
    }

    public final E set(int i10, E e10) {
        g();
        i(i10);
        E[] eArr = this.f7959b;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        this.modCount++;
        return e11;
    }

    public final int size() {
        return this.f7960c;
    }

    public final void add(int i10, E e10) {
        int i11;
        g();
        if (i10 < 0 || i10 > (i11 = this.f7960c)) {
            StringBuilder l10 = l.l("Index:", i10, ", Size:");
            l10.append(this.f7960c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
        E[] eArr = this.f7959b;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = new Object[b0.o(i11, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i10);
            System.arraycopy(this.f7959b, i10, eArr2, i10 + 1, this.f7960c - i10);
            this.f7959b = eArr2;
        }
        this.f7959b[i10] = e10;
        this.f7960c++;
        this.modCount++;
    }
}
