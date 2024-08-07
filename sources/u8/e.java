package u8;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import ng.r;
import u8.c;
import u8.k;

/* compiled from: ImmutableMap */
public abstract class e<K, V> implements Map<K, V>, Serializable, j$.util.Map {

    /* renamed from: a  reason: collision with root package name */
    public transient k.a f15317a;

    /* renamed from: b  reason: collision with root package name */
    public transient k.b f15318b;

    /* renamed from: c  reason: collision with root package name */
    public transient k.c f15319c;

    /* compiled from: ImmutableMap */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public Object[] f15320a = new Object[32];

        /* renamed from: b  reason: collision with root package name */
        public int f15321b = 0;

        /* renamed from: c  reason: collision with root package name */
        public C0205a f15322c;

        /* renamed from: u8.e$a$a  reason: collision with other inner class name */
        /* compiled from: ImmutableMap */
        public static final class C0205a {

            /* renamed from: a  reason: collision with root package name */
            public final Object f15323a;

            /* renamed from: b  reason: collision with root package name */
            public final Object f15324b;

            /* renamed from: c  reason: collision with root package name */
            public final Object f15325c;

            public C0205a(Object obj, Object obj2, Object obj3) {
                this.f15323a = obj;
                this.f15324b = obj2;
                this.f15325c = obj3;
            }

            public final IllegalArgumentException a() {
                String valueOf = String.valueOf(this.f15323a);
                String valueOf2 = String.valueOf(this.f15324b);
                String valueOf3 = String.valueOf(this.f15323a);
                String valueOf4 = String.valueOf(this.f15325c);
                StringBuilder sb2 = new StringBuilder(valueOf4.length() + valueOf3.length() + valueOf2.length() + valueOf.length() + 39);
                sb2.append("Multiple entries with same key: ");
                sb2.append(valueOf);
                sb2.append("=");
                sb2.append(valueOf2);
                sb2.append(" and ");
                sb2.append(valueOf3);
                sb2.append("=");
                sb2.append(valueOf4);
                return new IllegalArgumentException(sb2.toString());
            }
        }

        public final void a(String str, r.a aVar) {
            int i10 = (this.f15321b + 1) * 2;
            Object[] objArr = this.f15320a;
            if (i10 > objArr.length) {
                this.f15320a = Arrays.copyOf(objArr, c.a.a(objArr.length, i10));
            }
            if (aVar != null) {
                Object[] objArr2 = this.f15320a;
                int i11 = this.f15321b;
                int i12 = i11 * 2;
                objArr2[i12] = str;
                objArr2[i12 + 1] = aVar;
                this.f15321b = i11 + 1;
                return;
            }
            StringBuilder sb2 = new StringBuilder(str.length() + 26);
            sb2.append("null value in entry: ");
            sb2.append(str);
            sb2.append("=null");
            throw new NullPointerException(sb2.toString());
        }
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
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

    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        k.c cVar = this.f15319c;
        if (cVar == null) {
            k kVar = (k) this;
            k.c cVar2 = new k.c(kVar.f15379e, 1, kVar.f15380f);
            this.f15319c = cVar2;
            cVar = cVar2;
        }
        return cVar.contains(obj);
    }

    public final Set entrySet() {
        k.a aVar = this.f15317a;
        if (aVar != null) {
            return aVar;
        }
        k kVar = (k) this;
        k.a aVar2 = new k.a(kVar, kVar.f15379e, kVar.f15380f);
        this.f15317a = aVar2;
        return aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    public abstract V get(Object obj);

    public final V getOrDefault(Object obj, V v2) {
        V v10 = get(obj);
        if (v10 != null) {
            return v10;
        }
        return v2;
    }

    public final int hashCode() {
        k.a aVar = this.f15317a;
        if (aVar == null) {
            k kVar = (k) this;
            k.a aVar2 = new k.a(kVar, kVar.f15379e, kVar.f15380f);
            this.f15317a = aVar2;
            aVar = aVar2;
        }
        return j7.a.N(aVar);
    }

    public final boolean isEmpty() {
        if (((k) this).f15380f == 0) {
            return true;
        }
        return false;
    }

    public final Set keySet() {
        k.b bVar = this.f15318b;
        if (bVar != null) {
            return bVar;
        }
        k kVar = (k) this;
        k.b bVar2 = new k.b(kVar, new k.c(kVar.f15379e, 0, kVar.f15380f));
        this.f15318b = bVar2;
        return bVar2;
    }

    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Deprecated
    public final V put(K k10, V v2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
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

    public final String toString() {
        int i10 = ((k) this).f15380f;
        j7.a.q(i10, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) i10) * 8, 1073741824));
        sb2.append('{');
        boolean z10 = true;
        n n10 = ((k.a) entrySet()).iterator();
        while (true) {
            a aVar = (a) n10;
            if (aVar.hasNext()) {
                Map.Entry entry = (Map.Entry) aVar.next();
                if (!z10) {
                    sb2.append(", ");
                }
                z10 = false;
                sb2.append(entry.getKey());
                sb2.append('=');
                sb2.append(entry.getValue());
            } else {
                sb2.append('}');
                return sb2.toString();
            }
        }
    }

    public final Collection values() {
        k.c cVar = this.f15319c;
        if (cVar != null) {
            return cVar;
        }
        k kVar = (k) this;
        k.c cVar2 = new k.c(kVar.f15379e, 1, kVar.f15380f);
        this.f15319c = cVar2;
        return cVar2;
    }
}
