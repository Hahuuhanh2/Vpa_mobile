package j$.util;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class N implements Iterator, Consumer {

    /* renamed from: a  reason: collision with root package name */
    boolean f18342a = false;

    /* renamed from: b  reason: collision with root package name */
    Object f18343b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Spliterator f18344c;

    N(Spliterator spliterator) {
        this.f18344c = spliterator;
    }

    public final void accept(Object obj) {
        this.f18342a = true;
        this.f18343b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final boolean hasNext() {
        if (!this.f18342a) {
            this.f18344c.a(this);
        }
        return this.f18342a;
    }

    public final Object next() {
        if (this.f18342a || hasNext()) {
            this.f18342a = false;
            return this.f18343b;
        }
        throw new NoSuchElementException();
    }
}
