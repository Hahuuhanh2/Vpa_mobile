package com.google.gson.internal.bind;

import bc.h;
import bc.u;
import bc.v;
import dc.g;
import gc.a;

public final class JsonAdapterAnnotationTypeAdapterFactory implements v {

    /* renamed from: a  reason: collision with root package name */
    public final g f7747a;

    public JsonAdapterAnnotationTypeAdapterFactory(g gVar) {
        this.f7747a = gVar;
    }

    /* JADX WARNING: type inference failed for: r6v14, types: [bc.u] */
    /* JADX WARNING: type inference failed for: r6v15, types: [bc.u] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static bc.u b(dc.g r6, bc.h r7, gc.a r8, cc.a r9) {
        /*
            java.lang.Class r0 = r9.value()
            gc.a r1 = new gc.a
            r1.<init>(r0)
            dc.q r6 = r6.b(r1)
            java.lang.Object r6 = r6.p()
            boolean r5 = r9.nullSafe()
            boolean r9 = r6 instanceof bc.u
            if (r9 == 0) goto L_0x001c
            bc.u r6 = (bc.u) r6
            goto L_0x0077
        L_0x001c:
            boolean r9 = r6 instanceof bc.v
            if (r9 == 0) goto L_0x0027
            bc.v r6 = (bc.v) r6
            bc.u r6 = r6.a(r7, r8)
            goto L_0x0077
        L_0x0027:
            boolean r9 = r6 instanceof bc.p
            if (r9 != 0) goto L_0x005c
            boolean r0 = r6 instanceof bc.k
            if (r0 == 0) goto L_0x0030
            goto L_0x005c
        L_0x0030:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Invalid attempt to bind an instance of "
            java.lang.StringBuilder r9 = android.support.v4.media.a.q(r9)
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r9.append(r6)
            java.lang.String r6 = " as a @JsonAdapter for "
            r9.append(r6)
            java.lang.String r6 = r8.toString()
            r9.append(r6)
            java.lang.String r6 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r7.<init>(r6)
            throw r7
        L_0x005c:
            r0 = 0
            if (r9 == 0) goto L_0x0064
            r9 = r6
            bc.p r9 = (bc.p) r9
            r1 = r9
            goto L_0x0065
        L_0x0064:
            r1 = r0
        L_0x0065:
            boolean r9 = r6 instanceof bc.k
            if (r9 == 0) goto L_0x006d
            bc.k r6 = (bc.k) r6
            r2 = r6
            goto L_0x006e
        L_0x006d:
            r2 = r0
        L_0x006e:
            com.google.gson.internal.bind.TreeTypeAdapter r6 = new com.google.gson.internal.bind.TreeTypeAdapter
            r0 = r6
            r3 = r7
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r5 = 0
        L_0x0077:
            if (r6 == 0) goto L_0x0081
            if (r5 == 0) goto L_0x0081
            bc.t r7 = new bc.t
            r7.<init>(r6)
            r6 = r7
        L_0x0081:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.b(dc.g, bc.h, gc.a, cc.a):bc.u");
    }

    public final <T> u<T> a(h hVar, a<T> aVar) {
        cc.a aVar2 = (cc.a) aVar.f10437a.getAnnotation(cc.a.class);
        if (aVar2 == null) {
            return null;
        }
        return b(this.f7747a, hVar, aVar, aVar2);
    }
}
