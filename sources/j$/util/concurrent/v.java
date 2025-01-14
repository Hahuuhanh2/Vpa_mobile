package j$.util.concurrent;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

abstract class v {

    /* renamed from: a  reason: collision with root package name */
    private static final Unsafe f18458a;

    static {
        Field b10 = b();
        b10.setAccessible(true);
        try {
            f18458a = (Unsafe) b10.get((Object) null);
        } catch (IllegalAccessException e10) {
            throw new Error("Couldn't get the Unsafe", e10);
        }
    }

    public static final int a(Unsafe unsafe, Object obj, long j10) {
        int intVolatile;
        do {
            intVolatile = unsafe.getIntVolatile(obj, j10);
        } while (!unsafe.compareAndSwapInt(obj, j10, intVolatile, intVolatile - 4));
        return intVolatile;
    }

    private static Field b() {
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e10) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new Error("Couldn't find the Unsafe", e10);
        }
    }

    public static Unsafe c() {
        return f18458a;
    }
}
