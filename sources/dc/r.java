package dc;

import bc.q;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* compiled from: ReflectionAccessFilterHelper */
public final class r {

    /* compiled from: ReflectionAccessFilterHelper */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8936a;

        /* renamed from: dc.r$a$a  reason: collision with other inner class name */
        /* compiled from: ReflectionAccessFilterHelper */
        public class C0092a extends a {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Method f8937b;

            public C0092a(Method method) {
                this.f8937b = method;
            }

            public final boolean a(Object obj, AccessibleObject accessibleObject) {
                try {
                    return ((Boolean) this.f8937b.invoke(accessibleObject, new Object[]{obj})).booleanValue();
                } catch (Exception e10) {
                    throw new RuntimeException("Failed invoking canAccess", e10);
                }
            }
        }

        /* compiled from: ReflectionAccessFilterHelper */
        public class b extends a {
            public final boolean a(Object obj, AccessibleObject accessibleObject) {
                return true;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
        static {
            /*
                int r0 = dc.n.f8910a
                r1 = 9
                r2 = 1
                r3 = 0
                if (r0 < r1) goto L_0x000a
                r0 = r2
                goto L_0x000b
            L_0x000a:
                r0 = r3
            L_0x000b:
                if (r0 == 0) goto L_0x0021
                java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
                java.lang.String r1 = "canAccess"
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0021 }
                java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
                r2[r3] = r4     // Catch:{ NoSuchMethodException -> 0x0021 }
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{ NoSuchMethodException -> 0x0021 }
                dc.r$a$a r1 = new dc.r$a$a     // Catch:{ NoSuchMethodException -> 0x0021 }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x0021 }
                goto L_0x0022
            L_0x0021:
                r1 = 0
            L_0x0022:
                if (r1 != 0) goto L_0x0029
                dc.r$a$b r1 = new dc.r$a$b
                r1.<init>()
            L_0x0029:
                f8936a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dc.r.a.<clinit>():void");
        }

        public abstract boolean a(Object obj, AccessibleObject accessibleObject);
    }

    public static int a(Class cls, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int a10 = ((q) it.next()).a();
            if (a10 != 2) {
                return a10;
            }
        }
        return 1;
    }
}
