package r2;

import android.app.Application;
import androidx.lifecycle.v;
import fk.h;
import j7.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import sk.j;

/* compiled from: SavedStateViewModelFactory.kt */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final List<Class<?>> f14495a;

    /* renamed from: b  reason: collision with root package name */
    public static final List<Class<?>> f14496b;

    static {
        Class<v> cls = v.class;
        f14495a = a.d0(Application.class, cls);
        f14496b = a.c0(cls);
    }

    public static final <T> Constructor<T> a(Class<T> cls, List<? extends Class<?>> list) {
        j.f(list, "signature");
        Constructor<T>[] constructors = cls.getConstructors();
        j.e(constructors, "modelClass.constructors");
        int length = constructors.length;
        int i10 = 0;
        while (i10 < length) {
            Constructor<T> constructor = constructors[i10];
            Class[] parameterTypes = constructor.getParameterTypes();
            j.e(parameterTypes, "constructor.parameterTypes");
            List z02 = h.z0(parameterTypes);
            if (j.a(list, z02)) {
                return constructor;
            }
            if (list.size() != z02.size() || !z02.containsAll(list)) {
                i10++;
            } else {
                StringBuilder q10 = android.support.v4.media.a.q("Class ");
                q10.append(cls.getSimpleName());
                q10.append(" must have parameters in the proper order: ");
                q10.append(list);
                throw new UnsupportedOperationException(q10.toString());
            }
        }
        return null;
    }

    public static final <T extends v> T b(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        try {
            return (v) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
