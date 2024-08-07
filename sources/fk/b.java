package fk;

import fk.a0;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: AbstractIterator.kt */
public abstract class b<T> implements Iterator<T>, j$.util.Iterator {

    /* renamed from: a  reason: collision with root package name */
    public c0 f20181a = c0.NotReady;

    /* renamed from: b  reason: collision with root package name */
    public T f20182b;

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        boolean z10;
        c0 c0Var = this.f20181a;
        c0 c0Var2 = c0.Failed;
        if (c0Var != c0Var2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int ordinal = c0Var.ordinal();
            if (ordinal == 0) {
                return true;
            }
            if (ordinal != 2) {
                this.f20181a = c0Var2;
                a0.a aVar = (a0.a) this;
                int i10 = aVar.f20178c;
                if (i10 == 0) {
                    aVar.f20181a = c0.Done;
                } else {
                    a0<T> a0Var = aVar.f20180e;
                    T[] tArr = a0Var.f20174a;
                    int i11 = aVar.f20179d;
                    aVar.f20182b = tArr[i11];
                    aVar.f20181a = c0.Ready;
                    aVar.f20179d = (i11 + 1) % a0Var.f20175b;
                    aVar.f20178c = i10 - 1;
                }
                if (this.f20181a == c0.Ready) {
                    return true;
                }
            }
            return false;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final T next() {
        if (hasNext()) {
            this.f20181a = c0.NotReady;
            return this.f20182b;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
