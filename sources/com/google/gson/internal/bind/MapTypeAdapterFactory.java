package com.google.gson.internal.bind;

import androidx.fragment.app.o;
import bc.h;
import bc.j;
import bc.l;
import bc.m;
import bc.n;
import bc.u;
import bc.v;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import dc.g;
import dc.q;
import f0.b0;
import hc.b;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;

public final class MapTypeAdapterFactory implements v {

    /* renamed from: a  reason: collision with root package name */
    public final g f7748a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f7749b = false;

    public final class a<K, V> extends u<Map<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        public final h f7750a;

        /* renamed from: b  reason: collision with root package name */
        public final h f7751b;

        /* renamed from: c  reason: collision with root package name */
        public final q<? extends Map<K, V>> f7752c;

        public a(h hVar, Type type, u<K> uVar, Type type2, u<V> uVar2, q<? extends Map<K, V>> qVar) {
            this.f7750a = new h(hVar, uVar, type);
            this.f7751b = new h(hVar, uVar2, type2);
            this.f7752c = qVar;
        }

        public final Object a(hc.a aVar) {
            int k02 = aVar.k0();
            if (k02 == 9) {
                aVar.d0();
                return null;
            }
            Map map = (Map) this.f7752c.p();
            if (k02 == 1) {
                aVar.d();
                while (aVar.K()) {
                    aVar.d();
                    Object a10 = this.f7750a.a(aVar);
                    if (map.put(a10, this.f7751b.a(aVar)) == null) {
                        aVar.s();
                    } else {
                        throw new JsonSyntaxException(b0.q("duplicate key: ", a10));
                    }
                }
                aVar.s();
            } else {
                aVar.h();
                while (aVar.K()) {
                    o.f2694a.J(aVar);
                    Object a11 = this.f7750a.a(aVar);
                    if (map.put(a11, this.f7751b.a(aVar)) != null) {
                        throw new JsonSyntaxException(b0.q("duplicate key: ", a11));
                    }
                }
                aVar.v();
            }
            return map;
        }

        public final void b(b bVar, Object obj) {
            String str;
            boolean z10;
            Map map = (Map) obj;
            if (map == null) {
                bVar.B();
            } else if (!MapTypeAdapterFactory.this.f7749b) {
                bVar.i();
                for (Map.Entry entry : map.entrySet()) {
                    bVar.x(String.valueOf(entry.getKey()));
                    this.f7751b.b(bVar, entry.getValue());
                }
                bVar.v();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i10 = 0;
                boolean z11 = false;
                for (Map.Entry entry2 : map.entrySet()) {
                    h hVar = this.f7750a;
                    Object key = entry2.getKey();
                    hVar.getClass();
                    try {
                        c cVar = new c();
                        hVar.b(cVar, key);
                        if (cVar.f7827t.isEmpty()) {
                            l lVar = cVar.f7829v;
                            arrayList.add(lVar);
                            arrayList2.add(entry2.getValue());
                            lVar.getClass();
                            if ((lVar instanceof j) || (lVar instanceof n)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            z11 |= z10;
                        } else {
                            throw new IllegalStateException("Expected one JSON element but was " + cVar.f7827t);
                        }
                    } catch (IOException e10) {
                        throw new JsonIOException((Exception) e10);
                    }
                }
                if (z11) {
                    bVar.h();
                    int size = arrayList.size();
                    while (i10 < size) {
                        bVar.h();
                        TypeAdapters.f7804z.b(bVar, (l) arrayList.get(i10));
                        this.f7751b.b(bVar, arrayList2.get(i10));
                        bVar.s();
                        i10++;
                    }
                    bVar.s();
                    return;
                }
                bVar.i();
                int size2 = arrayList.size();
                while (i10 < size2) {
                    l lVar2 = (l) arrayList.get(i10);
                    lVar2.getClass();
                    if (lVar2 instanceof bc.o) {
                        bc.o i11 = lVar2.i();
                        Serializable serializable = i11.f4162a;
                        if (serializable instanceof Number) {
                            str = String.valueOf(i11.n());
                        } else if (serializable instanceof Boolean) {
                            str = Boolean.toString(i11.m());
                        } else if (serializable instanceof String) {
                            str = i11.l();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (lVar2 instanceof m) {
                        str = "null";
                    } else {
                        throw new AssertionError();
                    }
                    bVar.x(str);
                    this.f7751b.b(bVar, arrayList2.get(i10));
                    i10++;
                }
                bVar.v();
            }
        }
    }

    public MapTypeAdapterFactory(g gVar) {
        this.f7748a = gVar;
    }

    public final <T> u<T> a(h hVar, gc.a<T> aVar) {
        Type[] typeArr;
        u uVar;
        Type type = aVar.f10438b;
        Class<? super T> cls = aVar.f10437a;
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        Class<Object> cls2 = Object.class;
        Class<String> cls3 = String.class;
        if (type == Properties.class) {
            typeArr = new Type[]{cls3, cls3};
        } else {
            Type f10 = dc.a.f(type, cls, Map.class);
            typeArr = f10 instanceof ParameterizedType ? ((ParameterizedType) f10).getActualTypeArguments() : new Type[]{cls2, cls2};
        }
        Type type2 = typeArr[0];
        if (type2 == Boolean.TYPE || type2 == Boolean.class) {
            uVar = TypeAdapters.f7781c;
        } else {
            uVar = hVar.f(new gc.a(type2));
        }
        return new a(hVar, typeArr[0], uVar, typeArr[1], hVar.f(new gc.a(typeArr[1])), this.f7748a.b(aVar));
    }
}
