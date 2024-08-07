package com.google.gson.internal.bind;

import bc.h;
import bc.u;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import f0.b0;
import gc.a;
import hc.b;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ReflectiveTypeAdapterFactory */
public final class f extends ReflectiveTypeAdapterFactory.b {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f7835f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Method f7836g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f7837h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ u f7838i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ h f7839j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ a f7840k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ boolean f7841l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ boolean f7842m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(String str, Field field, boolean z10, boolean z11, boolean z12, Method method, boolean z13, u uVar, h hVar, a aVar, boolean z14, boolean z15) {
        super(str, field, z10, z11);
        this.f7835f = z12;
        this.f7836g = method;
        this.f7837h = z13;
        this.f7838i = uVar;
        this.f7839j = hVar;
        this.f7840k = aVar;
        this.f7841l = z14;
        this.f7842m = z15;
    }

    public final void a(hc.a aVar, int i10, Object[] objArr) {
        Object a10 = this.f7838i.a(aVar);
        if (a10 != null || !this.f7841l) {
            objArr[i10] = a10;
            return;
        }
        StringBuilder q10 = android.support.v4.media.a.q("null is not allowed as value for record component '");
        q10.append(this.f7764c);
        q10.append("' of primitive type; at path ");
        q10.append(aVar.z());
        throw new JsonParseException(q10.toString());
    }

    public final void b(hc.a aVar, Object obj) {
        Object a10 = this.f7838i.a(aVar);
        if (a10 != null || !this.f7841l) {
            if (this.f7835f) {
                ReflectiveTypeAdapterFactory.b(obj, this.f7763b);
            } else if (this.f7842m) {
                throw new JsonIOException(b0.r("Cannot set value of 'static final' ", fc.a.d(this.f7763b, false)));
            }
            this.f7763b.set(obj, a10);
        }
    }

    public final void c(b bVar, Object obj) {
        Object obj2;
        u uVar;
        if (this.f7765d) {
            if (this.f7835f) {
                Method method = this.f7836g;
                if (method == null) {
                    ReflectiveTypeAdapterFactory.b(obj, this.f7763b);
                } else {
                    ReflectiveTypeAdapterFactory.b(obj, method);
                }
            }
            Method method2 = this.f7836g;
            if (method2 != null) {
                try {
                    obj2 = method2.invoke(obj, new Object[0]);
                } catch (InvocationTargetException e10) {
                    throw new JsonIOException(b0.s("Accessor ", fc.a.d(this.f7836g, false), " threw exception"), e10.getCause());
                }
            } else {
                obj2 = this.f7763b.get(obj);
            }
            if (obj2 != obj) {
                bVar.x(this.f7762a);
                if (this.f7837h) {
                    uVar = this.f7838i;
                } else {
                    uVar = new h(this.f7839j, this.f7838i, this.f7840k.f10438b);
                }
                uVar.b(bVar, obj2);
            }
        }
    }
}
