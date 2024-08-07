package fc;

import com.google.gson.JsonIOException;
import f0.b0;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: ReflectionHelper */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0106a f10187a;

    /* renamed from: fc.a$a  reason: collision with other inner class name */
    /* compiled from: ReflectionHelper */
    public static abstract class C0106a {
        public abstract Method a(Class<?> cls, Field field);

        public abstract <T> Constructor<T> b(Class<T> cls);

        public abstract String[] c(Class<?> cls);

        public abstract boolean d(Class<?> cls);
    }

    /* compiled from: ReflectionHelper */
    public static class b extends C0106a {
        public final Method a(Class<?> cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        public final <T> Constructor<T> b(Class<T> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        public final String[] c(Class<?> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        public final boolean d(Class<?> cls) {
            return false;
        }
    }

    /* compiled from: ReflectionHelper */
    public static class c extends C0106a {

        /* renamed from: a  reason: collision with root package name */
        public final Method f10188a = Class.class.getMethod("isRecord", new Class[0]);

        /* renamed from: b  reason: collision with root package name */
        public final Method f10189b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f10190c;

        /* renamed from: d  reason: collision with root package name */
        public final Method f10191d;

        public c() {
            Method method = Class.class.getMethod("getRecordComponents", new Class[0]);
            this.f10189b = method;
            Class<?> componentType = method.getReturnType().getComponentType();
            this.f10190c = componentType.getMethod("getName", new Class[0]);
            this.f10191d = componentType.getMethod("getType", new Class[0]);
        }

        public final Method a(Class<?> cls, Field field) {
            try {
                return cls.getMethod(field.getName(), new Class[0]);
            } catch (ReflectiveOperationException e10) {
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
            }
        }

        public final <T> Constructor<T> b(Class<T> cls) {
            try {
                Object[] objArr = (Object[]) this.f10189b.invoke(cls, new Object[0]);
                Class[] clsArr = new Class[objArr.length];
                for (int i10 = 0; i10 < objArr.length; i10++) {
                    clsArr[i10] = (Class) this.f10191d.invoke(objArr[i10], new Object[0]);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e10) {
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
            }
        }

        public final String[] c(Class<?> cls) {
            try {
                Object[] objArr = (Object[]) this.f10189b.invoke(cls, new Object[0]);
                String[] strArr = new String[objArr.length];
                for (int i10 = 0; i10 < objArr.length; i10++) {
                    strArr[i10] = (String) this.f10190c.invoke(objArr[i10], new Object[0]);
                }
                return strArr;
            } catch (ReflectiveOperationException e10) {
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
            }
        }

        public final boolean d(Class<?> cls) {
            try {
                return ((Boolean) this.f10188a.invoke(cls, new Object[0])).booleanValue();
            } catch (ReflectiveOperationException e10) {
                throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
            }
        }
    }

    static {
        C0106a aVar;
        try {
            aVar = new c();
        } catch (NoSuchMethodException unused) {
            aVar = new b();
        }
        f10187a = aVar;
    }

    public static void a(AccessibleObject accessibleObject, StringBuilder sb2) {
        Class[] clsArr;
        sb2.append('(');
        if (accessibleObject instanceof Method) {
            clsArr = ((Method) accessibleObject).getParameterTypes();
        } else {
            clsArr = ((Constructor) accessibleObject).getParameterTypes();
        }
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(clsArr[i10].getSimpleName());
        }
        sb2.append(')');
    }

    public static String b(Constructor<?> constructor) {
        StringBuilder sb2 = new StringBuilder(constructor.getDeclaringClass().getName());
        a(constructor, sb2);
        return sb2.toString();
    }

    public static String c(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String d(AccessibleObject accessibleObject, boolean z10) {
        String str;
        if (accessibleObject instanceof Field) {
            StringBuilder q10 = android.support.v4.media.a.q("field '");
            q10.append(c((Field) accessibleObject));
            q10.append("'");
            str = q10.toString();
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb2 = new StringBuilder(method.getName());
            a(method, sb2);
            String sb3 = sb2.toString();
            StringBuilder q11 = android.support.v4.media.a.q("method '");
            q11.append(method.getDeclaringClass().getName());
            q11.append("#");
            q11.append(sb3);
            q11.append("'");
            str = q11.toString();
        } else if (accessibleObject instanceof Constructor) {
            StringBuilder q12 = android.support.v4.media.a.q("constructor '");
            q12.append(b((Constructor) accessibleObject));
            q12.append("'");
            str = q12.toString();
        } else {
            StringBuilder q13 = android.support.v4.media.a.q("<unknown AccessibleObject> ");
            q13.append(accessibleObject.toString());
            str = q13.toString();
        }
        if (!z10 || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static void e(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e10) {
            throw new JsonIOException(b0.s("Failed making ", d(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."), e10);
        }
    }
}
