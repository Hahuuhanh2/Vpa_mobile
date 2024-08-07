package com.google.gson.internal.bind;

import bc.b;
import bc.h;
import bc.q;
import bc.u;
import bc.v;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.Excluder;
import dc.g;
import dc.r;
import f0.b0;
import fc.a;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory implements v {

    /* renamed from: a  reason: collision with root package name */
    public final g f7756a;

    /* renamed from: b  reason: collision with root package name */
    public final bc.c f7757b;

    /* renamed from: c  reason: collision with root package name */
    public final Excluder f7758c;

    /* renamed from: d  reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f7759d;

    /* renamed from: e  reason: collision with root package name */
    public final List<q> f7760e;

    public static abstract class a<T, A> extends u<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, b> f7761a;

        public a(LinkedHashMap linkedHashMap) {
            this.f7761a = linkedHashMap;
        }

        public final T a(hc.a aVar) {
            if (aVar.k0() == 9) {
                aVar.d0();
                return null;
            }
            Object c10 = c();
            try {
                aVar.h();
                while (aVar.K()) {
                    b bVar = this.f7761a.get(aVar.a0());
                    if (bVar != null) {
                        if (bVar.f7766e) {
                            e(c10, aVar, bVar);
                        }
                    }
                    aVar.v0();
                }
                aVar.v();
                return d(c10);
            } catch (IllegalStateException e10) {
                throw new JsonSyntaxException((Exception) e10);
            } catch (IllegalAccessException e11) {
                a.C0106a aVar2 = fc.a.f10187a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e11);
            }
        }

        public final void b(hc.b bVar, T t10) {
            if (t10 == null) {
                bVar.B();
                return;
            }
            bVar.i();
            try {
                for (b c10 : this.f7761a.values()) {
                    c10.c(bVar, t10);
                }
                bVar.v();
            } catch (IllegalAccessException e10) {
                a.C0106a aVar = fc.a.f10187a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
            }
        }

        public abstract A c();

        public abstract T d(A a10);

        public abstract void e(A a10, hc.a aVar, b bVar);
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f7762a;

        /* renamed from: b  reason: collision with root package name */
        public final Field f7763b;

        /* renamed from: c  reason: collision with root package name */
        public final String f7764c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f7765d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f7766e;

        public b(String str, Field field, boolean z10, boolean z11) {
            this.f7762a = str;
            this.f7763b = field;
            this.f7764c = field.getName();
            this.f7765d = z10;
            this.f7766e = z11;
        }

        public abstract void a(hc.a aVar, int i10, Object[] objArr);

        public abstract void b(hc.a aVar, Object obj);

        public abstract void c(hc.b bVar, Object obj);
    }

    public static final class c<T> extends a<T, T> {

        /* renamed from: b  reason: collision with root package name */
        public final dc.q<T> f7767b;

        public c(dc.q qVar, LinkedHashMap linkedHashMap) {
            super(linkedHashMap);
            this.f7767b = qVar;
        }

        public final T c() {
            return this.f7767b.p();
        }

        public final T d(T t10) {
            return t10;
        }

        public final void e(T t10, hc.a aVar, b bVar) {
            bVar.b(aVar, t10);
        }
    }

    public static final class d<T> extends a<T, Object[]> {

        /* renamed from: e  reason: collision with root package name */
        public static final HashMap f7768e;

        /* renamed from: b  reason: collision with root package name */
        public final Constructor<T> f7769b;

        /* renamed from: c  reason: collision with root package name */
        public final Object[] f7770c;

        /* renamed from: d  reason: collision with root package name */
        public final HashMap f7771d = new HashMap();

        static {
            HashMap hashMap = new HashMap();
            hashMap.put(Byte.TYPE, (byte) 0);
            hashMap.put(Short.TYPE, (short) 0);
            hashMap.put(Integer.TYPE, 0);
            hashMap.put(Long.TYPE, 0L);
            hashMap.put(Float.TYPE, Float.valueOf(0.0f));
            hashMap.put(Double.TYPE, Double.valueOf(0.0d));
            hashMap.put(Character.TYPE, 0);
            hashMap.put(Boolean.TYPE, Boolean.FALSE);
            f7768e = hashMap;
        }

        public d(Class cls, LinkedHashMap linkedHashMap, boolean z10) {
            super(linkedHashMap);
            a.C0106a aVar = fc.a.f10187a;
            Constructor<T> b10 = aVar.b(cls);
            this.f7769b = b10;
            if (z10) {
                ReflectiveTypeAdapterFactory.b((Object) null, b10);
            } else {
                fc.a.e(b10);
            }
            String[] c10 = aVar.c(cls);
            for (int i10 = 0; i10 < c10.length; i10++) {
                this.f7771d.put(c10[i10], Integer.valueOf(i10));
            }
            Class[] parameterTypes = this.f7769b.getParameterTypes();
            this.f7770c = new Object[parameterTypes.length];
            for (int i11 = 0; i11 < parameterTypes.length; i11++) {
                this.f7770c[i11] = f7768e.get(parameterTypes[i11]);
            }
        }

        public final Object c() {
            return (Object[]) this.f7770c.clone();
        }

        public final Object d(Object obj) {
            Object[] objArr = (Object[]) obj;
            try {
                return this.f7769b.newInstance(objArr);
            } catch (IllegalAccessException e10) {
                a.C0106a aVar = fc.a.f10187a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
            } catch (IllegalArgumentException | InstantiationException e11) {
                StringBuilder q10 = android.support.v4.media.a.q("Failed to invoke constructor '");
                q10.append(fc.a.b(this.f7769b));
                q10.append("' with args ");
                q10.append(Arrays.toString(objArr));
                throw new RuntimeException(q10.toString(), e11);
            } catch (InvocationTargetException e12) {
                StringBuilder q11 = android.support.v4.media.a.q("Failed to invoke constructor '");
                q11.append(fc.a.b(this.f7769b));
                q11.append("' with args ");
                q11.append(Arrays.toString(objArr));
                throw new RuntimeException(q11.toString(), e12.getCause());
            }
        }

        public final void e(Object obj, hc.a aVar, b bVar) {
            Object[] objArr = (Object[]) obj;
            Integer num = (Integer) this.f7771d.get(bVar.f7764c);
            if (num != null) {
                bVar.a(aVar, num.intValue(), objArr);
                return;
            }
            StringBuilder q10 = android.support.v4.media.a.q("Could not find the index in the constructor '");
            q10.append(fc.a.b(this.f7769b));
            q10.append("' for field with name '");
            throw new IllegalStateException(android.support.v4.media.a.o(q10, bVar.f7764c, "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters."));
        }
    }

    public ReflectiveTypeAdapterFactory(g gVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List list) {
        b.a aVar = bc.b.f4140a;
        this.f7756a = gVar;
        this.f7757b = aVar;
        this.f7758c = excluder;
        this.f7759d = jsonAdapterAnnotationTypeAdapterFactory;
        this.f7760e = list;
    }

    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!r.a.f8936a.a(obj, accessibleObject)) {
            throw new JsonIOException(b0.r(fc.a.d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    public final <T> u<T> a(h hVar, gc.a<T> aVar) {
        boolean z10;
        Class<? super T> cls = aVar.f10437a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        int a10 = r.a(cls, this.f7760e);
        if (a10 != 4) {
            if (a10 == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            if (fc.a.f10187a.d(cls)) {
                return new d(cls, c(hVar, aVar, cls, z11, true), z11);
            }
            return new c(this.f7756a.b(aVar), c(hVar, aVar, cls, z11, false));
        }
        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + cls + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    /* JADX WARNING: type inference failed for: r2v43, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v46, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x020e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.LinkedHashMap c(bc.h r35, gc.a r36, java.lang.Class r37, boolean r38, boolean r39) {
        /*
            r34 = this;
            r0 = r34
            r14 = r35
            r15 = r37
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            boolean r1 = r37.isInterface()
            if (r1 == 0) goto L_0x0012
            return r13
        L_0x0012:
            r12 = r36
            r1 = r38
            r11 = r15
        L_0x0017:
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r11 == r2) goto L_0x0271
            java.lang.reflect.Field[] r10 = r11.getDeclaredFields()
            r2 = 0
            r3 = 1
            if (r11 == r15) goto L_0x005c
            int r4 = r10.length
            if (r4 <= 0) goto L_0x005c
            java.util.List<bc.q> r1 = r0.f7760e
            int r1 = dc.r.a(r11, r1)
            r4 = 4
            if (r1 == r4) goto L_0x0038
            r4 = 3
            if (r1 != r4) goto L_0x0035
            r16 = r3
            goto L_0x005e
        L_0x0035:
            r16 = r2
            goto L_0x005e
        L_0x0038:
            com.google.gson.JsonIOException r1 = new com.google.gson.JsonIOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ReflectionAccessFilter does not permit using reflection for "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r3 = " (supertype of "
            r2.append(r3)
            r2.append(r15)
            java.lang.String r3 = "). Register a TypeAdapter for this type or adjust the access filter."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x005c:
            r16 = r1
        L_0x005e:
            int r9 = r10.length
            r8 = r2
        L_0x0060:
            if (r8 >= r9) goto L_0x024b
            r7 = r10[r8]
            boolean r1 = r0.d(r7, r3)
            boolean r4 = r0.d(r7, r2)
            if (r1 != 0) goto L_0x007d
            if (r4 != 0) goto L_0x007d
            r32 = r8
            r24 = r9
            r25 = r10
            r36 = r11
            r33 = r12
            r15 = r13
            goto L_0x01fb
        L_0x007d:
            r17 = 0
            if (r39 == 0) goto L_0x00bf
            int r5 = r7.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 == 0) goto L_0x008c
            goto L_0x00c0
        L_0x008c:
            fc.a$a r5 = fc.a.f10187a
            java.lang.reflect.Method r5 = r5.a(r11, r7)
            if (r16 != 0) goto L_0x0097
            fc.a.e(r5)
        L_0x0097:
            java.lang.Class<cc.b> r6 = cc.b.class
            java.lang.annotation.Annotation r6 = r5.getAnnotation(r6)
            if (r6 == 0) goto L_0x00ba
            java.lang.Class<cc.b> r6 = cc.b.class
            java.lang.annotation.Annotation r6 = r7.getAnnotation(r6)
            if (r6 == 0) goto L_0x00a8
            goto L_0x00ba
        L_0x00a8:
            java.lang.String r1 = fc.a.d(r5, r2)
            com.google.gson.JsonIOException r2 = new com.google.gson.JsonIOException
            java.lang.String r3 = "@SerializedName on "
            java.lang.String r4 = " is not supported"
            java.lang.String r1 = f0.b0.s(r3, r1, r4)
            r2.<init>((java.lang.String) r1)
            throw r2
        L_0x00ba:
            r18 = r4
            r19 = r5
            goto L_0x00c4
        L_0x00bf:
            r2 = r4
        L_0x00c0:
            r18 = r2
            r19 = r17
        L_0x00c4:
            if (r16 != 0) goto L_0x00cb
            if (r19 != 0) goto L_0x00cb
            fc.a.e(r7)
        L_0x00cb:
            java.lang.reflect.Type r2 = r12.f10438b
            java.lang.reflect.Type r4 = r7.getGenericType()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.reflect.Type r6 = dc.a.g(r2, r11, r4, r5)
            java.lang.Class<cc.b> r2 = cc.b.class
            java.lang.annotation.Annotation r2 = r7.getAnnotation(r2)
            cc.b r2 = (cc.b) r2
            if (r2 != 0) goto L_0x00ef
            bc.c r2 = r0.f7757b
            java.lang.String r2 = r2.b(r7)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            goto L_0x00fe
        L_0x00ef:
            java.lang.String r4 = r2.value()
            java.lang.String[] r2 = r2.alternate()
            int r5 = r2.length
            if (r5 != 0) goto L_0x0102
            java.util.List r2 = java.util.Collections.singletonList(r4)
        L_0x00fe:
            r36 = r1
            r5 = r2
            goto L_0x0111
        L_0x0102:
            java.util.ArrayList r5 = new java.util.ArrayList
            r36 = r1
            int r1 = r2.length
            int r1 = r1 + r3
            r5.<init>(r1)
            r5.add(r4)
            java.util.Collections.addAll(r5, r2)
        L_0x0111:
            int r4 = r5.size()
            r1 = 0
            r2 = r3
            r15 = r17
            r3 = r1
            r1 = r36
        L_0x011c:
            if (r3 >= r4) goto L_0x01e7
            java.lang.Object r2 = r5.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            if (r3 == 0) goto L_0x0127
            r1 = 0
        L_0x0127:
            r20 = r1
            gc.a r1 = new gc.a
            r1.<init>(r6)
            r36 = r2
            java.lang.Class<? super T> r2 = r1.f10437a
            r38 = r3
            boolean r3 = r2 instanceof java.lang.Class
            if (r3 == 0) goto L_0x0140
            boolean r2 = r2.isPrimitive()
            if (r2 == 0) goto L_0x0140
            r2 = 1
            goto L_0x0141
        L_0x0140:
            r2 = 0
        L_0x0141:
            r21 = r2
            int r2 = r7.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isStatic(r2)
            if (r3 == 0) goto L_0x0155
            boolean r2 = java.lang.reflect.Modifier.isFinal(r2)
            if (r2 == 0) goto L_0x0155
            r2 = 1
            goto L_0x0156
        L_0x0155:
            r2 = 0
        L_0x0156:
            r22 = r2
            java.lang.Class<cc.a> r2 = cc.a.class
            java.lang.annotation.Annotation r2 = r7.getAnnotation(r2)
            cc.a r2 = (cc.a) r2
            if (r2 == 0) goto L_0x0170
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r3 = r0.f7759d
            r23 = r4
            dc.g r4 = r0.f7756a
            r3.getClass()
            bc.u r2 = com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.b(r4, r14, r1, r2)
            goto L_0x0174
        L_0x0170:
            r23 = r4
            r2 = r17
        L_0x0174:
            if (r2 == 0) goto L_0x0178
            r3 = 1
            goto L_0x0179
        L_0x0178:
            r3 = 0
        L_0x0179:
            r24 = r3
            if (r2 != 0) goto L_0x0181
            bc.u r2 = r14.f(r1)
        L_0x0181:
            r25 = r2
            com.google.gson.internal.bind.f r4 = new com.google.gson.internal.bind.f
            r26 = 1
            r27 = r1
            r1 = r4
            r3 = r36
            r2 = r3
            r28 = r38
            r0 = r3
            r3 = r7
            r14 = r4
            r4 = r20
            r29 = r5
            r5 = r18
            r30 = r6
            r6 = r16
            r31 = r7
            r7 = r19
            r32 = r8
            r8 = r24
            r24 = r9
            r9 = r25
            r25 = r10
            r10 = r35
            r36 = r11
            r11 = r27
            r33 = r12
            r12 = r21
            r38 = r15
            r15 = r13
            r13 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r0 = r15.put(r0, r14)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b r0 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b) r0
            if (r38 != 0) goto L_0x01c5
            goto L_0x01c7
        L_0x01c5:
            r0 = r38
        L_0x01c7:
            int r3 = r28 + 1
            r14 = r35
            r11 = r36
            r13 = r15
            r1 = r20
            r4 = r23
            r9 = r24
            r10 = r25
            r2 = r26
            r5 = r29
            r6 = r30
            r7 = r31
            r8 = r32
            r12 = r33
            r15 = r0
            r0 = r34
            goto L_0x011c
        L_0x01e7:
            r31 = r7
            r32 = r8
            r24 = r9
            r25 = r10
            r36 = r11
            r33 = r12
            r38 = r15
            r15 = r13
            r0 = 0
            if (r38 != 0) goto L_0x020e
            r3 = r2
            r2 = r0
        L_0x01fb:
            int r8 = r32 + 1
            r0 = r34
            r14 = r35
            r11 = r36
            r13 = r15
            r9 = r24
            r10 = r25
            r12 = r33
            r15 = r37
            goto L_0x0060
        L_0x020e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Class "
            java.lang.StringBuilder r1 = android.support.v4.media.a.q(r1)
            java.lang.String r2 = r37.getName()
            r1.append(r2)
            java.lang.String r2 = " declares multiple JSON fields named '"
            r1.append(r2)
            r2 = r38
            java.lang.String r3 = r2.f7762a
            r1.append(r3)
            java.lang.String r3 = "'; conflict is caused by fields "
            r1.append(r3)
            java.lang.reflect.Field r2 = r2.f7763b
            java.lang.String r2 = fc.a.c(r2)
            r1.append(r2)
            java.lang.String r2 = " and "
            r1.append(r2)
            java.lang.String r2 = fc.a.c(r31)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x024b:
            r36 = r11
            r0 = r12
            r15 = r13
            java.lang.reflect.Type r0 = r0.f10438b
            java.lang.reflect.Type r1 = r36.getGenericSuperclass()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = r36
            java.lang.reflect.Type r0 = dc.a.g(r0, r3, r1, r2)
            gc.a r12 = new gc.a
            r12.<init>(r0)
            java.lang.Class<? super T> r11 = r12.f10437a
            r0 = r34
            r14 = r35
            r1 = r16
            r15 = r37
            goto L_0x0017
        L_0x0271:
            r15 = r13
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c(bc.h, gc.a, java.lang.Class, boolean, boolean):java.util.LinkedHashMap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        if (r1 == false) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(java.lang.reflect.Field r8, boolean r9) {
        /*
            r7 = this;
            com.google.gson.internal.Excluder r0 = r7.f7758c
            java.lang.Class r1 = r8.getType()
            boolean r2 = r0.b(r1)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x0017
            boolean r0 = r0.c(r1, r9)
            if (r0 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = r4
            goto L_0x0018
        L_0x0017:
            r0 = r3
        L_0x0018:
            if (r0 != 0) goto L_0x00a5
            com.google.gson.internal.Excluder r0 = r7.f7758c
            int r1 = r0.f7729b
            int r2 = r8.getModifiers()
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0027
            goto L_0x009f
        L_0x0027:
            double r1 = r0.f7728a
            r5 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0046
            java.lang.Class<cc.c> r1 = cc.c.class
            java.lang.annotation.Annotation r1 = r8.getAnnotation(r1)
            cc.c r1 = (cc.c) r1
            java.lang.Class<cc.d> r2 = cc.d.class
            java.lang.annotation.Annotation r2 = r8.getAnnotation(r2)
            cc.d r2 = (cc.d) r2
            boolean r1 = r0.f(r1, r2)
            if (r1 != 0) goto L_0x0046
            goto L_0x009f
        L_0x0046:
            boolean r1 = r8.isSynthetic()
            if (r1 == 0) goto L_0x004d
            goto L_0x009f
        L_0x004d:
            boolean r1 = r0.f7730c
            if (r1 != 0) goto L_0x006e
            java.lang.Class r1 = r8.getType()
            boolean r2 = r1.isMemberClass()
            if (r2 == 0) goto L_0x006a
            int r1 = r1.getModifiers()
            r1 = r1 & 8
            if (r1 == 0) goto L_0x0065
            r1 = r3
            goto L_0x0066
        L_0x0065:
            r1 = r4
        L_0x0066:
            if (r1 != 0) goto L_0x006a
            r1 = r3
            goto L_0x006b
        L_0x006a:
            r1 = r4
        L_0x006b:
            if (r1 == 0) goto L_0x006e
            goto L_0x009f
        L_0x006e:
            java.lang.Class r1 = r8.getType()
            boolean r1 = com.google.gson.internal.Excluder.e(r1)
            if (r1 == 0) goto L_0x0079
            goto L_0x009f
        L_0x0079:
            if (r9 == 0) goto L_0x007e
            java.util.List<bc.a> r9 = r0.f7731d
            goto L_0x0080
        L_0x007e:
            java.util.List<bc.a> r9 = r0.f7732e
        L_0x0080:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x00a1
            java.util.Objects.requireNonNull(r8)
            java.util.Iterator r8 = r9.iterator()
        L_0x008d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00a1
            java.lang.Object r9 = r8.next()
            bc.a r9 = (bc.a) r9
            boolean r9 = r9.b()
            if (r9 == 0) goto L_0x008d
        L_0x009f:
            r8 = r3
            goto L_0x00a2
        L_0x00a1:
            r8 = r4
        L_0x00a2:
            if (r8 != 0) goto L_0x00a5
            goto L_0x00a6
        L_0x00a5:
            r3 = r4
        L_0x00a6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.d(java.lang.reflect.Field, boolean):boolean");
    }
}
