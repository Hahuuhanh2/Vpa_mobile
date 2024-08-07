package ae;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import rk.l;

/* compiled from: DataStore.kt */
public final class a<V> extends HashMap<Integer, V> implements Map {

    /* renamed from: a  reason: collision with root package name */
    public final l<Integer, V> f166a;

    public a(l<? super Integer, ? extends V> lVar) {
        this.f166a = lVar;
    }

    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    public final /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    public final /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, Function.VivifiedWrapper.convert(function));
    }

    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return super.containsKey((Integer) obj);
    }

    public final /* bridge */ Set<Map.Entry<Integer, V>> entrySet() {
        return super.entrySet();
    }

    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    public final V get(Object obj) {
        if (!(obj instanceof Integer)) {
            return null;
        }
        int intValue = ((Number) obj).intValue();
        V v2 = super.get(Integer.valueOf(intValue));
        if (v2 != null) {
            return v2;
        }
        V invoke = this.f166a.invoke(Integer.valueOf(intValue));
        put(Integer.valueOf(intValue), invoke);
        return invoke;
    }

    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof Integer)) {
            return obj2;
        }
        return Map.CC.$default$getOrDefault(this, (Integer) obj, obj2);
    }

    public final /* bridge */ Set<Integer> keySet() {
        return super.keySet();
    }

    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    public final /* bridge */ V remove(Object obj) {
        if (!(obj instanceof Integer)) {
            return null;
        }
        return super.remove((Integer) obj);
    }

    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final /* bridge */ int size() {
        return super.size();
    }

    public final /* bridge */ Collection<V> values() {
        return super.values();
    }

    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return Map.CC.$default$remove(this, (Integer) obj, obj2);
    }
}
