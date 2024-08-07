package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.p;
import java.util.Arrays;
import java.util.RandomAccess;
import n0.l;

/* compiled from: ProtobufArrayList */
public final class b0<E> extends c<E> implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    public static final b0<Object> f7330d;

    /* renamed from: b  reason: collision with root package name */
    public E[] f7331b;

    /* renamed from: c  reason: collision with root package name */
    public int f7332c;

    static {
        b0<Object> b0Var = new b0<>(new Object[0], 0);
        f7330d = b0Var;
        b0Var.f7333a = false;
    }

    public b0(E[] eArr, int i10) {
        this.f7331b = eArr;
        this.f7332c = i10;
    }

    public final boolean add(E e10) {
        g();
        int i10 = this.f7332c;
        E[] eArr = this.f7331b;
        if (i10 == eArr.length) {
            this.f7331b = Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f7331b;
        int i11 = this.f7332c;
        this.f7332c = i11 + 1;
        eArr2[i11] = e10;
        this.modCount++;
        return true;
    }

    public final p.c b(int i10) {
        if (i10 >= this.f7332c) {
            return new b0(Arrays.copyOf(this.f7331b, i10), this.f7332c);
        }
        throw new IllegalArgumentException();
    }

    public final E get(int i10) {
        i(i10);
        return this.f7331b[i10];
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f7332c) {
            StringBuilder l10 = l.l("Index:", i10, ", Size:");
            l10.append(this.f7332c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
    }

    public final E remove(int i10) {
        g();
        i(i10);
        E[] eArr = this.f7331b;
        E e10 = eArr[i10];
        int i11 = this.f7332c;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f7332c--;
        this.modCount++;
        return e10;
    }

    public final E set(int i10, E e10) {
        g();
        i(i10);
        E[] eArr = this.f7331b;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        this.modCount++;
        return e11;
    }

    public final int size() {
        return this.f7332c;
    }

    public final void add(int i10, E e10) {
        int i11;
        g();
        if (i10 < 0 || i10 > (i11 = this.f7332c)) {
            StringBuilder l10 = l.l("Index:", i10, ", Size:");
            l10.append(this.f7332c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
        E[] eArr = this.f7331b;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = new Object[f0.b0.o(i11, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i10);
            System.arraycopy(this.f7331b, i10, eArr2, i10 + 1, this.f7332c - i10);
            this.f7331b = eArr2;
        }
        this.f7331b[i10] = e10;
        this.f7332c++;
        this.modCount++;
    }
}
