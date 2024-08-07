package com.google.protobuf;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField */
public final class l extends m {

    /* compiled from: LazyField */
    public static class a<K> implements Map.Entry<K, Object> {

        /* renamed from: a  reason: collision with root package name */
        public Map.Entry<K, l> f7919a;

        public a() {
            throw null;
        }

        public a(Map.Entry entry) {
            this.f7919a = entry;
        }

        public final K getKey() {
            return this.f7919a.getKey();
        }

        public final Object getValue() {
            l value = this.f7919a.getValue();
            if (value == null) {
                return null;
            }
            return value.a((u) null);
        }

        public final Object setValue(Object obj) {
            if (obj instanceof u) {
                l value = this.f7919a.getValue();
                u uVar = value.f7921a;
                value.f7922b = null;
                value.f7921a = (u) obj;
                return uVar;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* compiled from: LazyField */
    public static class b<K> implements Iterator<Map.Entry<K, Object>>, j$.util.Iterator {

        /* renamed from: a  reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f7920a;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f7920a = it;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return this.f7920a.hasNext();
        }

        public final Object next() {
            Map.Entry next = this.f7920a.next();
            if (next.getValue() instanceof l) {
                return new a(next);
            }
            return next;
        }

        public final void remove() {
            this.f7920a.remove();
        }
    }

    public final boolean equals(Object obj) {
        return a((u) null).equals(obj);
    }

    public final int hashCode() {
        return a((u) null).hashCode();
    }

    public final String toString() {
        return a((u) null).toString();
    }
}
