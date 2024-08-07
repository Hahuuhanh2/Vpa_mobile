package okhttp3.internal.cache;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import okhttp3.internal.cache.DiskLruCache;

/* compiled from: DiskLruCache.kt */
public final class DiskLruCache$snapshots$1 implements Iterator<DiskLruCache.Snapshot>, j$.util.Iterator {

    /* renamed from: a  reason: collision with root package name */
    public DiskLruCache.Snapshot f22189a;

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        throw null;
    }

    public final Object next() {
        throw null;
    }

    public final void remove() {
        if (this.f22189a == null) {
            throw new IllegalStateException("remove() before next()".toString());
        }
        try {
            throw null;
        } catch (Throwable th2) {
            this.f22189a = null;
            throw th2;
        }
    }
}
