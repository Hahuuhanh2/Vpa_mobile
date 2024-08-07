package com.google.gson.internal.bind;

import bc.h;
import bc.u;
import bc.v;
import gc.a;
import hc.b;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class ArrayTypeAdapter<E> extends u<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final v f7739c = new v() {
        public final <T> u<T> a(h hVar, a<T> aVar) {
            Type type;
            Type type2 = aVar.f10438b;
            boolean z10 = type2 instanceof GenericArrayType;
            if (!z10 && (!(type2 instanceof Class) || !((Class) type2).isArray())) {
                return null;
            }
            if (z10) {
                type = ((GenericArrayType) type2).getGenericComponentType();
            } else {
                type = ((Class) type2).getComponentType();
            }
            return new ArrayTypeAdapter(hVar, hVar.f(new a(type)), dc.a.e(type));
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final Class<E> f7740a;

    /* renamed from: b  reason: collision with root package name */
    public final h f7741b;

    public ArrayTypeAdapter(h hVar, u<E> uVar, Class<E> cls) {
        this.f7741b = new h(hVar, uVar, cls);
        this.f7740a = cls;
    }

    public final Object a(hc.a aVar) {
        if (aVar.k0() == 9) {
            aVar.d0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.d();
        while (aVar.K()) {
            arrayList.add(this.f7741b.a(aVar));
        }
        aVar.s();
        int size = arrayList.size();
        if (!this.f7740a.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance(this.f7740a, size));
        }
        Object newInstance = Array.newInstance(this.f7740a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    public final void b(b bVar, Object obj) {
        if (obj == null) {
            bVar.B();
            return;
        }
        bVar.h();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f7741b.b(bVar, Array.get(obj, i10));
        }
        bVar.s();
    }
}
