package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import f0.b0;
import v0.h;

/* compiled from: FragmentFactory */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public static final h<ClassLoader, h<String, Class<?>>> f2696a = new h<>();

    public static Class<?> b(ClassLoader classLoader, String str) {
        h<ClassLoader, h<String, Class<?>>> hVar = f2696a;
        h orDefault = hVar.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new h();
            hVar.put(classLoader, orDefault);
        }
        Class<?> cls = (Class) orDefault.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        orDefault.put(str, cls2);
        return cls2;
    }

    public static Class<? extends Fragment> c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassNotFoundException e10) {
            throw new Fragment.InstantiationException(b0.s("Unable to instantiate fragment ", str, ": make sure class name exists"), e10);
        } catch (ClassCastException e11) {
            throw new Fragment.InstantiationException(b0.s("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e11);
        }
    }

    public Fragment a(String str) {
        throw null;
    }
}
