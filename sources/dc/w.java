package dc;

import f0.b0;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator */
public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f8943a;

    static {
        w wVar;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            wVar = new s(cls.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                wVar = new t(intValue, declaredMethod2);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    wVar = new u(declaredMethod3);
                } catch (Exception unused3) {
                    wVar = new v();
                }
            }
        }
        f8943a = wVar;
    }

    public static void a(Class cls) {
        String a10 = g.a(cls);
        if (a10 != null) {
            throw new AssertionError(b0.r("UnsafeAllocator is used for non-instantiable type: ", a10));
        }
    }

    public abstract <T> T b(Class<T> cls);
}
