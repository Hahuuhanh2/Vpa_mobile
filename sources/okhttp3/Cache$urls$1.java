package okhttp3;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import sk.j;

/* compiled from: Cache.kt */
public final class Cache$urls$1 implements Iterator<String>, j$.util.Iterator {

    /* renamed from: a  reason: collision with root package name */
    public boolean f21907a;

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        this.f21907a = false;
        throw null;
    }

    public final Object next() {
        hasNext();
        j.c((Object) null);
        throw null;
    }

    public final void remove() {
        if (!this.f21907a) {
            throw new IllegalStateException("remove() before next()".toString());
        }
        throw null;
    }
}
