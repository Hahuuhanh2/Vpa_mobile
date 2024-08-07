package com.google.crypto.tink.shaded.protobuf;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField */
public final class q extends r {

    /* compiled from: LazyField */
    public static class a<K> implements Map.Entry<K, Object> {

        /* renamed from: a  reason: collision with root package name */
        public Map.Entry<K, q> f7417a;

        public a() {
            throw null;
        }

        public a(Map.Entry entry) {
            this.f7417a = entry;
        }

        public final K getKey() {
            return this.f7417a.getKey();
        }

        public final Object getValue() {
            q value = this.f7417a.getValue();
            if (value == null) {
                return null;
            }
            return value.a((x) null);
        }

        public final Object setValue(Object obj) {
            if (obj instanceof x) {
                q value = this.f7417a.getValue();
                x xVar = value.f7419a;
                value.f7420b = null;
                value.f7419a = (x) obj;
                return xVar;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* compiled from: LazyField */
    public static class b<K> implements Iterator<Map.Entry<K, Object>>, j$.util.Iterator {

        /* renamed from: a  reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f7418a;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f7418a = it;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return this.f7418a.hasNext();
        }

        public final Object next() {
            Map.Entry next = this.f7418a.next();
            if (next.getValue() instanceof q) {
                return new a(next);
            }
            return next;
        }

        public final void remove() {
            this.f7418a.remove();
        }
    }

    public final boolean equals(Object obj) {
        return a((x) null).equals(obj);
    }

    public final int hashCode() {
        return a((x) null).hashCode();
    }

    public final String toString() {
        return a((x) null).toString();
    }
}
