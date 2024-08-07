package androidx.datastore.preferences.protobuf;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField */
public final class q extends r {

    /* compiled from: LazyField */
    public static class a<K> implements Map.Entry<K, Object> {

        /* renamed from: a  reason: collision with root package name */
        public Map.Entry<K, q> f2320a;

        public a() {
            throw null;
        }

        public a(Map.Entry entry) {
            this.f2320a = entry;
        }

        public final K getKey() {
            return this.f2320a.getKey();
        }

        public final Object getValue() {
            q value = this.f2320a.getValue();
            if (value == null) {
                return null;
            }
            return value.a((z) null);
        }

        public final Object setValue(Object obj) {
            if (obj instanceof z) {
                q value = this.f2320a.getValue();
                z zVar = value.f2322a;
                value.f2323b = null;
                value.f2322a = (z) obj;
                return zVar;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* compiled from: LazyField */
    public static class b<K> implements Iterator<Map.Entry<K, Object>>, j$.util.Iterator {

        /* renamed from: a  reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f2321a;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f2321a = it;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return this.f2321a.hasNext();
        }

        public final Object next() {
            Map.Entry next = this.f2321a.next();
            if (next.getValue() instanceof q) {
                return new a(next);
            }
            return next;
        }

        public final void remove() {
            this.f2321a.remove();
        }
    }

    public final boolean equals(Object obj) {
        return a((z) null).equals(obj);
    }

    public final int hashCode() {
        return a((z) null).hashCode();
    }

    public final String toString() {
        return a((z) null).toString();
    }
}
