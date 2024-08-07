package v0;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import v0.g;

/* compiled from: ArrayMap */
public class b<K, V> extends h<K, V> implements Map<K, V>, j$.util.Map {

    /* renamed from: o  reason: collision with root package name */
    public a f15969o;

    public b() {
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

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f15969o == null) {
            this.f15969o = new a(this);
        }
        a aVar = this.f15969o;
        if (aVar.f15986a == null) {
            aVar.f15986a = new g.b();
        }
        return aVar.f15986a;
    }

    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    public final Set<K> keySet() {
        if (this.f15969o == null) {
            this.f15969o = new a(this);
        }
        a aVar = this.f15969o;
        if (aVar.f15987b == null) {
            aVar.f15987b = new g.c();
        }
        return aVar.f15987b;
    }

    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        c(map.size() + this.f16007c);
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final Collection<V> values() {
        if (this.f15969o == null) {
            this.f15969o = new a(this);
        }
        a aVar = this.f15969o;
        if (aVar.f15988c == null) {
            aVar.f15988c = new g.e();
        }
        return aVar.f15988c;
    }

    public b(int i10) {
        super(i10);
    }

    public b(b bVar) {
        if (bVar != null) {
            j(bVar);
        }
    }
}
