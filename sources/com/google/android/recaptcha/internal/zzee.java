package com.google.android.recaptcha.internal;

import ek.i;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import sk.j;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
public abstract class zzee implements InvocationHandler {
    private final Object zza;

    public zzee(Object obj) {
        this.zza = obj;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        int i10;
        if (j.a(method.getName(), "toString") && method.getParameterTypes().length == 0) {
            return "Proxy@".concat(String.valueOf(Integer.toHexString(obj.hashCode())));
        }
        if (j.a(method.getName(), "hashCode") && method.getParameterTypes().length == 0) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if (j.a(method.getName(), "equals") && method.getParameterTypes().length != 0) {
            boolean z10 = false;
            if (!(objArr == null || objArr.length == 0)) {
                Object obj3 = objArr[0];
                if (obj3 != null) {
                    i10 = obj3.hashCode();
                } else {
                    i10 = 0;
                }
                if (i10 == obj.hashCode()) {
                    z10 = true;
                }
            }
            return Boolean.valueOf(z10);
        } else if (!zza(obj, method, objArr)) {
            return i.f20112a;
        } else {
            if ((this.zza != null || !j.a(method.getReturnType(), Void.TYPE)) && ((obj2 = this.zza) == null || !j.a(zzie.zza(obj2.getClass()), zzie.zza(method.getReturnType())))) {
                throw new IllegalArgumentException(this.zza + " cannot be returned from method with return type " + method.getReturnType());
            }
            Object obj4 = this.zza;
            if (obj4 == null) {
                return i.f20112a;
            }
            return obj4;
        }
    }

    public abstract boolean zza(Object obj, Method method, Object[] objArr);
}
