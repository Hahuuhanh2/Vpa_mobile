package sk;

import al.g0;
import ek.a;
import f0.b0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import rk.c;
import rk.e;
import rk.f;
import rk.g;
import rk.h;
import rk.i;
import rk.j;
import rk.k;
import rk.l;
import rk.m;
import rk.n;
import rk.o;
import rk.p;
import rk.q;
import rk.r;
import rk.s;
import rk.t;
import rk.u;
import rk.v;
import rk.w;
import wk.b;

/* compiled from: ClassReference.kt */
public final class d implements b<Object>, c {

    /* renamed from: b  reason: collision with root package name */
    public static final Map<Class<? extends a<?>>, Integer> f22923b;

    /* renamed from: c  reason: collision with root package name */
    public static final LinkedHashMap f22924c;

    /* renamed from: a  reason: collision with root package name */
    public final Class<?> f22925a;

    static {
        int i10 = 0;
        List d02 = j7.a.d0(rk.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, rk.b.class, c.class, rk.d.class, e.class, f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(fk.j.H0(d02));
        for (Object next : d02) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                arrayList.add(new ek.e((Class) next, Integer.valueOf(i10)));
                i10 = i11;
            } else {
                j7.a.x0();
                throw null;
            }
        }
        f22923b = fk.h.A0(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        j.e(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            j.e(str, "kotlinName");
            sb2.append(yk.l.i1(str, str));
            sb2.append("CompanionObject");
            String sb3 = sb2.toString();
            hashMap3.put(sb3, str + ".Companion");
        }
        for (Map.Entry next2 : f22923b.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(g0.d0(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            Object key = entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(key, yk.l.i1(str2, str2));
        }
        f22924c = linkedHashMap;
    }

    public d(Class<?> cls) {
        j.f(cls, "jClass");
        this.f22925a = cls;
    }

    public final Class<?> a() {
        return this.f22925a;
    }

    public final String b() {
        String str;
        Class<?> cls = this.f22925a;
        j.f(cls, "jClass");
        String str2 = null;
        if (!cls.isAnonymousClass()) {
            if (cls.isLocalClass()) {
                String simpleName = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    return yk.l.h1(simpleName, enclosingMethod.getName() + '$', simpleName);
                }
                Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                if (enclosingConstructor != null) {
                    return yk.l.h1(simpleName, enclosingConstructor.getName() + '$', simpleName);
                }
                int R0 = yk.l.R0(simpleName, '$', 0, false, 6);
                if (R0 == -1) {
                    return simpleName;
                }
                String substring = simpleName.substring(R0 + 1, simpleName.length());
                j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            } else if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) f22924c.get(componentType.getName())) != null) {
                    str2 = b0.r(str, "Array");
                }
                if (str2 == null) {
                    return "Array";
                }
            } else {
                String str3 = (String) f22924c.get(cls.getName());
                if (str3 == null) {
                    return cls.getSimpleName();
                }
                return str3;
            }
        }
        return str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d) || !j.a(g0.V(this), g0.V((b) obj))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return g0.V(this).hashCode();
    }

    public final String toString() {
        return this.f22925a.toString() + " (Kotlin reflection is not available)";
    }
}
