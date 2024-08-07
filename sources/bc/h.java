package bc;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.bind.d;
import com.google.gson.internal.bind.e;
import com.google.gson.stream.MalformedJsonException;
import dc.g;
import dc.o;
import hc.b;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: Gson */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final ThreadLocal<Map<gc.a<?>, u<?>>> f4144a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f4145b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final g f4146c;

    /* renamed from: d  reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f4147d;

    /* renamed from: e  reason: collision with root package name */
    public final List<v> f4148e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Type, i<?>> f4149f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4150g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4151h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f4152i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f4153j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f4154k;

    /* renamed from: l  reason: collision with root package name */
    public final List<v> f4155l;

    /* renamed from: m  reason: collision with root package name */
    public final List<v> f4156m;

    /* renamed from: n  reason: collision with root package name */
    public final List<q> f4157n;

    /* compiled from: Gson */
    public static class a<T> extends com.google.gson.internal.bind.g<T> {

        /* renamed from: a  reason: collision with root package name */
        public u<T> f4158a = null;

        public final T a(hc.a aVar) {
            u<T> uVar = this.f4158a;
            if (uVar != null) {
                return uVar.a(aVar);
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        public final void b(b bVar, T t10) {
            u<T> uVar = this.f4158a;
            if (uVar != null) {
                uVar.b(bVar, t10);
                return;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        public final u<T> c() {
            u<T> uVar = this.f4158a;
            if (uVar != null) {
                return uVar;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }

    public h() {
        Excluder excluder = Excluder.f7727f;
        Map<Type, i<?>> emptyMap = Collections.emptyMap();
        List<v> emptyList = Collections.emptyList();
        List<v> emptyList2 = Collections.emptyList();
        List emptyList3 = Collections.emptyList();
        List<q> emptyList4 = Collections.emptyList();
        this.f4149f = emptyMap;
        g gVar = new g(emptyMap, emptyList4);
        this.f4146c = gVar;
        this.f4150g = false;
        this.f4151h = false;
        this.f4152i = true;
        this.f4153j = false;
        this.f4154k = false;
        this.f4155l = emptyList;
        this.f4156m = emptyList2;
        this.f4157n = emptyList4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.A);
        arrayList.add(e.f7832c);
        arrayList.add(excluder);
        arrayList.addAll(emptyList3);
        arrayList.add(TypeAdapters.f7794p);
        arrayList.add(TypeAdapters.f7785g);
        arrayList.add(TypeAdapters.f7782d);
        arrayList.add(TypeAdapters.f7783e);
        arrayList.add(TypeAdapters.f7784f);
        TypeAdapters.b bVar = TypeAdapters.f7789k;
        arrayList.add(TypeAdapters.b(Long.TYPE, Long.class, bVar));
        arrayList.add(TypeAdapters.b(Double.TYPE, Double.class, new d()));
        arrayList.add(TypeAdapters.b(Float.TYPE, Float.class, new e()));
        arrayList.add(d.f7830b);
        arrayList.add(TypeAdapters.f7786h);
        arrayList.add(TypeAdapters.f7787i);
        arrayList.add(TypeAdapters.a(AtomicLong.class, new t(new f(bVar))));
        arrayList.add(TypeAdapters.a(AtomicLongArray.class, new t(new g(bVar))));
        arrayList.add(TypeAdapters.f7788j);
        arrayList.add(TypeAdapters.f7790l);
        arrayList.add(TypeAdapters.f7795q);
        arrayList.add(TypeAdapters.f7796r);
        arrayList.add(TypeAdapters.a(BigDecimal.class, TypeAdapters.f7791m));
        arrayList.add(TypeAdapters.a(BigInteger.class, TypeAdapters.f7792n));
        arrayList.add(TypeAdapters.a(o.class, TypeAdapters.f7793o));
        arrayList.add(TypeAdapters.f7797s);
        arrayList.add(TypeAdapters.f7798t);
        arrayList.add(TypeAdapters.f7800v);
        arrayList.add(TypeAdapters.f7801w);
        arrayList.add(TypeAdapters.f7803y);
        arrayList.add(TypeAdapters.f7799u);
        arrayList.add(TypeAdapters.f7780b);
        arrayList.add(DateTypeAdapter.f7745b);
        arrayList.add(TypeAdapters.f7802x);
        if (com.google.gson.internal.sql.a.f7852a) {
            arrayList.add(com.google.gson.internal.sql.a.f7854c);
            arrayList.add(com.google.gson.internal.sql.a.f7853b);
            arrayList.add(com.google.gson.internal.sql.a.f7855d);
        }
        arrayList.add(ArrayTypeAdapter.f7739c);
        arrayList.add(TypeAdapters.f7779a);
        arrayList.add(new CollectionTypeAdapterFactory(gVar));
        arrayList.add(new MapTypeAdapterFactory(gVar));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(gVar);
        this.f4147d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.B);
        arrayList.add(new ReflectiveTypeAdapterFactory(gVar, excluder, jsonAdapterAnnotationTypeAdapterFactory, emptyList4));
        this.f4148e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final <T> T b(l lVar, Class<T> cls) {
        Object obj;
        gc.a aVar = new gc.a(cls);
        if (lVar == null) {
            obj = null;
        } else {
            obj = c(new com.google.gson.internal.bind.b(lVar), aVar);
        }
        return m9.b.f0(cls).cast(obj);
    }

    public final <T> T c(hc.a aVar, gc.a<T> aVar2) {
        boolean z10 = aVar.f10712b;
        aVar.f10712b = true;
        try {
            aVar.k0();
            T a10 = f(aVar2).a(aVar);
            aVar.f10712b = z10;
            return a10;
        } catch (EOFException e10) {
            if (1 != 0) {
                aVar.f10712b = z10;
                return null;
            }
            throw new JsonSyntaxException((Exception) e10);
        } catch (IllegalStateException e11) {
            throw new JsonSyntaxException((Exception) e11);
        } catch (IOException e12) {
            throw new JsonSyntaxException((Exception) e12);
        } catch (AssertionError e13) {
            throw new AssertionError("AssertionError (GSON 2.10.1): " + e13.getMessage(), e13);
        } catch (Throwable th2) {
            aVar.f10712b = z10;
            throw th2;
        }
    }

    public final Object d(Class cls, String str) {
        return m9.b.f0(cls).cast(e(str, new gc.a(cls)));
    }

    public final <T> T e(String str, gc.a<T> aVar) {
        if (str == null) {
            return null;
        }
        hc.a aVar2 = new hc.a(new StringReader(str));
        aVar2.f10712b = this.f4154k;
        T c10 = c(aVar2, aVar);
        if (c10 != null) {
            try {
                if (aVar2.k0() != 10) {
                    throw new JsonSyntaxException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e10) {
                throw new JsonSyntaxException((Exception) e10);
            } catch (IOException e11) {
                throw new JsonIOException((Exception) e11);
            }
        }
        return c10;
    }

    public final <T> u<T> f(gc.a<T> aVar) {
        u<T> uVar = (u) this.f4145b.get(aVar);
        if (uVar != null) {
            return uVar;
        }
        Map map = this.f4144a.get();
        boolean z10 = false;
        if (map == null) {
            map = new HashMap();
            this.f4144a.set(map);
            z10 = true;
        } else {
            u<T> uVar2 = (u) map.get(aVar);
            if (uVar2 != null) {
                return uVar2;
            }
        }
        u<T> uVar3 = null;
        try {
            a aVar2 = new a();
            map.put(aVar, aVar2);
            Iterator<v> it = this.f4148e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                uVar3 = it.next().a(this, aVar);
                if (uVar3 != null) {
                    if (aVar2.f4158a == null) {
                        aVar2.f4158a = uVar3;
                        map.put(aVar, uVar3);
                    } else {
                        throw new AssertionError("Delegate is already set");
                    }
                }
            }
            if (uVar3 != null) {
                if (z10) {
                    this.f4145b.putAll(map);
                }
                return uVar3;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + aVar);
        } finally {
            if (z10) {
                this.f4144a.remove();
            }
        }
    }

    public final <T> u<T> g(v vVar, gc.a<T> aVar) {
        if (!this.f4148e.contains(vVar)) {
            vVar = this.f4147d;
        }
        boolean z10 = false;
        for (v next : this.f4148e) {
            if (z10) {
                u<T> a10 = next.a(this, aVar);
                if (a10 != null) {
                    return a10;
                }
            } else if (next == vVar) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public final b h(Writer writer) {
        if (this.f4151h) {
            writer.write(")]}'\n");
        }
        b bVar = new b(writer);
        if (this.f4153j) {
            bVar.f10732d = "  ";
            bVar.f10733e = ": ";
        }
        bVar.f10735n = this.f4152i;
        bVar.f10734f = this.f4154k;
        bVar.f10737p = this.f4150g;
        return bVar;
    }

    public final String i(Object obj) {
        if (obj == null) {
            m mVar = m.f4160a;
            StringWriter stringWriter = new StringWriter();
            try {
                j(mVar, h(stringWriter));
                return stringWriter.toString();
            } catch (IOException e10) {
                throw new JsonIOException((Exception) e10);
            }
        } else {
            Class<?> cls = obj.getClass();
            StringWriter stringWriter2 = new StringWriter();
            try {
                k(obj, cls, h(stringWriter2));
                return stringWriter2.toString();
            } catch (IOException e11) {
                throw new JsonIOException((Exception) e11);
            }
        }
    }

    public final void j(m mVar, b bVar) {
        boolean z10 = bVar.f10734f;
        bVar.f10734f = true;
        boolean z11 = bVar.f10735n;
        bVar.f10735n = this.f4152i;
        boolean z12 = bVar.f10737p;
        bVar.f10737p = this.f4150g;
        try {
            TypeAdapters.f7804z.b(bVar, mVar);
            bVar.f10734f = z10;
            bVar.f10735n = z11;
            bVar.f10737p = z12;
        } catch (IOException e10) {
            throw new JsonIOException((Exception) e10);
        } catch (AssertionError e11) {
            throw new AssertionError("AssertionError (GSON 2.10.1): " + e11.getMessage(), e11);
        } catch (Throwable th2) {
            bVar.f10734f = z10;
            bVar.f10735n = z11;
            bVar.f10737p = z12;
            throw th2;
        }
    }

    public final void k(Object obj, Class cls, b bVar) {
        u f10 = f(new gc.a(cls));
        boolean z10 = bVar.f10734f;
        bVar.f10734f = true;
        boolean z11 = bVar.f10735n;
        bVar.f10735n = this.f4152i;
        boolean z12 = bVar.f10737p;
        bVar.f10737p = this.f4150g;
        try {
            f10.b(bVar, obj);
            bVar.f10734f = z10;
            bVar.f10735n = z11;
            bVar.f10737p = z12;
        } catch (IOException e10) {
            throw new JsonIOException((Exception) e10);
        } catch (AssertionError e11) {
            throw new AssertionError("AssertionError (GSON 2.10.1): " + e11.getMessage(), e11);
        } catch (Throwable th2) {
            bVar.f10734f = z10;
            bVar.f10735n = z11;
            bVar.f10737p = z12;
            throw th2;
        }
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("{serializeNulls:");
        q10.append(this.f4150g);
        q10.append(",factories:");
        q10.append(this.f4148e);
        q10.append(",instanceCreators:");
        q10.append(this.f4146c);
        q10.append("}");
        return q10.toString();
    }
}
