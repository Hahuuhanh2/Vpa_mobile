package j$.util;

import j$.util.Map;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/* renamed from: j$.util.d  reason: case insensitive filesystem */
final class C0359d implements Map, Serializable, Map {
    private static final long serialVersionUID = 1978198479659022715L;

    /* renamed from: a  reason: collision with root package name */
    private final Map f18467a;

    /* renamed from: b  reason: collision with root package name */
    final Object f18468b = this;

    /* renamed from: c  reason: collision with root package name */
    private transient Set f18469c;

    /* renamed from: d  reason: collision with root package name */
    private transient Set f18470d;

    /* renamed from: e  reason: collision with root package name */
    private transient Collection f18471e;

    C0359d(Map map) {
        map.getClass();
        this.f18467a = map;
    }

    private static Set a(Set set, Object obj) {
        if (DesugarCollections.f18335f == null) {
            return Collections.synchronizedSet(set);
        }
        try {
            return (Set) DesugarCollections.f18335f.newInstance(new Object[]{set, obj});
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new Error("Unable to instantiate a synchronized list.", e10);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f18468b) {
            objectOutputStream.defaultWriteObject();
        }
    }

    public final void clear() {
        synchronized (this.f18468b) {
            this.f18467a.clear();
        }
    }

    public final Object compute(Object obj, BiFunction biFunction) {
        Object compute;
        synchronized (this.f18468b) {
            Map map = this.f18467a;
            compute = map instanceof Map ? ((Map) map).compute(obj, biFunction) : map instanceof ConcurrentMap ? ConcurrentMap.CC.$default$compute((java.util.concurrent.ConcurrentMap) map, obj, biFunction) : Map.CC.$default$compute(map, obj, biFunction);
        }
        return compute;
    }

    public final /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final Object computeIfAbsent(Object obj, Function function) {
        Object computeIfAbsent;
        synchronized (this.f18468b) {
            java.util.Map map = this.f18467a;
            computeIfAbsent = map instanceof Map ? ((Map) map).computeIfAbsent(obj, function) : map instanceof java.util.concurrent.ConcurrentMap ? ConcurrentMap.CC.$default$computeIfAbsent((java.util.concurrent.ConcurrentMap) map, obj, function) : Map.CC.$default$computeIfAbsent(map, obj, function);
        }
        return computeIfAbsent;
    }

    public final /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object computeIfPresent;
        synchronized (this.f18468b) {
            java.util.Map map = this.f18467a;
            computeIfPresent = map instanceof Map ? ((Map) map).computeIfPresent(obj, biFunction) : map instanceof java.util.concurrent.ConcurrentMap ? ConcurrentMap.CC.$default$computeIfPresent((java.util.concurrent.ConcurrentMap) map, obj, biFunction) : Map.CC.$default$computeIfPresent(map, obj, biFunction);
        }
        return computeIfPresent;
    }

    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.f18468b) {
            containsKey = this.f18467a.containsKey(obj);
        }
        return containsKey;
    }

    public final boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.f18468b) {
            containsValue = this.f18467a.containsValue(obj);
        }
        return containsValue;
    }

    public final Set entrySet() {
        Set set;
        synchronized (this.f18468b) {
            if (this.f18470d == null) {
                this.f18470d = a(this.f18467a.entrySet(), this.f18468b);
            }
            set = this.f18470d;
        }
        return set;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f18468b) {
            equals = this.f18467a.equals(obj);
        }
        return equals;
    }

    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.f18468b) {
            java.util.Map map = this.f18467a;
            if (map instanceof Map) {
                ((Map) map).forEach(biConsumer);
            } else if (map instanceof java.util.concurrent.ConcurrentMap) {
                ConcurrentMap.CC.$default$forEach((java.util.concurrent.ConcurrentMap) map, biConsumer);
            } else {
                Map.CC.$default$forEach(map, biConsumer);
            }
        }
    }

    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.f18468b) {
            obj2 = this.f18467a.get(obj);
        }
        return obj2;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        Object orDefault;
        synchronized (this.f18468b) {
            java.util.Map map = this.f18467a;
            orDefault = map instanceof Map ? ((Map) map).getOrDefault(obj, obj2) : map instanceof java.util.concurrent.ConcurrentMap ? ConcurrentMap.CC.$default$getOrDefault((java.util.concurrent.ConcurrentMap) map, obj, obj2) : Map.CC.$default$getOrDefault(map, obj, obj2);
        }
        return orDefault;
    }

    public final int hashCode() {
        int hashCode;
        synchronized (this.f18468b) {
            hashCode = this.f18467a.hashCode();
        }
        return hashCode;
    }

    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f18468b) {
            isEmpty = this.f18467a.isEmpty();
        }
        return isEmpty;
    }

    public final Set keySet() {
        Set set;
        synchronized (this.f18468b) {
            if (this.f18469c == null) {
                this.f18469c = a(this.f18467a.keySet(), this.f18468b);
            }
            set = this.f18469c;
        }
        return set;
    }

    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object merge;
        synchronized (this.f18468b) {
            java.util.Map map = this.f18467a;
            merge = map instanceof Map ? ((Map) map).merge(obj, obj2, biFunction) : map instanceof java.util.concurrent.ConcurrentMap ? ConcurrentMap.CC.$default$merge((java.util.concurrent.ConcurrentMap) map, obj, obj2, biFunction) : Map.CC.$default$merge(map, obj, obj2, biFunction);
        }
        return merge;
    }

    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this.f18468b) {
            put = this.f18467a.put(obj, obj2);
        }
        return put;
    }

    public final void putAll(java.util.Map map) {
        synchronized (this.f18468b) {
            this.f18467a.putAll(map);
        }
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object q10;
        synchronized (this.f18468b) {
            q10 = C0407m.q(this.f18467a, obj, obj2);
        }
        return q10;
    }

    public final Object remove(Object obj) {
        Object remove;
        synchronized (this.f18468b) {
            remove = this.f18467a.remove(obj);
        }
        return remove;
    }

    public final boolean remove(Object obj, Object obj2) {
        boolean remove;
        synchronized (this.f18468b) {
            java.util.Map map = this.f18467a;
            remove = map instanceof Map ? ((Map) map).remove(obj, obj2) : Map.CC.$default$remove(map, obj, obj2);
        }
        return remove;
    }

    public final Object replace(Object obj, Object obj2) {
        Object replace;
        synchronized (this.f18468b) {
            java.util.Map map = this.f18467a;
            replace = map instanceof Map ? ((Map) map).replace(obj, obj2) : Map.CC.$default$replace(map, obj, obj2);
        }
        return replace;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean replace;
        synchronized (this.f18468b) {
            java.util.Map map = this.f18467a;
            replace = map instanceof Map ? ((Map) map).replace(obj, obj2, obj3) : Map.CC.$default$replace(map, obj, obj2, obj3);
        }
        return replace;
    }

    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f18468b) {
            java.util.Map map = this.f18467a;
            if (map instanceof Map) {
                ((Map) map).replaceAll(biFunction);
            } else if (map instanceof java.util.concurrent.ConcurrentMap) {
                ConcurrentMap.CC.$default$replaceAll((java.util.concurrent.ConcurrentMap) map, biFunction);
            } else {
                Map.CC.$default$replaceAll(map, biFunction);
            }
        }
    }

    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final int size() {
        int size;
        synchronized (this.f18468b) {
            size = this.f18467a.size();
        }
        return size;
    }

    public final String toString() {
        String obj;
        synchronized (this.f18468b) {
            obj = this.f18467a.toString();
        }
        return obj;
    }

    public final Collection values() {
        Collection collection;
        Collection collection2;
        synchronized (this.f18468b) {
            if (this.f18471e == null) {
                Collection values = this.f18467a.values();
                Object obj = this.f18468b;
                if (DesugarCollections.f18334e == null) {
                    collection2 = Collections.synchronizedCollection(values);
                } else {
                    try {
                        collection2 = (Collection) DesugarCollections.f18334e.newInstance(new Object[]{values, obj});
                    } catch (InstantiationException e10) {
                        e = e10;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (IllegalAccessException e11) {
                        e = e11;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    } catch (InvocationTargetException e12) {
                        e = e12;
                        throw new Error("Unable to instantiate a synchronized list.", e);
                    }
                }
                this.f18471e = collection2;
            }
            collection = this.f18471e;
        }
        return collection;
    }
}
