package j$.util;

import j$.util.Collection;
import j$.util.List;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.function.UnaryOperator;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DesugarCollections {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f18330a;

    /* renamed from: b  reason: collision with root package name */
    static final Class f18331b = Collections.synchronizedList(new LinkedList()).getClass();

    /* renamed from: c  reason: collision with root package name */
    private static final Field f18332c;

    /* renamed from: d  reason: collision with root package name */
    private static final Field f18333d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final Constructor f18334e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final Constructor f18335f;

    static {
        Field field;
        Field field2;
        Constructor<?> constructor;
        Class<Object> cls = Object.class;
        Class<?> cls2 = Collections.synchronizedCollection(new ArrayList()).getClass();
        f18330a = cls2;
        Constructor<?> constructor2 = null;
        try {
            field = cls2.getDeclaredField("mutex");
        } catch (NoSuchFieldException unused) {
            field = null;
        }
        f18332c = field;
        if (field != null) {
            field.setAccessible(true);
        }
        try {
            field2 = cls2.getDeclaredField("c");
        } catch (NoSuchFieldException unused2) {
            field2 = null;
        }
        f18333d = field2;
        if (field2 != null) {
            field2.setAccessible(true);
        }
        try {
            constructor = Collections.synchronizedSet(new HashSet()).getClass().getDeclaredConstructor(new Class[]{Set.class, cls});
        } catch (NoSuchMethodException unused3) {
            constructor = null;
        }
        f18335f = constructor;
        if (constructor != null) {
            constructor.setAccessible(true);
        }
        try {
            constructor2 = cls2.getDeclaredConstructor(new Class[]{Collection.class, cls});
        } catch (NoSuchMethodException unused4) {
        }
        f18334e = constructor2;
        if (constructor2 != null) {
            constructor2.setAccessible(true);
        }
    }

    public static void c(Iterable iterable, Consumer consumer) {
        Field field = f18332c;
        if (field == null) {
            try {
                Collection.EL.a((java.util.Collection) f18333d.get(iterable), consumer);
            } catch (IllegalAccessException e10) {
                throw new Error("Runtime illegal access in synchronized collection forEach fall-back.", e10);
            }
        } else {
            try {
                synchronized (field.get(iterable)) {
                    Collection.EL.a((java.util.Collection) f18333d.get(iterable), consumer);
                }
            } catch (IllegalAccessException e11) {
                throw new Error("Runtime illegal access in synchronized collection forEach.", e11);
            }
        }
    }

    static boolean d(java.util.Collection collection, Predicate predicate) {
        boolean removeIf;
        Field field = f18332c;
        if (field == null) {
            try {
                java.util.Collection collection2 = (java.util.Collection) f18333d.get(collection);
                return collection2 instanceof Collection ? ((Collection) collection2).removeIf(predicate) : Collection.CC.$default$removeIf(collection2, predicate);
            } catch (IllegalAccessException e10) {
                throw new Error("Runtime illegal access in synchronized collection removeIf fall-back.", e10);
            }
        } else {
            try {
                synchronized (field.get(collection)) {
                    java.util.Collection collection3 = (java.util.Collection) f18333d.get(collection);
                    removeIf = collection3 instanceof Collection ? ((Collection) collection3).removeIf(predicate) : Collection.CC.$default$removeIf(collection3, predicate);
                }
                return removeIf;
            } catch (IllegalAccessException e11) {
                throw new Error("Runtime illegal access in synchronized collection removeIf.", e11);
            }
        }
    }

    static void e(List list, UnaryOperator unaryOperator) {
        Field field = f18332c;
        if (field == null) {
            try {
                List list2 = (List) f18333d.get(list);
                if (list2 instanceof List) {
                    ((List) list2).replaceAll(unaryOperator);
                } else {
                    List.CC.$default$replaceAll(list2, unaryOperator);
                }
            } catch (IllegalAccessException e10) {
                throw new Error("Runtime illegal access in synchronized list replaceAll fall-back.", e10);
            }
        } else {
            try {
                synchronized (field.get(list)) {
                    java.util.List list3 = (java.util.List) f18333d.get(list);
                    if (list3 instanceof List) {
                        ((List) list3).replaceAll(unaryOperator);
                    } else {
                        List.CC.$default$replaceAll(list3, unaryOperator);
                    }
                }
            } catch (IllegalAccessException e11) {
                throw new Error("Runtime illegal access in synchronized list replaceAll.", e11);
            }
        }
    }

    static void f(java.util.List list, Comparator comparator) {
        Field field = f18332c;
        if (field == null) {
            try {
                List.EL.sort((java.util.List) f18333d.get(list), comparator);
            } catch (IllegalAccessException e10) {
                throw new Error("Runtime illegal access in synchronized collection sort fall-back.", e10);
            }
        } else {
            try {
                synchronized (field.get(list)) {
                    List.EL.sort((java.util.List) f18333d.get(list), comparator);
                }
            } catch (IllegalAccessException e11) {
                throw new Error("Runtime illegal access in synchronized list sort.", e11);
            }
        }
    }

    public static <K, V> Map<K, V> synchronizedMap(Map<K, V> map) {
        return new C0359d(map);
    }
}
