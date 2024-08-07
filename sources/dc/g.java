package dc;

import bc.i;
import bc.q;
import com.google.gson.JsonIOException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* compiled from: ConstructorConstructor */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Type, i<?>> f8897a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8898b = true;

    /* renamed from: c  reason: collision with root package name */
    public final List<q> f8899c;

    /* compiled from: ConstructorConstructor */
    public class a implements q<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f8900a;

        public a(i iVar, Type type) {
            this.f8900a = iVar;
        }

        public final T p() {
            return this.f8900a.a();
        }
    }

    /* compiled from: ConstructorConstructor */
    public class b implements q<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f8901a;

        public b(i iVar, Type type) {
            this.f8901a = iVar;
        }

        public final T p() {
            return this.f8901a.a();
        }
    }

    /* compiled from: ConstructorConstructor */
    public class c implements q<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8902a;

        public c(String str) {
            this.f8902a = str;
        }

        public final T p() {
            throw new JsonIOException(this.f8902a);
        }
    }

    /* compiled from: ConstructorConstructor */
    public class d implements q<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8903a;

        public d(String str) {
            this.f8903a = str;
        }

        public final T p() {
            throw new JsonIOException(this.f8903a);
        }
    }

    public g(Map map, List list) {
        this.f8897a = map;
        this.f8899c = list;
    }

    public static String a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder q10 = android.support.v4.media.a.q("Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ");
            q10.append(cls.getName());
            return q10.toString();
        } else if (!Modifier.isAbstract(modifiers)) {
            return null;
        } else {
            StringBuilder q11 = android.support.v4.media.a.q("Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ");
            q11.append(cls.getName());
            return q11.toString();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> dc.q<T> b(gc.a<T> r10) {
        /*
            r9 = this;
            java.lang.reflect.Type r0 = r10.f10438b
            java.lang.Class<? super T> r10 = r10.f10437a
            java.util.Map<java.lang.reflect.Type, bc.i<?>> r1 = r9.f8897a
            java.lang.Object r1 = r1.get(r0)
            bc.i r1 = (bc.i) r1
            if (r1 == 0) goto L_0x0014
            dc.g$a r10 = new dc.g$a
            r10.<init>(r1, r0)
            return r10
        L_0x0014:
            java.util.Map<java.lang.reflect.Type, bc.i<?>> r1 = r9.f8897a
            java.lang.Object r1 = r1.get(r10)
            bc.i r1 = (bc.i) r1
            if (r1 == 0) goto L_0x0024
            dc.g$b r10 = new dc.g$b
            r10.<init>(r1, r0)
            return r10
        L_0x0024:
            java.lang.Class<java.util.EnumSet> r1 = java.util.EnumSet.class
            boolean r1 = r1.isAssignableFrom(r10)
            r2 = 0
            if (r1 == 0) goto L_0x0033
            dc.i r1 = new dc.i
            r1.<init>(r0)
            goto L_0x003e
        L_0x0033:
            java.lang.Class<java.util.EnumMap> r1 = java.util.EnumMap.class
            if (r10 != r1) goto L_0x003d
            dc.j r1 = new dc.j
            r1.<init>(r0)
            goto L_0x003e
        L_0x003d:
            r1 = r2
        L_0x003e:
            if (r1 == 0) goto L_0x0041
            return r1
        L_0x0041:
            java.util.List<bc.q> r1 = r9.f8899c
            int r1 = dc.r.a(r10, r1)
            int r3 = r10.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isAbstract(r3)
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0055
            goto L_0x00ca
        L_0x0055:
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x00ca }
            java.lang.reflect.Constructor r3 = r10.getDeclaredConstructor(r3)     // Catch:{ NoSuchMethodException -> 0x00ca }
            if (r1 == r5) goto L_0x0075
            dc.r$a r6 = dc.r.a.f8936a
            boolean r6 = r6.a(r2, r3)
            if (r6 == 0) goto L_0x0073
            r6 = 4
            if (r1 != r6) goto L_0x0075
            int r6 = r3.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isPublic(r6)
            if (r6 == 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r6 = r4
            goto L_0x0076
        L_0x0075:
            r6 = r5
        L_0x0076:
            if (r6 != 0) goto L_0x0094
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "Unable to invoke no-args constructor of "
            r3.append(r6)
            r3.append(r10)
            java.lang.String r6 = "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter."
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            dc.k r6 = new dc.k
            r6.<init>(r3)
            goto L_0x00cb
        L_0x0094:
            if (r1 != r5) goto L_0x00c4
            fc.a$a r6 = fc.a.f10187a
            r3.setAccessible(r5)     // Catch:{ Exception -> 0x009d }
            r6 = r2
            goto L_0x00bb
        L_0x009d:
            r6 = move-exception
            java.lang.String r7 = "Failed making constructor '"
            java.lang.StringBuilder r7 = android.support.v4.media.a.q(r7)
            java.lang.String r8 = fc.a.b(r3)
            r7.append(r8)
            java.lang.String r8 = "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: "
            r7.append(r8)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
        L_0x00bb:
            if (r6 == 0) goto L_0x00c4
            dc.l r3 = new dc.l
            r3.<init>(r6)
            r6 = r3
            goto L_0x00cb
        L_0x00c4:
            dc.m r6 = new dc.m
            r6.<init>(r3)
            goto L_0x00cb
        L_0x00ca:
            r6 = r2
        L_0x00cb:
            if (r6 == 0) goto L_0x00ce
            return r6
        L_0x00ce:
            java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
            boolean r3 = r3.isAssignableFrom(r10)
            if (r3 == 0) goto L_0x0108
            java.lang.Class<java.util.SortedSet> r0 = java.util.SortedSet.class
            boolean r0 = r0.isAssignableFrom(r10)
            if (r0 == 0) goto L_0x00e5
            m9.b r2 = new m9.b
            r2.<init>()
            goto L_0x0160
        L_0x00e5:
            java.lang.Class<java.util.Set> r0 = java.util.Set.class
            boolean r0 = r0.isAssignableFrom(r10)
            if (r0 == 0) goto L_0x00f4
            p3.l0 r2 = new p3.l0
            r2.<init>()
            goto L_0x0160
        L_0x00f4:
            java.lang.Class<java.util.Queue> r0 = java.util.Queue.class
            boolean r0 = r0.isAssignableFrom(r10)
            if (r0 == 0) goto L_0x0102
            al.g0 r2 = new al.g0
            r2.<init>()
            goto L_0x0160
        L_0x0102:
            j7.a r2 = new j7.a
            r2.<init>()
            goto L_0x0160
        L_0x0108:
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = r3.isAssignableFrom(r10)
            if (r3 == 0) goto L_0x0160
            java.lang.Class<java.util.concurrent.ConcurrentNavigableMap> r2 = java.util.concurrent.ConcurrentNavigableMap.class
            boolean r2 = r2.isAssignableFrom(r10)
            if (r2 == 0) goto L_0x011e
            dc.b r2 = new dc.b
            r2.<init>()
            goto L_0x0160
        L_0x011e:
            java.lang.Class<java.util.concurrent.ConcurrentMap> r2 = java.util.concurrent.ConcurrentMap.class
            boolean r2 = r2.isAssignableFrom(r10)
            if (r2 == 0) goto L_0x012c
            dc.c r2 = new dc.c
            r2.<init>()
            goto L_0x0160
        L_0x012c:
            java.lang.Class<java.util.SortedMap> r2 = java.util.SortedMap.class
            boolean r2 = r2.isAssignableFrom(r10)
            if (r2 == 0) goto L_0x013a
            a.a r2 = new a.a
            r2.<init>()
            goto L_0x0160
        L_0x013a:
            boolean r2 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L_0x015b
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r0 = r0[r4]
            gc.a r3 = new gc.a
            r3.<init>(r0)
            java.lang.Class<? super T> r0 = r3.f10437a
            boolean r0 = r2.isAssignableFrom(r0)
            if (r0 != 0) goto L_0x015b
            dc.d r2 = new dc.d
            r2.<init>()
            goto L_0x0160
        L_0x015b:
            dc.e r2 = new dc.e
            r2.<init>()
        L_0x0160:
            if (r2 == 0) goto L_0x0163
            return r2
        L_0x0163:
            java.lang.String r0 = a(r10)
            if (r0 == 0) goto L_0x016f
            dc.g$c r10 = new dc.g$c
            r10.<init>(r0)
            return r10
        L_0x016f:
            java.lang.String r0 = "Unable to create instance of "
            if (r1 != r5) goto L_0x0197
            boolean r1 = r9.f8898b
            if (r1 == 0) goto L_0x017d
            dc.f r0 = new dc.f
            r0.<init>(r10)
            goto L_0x0196
        L_0x017d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r10)
            java.lang.String r10 = "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem."
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            dc.h r0 = new dc.h
            r0.<init>(r10)
        L_0x0196:
            return r0
        L_0x0197:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r10)
            java.lang.String r10 = "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection."
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            dc.g$d r0 = new dc.g$d
            r0.<init>(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dc.g.b(gc.a):dc.q");
    }

    public final String toString() {
        return this.f8897a.toString();
    }
}
