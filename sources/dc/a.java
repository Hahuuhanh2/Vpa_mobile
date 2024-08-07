package dc;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: $Gson$Types */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Type[] f8884a = new Type[0];

    /* renamed from: dc.a$a  reason: collision with other inner class name */
    /* compiled from: $Gson$Types */
    public static final class C0091a implements GenericArrayType, Serializable {

        /* renamed from: a  reason: collision with root package name */
        public final Type f8885a;

        public C0091a(Type type) {
            Objects.requireNonNull(type);
            this.f8885a = a.a(type);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType) || !a.c(this, (GenericArrayType) obj)) {
                return false;
            }
            return true;
        }

        public final Type getGenericComponentType() {
            return this.f8885a;
        }

        public final int hashCode() {
            return this.f8885a.hashCode();
        }

        public final String toString() {
            return a.h(this.f8885a) + "[]";
        }
    }

    /* compiled from: $Gson$Types */
    public static final class b implements ParameterizedType, Serializable {

        /* renamed from: a  reason: collision with root package name */
        public final Type f8886a;

        /* renamed from: b  reason: collision with root package name */
        public final Type f8887b;

        /* renamed from: c  reason: collision with root package name */
        public final Type[] f8888c;

        public b(Type type, Type type2, Type... typeArr) {
            Type type3;
            boolean z10;
            Objects.requireNonNull(type2);
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z11 = true;
                if (Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (type == null && !z10) {
                    z11 = false;
                }
                j7.a.n(z11);
            }
            if (type == null) {
                type3 = null;
            } else {
                type3 = a.a(type);
            }
            this.f8886a = type3;
            this.f8887b = a.a(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f8888c = typeArr2;
            int length = typeArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                Objects.requireNonNull(this.f8888c[i10]);
                a.b(this.f8888c[i10]);
                Type[] typeArr3 = this.f8888c;
                typeArr3[i10] = a.a(typeArr3[i10]);
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType) || !a.c(this, (ParameterizedType) obj)) {
                return false;
            }
            return true;
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f8888c.clone();
        }

        public final Type getOwnerType() {
            return this.f8886a;
        }

        public final Type getRawType() {
            return this.f8887b;
        }

        public final int hashCode() {
            int i10;
            int hashCode = Arrays.hashCode(this.f8888c) ^ this.f8887b.hashCode();
            Type type = this.f8886a;
            if (type != null) {
                i10 = type.hashCode();
            } else {
                i10 = 0;
            }
            return hashCode ^ i10;
        }

        public final String toString() {
            int length = this.f8888c.length;
            if (length == 0) {
                return a.h(this.f8887b);
            }
            StringBuilder sb2 = new StringBuilder((length + 1) * 30);
            sb2.append(a.h(this.f8887b));
            sb2.append("<");
            sb2.append(a.h(this.f8888c[0]));
            for (int i10 = 1; i10 < length; i10++) {
                sb2.append(", ");
                sb2.append(a.h(this.f8888c[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* compiled from: $Gson$Types */
    public static final class c implements WildcardType, Serializable {

        /* renamed from: a  reason: collision with root package name */
        public final Type f8889a;

        /* renamed from: b  reason: collision with root package name */
        public final Type f8890b;

        public c(Type[] typeArr, Type[] typeArr2) {
            boolean z10;
            boolean z11;
            Class<Object> cls = Object.class;
            boolean z12 = true;
            if (typeArr2.length <= 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            j7.a.n(z10);
            if (typeArr.length == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            j7.a.n(z11);
            if (typeArr2.length == 1) {
                Objects.requireNonNull(typeArr2[0]);
                a.b(typeArr2[0]);
                j7.a.n(typeArr[0] != cls ? false : z12);
                this.f8890b = a.a(typeArr2[0]);
                this.f8889a = cls;
                return;
            }
            Objects.requireNonNull(typeArr[0]);
            a.b(typeArr[0]);
            this.f8890b = null;
            this.f8889a = a.a(typeArr[0]);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof WildcardType) || !a.c(this, (WildcardType) obj)) {
                return false;
            }
            return true;
        }

        public final Type[] getLowerBounds() {
            Type type = this.f8890b;
            if (type == null) {
                return a.f8884a;
            }
            return new Type[]{type};
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.f8889a};
        }

        public final int hashCode() {
            int i10;
            Type type = this.f8890b;
            if (type != null) {
                i10 = type.hashCode() + 31;
            } else {
                i10 = 1;
            }
            return i10 ^ (this.f8889a.hashCode() + 31);
        }

        public final String toString() {
            if (this.f8890b != null) {
                StringBuilder q10 = android.support.v4.media.a.q("? super ");
                q10.append(a.h(this.f8890b));
                return q10.toString();
            } else if (this.f8889a == Object.class) {
                return "?";
            } else {
                StringBuilder q11 = android.support.v4.media.a.q("? extends ");
                q11.append(a.h(this.f8889a));
                return q11.toString();
            }
        }
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                return new C0091a(a(cls.getComponentType()));
            }
            return cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C0091a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    public static void b(Type type) {
        boolean z10;
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            z10 = true;
        } else {
            z10 = false;
        }
        j7.a.n(z10);
    }

    public static boolean c(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (!Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return false;
            }
            return true;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return c(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return false;
            }
            return true;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                return false;
            }
            return true;
        }
    }

    public static Type d(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return d(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return d(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Class<?> e(Type type) {
        String str;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            j7.a.n(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return e(((WildcardType) type).getUpperBounds()[0]);
            }
            if (type == null) {
                str = "null";
            } else {
                str = type.getClass().getName();
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + str);
        }
    }

    public static Type f(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        j7.a.n(cls2.isAssignableFrom(cls));
        return g(type, cls, d(type, cls, cls2), new HashMap());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: dc.a$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: dc.a$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: java.lang.reflect.ParameterizedType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0142 A[EDGE_INSN: B:84:0x0142->B:79:0x0142 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type g(java.lang.reflect.Type r9, java.lang.Class r10, java.lang.reflect.Type r11, java.util.HashMap r12) {
        /*
            r0 = 0
            r1 = r0
        L_0x0002:
            boolean r2 = r11 instanceof java.lang.reflect.TypeVariable
            r3 = 0
            if (r2 == 0) goto L_0x005e
            r2 = r11
            java.lang.reflect.TypeVariable r2 = (java.lang.reflect.TypeVariable) r2
            java.lang.Object r4 = r12.get(r2)
            java.lang.reflect.Type r4 = (java.lang.reflect.Type) r4
            if (r4 == 0) goto L_0x0019
            java.lang.Class r9 = java.lang.Void.TYPE
            if (r4 != r9) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r11 = r4
        L_0x0018:
            return r11
        L_0x0019:
            java.lang.Class r11 = java.lang.Void.TYPE
            r12.put(r2, r11)
            if (r1 != 0) goto L_0x0021
            r1 = r2
        L_0x0021:
            java.lang.reflect.GenericDeclaration r11 = r2.getGenericDeclaration()
            boolean r4 = r11 instanceof java.lang.Class
            if (r4 == 0) goto L_0x002c
            java.lang.Class r11 = (java.lang.Class) r11
            goto L_0x002d
        L_0x002c:
            r11 = r0
        L_0x002d:
            if (r11 != 0) goto L_0x0030
            goto L_0x0059
        L_0x0030:
            java.lang.reflect.Type r4 = d(r9, r10, r11)
            boolean r5 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L_0x0059
            java.lang.reflect.TypeVariable[] r11 = r11.getTypeParameters()
            int r5 = r11.length
        L_0x003d:
            if (r3 >= r5) goto L_0x0053
            r6 = r11[r3]
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x0050
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type[] r11 = r4.getActualTypeArguments()
            r11 = r11[r3]
            goto L_0x005a
        L_0x0050:
            int r3 = r3 + 1
            goto L_0x003d
        L_0x0053:
            java.util.NoSuchElementException r9 = new java.util.NoSuchElementException
            r9.<init>()
            throw r9
        L_0x0059:
            r11 = r2
        L_0x005a:
            if (r11 != r2) goto L_0x0002
            goto L_0x0142
        L_0x005e:
            boolean r0 = r11 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0082
            r0 = r11
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L_0x0082
            java.lang.Class r11 = r0.getComponentType()
            java.lang.reflect.Type r9 = g(r9, r10, r11, r12)
            boolean r10 = java.util.Objects.equals(r11, r9)
            if (r10 == 0) goto L_0x007c
            r11 = r0
            goto L_0x0142
        L_0x007c:
            dc.a$a r10 = new dc.a$a
            r10.<init>(r9)
            goto L_0x009d
        L_0x0082:
            boolean r0 = r11 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x00a0
            java.lang.reflect.GenericArrayType r11 = (java.lang.reflect.GenericArrayType) r11
            java.lang.reflect.Type r0 = r11.getGenericComponentType()
            java.lang.reflect.Type r9 = g(r9, r10, r0, r12)
            boolean r10 = java.util.Objects.equals(r0, r9)
            if (r10 == 0) goto L_0x0098
            goto L_0x0142
        L_0x0098:
            dc.a$a r10 = new dc.a$a
            r10.<init>(r9)
        L_0x009d:
            r11 = r10
            goto L_0x0142
        L_0x00a0:
            boolean r0 = r11 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L_0x00e4
            java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
            java.lang.reflect.Type r0 = r11.getOwnerType()
            java.lang.reflect.Type r4 = g(r9, r10, r0, r12)
            boolean r0 = java.util.Objects.equals(r4, r0)
            r0 = r0 ^ r2
            java.lang.reflect.Type[] r5 = r11.getActualTypeArguments()
            int r6 = r5.length
        L_0x00b9:
            if (r3 >= r6) goto L_0x00d8
            r7 = r5[r3]
            java.lang.reflect.Type r7 = g(r9, r10, r7, r12)
            r8 = r5[r3]
            boolean r8 = java.util.Objects.equals(r7, r8)
            if (r8 != 0) goto L_0x00d5
            if (r0 != 0) goto L_0x00d3
            java.lang.Object r0 = r5.clone()
            r5 = r0
            java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
            r0 = r2
        L_0x00d3:
            r5[r3] = r7
        L_0x00d5:
            int r3 = r3 + 1
            goto L_0x00b9
        L_0x00d8:
            if (r0 == 0) goto L_0x0142
            java.lang.reflect.Type r9 = r11.getRawType()
            dc.a$b r10 = new dc.a$b
            r10.<init>(r4, r9, r5)
            goto L_0x009d
        L_0x00e4:
            boolean r0 = r11 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0142
            java.lang.reflect.WildcardType r11 = (java.lang.reflect.WildcardType) r11
            java.lang.reflect.Type[] r0 = r11.getLowerBounds()
            java.lang.reflect.Type[] r4 = r11.getUpperBounds()
            int r5 = r0.length
            if (r5 != r2) goto L_0x011b
            r4 = r0[r3]
            java.lang.reflect.Type r9 = g(r9, r10, r4, r12)
            r10 = r0[r3]
            if (r9 == r10) goto L_0x0142
            boolean r10 = r9 instanceof java.lang.reflect.WildcardType
            if (r10 == 0) goto L_0x010a
            java.lang.reflect.WildcardType r9 = (java.lang.reflect.WildcardType) r9
            java.lang.reflect.Type[] r9 = r9.getLowerBounds()
            goto L_0x010f
        L_0x010a:
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            r10[r3] = r9
            r9 = r10
        L_0x010f:
            dc.a$c r11 = new dc.a$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r10[r3] = r0
            r11.<init>(r10, r9)
            goto L_0x0142
        L_0x011b:
            int r0 = r4.length
            if (r0 != r2) goto L_0x0142
            r0 = r4[r3]
            java.lang.reflect.Type r9 = g(r9, r10, r0, r12)     // Catch:{ all -> 0x0140 }
            r10 = r4[r3]
            if (r9 == r10) goto L_0x0142
            boolean r10 = r9 instanceof java.lang.reflect.WildcardType
            if (r10 == 0) goto L_0x0133
            java.lang.reflect.WildcardType r9 = (java.lang.reflect.WildcardType) r9
            java.lang.reflect.Type[] r9 = r9.getUpperBounds()
            goto L_0x0138
        L_0x0133:
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            r10[r3] = r9
            r9 = r10
        L_0x0138:
            dc.a$c r11 = new dc.a$c
            java.lang.reflect.Type[] r10 = f8884a
            r11.<init>(r9, r10)
            goto L_0x0142
        L_0x0140:
            r9 = move-exception
            throw r9
        L_0x0142:
            if (r1 == 0) goto L_0x0147
            r12.put(r1, r11)
        L_0x0147:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dc.a.g(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.HashMap):java.lang.reflect.Type");
    }

    public static String h(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }
}
