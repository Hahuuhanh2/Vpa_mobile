package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.p;
import j2.i;
import j2.r;
import j2.y;
import java.util.Collections;
import java.util.List;

/* compiled from: ListFieldSchema */
public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2325a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f2326b = new b();

    /* compiled from: ListFieldSchema */
    public static final class a extends t {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?> f2327c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.datastore.preferences.protobuf.s} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: androidx.datastore.preferences.protobuf.s} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: androidx.datastore.preferences.protobuf.s} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.util.List d(java.lang.Object r3, int r4, long r5) {
            /*
                java.lang.Object r0 = j2.y.n(r3, r5)
                java.util.List r0 = (java.util.List) r0
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002f
                boolean r1 = r0 instanceof j2.i
                if (r1 == 0) goto L_0x0016
                androidx.datastore.preferences.protobuf.s r0 = new androidx.datastore.preferences.protobuf.s
                r0.<init>((int) r4)
                goto L_0x002b
            L_0x0016:
                boolean r1 = r0 instanceof j2.r
                if (r1 == 0) goto L_0x0026
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.p.c
                if (r1 == 0) goto L_0x0026
                androidx.datastore.preferences.protobuf.p$c r0 = (androidx.datastore.preferences.protobuf.p.c) r0
                androidx.datastore.preferences.protobuf.p$c r4 = r0.b(r4)
                r0 = r4
                goto L_0x002b
            L_0x0026:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r4)
            L_0x002b:
                j2.y.u(r3, r5, r0)
                goto L_0x0081
            L_0x002f:
                java.lang.Class<?> r1 = f2327c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004d
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r4
                r1.<init>(r2)
                r1.addAll(r0)
                j2.y.u(r3, r5, r1)
            L_0x004b:
                r0 = r1
                goto L_0x0081
            L_0x004d:
                boolean r1 = r0 instanceof j2.x
                if (r1 == 0) goto L_0x0064
                androidx.datastore.preferences.protobuf.s r1 = new androidx.datastore.preferences.protobuf.s
                int r2 = r0.size()
                int r2 = r2 + r4
                r1.<init>((int) r2)
                j2.x r0 = (j2.x) r0
                r1.addAll(r0)
                j2.y.u(r3, r5, r1)
                goto L_0x004b
            L_0x0064:
                boolean r1 = r0 instanceof j2.r
                if (r1 == 0) goto L_0x0081
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.p.c
                if (r1 == 0) goto L_0x0081
                r1 = r0
                androidx.datastore.preferences.protobuf.p$c r1 = (androidx.datastore.preferences.protobuf.p.c) r1
                boolean r2 = r1.f()
                if (r2 != 0) goto L_0x0081
                int r0 = r0.size()
                int r0 = r0 + r4
                androidx.datastore.preferences.protobuf.p$c r0 = r1.b(r0)
                j2.y.u(r3, r5, r0)
            L_0x0081:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.t.a.d(java.lang.Object, int, long):java.util.List");
        }

        public final void a(Object obj, long j10) {
            Object obj2;
            List list = (List) y.n(obj, j10);
            if (list instanceof i) {
                obj2 = ((i) list).d();
            } else if (!f2327c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof r) || !(list instanceof p.c)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    p.c cVar = (p.c) list;
                    if (cVar.f()) {
                        cVar.a();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            y.u(obj, j10, obj2);
        }

        public final void b(Object obj, long j10, Object obj2) {
            List list = (List) y.n(obj2, j10);
            List d10 = d(obj, list.size(), j10);
            int size = d10.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                d10.addAll(list);
            }
            if (size > 0) {
                list = d10;
            }
            y.u(obj, j10, list);
        }

        public final <L> List<L> c(Object obj, long j10) {
            return d(obj, 10, j10);
        }
    }

    /* compiled from: ListFieldSchema */
    public static final class b extends t {
        public final void a(Object obj, long j10) {
            ((p.c) y.n(obj, j10)).a();
        }

        public final void b(Object obj, long j10, Object obj2) {
            p.c cVar = (p.c) y.n(obj, j10);
            p.c cVar2 = (p.c) y.n(obj2, j10);
            int size = cVar.size();
            int size2 = cVar2.size();
            if (size > 0 && size2 > 0) {
                if (!cVar.f()) {
                    cVar = cVar.b(size2 + size);
                }
                cVar.addAll(cVar2);
            }
            if (size > 0) {
                cVar2 = cVar;
            }
            y.u(obj, j10, cVar2);
        }

        public final <L> List<L> c(Object obj, long j10) {
            int i10;
            p.c cVar = (p.c) y.n(obj, j10);
            if (cVar.f()) {
                return cVar;
            }
            int size = cVar.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size * 2;
            }
            p.c b10 = cVar.b(i10);
            y.u(obj, j10, b10);
            return b10;
        }
    }

    public abstract void a(Object obj, long j10);

    public abstract void b(Object obj, long j10, Object obj2);

    public abstract <L> List<L> c(Object obj, long j10);
}
