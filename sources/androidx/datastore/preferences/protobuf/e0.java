package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.p;
import f0.b0;
import java.util.Arrays;
import java.util.RandomAccess;
import n0.l;

/* compiled from: ProtobufArrayList */
public final class e0<E> extends c<E> implements RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    public static final e0<Object> f2257d;

    /* renamed from: b  reason: collision with root package name */
    public E[] f2258b;

    /* renamed from: c  reason: collision with root package name */
    public int f2259c;

    static {
        e0<Object> e0Var = new e0<>(new Object[0], 0);
        f2257d = e0Var;
        e0Var.f2231a = false;
    }

    public e0(E[] eArr, int i10) {
        this.f2258b = eArr;
        this.f2259c = i10;
    }

    public final boolean add(E e10) {
        g();
        int i10 = this.f2259c;
        E[] eArr = this.f2258b;
        if (i10 == eArr.length) {
            this.f2258b = Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f2258b;
        int i11 = this.f2259c;
        this.f2259c = i11 + 1;
        eArr2[i11] = e10;
        this.modCount++;
        return true;
    }

    public final p.c b(int i10) {
        if (i10 >= this.f2259c) {
            return new e0(Arrays.copyOf(this.f2258b, i10), this.f2259c);
        }
        throw new IllegalArgumentException();
    }

    public final E get(int i10) {
        i(i10);
        return this.f2258b[i10];
    }

    public final void i(int i10) {
        if (i10 < 0 || i10 >= this.f2259c) {
            StringBuilder l10 = l.l("Index:", i10, ", Size:");
            l10.append(this.f2259c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
    }

    public final E remove(int i10) {
        g();
        i(i10);
        E[] eArr = this.f2258b;
        E e10 = eArr[i10];
        int i11 = this.f2259c;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f2259c--;
        this.modCount++;
        return e10;
    }

    public final E set(int i10, E e10) {
        g();
        i(i10);
        E[] eArr = this.f2258b;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        this.modCount++;
        return e11;
    }

    public final int size() {
        return this.f2259c;
    }

    public final void add(int i10, E e10) {
        int i11;
        g();
        if (i10 < 0 || i10 > (i11 = this.f2259c)) {
            StringBuilder l10 = l.l("Index:", i10, ", Size:");
            l10.append(this.f2259c);
            throw new IndexOutOfBoundsException(l10.toString());
        }
        E[] eArr = this.f2258b;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = new Object[b0.o(i11, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i10);
            System.arraycopy(this.f2258b, i10, eArr2, i10 + 1, this.f2259c - i10);
            this.f2258b = eArr2;
        }
        this.f2258b[i10] = e10;
        this.f2259c++;
        this.modCount++;
    }
}
