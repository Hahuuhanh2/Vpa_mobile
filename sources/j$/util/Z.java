package j$.util;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

class Z implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    private final Collection f18373a;

    /* renamed from: b  reason: collision with root package name */
    private Iterator f18374b = null;

    /* renamed from: c  reason: collision with root package name */
    private final int f18375c;

    /* renamed from: d  reason: collision with root package name */
    private long f18376d;

    /* renamed from: e  reason: collision with root package name */
    private int f18377e;

    public Z(Collection collection, int i10) {
        this.f18373a = collection;
        this.f18375c = (i10 & 4096) == 0 ? i10 | 64 | 16384 : i10;
    }

    public final boolean a(Consumer consumer) {
        consumer.getClass();
        if (this.f18374b == null) {
            this.f18374b = this.f18373a.iterator();
            this.f18376d = (long) this.f18373a.size();
        }
        if (!this.f18374b.hasNext()) {
            return false;
        }
        consumer.accept(this.f18374b.next());
        return true;
    }

    public final int characteristics() {
        return this.f18375c;
    }

    public final long estimateSize() {
        if (this.f18374b != null) {
            return this.f18376d;
        }
        this.f18374b = this.f18373a.iterator();
        long size = (long) this.f18373a.size();
        this.f18376d = size;
        return size;
    }

    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.f18374b;
        if (it == null) {
            it = this.f18373a.iterator();
            this.f18374b = it;
            this.f18376d = (long) this.f18373a.size();
        }
        if (it instanceof Iterator) {
            ((Iterator) it).forEachRemaining(consumer);
        } else {
            Iterator.CC.$default$forEachRemaining(it, consumer);
        }
    }

    public Comparator getComparator() {
        if (C0407m.k(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return C0407m.i(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return C0407m.k(this, i10);
    }

    public final Spliterator trySplit() {
        long j10;
        java.util.Iterator it = this.f18374b;
        if (it == null) {
            it = this.f18373a.iterator();
            this.f18374b = it;
            j10 = (long) this.f18373a.size();
            this.f18376d = j10;
        } else {
            j10 = this.f18376d;
        }
        if (j10 <= 1 || !it.hasNext()) {
            return null;
        }
        int i10 = this.f18377e + 1024;
        if (((long) i10) > j10) {
            i10 = (int) j10;
        }
        if (i10 > 33554432) {
            i10 = 33554432;
        }
        Object[] objArr = new Object[i10];
        int i11 = 0;
        do {
            objArr[i11] = it.next();
            i11++;
            if (i11 >= i10 || !it.hasNext()) {
                this.f18377e = i11;
                long j11 = this.f18376d;
            }
            objArr[i11] = it.next();
            i11++;
            break;
        } while (!it.hasNext());
        this.f18377e = i11;
        long j112 = this.f18376d;
        if (j112 != Long.MAX_VALUE) {
            this.f18376d = j112 - ((long) i11);
        }
        return new S(objArr, 0, i11, this.f18375c);
    }
}
