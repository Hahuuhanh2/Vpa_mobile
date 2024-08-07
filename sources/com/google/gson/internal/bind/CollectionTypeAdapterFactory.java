package com.google.gson.internal.bind;

import bc.h;
import bc.u;
import bc.v;
import dc.g;
import dc.q;
import hc.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

public final class CollectionTypeAdapterFactory implements v {

    /* renamed from: a  reason: collision with root package name */
    public final g f7742a;

    public static final class a<E> extends u<Collection<E>> {

        /* renamed from: a  reason: collision with root package name */
        public final h f7743a;

        /* renamed from: b  reason: collision with root package name */
        public final q<? extends Collection<E>> f7744b;

        public a(h hVar, Type type, u<E> uVar, q<? extends Collection<E>> qVar) {
            this.f7743a = new h(hVar, uVar, type);
            this.f7744b = qVar;
        }

        public final Object a(hc.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
                return null;
            }
            Collection collection = (Collection) this.f7744b.p();
            aVar.d();
            while (aVar.K()) {
                collection.add(this.f7743a.a(aVar));
            }
            aVar.s();
            return collection;
        }

        public final void b(b bVar, Object obj) {
            Collection<Object> collection = (Collection) obj;
            if (collection == null) {
                bVar.B();
                return;
            }
            bVar.h();
            for (Object b10 : collection) {
                this.f7743a.b(bVar, b10);
            }
            bVar.s();
        }
    }

    public CollectionTypeAdapterFactory(g gVar) {
        this.f7742a = gVar;
    }

    public final <T> u<T> a(h hVar, gc.a<T> aVar) {
        Type type;
        Type type2 = aVar.f10438b;
        Class<? super T> cls = aVar.f10437a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type f10 = dc.a.f(type2, cls, Collection.class);
        if (f10 instanceof ParameterizedType) {
            type = ((ParameterizedType) f10).getActualTypeArguments()[0];
        } else {
            type = Object.class;
        }
        return new a(hVar, type, hVar.f(new gc.a(type)), this.f7742a.b(aVar));
    }
}
