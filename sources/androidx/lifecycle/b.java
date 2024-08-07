package androidx.lifecycle;

import androidx.lifecycle.i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r2.l;

@Deprecated
/* compiled from: ClassesInfoCache */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static b f2733c = new b();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f2734a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f2735b = new HashMap();

    @Deprecated
    /* compiled from: ClassesInfoCache */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f2736a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<C0025b, i.a> f2737b;

        public a(HashMap hashMap) {
            this.f2737b = hashMap;
            for (Map.Entry entry : hashMap.entrySet()) {
                i.a aVar = (i.a) entry.getValue();
                List list = (List) this.f2736a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f2736a.put(aVar, list);
                }
                list.add((C0025b) entry.getKey());
            }
        }

        public static void a(List<C0025b> list, l lVar, i.a aVar, Object obj) {
            if (list != null) {
                int size = list.size() - 1;
                while (size >= 0) {
                    C0025b bVar = list.get(size);
                    bVar.getClass();
                    try {
                        int i10 = bVar.f2738a;
                        if (i10 == 0) {
                            bVar.f2739b.invoke(obj, new Object[0]);
                        } else if (i10 == 1) {
                            bVar.f2739b.invoke(obj, new Object[]{lVar});
                        } else if (i10 == 2) {
                            bVar.f2739b.invoke(obj, new Object[]{lVar, aVar});
                        }
                        size--;
                    } catch (InvocationTargetException e10) {
                        throw new RuntimeException("Failed to call observer method", e10.getCause());
                    } catch (IllegalAccessException e11) {
                        throw new RuntimeException(e11);
                    }
                }
            }
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.b$b  reason: collision with other inner class name */
    /* compiled from: ClassesInfoCache */
    public static final class C0025b {

        /* renamed from: a  reason: collision with root package name */
        public final int f2738a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f2739b;

        public C0025b(int i10, Method method) {
            this.f2738a = i10;
            this.f2739b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0025b)) {
                return false;
            }
            C0025b bVar = (C0025b) obj;
            if (this.f2738a != bVar.f2738a || !this.f2739b.getName().equals(bVar.f2739b.getName())) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f2739b.getName().hashCode() + (this.f2738a * 31);
        }
    }

    public static void c(HashMap hashMap, C0025b bVar, i.a aVar, Class cls) {
        i.a aVar2 = (i.a) hashMap.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f2739b;
            StringBuilder q10 = android.support.v4.media.a.q("Method ");
            q10.append(method.getName());
            q10.append(" in ");
            q10.append(cls.getName());
            q10.append(" already declared with different @OnLifecycleEvent value: previous value ");
            q10.append(aVar2);
            q10.append(", new value ");
            q10.append(aVar);
            throw new IllegalArgumentException(q10.toString());
        } else if (aVar2 == null) {
            hashMap.put(bVar, aVar);
        }
    }

    public final a a(Class<?> cls, Method[] methodArr) {
        int i10;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).f2737b);
        }
        for (Class b10 : cls.getInterfaces()) {
            for (Map.Entry next : b(b10).f2737b.entrySet()) {
                c(hashMap, (C0025b) next.getKey(), (i.a) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e10) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
            }
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            q qVar = (q) method.getAnnotation(q.class);
            if (qVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else if (l.class.isAssignableFrom(parameterTypes[0])) {
                    i10 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                i.a value = qVar.value();
                if (parameterTypes.length > 1) {
                    if (!i.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == i.a.ON_ANY) {
                        i10 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    c(hashMap, new C0025b(i10, method), value, cls);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f2734a.put(cls, aVar);
        this.f2735b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    public final a b(Class<?> cls) {
        a aVar = (a) this.f2734a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return a(cls, (Method[]) null);
    }
}
