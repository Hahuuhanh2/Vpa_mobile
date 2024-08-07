package com.google.gson.internal.bind;

import bc.u;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import hc.a;
import hc.b;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: TypeAdapterRuntimeTypeWrapper */
public final class h<T> extends u<T> {

    /* renamed from: a  reason: collision with root package name */
    public final bc.h f7843a;

    /* renamed from: b  reason: collision with root package name */
    public final u<T> f7844b;

    /* renamed from: c  reason: collision with root package name */
    public final Type f7845c;

    public h(bc.h hVar, u<T> uVar, Type type) {
        this.f7843a = hVar;
        this.f7844b = uVar;
        this.f7845c = type;
    }

    public final T a(a aVar) {
        return this.f7844b.a(aVar);
    }

    public final void b(b bVar, T t10) {
        u<T> c10;
        u<T> uVar = this.f7844b;
        Type type = this.f7845c;
        if (t10 != null && ((type instanceof Class) || (type instanceof TypeVariable))) {
            type = t10.getClass();
        }
        if (type != this.f7845c) {
            uVar = this.f7843a.f(new gc.a(type));
            if (uVar instanceof ReflectiveTypeAdapterFactory.a) {
                u<T> uVar2 = this.f7844b;
                while ((uVar2 instanceof g) && (c10 = ((g) uVar2).c()) != uVar2) {
                    uVar2 = c10;
                }
                if (!(uVar2 instanceof ReflectiveTypeAdapterFactory.a)) {
                    uVar = this.f7844b;
                }
            }
        }
        uVar.b(bVar, t10);
    }
}
