package vl;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import rj.a;
import rj.b;
import rj.d;
import ul.c;
import ul.d0;
import ul.y;

/* compiled from: RxJava3CallAdapterFactory */
public final class g extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f23374a = true;

    public final c a(Type type, Annotation[] annotationArr) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Type type2;
        String str;
        Class<?> f10 = d0.f(type);
        if (f10 == a.class) {
            return new f(Void.class, this.f23374a, false, true, false, false, false, true);
        }
        if (f10 == b.class) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (f10 == rj.g.class) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (f10 == rj.c.class) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (f10 != d.class && !z10 && !z11 && !z12) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (z10) {
                str = "Flowable";
            } else if (z11) {
                str = "Single";
            } else if (z12) {
                str = "Maybe";
            } else {
                str = "Observable";
            }
            StringBuilder r10 = android.support.v4.media.a.r(str, " return type must be parameterized as ", str, "<Foo> or ", str);
            r10.append("<? extends Foo>");
            throw new IllegalStateException(r10.toString());
        }
        Type e10 = d0.e(0, (ParameterizedType) type);
        Class<?> f11 = d0.f(e10);
        if (f11 == y.class) {
            if (e10 instanceof ParameterizedType) {
                type2 = d0.e(0, (ParameterizedType) e10);
                z14 = false;
                z13 = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (f11 != d.class) {
            type2 = e10;
            z13 = true;
            z14 = false;
        } else if (e10 instanceof ParameterizedType) {
            type2 = d0.e(0, (ParameterizedType) e10);
            z14 = true;
            z13 = false;
        } else {
            throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
        }
        return new f(type2, this.f23374a, z14, z13, z10, z11, z12, false);
    }
}
