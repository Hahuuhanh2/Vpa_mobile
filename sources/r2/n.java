package r2;

import androidx.lifecycle.b;
import androidx.lifecycle.e;
import androidx.lifecycle.q;
import j7.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import sk.j;
import yk.h;

/* compiled from: Lifecycling.kt */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f14482a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f14483b = new HashMap();

    public static e a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(new Object[]{obj});
            j.e(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return (e) newInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    public static final String b(String str) {
        return h.J0(str, ".", "_") + "_LifecycleAdapter";
    }

    public static int c(Class cls) {
        Constructor<?> constructor;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        boolean z14;
        Class<k> cls2 = k.class;
        Integer num = (Integer) f14482a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i10 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package packageR = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                if (packageR != null) {
                    str = packageR.getName();
                } else {
                    str = "";
                }
                j.e(str, "fullPackage");
                if (str.length() == 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    j.e(canonicalName, "name");
                    canonicalName = canonicalName.substring(str.length() + 1);
                    j.e(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                j.e(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String b10 = b(canonicalName);
                if (str.length() == 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (!z14) {
                    b10 = str + '.' + b10;
                }
                constructor = Class.forName(b10).getDeclaredConstructor(new Class[]{cls});
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            }
            if (constructor != null) {
                f14483b.put(cls, a.c0(constructor));
            } else {
                b bVar = b.f2733c;
                Boolean bool = (Boolean) bVar.f2735b.get(cls);
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                bVar.f2735b.put(cls, Boolean.FALSE);
                                z10 = false;
                                break;
                            } else if (((q) declaredMethods[i11].getAnnotation(q.class)) != null) {
                                bVar.a(cls, declaredMethods);
                                z10 = true;
                                break;
                            } else {
                                i11++;
                            }
                        }
                    } catch (NoClassDefFoundError e11) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
                    }
                }
                if (!z10) {
                    Class superclass = cls.getSuperclass();
                    if (superclass == null || !cls2.isAssignableFrom(superclass)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        j.e(superclass, "superclass");
                        if (c(superclass) != 1) {
                            Object obj = f14483b.get(superclass);
                            j.c(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class[] interfaces = cls.getInterfaces();
                    j.e(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            Class cls3 = interfaces[i12];
                            if (cls3 == null || !cls2.isAssignableFrom(cls3)) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            if (z12) {
                                j.e(cls3, "intrface");
                                if (c(cls3) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = f14483b.get(cls3);
                                j.c(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i12++;
                        } else if (arrayList != null) {
                            f14483b.put(cls, arrayList);
                        }
                    }
                }
            }
            i10 = 2;
        }
        f14482a.put(cls, Integer.valueOf(i10));
        return i10;
    }
}
