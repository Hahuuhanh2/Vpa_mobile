package com.google.protobuf;

import com.google.protobuf.k;
import java.util.Collections;
import java.util.List;
import tc.b0;
import tc.k;
import tc.u;

/* compiled from: ListFieldSchema */
public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7924a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f7925b = new b();

    /* compiled from: ListFieldSchema */
    public static final class a extends o {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?> f7926c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.protobuf.n} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.protobuf.n} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.protobuf.n} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.util.List c(java.lang.Object r3, int r4, long r5) {
            /*
                java.lang.Object r0 = tc.b0.o(r3, r5)
                java.util.List r0 = (java.util.List) r0
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002f
                boolean r1 = r0 instanceof tc.k
                if (r1 == 0) goto L_0x0016
                com.google.protobuf.n r0 = new com.google.protobuf.n
                r0.<init>((int) r4)
                goto L_0x002b
            L_0x0016:
                boolean r1 = r0 instanceof tc.u
                if (r1 == 0) goto L_0x0026
                boolean r1 = r0 instanceof com.google.protobuf.k.c
                if (r1 == 0) goto L_0x0026
                com.google.protobuf.k$c r0 = (com.google.protobuf.k.c) r0
                com.google.protobuf.k$c r4 = r0.b(r4)
                r0 = r4
                goto L_0x002b
            L_0x0026:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r4)
            L_0x002b:
                tc.b0.v(r3, r5, r0)
                goto L_0x0081
            L_0x002f:
                java.lang.Class<?> r1 = f7926c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004d
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r4
                r1.<init>(r2)
                r1.addAll(r0)
                tc.b0.v(r3, r5, r1)
            L_0x004b:
                r0 = r1
                goto L_0x0081
            L_0x004d:
                boolean r1 = r0 instanceof tc.a0
                if (r1 == 0) goto L_0x0064
                com.google.protobuf.n r1 = new com.google.protobuf.n
                int r2 = r0.size()
                int r2 = r2 + r4
                r1.<init>((int) r2)
                tc.a0 r0 = (tc.a0) r0
                r1.addAll(r0)
                tc.b0.v(r3, r5, r1)
                goto L_0x004b
            L_0x0064:
                boolean r1 = r0 instanceof tc.u
                if (r1 == 0) goto L_0x0081
                boolean r1 = r0 instanceof com.google.protobuf.k.c
                if (r1 == 0) goto L_0x0081
                r1 = r0
                com.google.protobuf.k$c r1 = (com.google.protobuf.k.c) r1
                boolean r2 = r1.f()
                if (r2 != 0) goto L_0x0081
                int r0 = r0.size()
                int r0 = r0 + r4
                com.google.protobuf.k$c r0 = r1.b(r0)
                tc.b0.v(r3, r5, r0)
            L_0x0081:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.o.a.c(java.lang.Object, int, long):java.util.List");
        }

        public final void a(Object obj, long j10) {
            Object obj2;
            List list = (List) b0.o(obj, j10);
            if (list instanceof k) {
                obj2 = ((k) list).d();
            } else if (!f7926c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof u) || !(list instanceof k.c)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    k.c cVar = (k.c) list;
                    if (cVar.f()) {
                        cVar.a();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            b0.v(obj, j10, obj2);
        }

        public final void b(Object obj, long j10, Object obj2) {
            List list = (List) b0.o(obj2, j10);
            List c10 = c(obj, list.size(), j10);
            int size = c10.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                c10.addAll(list);
            }
            if (size > 0) {
                list = c10;
            }
            b0.v(obj, j10, list);
        }
    }

    /* compiled from: ListFieldSchema */
    public static final class b extends o {
        public final void a(Object obj, long j10) {
            ((k.c) b0.o(obj, j10)).a();
        }

        public final void b(Object obj, long j10, Object obj2) {
            k.c cVar = (k.c) b0.o(obj, j10);
            k.c cVar2 = (k.c) b0.o(obj2, j10);
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
            b0.v(obj, j10, cVar2);
        }
    }

    public abstract void a(Object obj, long j10);

    public abstract void b(Object obj, long j10, Object obj2);
}
