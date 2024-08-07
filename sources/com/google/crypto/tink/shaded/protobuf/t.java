package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.p;
import j9.c0;
import j9.j;
import j9.v;
import java.util.Collections;
import java.util.List;

/* compiled from: ListFieldSchema */
public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7422a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f7423b = new b();

    /* compiled from: ListFieldSchema */
    public static final class a extends t {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?> f7424c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.crypto.tink.shaded.protobuf.s} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.crypto.tink.shaded.protobuf.s} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.crypto.tink.shaded.protobuf.s} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.util.List d(java.lang.Object r3, int r4, long r5) {
            /*
                java.lang.Object r0 = j9.c0.o(r3, r5)
                java.util.List r0 = (java.util.List) r0
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002f
                boolean r1 = r0 instanceof j9.j
                if (r1 == 0) goto L_0x0016
                com.google.crypto.tink.shaded.protobuf.s r0 = new com.google.crypto.tink.shaded.protobuf.s
                r0.<init>((int) r4)
                goto L_0x002b
            L_0x0016:
                boolean r1 = r0 instanceof j9.v
                if (r1 == 0) goto L_0x0026
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.p.c
                if (r1 == 0) goto L_0x0026
                com.google.crypto.tink.shaded.protobuf.p$c r0 = (com.google.crypto.tink.shaded.protobuf.p.c) r0
                com.google.crypto.tink.shaded.protobuf.p$c r4 = r0.b(r4)
                r0 = r4
                goto L_0x002b
            L_0x0026:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r4)
            L_0x002b:
                j9.c0.y(r3, r5, r0)
                goto L_0x0081
            L_0x002f:
                java.lang.Class<?> r1 = f7424c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004d
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r4
                r1.<init>(r2)
                r1.addAll(r0)
                j9.c0.y(r3, r5, r1)
            L_0x004b:
                r0 = r1
                goto L_0x0081
            L_0x004d:
                boolean r1 = r0 instanceof j9.b0
                if (r1 == 0) goto L_0x0064
                com.google.crypto.tink.shaded.protobuf.s r1 = new com.google.crypto.tink.shaded.protobuf.s
                int r2 = r0.size()
                int r2 = r2 + r4
                r1.<init>((int) r2)
                j9.b0 r0 = (j9.b0) r0
                r1.addAll(r0)
                j9.c0.y(r3, r5, r1)
                goto L_0x004b
            L_0x0064:
                boolean r1 = r0 instanceof j9.v
                if (r1 == 0) goto L_0x0081
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.p.c
                if (r1 == 0) goto L_0x0081
                r1 = r0
                com.google.crypto.tink.shaded.protobuf.p$c r1 = (com.google.crypto.tink.shaded.protobuf.p.c) r1
                boolean r2 = r1.f()
                if (r2 != 0) goto L_0x0081
                int r0 = r0.size()
                int r0 = r0 + r4
                com.google.crypto.tink.shaded.protobuf.p$c r0 = r1.b(r0)
                j9.c0.y(r3, r5, r0)
            L_0x0081:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.t.a.d(java.lang.Object, int, long):java.util.List");
        }

        public final void a(Object obj, long j10) {
            Object obj2;
            List list = (List) c0.o(obj, j10);
            if (list instanceof j) {
                obj2 = ((j) list).d();
            } else if (!f7424c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof v) || !(list instanceof p.c)) {
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
            c0.y(obj, j10, obj2);
        }

        public final void b(Object obj, long j10, Object obj2) {
            List list = (List) c0.o(obj2, j10);
            List d10 = d(obj, list.size(), j10);
            int size = d10.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                d10.addAll(list);
            }
            if (size > 0) {
                list = d10;
            }
            c0.y(obj, j10, list);
        }

        public final <L> List<L> c(Object obj, long j10) {
            return d(obj, 10, j10);
        }
    }

    /* compiled from: ListFieldSchema */
    public static final class b extends t {
        public final void a(Object obj, long j10) {
            ((p.c) c0.o(obj, j10)).a();
        }

        public final void b(Object obj, long j10, Object obj2) {
            p.c cVar = (p.c) c0.o(obj, j10);
            p.c cVar2 = (p.c) c0.o(obj2, j10);
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
            c0.y(obj, j10, cVar2);
        }

        public final <L> List<L> c(Object obj, long j10) {
            int i10;
            p.c cVar = (p.c) c0.o(obj, j10);
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
            c0.y(obj, j10, b10);
            return b10;
        }
    }

    public abstract void a(Object obj, long j10);

    public abstract void b(Object obj, long j10, Object obj2);

    public abstract <L> List<L> c(Object obj, long j10);
}
