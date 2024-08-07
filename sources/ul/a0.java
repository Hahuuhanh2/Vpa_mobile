package ul;

/* compiled from: ServiceMethod */
public abstract class a0<T> {
    /* JADX WARNING: Removed duplicated region for block: B:378:0x0997  */
    /* JADX WARNING: Removed duplicated region for block: B:557:0x099a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ul.i b(ul.z r22, java.lang.reflect.Method r23) {
        /*
            r0 = r22
            r1 = r23
            ul.x$a r2 = new ul.x$a
            r2.<init>(r0, r1)
            java.lang.annotation.Annotation[] r3 = r2.f23225c
            int r4 = r3.length
            r5 = 0
            r6 = r5
        L_0x000e:
            java.lang.String r7 = "HEAD"
            r8 = 0
            r9 = 1
            if (r6 >= r4) goto L_0x014f
            r10 = r3[r6]
            boolean r11 = r10 instanceof xl.b
            if (r11 == 0) goto L_0x0027
            xl.b r10 = (xl.b) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "DELETE"
            r2.b(r8, r7, r5)
            goto L_0x014b
        L_0x0027:
            boolean r11 = r10 instanceof xl.f
            if (r11 == 0) goto L_0x0038
            xl.f r10 = (xl.f) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "GET"
            r2.b(r8, r7, r5)
            goto L_0x014b
        L_0x0038:
            boolean r11 = r10 instanceof xl.g
            if (r11 == 0) goto L_0x0047
            xl.g r10 = (xl.g) r10
            java.lang.String r8 = r10.value()
            r2.b(r7, r8, r5)
            goto L_0x014b
        L_0x0047:
            boolean r7 = r10 instanceof xl.n
            if (r7 == 0) goto L_0x0058
            xl.n r10 = (xl.n) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "PATCH"
            r2.b(r8, r7, r9)
            goto L_0x014b
        L_0x0058:
            boolean r7 = r10 instanceof xl.o
            if (r7 == 0) goto L_0x0069
            xl.o r10 = (xl.o) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "POST"
            r2.b(r8, r7, r9)
            goto L_0x014b
        L_0x0069:
            boolean r7 = r10 instanceof xl.p
            if (r7 == 0) goto L_0x007a
            xl.p r10 = (xl.p) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "PUT"
            r2.b(r8, r7, r9)
            goto L_0x014b
        L_0x007a:
            boolean r7 = r10 instanceof xl.m
            if (r7 == 0) goto L_0x008b
            xl.m r10 = (xl.m) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "OPTIONS"
            r2.b(r8, r7, r5)
            goto L_0x014b
        L_0x008b:
            boolean r7 = r10 instanceof xl.h
            if (r7 == 0) goto L_0x00a2
            xl.h r10 = (xl.h) r10
            java.lang.String r7 = r10.method()
            java.lang.String r8 = r10.path()
            boolean r9 = r10.hasBody()
            r2.b(r7, r8, r9)
            goto L_0x014b
        L_0x00a2:
            boolean r7 = r10 instanceof xl.k
            if (r7 == 0) goto L_0x0121
            xl.k r10 = (xl.k) r10
            java.lang.String[] r7 = r10.value()
            int r10 = r7.length
            if (r10 == 0) goto L_0x0116
            okhttp3.Headers$Builder r10 = new okhttp3.Headers$Builder
            r10.<init>()
            int r11 = r7.length
            r12 = r5
        L_0x00b6:
            if (r12 >= r11) goto L_0x010f
            r13 = r7[r12]
            r14 = 58
            int r14 = r13.indexOf(r14)
            r15 = -1
            if (r14 == r15) goto L_0x0102
            if (r14 == 0) goto L_0x0102
            int r15 = r13.length()
            int r15 = r15 - r9
            if (r14 == r15) goto L_0x0102
            java.lang.String r15 = r13.substring(r5, r14)
            int r14 = r14 + 1
            java.lang.String r13 = r13.substring(r14)
            java.lang.String r13 = r13.trim()
            java.lang.String r14 = "Content-Type"
            boolean r14 = r14.equalsIgnoreCase(r15)
            if (r14 == 0) goto L_0x00fc
            okhttp3.MediaType$Companion r14 = okhttp3.MediaType.f22026e     // Catch:{ IllegalArgumentException -> 0x00ee }
            r14.getClass()     // Catch:{ IllegalArgumentException -> 0x00ee }
            okhttp3.MediaType r14 = okhttp3.MediaType.Companion.a(r13)     // Catch:{ IllegalArgumentException -> 0x00ee }
            r2.f23242t = r14     // Catch:{ IllegalArgumentException -> 0x00ee }
            goto L_0x00ff
        L_0x00ee:
            r0 = move-exception
            java.lang.reflect.Method r1 = r2.f23224b
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r2[r5] = r13
            java.lang.String r3 = "Malformed content type: %s"
            java.lang.IllegalArgumentException r0 = ul.d0.j(r1, r0, r3, r2)
            throw r0
        L_0x00fc:
            r10.a(r15, r13)
        L_0x00ff:
            int r12 = r12 + 1
            goto L_0x00b6
        L_0x0102:
            java.lang.reflect.Method r0 = r2.f23224b
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r5] = r13
            java.lang.String r2 = "@Headers value must be in the form \"Name: Value\". Found: \"%s\""
            java.lang.IllegalArgumentException r0 = ul.d0.j(r0, r8, r2, r1)
            throw r0
        L_0x010f:
            okhttp3.Headers r7 = r10.d()
            r2.f23241s = r7
            goto L_0x014b
        L_0x0116:
            java.lang.reflect.Method r0 = r2.f23224b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "@Headers annotation is empty."
            java.lang.IllegalArgumentException r0 = ul.d0.j(r0, r8, r2, r1)
            throw r0
        L_0x0121:
            boolean r7 = r10 instanceof xl.l
            java.lang.String r11 = "Only one encoding annotation is allowed."
            if (r7 == 0) goto L_0x0137
            boolean r7 = r2.f23238p
            if (r7 != 0) goto L_0x012e
            r2.f23239q = r9
            goto L_0x014b
        L_0x012e:
            java.lang.reflect.Method r0 = r2.f23224b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.IllegalArgumentException r0 = ul.d0.j(r0, r8, r11, r1)
            throw r0
        L_0x0137:
            boolean r7 = r10 instanceof xl.e
            if (r7 == 0) goto L_0x014b
            boolean r7 = r2.f23239q
            if (r7 != 0) goto L_0x0142
            r2.f23238p = r9
            goto L_0x014b
        L_0x0142:
            java.lang.reflect.Method r0 = r2.f23224b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.IllegalArgumentException r0 = ul.d0.j(r0, r8, r11, r1)
            throw r0
        L_0x014b:
            int r6 = r6 + 1
            goto L_0x000e
        L_0x014f:
            java.lang.String r3 = r2.f23236n
            if (r3 == 0) goto L_0x0b97
            boolean r3 = r2.f23237o
            if (r3 != 0) goto L_0x0176
            boolean r3 = r2.f23239q
            if (r3 != 0) goto L_0x016b
            boolean r3 = r2.f23238p
            if (r3 != 0) goto L_0x0160
            goto L_0x0176
        L_0x0160:
            java.lang.reflect.Method r0 = r2.f23224b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."
            java.lang.IllegalArgumentException r0 = ul.d0.j(r0, r8, r2, r1)
            throw r0
        L_0x016b:
            java.lang.reflect.Method r0 = r2.f23224b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."
            java.lang.IllegalArgumentException r0 = ul.d0.j(r0, r8, r2, r1)
            throw r0
        L_0x0176:
            java.lang.annotation.Annotation[][] r3 = r2.f23226d
            int r3 = r3.length
            ul.u[] r4 = new ul.u[r3]
            r2.f23244v = r4
            int r4 = r3 + -1
            r6 = r5
        L_0x0180:
            if (r5 >= r3) goto L_0x09fa
            ul.u<?>[] r10 = r2.f23244v
            java.lang.reflect.Type[] r11 = r2.f23227e
            r11 = r11[r5]
            java.lang.annotation.Annotation[][] r12 = r2.f23226d
            r12 = r12[r5]
            if (r5 != r4) goto L_0x018f
            goto L_0x0190
        L_0x018f:
            r9 = r6
        L_0x0190:
            if (r12 == 0) goto L_0x09c1
            int r13 = r12.length
        L_0x0193:
            if (r6 >= r13) goto L_0x09b8
            r14 = r12[r6]
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            r16 = r3
            java.lang.Class<okhttp3.MultipartBody$Part> r3 = okhttp3.MultipartBody.Part.class
            r17 = r4
            boolean r4 = r14 instanceof xl.y
            r18 = r13
            java.lang.String r13 = "@Path parameters may not be used with @Url."
            if (r4 == 0) goto L_0x0245
            r2.c(r5, r11)
            boolean r3 = r2.f23235m
            if (r3 != 0) goto L_0x0239
            boolean r3 = r2.f23231i
            if (r3 != 0) goto L_0x022f
            boolean r3 = r2.f23232j
            if (r3 != 0) goto L_0x0223
            boolean r3 = r2.f23233k
            if (r3 != 0) goto L_0x0217
            boolean r3 = r2.f23234l
            if (r3 != 0) goto L_0x020b
            java.lang.String r3 = r2.f23240r
            if (r3 != 0) goto L_0x01fa
            r3 = 1
            r2.f23235m = r3
            java.lang.Class<okhttp3.HttpUrl> r3 = okhttp3.HttpUrl.class
            if (r11 == r3) goto L_0x01ef
            if (r11 == r15) goto L_0x01ef
            java.lang.Class<java.net.URI> r3 = java.net.URI.class
            if (r11 == r3) goto L_0x01ef
            boolean r3 = r11 instanceof java.lang.Class
            if (r3 == 0) goto L_0x01e3
            java.lang.String r3 = "android.net.Uri"
            r4 = r11
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.String r4 = r4.getName()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01e3
            goto L_0x01ef
        L_0x01e3:
            java.lang.reflect.Method r0 = r2.f23224b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type."
            java.lang.IllegalArgumentException r0 = ul.d0.k(r0, r5, r2, r1)
            throw r0
        L_0x01ef:
            ul.u$n r3 = new ul.u$n
            java.lang.reflect.Method r4 = r2.f23224b
            r3.<init>(r5, r4)
        L_0x01f6:
            r19 = r7
            goto L_0x0751
        L_0x01fa:
            java.lang.reflect.Method r0 = r2.f23224b
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.f23236n
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "@Url cannot be used with @%s URL"
            java.lang.IllegalArgumentException r0 = ul.d0.k(r0, r5, r2, r1)
            throw r0
        L_0x020b:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f23224b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Url parameter must not come after a @QueryMap."
            java.lang.IllegalArgumentException r0 = ul.d0.k(r1, r5, r2, r0)
            throw r0
        L_0x0217:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f23224b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Url parameter must not come after a @QueryName."
            java.lang.IllegalArgumentException r0 = ul.d0.k(r1, r5, r2, r0)
            throw r0
        L_0x0223:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f23224b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Url parameter must not come after a @Query."
            java.lang.IllegalArgumentException r0 = ul.d0.k(r1, r5, r2, r0)
            throw r0
        L_0x022f:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f23224b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = ul.d0.k(r1, r5, r13, r0)
            throw r0
        L_0x0239:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f23224b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "Multiple @Url method annotations found."
            java.lang.IllegalArgumentException r0 = ul.d0.k(r1, r5, r2, r0)
            throw r0
        L_0x0245:
            boolean r4 = r14 instanceof xl.s
            r1 = 2
            if (r4 == 0) goto L_0x02f9
            r2.c(r5, r11)
            boolean r3 = r2.f23232j
            if (r3 != 0) goto L_0x02ed
            boolean r3 = r2.f23233k
            if (r3 != 0) goto L_0x02e1
            boolean r3 = r2.f23234l
            if (r3 != 0) goto L_0x02d5
            boolean r3 = r2.f23235m
            if (r3 != 0) goto L_0x02cb
            java.lang.String r3 = r2.f23240r
            if (r3 == 0) goto L_0x02ba
            r3 = 1
            r2.f23231i = r3
            xl.s r14 = (xl.s) r14
            java.lang.String r3 = r14.value()
            java.util.regex.Pattern r4 = ul.x.a.f23222y
            java.util.regex.Matcher r4 = r4.matcher(r3)
            boolean r4 = r4.matches()
            if (r4 == 0) goto L_0x02a3
            java.util.LinkedHashSet r4 = r2.f23243u
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L_0x0290
            ul.z r1 = r2.f23223a
            r1.f(r11, r12)
            ul.u$i r1 = new ul.u$i
            java.lang.reflect.Method r4 = r2.f23224b
            boolean r13 = r14.encoded()
            r1.<init>(r4, r5, r3, r13)
            goto L_0x0389
        L_0x0290:
            java.lang.reflect.Method r0 = r2.f23224b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.f23240r
            r4 = 0
            r1[r4] = r2
            r2 = 1
            r1[r2] = r3
            java.lang.String r2 = "URL \"%s\" does not contain \"{%s}\"."
            java.lang.IllegalArgumentException r0 = ul.d0.k(r0, r5, r2, r1)
            throw r0
        L_0x02a3:
            r0 = 1
            r4 = 0
            java.lang.reflect.Method r2 = r2.f23224b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.regex.Pattern r6 = ul.x.a.f23221x
            java.lang.String r6 = r6.pattern()
            r1[r4] = r6
            r1[r0] = r3
            java.lang.String r0 = "@Path parameter name must match %s. Found: %s"
            java.lang.IllegalArgumentException r0 = ul.d0.k(r2, r5, r0, r1)
            throw r0
        L_0x02ba:
            r0 = 1
            r1 = 0
            java.lang.reflect.Method r3 = r2.f23224b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = r2.f23236n
            r0[r1] = r2
            java.lang.String r1 = "@Path can only be used with relative url on @%s"
            java.lang.IllegalArgumentException r0 = ul.d0.k(r3, r5, r1, r0)
            throw r0
        L_0x02cb:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f23224b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = ul.d0.k(r1, r5, r13, r0)
            throw r0
        L_0x02d5:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f23224b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Path parameter must not come after a @QueryMap."
            java.lang.IllegalArgumentException r0 = ul.d0.k(r1, r5, r2, r0)
            throw r0
        L_0x02e1:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f23224b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Path parameter must not come after a @QueryName."
            java.lang.IllegalArgumentException r0 = ul.d0.k(r1, r5, r2, r0)
            throw r0
        L_0x02ed:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f23224b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Path parameter must not come after a @Query."
            java.lang.IllegalArgumentException r0 = ul.d0.k(r1, r5, r2, r0)
            throw r0
        L_0x02f9:
            boolean r1 = r14 instanceof xl.t
            java.lang.String r4 = "<String>)"
            java.lang.String r13 = " must include generic type (e.g., "
            if (r1 == 0) goto L_0x038d
            r2.c(r5, r11)
            xl.t r14 = (xl.t) r14
            java.lang.String r1 = r14.value()
            boolean r3 = r14.encoded()
            java.lang.Class r14 = ul.d0.f(r11)
            r15 = 1
            r2.f23232j = r15
            java.lang.Class<java.lang.Iterable> r15 = java.lang.Iterable.class
            boolean r15 = r15.isAssignableFrom(r14)
            if (r15 == 0) goto L_0x0360
            boolean r15 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r15 == 0) goto L_0x0339
            r4 = r11
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            r13 = 0
            java.lang.reflect.Type r4 = ul.d0.e(r13, r4)
            ul.z r13 = r2.f23223a
            r13.f(r4, r12)
            ul.u$j r4 = new ul.u$j
            r4.<init>(r1, r3)
            ul.s r1 = new ul.s
            r1.<init>(r4)
            goto L_0x0389
        L_0x0339:
            java.lang.reflect.Method r0 = r2.f23224b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r14.getSimpleName()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r14.getSimpleName()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = ul.d0.k(r0, r5, r1, r2)
            throw r0
        L_0x0360:
            boolean r4 = r14.isArray()
            if (r4 == 0) goto L_0x037e
            java.lang.Class r4 = r14.getComponentType()
            java.lang.Class r4 = ul.x.a.a(r4)
            ul.z r13 = r2.f23223a
            r13.f(r4, r12)
            ul.u$j r4 = new ul.u$j
            r4.<init>(r1, r3)
            ul.t r1 = new ul.t
            r1.<init>(r4)
            goto L_0x0389
        L_0x037e:
            ul.z r4 = r2.f23223a
            r4.f(r11, r12)
            ul.u$j r4 = new ul.u$j
            r4.<init>(r1, r3)
            r1 = r4
        L_0x0389:
            r19 = r7
            goto L_0x061c
        L_0x038d:
            boolean r1 = r14 instanceof xl.v
            if (r1 == 0) goto L_0x0417
            r2.c(r5, r11)
            xl.v r14 = (xl.v) r14
            boolean r1 = r14.encoded()
            java.lang.Class r3 = ul.d0.f(r11)
            r14 = 1
            r2.f23233k = r14
            java.lang.Class<java.lang.Iterable> r14 = java.lang.Iterable.class
            boolean r14 = r14.isAssignableFrom(r3)
            if (r14 == 0) goto L_0x03ec
            boolean r14 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r14 == 0) goto L_0x03c5
            r3 = r11
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            r4 = 0
            java.lang.reflect.Type r3 = ul.d0.e(r4, r3)
            ul.z r4 = r2.f23223a
            r4.f(r3, r12)
            ul.u$l r3 = new ul.u$l
            r3.<init>(r1)
            ul.s r1 = new ul.s
            r1.<init>(r3)
            goto L_0x0389
        L_0x03c5:
            java.lang.reflect.Method r0 = r2.f23224b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getSimpleName()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r3.getSimpleName()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = ul.d0.k(r0, r5, r1, r2)
            throw r0
        L_0x03ec:
            boolean r4 = r3.isArray()
            if (r4 == 0) goto L_0x040b
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Class r3 = ul.x.a.a(r3)
            ul.z r4 = r2.f23223a
            r4.f(r3, r12)
            ul.u$l r3 = new ul.u$l
            r3.<init>(r1)
            ul.t r1 = new ul.t
            r1.<init>(r3)
            goto L_0x0389
        L_0x040b:
            ul.z r3 = r2.f23223a
            r3.f(r11, r12)
            ul.u$l r3 = new ul.u$l
            r3.<init>(r1)
            goto L_0x01f6
        L_0x0417:
            boolean r1 = r14 instanceof xl.u
            r19 = r7
            java.lang.String r7 = "Map must include generic types (e.g., Map<String, String>)"
            if (r1 == 0) goto L_0x048d
            r2.c(r5, r11)
            java.lang.Class r1 = ul.d0.f(r11)
            r3 = 1
            r2.f23234l = r3
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            boolean r4 = r4.isAssignableFrom(r1)
            if (r4 == 0) goto L_0x0481
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            java.lang.reflect.Type r1 = ul.d0.g(r11, r1, r4)
            boolean r4 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L_0x0477
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            r4 = 0
            java.lang.reflect.Type r4 = ul.d0.e(r4, r1)
            if (r15 != r4) goto L_0x045c
            java.lang.reflect.Type r1 = ul.d0.e(r3, r1)
            ul.z r3 = r2.f23223a
            r3.f(r1, r12)
            ul.u$k r1 = new ul.u$k
            java.lang.reflect.Method r3 = r2.f23224b
            xl.u r14 = (xl.u) r14
            boolean r4 = r14.encoded()
            r1.<init>(r3, r5, r4)
            goto L_0x061c
        L_0x045c:
            java.lang.reflect.Method r0 = r2.f23224b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "@QueryMap keys must be of type String: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = ul.d0.k(r0, r5, r1, r2)
            throw r0
        L_0x0477:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f23224b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = ul.d0.k(r1, r5, r7, r0)
            throw r0
        L_0x0481:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f23224b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@QueryMap parameter type must be Map."
            java.lang.IllegalArgumentException r0 = ul.d0.k(r1, r5, r2, r0)
            throw r0
        L_0x048d:
            boolean r1 = r14 instanceof xl.i
            if (r1 == 0) goto L_0x0515
            r2.c(r5, r11)
            xl.i r14 = (xl.i) r14
            java.lang.String r1 = r14.value()
            java.lang.Class r3 = ul.d0.f(r11)
            java.lang.Class<java.lang.Iterable> r7 = java.lang.Iterable.class
            boolean r7 = r7.isAssignableFrom(r3)
            if (r7 == 0) goto L_0x04ea
            boolean r7 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r7 == 0) goto L_0x04c3
            r3 = r11
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            r4 = 0
            java.lang.reflect.Type r3 = ul.d0.e(r4, r3)
            ul.z r4 = r2.f23223a
            r4.f(r3, r12)
            ul.u$d r3 = new ul.u$d
            r3.<init>(r1)
            ul.s r1 = new ul.s
            r1.<init>(r3)
            goto L_0x061c
        L_0x04c3:
            java.lang.reflect.Method r0 = r2.f23224b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getSimpleName()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r3.getSimpleName()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = ul.d0.k(r0, r5, r1, r2)
            throw r0
        L_0x04ea:
            boolean r4 = r3.isArray()
            if (r4 == 0) goto L_0x0509
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Class r3 = ul.x.a.a(r3)
            ul.z r4 = r2.f23223a
            r4.f(r3, r12)
            ul.u$d r3 = new ul.u$d
            r3.<init>(r1)
            ul.t r1 = new ul.t
            r1.<init>(r3)
            goto L_0x061c
        L_0x0509:
            ul.z r3 = r2.f23223a
            r3.f(r11, r12)
            ul.u$d r3 = new ul.u$d
            r3.<init>(r1)
            goto L_0x0751
        L_0x0515:
            boolean r1 = r14 instanceof xl.j
            if (r1 == 0) goto L_0x058c
            java.lang.Class<okhttp3.Headers> r1 = okhttp3.Headers.class
            if (r11 != r1) goto L_0x0526
            ul.u$f r1 = new ul.u$f
            java.lang.reflect.Method r3 = r2.f23224b
            r1.<init>(r5, r3)
            goto L_0x061c
        L_0x0526:
            r2.c(r5, r11)
            java.lang.Class r1 = ul.d0.f(r11)
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L_0x0580
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            java.lang.reflect.Type r1 = ul.d0.g(r11, r1, r3)
            boolean r3 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x0576
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            r3 = 0
            java.lang.reflect.Type r3 = ul.d0.e(r3, r1)
            if (r15 != r3) goto L_0x055b
            r3 = 1
            java.lang.reflect.Type r1 = ul.d0.e(r3, r1)
            ul.z r3 = r2.f23223a
            r3.f(r1, r12)
            ul.u$e r1 = new ul.u$e
            java.lang.reflect.Method r3 = r2.f23224b
            r1.<init>(r3, r5)
            goto L_0x061c
        L_0x055b:
            java.lang.reflect.Method r0 = r2.f23224b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "@HeaderMap keys must be of type String: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = ul.d0.k(r0, r5, r1, r2)
            throw r0
        L_0x0576:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f23224b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = ul.d0.k(r1, r5, r7, r0)
            throw r0
        L_0x0580:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f23224b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@HeaderMap parameter type must be Map."
            java.lang.IllegalArgumentException r0 = ul.d0.k(r1, r5, r2, r0)
            throw r0
        L_0x058c:
            boolean r1 = r14 instanceof xl.c
            if (r1 == 0) goto L_0x062b
            r2.c(r5, r11)
            boolean r1 = r2.f23238p
            if (r1 == 0) goto L_0x061f
            xl.c r14 = (xl.c) r14
            java.lang.String r1 = r14.value()
            boolean r3 = r14.encoded()
            r7 = 1
            r2.f23228f = r7
            java.lang.Class r7 = ul.d0.f(r11)
            java.lang.Class<java.lang.Iterable> r14 = java.lang.Iterable.class
            boolean r14 = r14.isAssignableFrom(r7)
            if (r14 == 0) goto L_0x05f3
            boolean r14 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r14 == 0) goto L_0x05cc
            r4 = r11
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            r7 = 0
            java.lang.reflect.Type r4 = ul.d0.e(r7, r4)
            ul.z r7 = r2.f23223a
            r7.f(r4, r12)
            ul.u$b r4 = new ul.u$b
            r4.<init>(r1, r3)
            ul.s r1 = new ul.s
            r1.<init>(r4)
            goto L_0x061c
        L_0x05cc:
            java.lang.reflect.Method r0 = r2.f23224b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r7.getSimpleName()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r7.getSimpleName()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = ul.d0.k(r0, r5, r1, r2)
            throw r0
        L_0x05f3:
            boolean r4 = r7.isArray()
            if (r4 == 0) goto L_0x0611
            java.lang.Class r4 = r7.getComponentType()
            java.lang.Class r4 = ul.x.a.a(r4)
            ul.z r7 = r2.f23223a
            r7.f(r4, r12)
            ul.u$b r4 = new ul.u$b
            r4.<init>(r1, r3)
            ul.t r1 = new ul.t
            r1.<init>(r4)
            goto L_0x061c
        L_0x0611:
            ul.z r4 = r2.f23223a
            r4.f(r11, r12)
            ul.u$b r4 = new ul.u$b
            r4.<init>(r1, r3)
            r1 = r4
        L_0x061c:
            r3 = r1
            goto L_0x0751
        L_0x061f:
            java.lang.reflect.Method r0 = r2.f23224b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "@Field parameters can only be used with form encoding."
            java.lang.IllegalArgumentException r0 = ul.d0.k(r0, r5, r2, r1)
            throw r0
        L_0x062b:
            boolean r1 = r14 instanceof xl.d
            if (r1 == 0) goto L_0x06ac
            r2.c(r5, r11)
            boolean r1 = r2.f23238p
            if (r1 == 0) goto L_0x06a0
            java.lang.Class r1 = ul.d0.f(r11)
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L_0x0694
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            java.lang.reflect.Type r1 = ul.d0.g(r11, r1, r3)
            boolean r3 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x068a
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            r3 = 0
            java.lang.reflect.Type r3 = ul.d0.e(r3, r1)
            if (r15 != r3) goto L_0x066f
            r3 = 1
            java.lang.reflect.Type r1 = ul.d0.e(r3, r1)
            ul.z r4 = r2.f23223a
            r4.f(r1, r12)
            r2.f23228f = r3
            ul.u$c r1 = new ul.u$c
            java.lang.reflect.Method r3 = r2.f23224b
            xl.d r14 = (xl.d) r14
            boolean r4 = r14.encoded()
            r1.<init>(r3, r5, r4)
            goto L_0x061c
        L_0x066f:
            java.lang.reflect.Method r0 = r2.f23224b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "@FieldMap keys must be of type String: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = ul.d0.k(r0, r5, r1, r2)
            throw r0
        L_0x068a:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f23224b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = ul.d0.k(r1, r5, r7, r0)
            throw r0
        L_0x0694:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f23224b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@FieldMap parameter type must be Map."
            java.lang.IllegalArgumentException r0 = ul.d0.k(r1, r5, r2, r0)
            throw r0
        L_0x06a0:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f23224b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@FieldMap parameters can only be used with form encoding."
            java.lang.IllegalArgumentException r0 = ul.d0.k(r1, r5, r2, r0)
            throw r0
        L_0x06ac:
            boolean r1 = r14 instanceof xl.q
            if (r1 == 0) goto L_0x0851
            r2.c(r5, r11)
            boolean r1 = r2.f23239q
            if (r1 == 0) goto L_0x0845
            xl.q r14 = (xl.q) r14
            r1 = 1
            r2.f23229g = r1
            java.lang.String r1 = r14.value()
            java.lang.Class r7 = ul.d0.f(r11)
            boolean r15 = r1.isEmpty()
            if (r15 == 0) goto L_0x075e
            java.lang.Class<java.lang.Iterable> r1 = java.lang.Iterable.class
            boolean r1 = r1.isAssignableFrom(r7)
            java.lang.String r14 = "@Part annotation must supply a name or use MultipartBody.Part parameter type."
            if (r1 == 0) goto L_0x0722
            boolean r1 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L_0x06fb
            r1 = r11
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            r4 = 0
            java.lang.reflect.Type r1 = ul.d0.e(r4, r1)
            java.lang.Class r1 = ul.d0.f(r1)
            boolean r1 = r3.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x06f2
            ul.u$m r1 = ul.u.m.f23187a
            ul.s r3 = new ul.s
            r3.<init>(r1)
            goto L_0x0751
        L_0x06f2:
            java.lang.reflect.Method r0 = r2.f23224b
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.IllegalArgumentException r0 = ul.d0.k(r0, r5, r14, r1)
            throw r0
        L_0x06fb:
            java.lang.reflect.Method r0 = r2.f23224b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r7.getSimpleName()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r7.getSimpleName()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = ul.d0.k(r0, r5, r1, r2)
            throw r0
        L_0x0722:
            boolean r1 = r7.isArray()
            if (r1 == 0) goto L_0x0746
            java.lang.Class r1 = r7.getComponentType()
            boolean r1 = r3.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x073c
            ul.u$m r1 = ul.u.m.f23187a
            ul.t r3 = new ul.t
            r3.<init>(r1)
            r1 = r3
            goto L_0x061c
        L_0x073c:
            java.lang.reflect.Method r0 = r2.f23224b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = ul.d0.k(r0, r5, r14, r1)
            throw r0
        L_0x0746:
            r1 = 0
            boolean r3 = r3.isAssignableFrom(r7)
            if (r3 == 0) goto L_0x0755
            ul.u$m r1 = ul.u.m.f23187a
            goto L_0x061c
        L_0x0751:
            r20 = r10
            goto L_0x0994
        L_0x0755:
            java.lang.reflect.Method r0 = r2.f23224b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = ul.d0.k(r0, r5, r14, r1)
            throw r0
        L_0x075e:
            r15 = 4
            java.lang.String[] r15 = new java.lang.String[r15]
            java.lang.String r20 = "Content-Disposition"
            r21 = 0
            r15[r21] = r20
            java.lang.String r0 = "form-data; name=\""
            r20 = r10
            java.lang.String r10 = "\""
            java.lang.String r0 = f0.b0.s(r0, r1, r10)
            r1 = 1
            r15[r1] = r0
            java.lang.String r0 = "Content-Transfer-Encoding"
            r1 = 2
            r15[r1] = r0
            r0 = 3
            java.lang.String r1 = r14.encoding()
            r15[r0] = r1
            okhttp3.Headers$Companion r0 = okhttp3.Headers.f22002b
            r0.getClass()
            okhttp3.Headers r0 = okhttp3.Headers.Companion.c(r15)
            java.lang.Class<java.lang.Iterable> r1 = java.lang.Iterable.class
            boolean r1 = r1.isAssignableFrom(r7)
            java.lang.String r10 = "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."
            if (r1 == 0) goto L_0x07ef
            boolean r1 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L_0x07c8
            r1 = r11
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            r4 = 0
            java.lang.reflect.Type r1 = ul.d0.e(r4, r1)
            java.lang.Class r4 = ul.d0.f(r1)
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 != 0) goto L_0x07be
            ul.z r3 = r2.f23223a
            java.lang.annotation.Annotation[] r4 = r2.f23225c
            ul.f r1 = r3.d(r1, r12, r4)
            ul.u$g r3 = new ul.u$g
            java.lang.reflect.Method r4 = r2.f23224b
            r3.<init>(r4, r5, r0, r1)
            ul.s r0 = new ul.s
            r0.<init>(r3)
            goto L_0x0817
        L_0x07be:
            java.lang.reflect.Method r0 = r2.f23224b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = ul.d0.k(r0, r5, r10, r1)
            throw r0
        L_0x07c8:
            java.lang.reflect.Method r0 = r2.f23224b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r7.getSimpleName()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r7.getSimpleName()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.IllegalArgumentException r0 = ul.d0.k(r0, r5, r1, r2)
            throw r0
        L_0x07ef:
            boolean r1 = r7.isArray()
            if (r1 == 0) goto L_0x0824
            java.lang.Class r1 = r7.getComponentType()
            java.lang.Class r1 = ul.x.a.a(r1)
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 != 0) goto L_0x081a
            ul.z r3 = r2.f23223a
            java.lang.annotation.Annotation[] r4 = r2.f23225c
            ul.f r1 = r3.d(r1, r12, r4)
            ul.u$g r3 = new ul.u$g
            java.lang.reflect.Method r4 = r2.f23224b
            r3.<init>(r4, r5, r0, r1)
            ul.t r0 = new ul.t
            r0.<init>(r3)
        L_0x0817:
            r3 = r0
            goto L_0x0994
        L_0x081a:
            java.lang.reflect.Method r0 = r2.f23224b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = ul.d0.k(r0, r5, r10, r1)
            throw r0
        L_0x0824:
            boolean r1 = r3.isAssignableFrom(r7)
            if (r1 != 0) goto L_0x083b
            ul.z r1 = r2.f23223a
            java.lang.annotation.Annotation[] r3 = r2.f23225c
            ul.f r1 = r1.d(r11, r12, r3)
            ul.u$g r3 = new ul.u$g
            java.lang.reflect.Method r4 = r2.f23224b
            r3.<init>(r4, r5, r0, r1)
            goto L_0x0994
        L_0x083b:
            java.lang.reflect.Method r0 = r2.f23224b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = ul.d0.k(r0, r5, r10, r1)
            throw r0
        L_0x0845:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f23224b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@Part parameters can only be used with multipart encoding."
            java.lang.IllegalArgumentException r0 = ul.d0.k(r1, r5, r2, r0)
            throw r0
        L_0x0851:
            r20 = r10
            boolean r0 = r14 instanceof xl.r
            if (r0 == 0) goto L_0x08ef
            r2.c(r5, r11)
            boolean r0 = r2.f23239q
            if (r0 == 0) goto L_0x08e3
            r0 = 1
            r2.f23229g = r0
            java.lang.Class r0 = ul.d0.f(r11)
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r1 = r1.isAssignableFrom(r0)
            if (r1 == 0) goto L_0x08d7
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            java.lang.reflect.Type r0 = ul.d0.g(r11, r0, r1)
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L_0x08cd
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r1 = 0
            java.lang.reflect.Type r1 = ul.d0.e(r1, r0)
            if (r15 != r1) goto L_0x08b2
            r1 = 1
            java.lang.reflect.Type r0 = ul.d0.e(r1, r0)
            java.lang.Class r1 = ul.d0.f(r0)
            boolean r1 = r3.isAssignableFrom(r1)
            if (r1 != 0) goto L_0x08a6
            ul.z r1 = r2.f23223a
            java.lang.annotation.Annotation[] r3 = r2.f23225c
            ul.f r0 = r1.d(r0, r12, r3)
            xl.r r14 = (xl.r) r14
            ul.u$h r3 = new ul.u$h
            java.lang.reflect.Method r1 = r2.f23224b
            java.lang.String r4 = r14.encoding()
            r3.<init>(r1, r5, r0, r4)
            goto L_0x0994
        L_0x08a6:
            java.lang.reflect.Method r0 = r2.f23224b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead."
            java.lang.IllegalArgumentException r0 = ul.d0.k(r0, r5, r2, r1)
            throw r0
        L_0x08b2:
            r0 = 0
            java.lang.reflect.Method r2 = r2.f23224b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "@PartMap keys must be of type String: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = ul.d0.k(r2, r5, r1, r0)
            throw r0
        L_0x08cd:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f23224b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.IllegalArgumentException r0 = ul.d0.k(r1, r5, r7, r0)
            throw r0
        L_0x08d7:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f23224b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@PartMap parameter type must be Map."
            java.lang.IllegalArgumentException r0 = ul.d0.k(r1, r5, r2, r0)
            throw r0
        L_0x08e3:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f23224b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@PartMap parameters can only be used with multipart encoding."
            java.lang.IllegalArgumentException r0 = ul.d0.k(r1, r5, r2, r0)
            throw r0
        L_0x08ef:
            boolean r0 = r14 instanceof xl.a
            if (r0 == 0) goto L_0x093e
            r2.c(r5, r11)
            boolean r0 = r2.f23238p
            if (r0 != 0) goto L_0x0932
            boolean r0 = r2.f23239q
            if (r0 != 0) goto L_0x0932
            boolean r0 = r2.f23230h
            if (r0 != 0) goto L_0x0926
            ul.z r0 = r2.f23223a     // Catch:{ RuntimeException -> 0x0916 }
            java.lang.annotation.Annotation[] r1 = r2.f23225c     // Catch:{ RuntimeException -> 0x0916 }
            ul.f r0 = r0.d(r11, r12, r1)     // Catch:{ RuntimeException -> 0x0916 }
            r1 = 1
            r2.f23230h = r1
            ul.u$a r3 = new ul.u$a
            java.lang.reflect.Method r1 = r2.f23224b
            r3.<init>(r1, r5, r0)
            goto L_0x0994
        L_0x0916:
            r0 = move-exception
            java.lang.reflect.Method r1 = r2.f23224b
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r11
            java.lang.String r3 = "Unable to create @Body converter for %s"
            java.lang.IllegalArgumentException r0 = ul.d0.l(r1, r0, r5, r3, r2)
            throw r0
        L_0x0926:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f23224b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "Multiple @Body method annotations found."
            java.lang.IllegalArgumentException r0 = ul.d0.k(r1, r5, r2, r0)
            throw r0
        L_0x0932:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f23224b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@Body parameters cannot be used with form or multi-part encoding."
            java.lang.IllegalArgumentException r0 = ul.d0.k(r1, r5, r2, r0)
            throw r0
        L_0x093e:
            boolean r0 = r14 instanceof xl.x
            if (r0 == 0) goto L_0x0993
            r2.c(r5, r11)
            java.lang.Class r0 = ul.d0.f(r11)
            int r1 = r5 + -1
        L_0x094b:
            if (r1 < 0) goto L_0x098d
            ul.u<?>[] r3 = r2.f23244v
            r3 = r3[r1]
            boolean r4 = r3 instanceof ul.u.o
            if (r4 == 0) goto L_0x098a
            ul.u$o r3 = (ul.u.o) r3
            java.lang.Class<T> r3 = r3.f23190a
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0960
            goto L_0x098a
        L_0x0960:
            java.lang.reflect.Method r2 = r2.f23224b
            java.lang.String r3 = "@Tag type "
            java.lang.StringBuilder r3 = android.support.v4.media.a.q(r3)
            java.lang.String r0 = r0.getName()
            r3.append(r0)
            java.lang.String r0 = " is duplicate of parameter #"
            r3.append(r0)
            int r1 = r1 + 1
            r3.append(r1)
            java.lang.String r0 = " and would always overwrite its value."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r0 = ul.d0.k(r2, r5, r0, r1)
            throw r0
        L_0x098a:
            int r1 = r1 + -1
            goto L_0x094b
        L_0x098d:
            ul.u$o r3 = new ul.u$o
            r3.<init>(r0)
            goto L_0x0994
        L_0x0993:
            r3 = 0
        L_0x0994:
            if (r3 != 0) goto L_0x0997
            goto L_0x099a
        L_0x0997:
            if (r8 != 0) goto L_0x09ac
            r8 = r3
        L_0x099a:
            int r6 = r6 + 1
            r0 = r22
            r1 = r23
            r3 = r16
            r4 = r17
            r13 = r18
            r7 = r19
            r10 = r20
            goto L_0x0193
        L_0x09ac:
            java.lang.reflect.Method r0 = r2.f23224b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Multiple Retrofit annotations found, only one allowed."
            java.lang.IllegalArgumentException r0 = ul.d0.k(r0, r5, r2, r1)
            throw r0
        L_0x09b8:
            r16 = r3
            r17 = r4
            r19 = r7
            r20 = r10
            goto L_0x09ca
        L_0x09c1:
            r16 = r3
            r17 = r4
            r19 = r7
            r20 = r10
            r8 = 0
        L_0x09ca:
            if (r8 != 0) goto L_0x09e7
            if (r9 == 0) goto L_0x09db
            java.lang.Class r0 = ul.d0.f(r11)     // Catch:{ NoClassDefFoundError -> 0x09db }
            java.lang.Class<ik.d> r1 = ik.d.class
            if (r0 != r1) goto L_0x09db
            r0 = 1
            r2.f23245w = r0     // Catch:{ NoClassDefFoundError -> 0x09db }
            r8 = 0
            goto L_0x09e7
        L_0x09db:
            java.lang.reflect.Method r0 = r2.f23224b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "No Retrofit annotation found."
            java.lang.IllegalArgumentException r0 = ul.d0.k(r0, r5, r2, r1)
            throw r0
        L_0x09e7:
            r20[r5] = r8
            int r5 = r5 + 1
            r6 = 0
            r8 = 0
            r9 = 1
            r0 = r22
            r1 = r23
            r3 = r16
            r4 = r17
            r7 = r19
            goto L_0x0180
        L_0x09fa:
            r19 = r7
            java.lang.String r0 = r2.f23240r
            if (r0 != 0) goto L_0x0a17
            boolean r0 = r2.f23235m
            if (r0 == 0) goto L_0x0a05
            goto L_0x0a17
        L_0x0a05:
            java.lang.reflect.Method r0 = r2.f23224b
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.f23236n
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "Missing either @%s URL or @Url parameter."
            r3 = 0
            java.lang.IllegalArgumentException r0 = ul.d0.j(r0, r3, r2, r1)
            throw r0
        L_0x0a17:
            boolean r0 = r2.f23238p
            if (r0 != 0) goto L_0x0a35
            boolean r1 = r2.f23239q
            if (r1 != 0) goto L_0x0a35
            boolean r1 = r2.f23237o
            if (r1 != 0) goto L_0x0a35
            boolean r1 = r2.f23230h
            if (r1 != 0) goto L_0x0a28
            goto L_0x0a35
        L_0x0a28:
            java.lang.reflect.Method r0 = r2.f23224b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Non-body HTTP method cannot contain @Body."
            r3 = 0
            java.lang.IllegalArgumentException r0 = ul.d0.j(r0, r3, r2, r1)
            throw r0
        L_0x0a35:
            if (r0 == 0) goto L_0x0a49
            boolean r0 = r2.f23228f
            if (r0 == 0) goto L_0x0a3c
            goto L_0x0a49
        L_0x0a3c:
            java.lang.reflect.Method r0 = r2.f23224b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Form-encoded method must contain at least one @Field."
            r3 = 0
            java.lang.IllegalArgumentException r0 = ul.d0.j(r0, r3, r2, r1)
            throw r0
        L_0x0a49:
            r0 = 0
            r1 = 0
            boolean r3 = r2.f23239q
            if (r3 == 0) goto L_0x0a5f
            boolean r3 = r2.f23229g
            if (r3 == 0) goto L_0x0a54
            goto L_0x0a5f
        L_0x0a54:
            java.lang.reflect.Method r2 = r2.f23224b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = "Multipart method must contain at least one @Part."
            java.lang.IllegalArgumentException r0 = ul.d0.j(r2, r1, r3, r0)
            throw r0
        L_0x0a5f:
            ul.x r0 = new ul.x
            r0.<init>(r2)
            java.lang.reflect.Type r1 = r23.getGenericReturnType()
            boolean r2 = ul.d0.h(r1)
            if (r2 != 0) goto L_0x0b87
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 == r2) goto L_0x0b7a
            java.lang.Class<ul.y> r1 = ul.y.class
            boolean r2 = r0.f23220k
            java.lang.annotation.Annotation[] r3 = r23.getAnnotations()
            if (r2 == 0) goto L_0x0ad1
            java.lang.reflect.Type[] r4 = r23.getGenericParameterTypes()
            int r5 = r4.length
            int r5 = r5 + -1
            r4 = r4[r5]
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            r5 = 0
            r4 = r4[r5]
            boolean r6 = r4 instanceof java.lang.reflect.WildcardType
            if (r6 == 0) goto L_0x0a9a
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            java.lang.reflect.Type[] r4 = r4.getLowerBounds()
            r4 = r4[r5]
        L_0x0a9a:
            java.lang.Class r6 = ul.d0.f(r4)
            if (r6 != r1) goto L_0x0aac
            boolean r6 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r6 == 0) goto L_0x0aac
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type r4 = ul.d0.e(r5, r4)
            r6 = 1
            goto L_0x0aad
        L_0x0aac:
            r6 = r5
        L_0x0aad:
            ul.d0$b r7 = new ul.d0$b
            java.lang.Class<ul.b> r8 = ul.b.class
            r9 = 1
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r9]
            r10[r5] = r4
            r4 = 0
            r7.<init>(r4, r8, r10)
            java.lang.Class<ul.b0> r4 = ul.b0.class
            boolean r4 = ul.d0.i(r3, r4)
            if (r4 == 0) goto L_0x0ac3
            goto L_0x0ad6
        L_0x0ac3:
            int r4 = r3.length
            int r4 = r4 + r9
            java.lang.annotation.Annotation[] r4 = new java.lang.annotation.Annotation[r4]
            ul.c0 r8 = ul.c0.f23093a
            r4[r5] = r8
            int r8 = r3.length
            java.lang.System.arraycopy(r3, r5, r4, r9, r8)
            r3 = r4
            goto L_0x0ad6
        L_0x0ad1:
            java.lang.reflect.Type r7 = r23.getGenericReturnType()
            r6 = 0
        L_0x0ad6:
            r4 = r22
            ul.c r3 = r4.a(r7, r3)     // Catch:{ RuntimeException -> 0x0b69 }
            java.lang.reflect.Type r5 = r3.a()
            java.lang.Class<okhttp3.Response> r7 = okhttp3.Response.class
            if (r5 == r7) goto L_0x0b44
            if (r5 == r1) goto L_0x0b37
            java.lang.String r1 = r0.f23212c
            r7 = r19
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0b06
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0af9
            goto L_0x0b06
        L_0x0af9:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "HEAD method must use Void as response type."
            r2 = 0
            r8 = r23
            java.lang.IllegalArgumentException r0 = ul.d0.j(r8, r2, r1, r0)
            throw r0
        L_0x0b06:
            r8 = r23
            java.lang.annotation.Annotation[] r1 = r23.getAnnotations()
            ul.f r1 = r4.e(r5, r1)     // Catch:{ RuntimeException -> 0x0b28 }
            okhttp3.Call$Factory r4 = r4.f23250b
            if (r2 != 0) goto L_0x0b1a
            ul.i$a r2 = new ul.i$a
            r2.<init>(r0, r4, r1, r3)
            goto L_0x0b27
        L_0x0b1a:
            if (r6 == 0) goto L_0x0b22
            ul.i$c r2 = new ul.i$c
            r2.<init>(r0, r4, r1, r3)
            goto L_0x0b27
        L_0x0b22:
            ul.i$b r2 = new ul.i$b
            r2.<init>(r0, r4, r1, r3)
        L_0x0b27:
            return r2
        L_0x0b28:
            r0 = move-exception
            r1 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r5
            java.lang.String r2 = "Unable to create converter for %s"
            java.lang.IllegalArgumentException r0 = ul.d0.j(r8, r1, r2, r0)
            throw r0
        L_0x0b37:
            r8 = r23
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Response must include generic type (e.g., Response<String>)"
            r2 = 0
            java.lang.IllegalArgumentException r0 = ul.d0.j(r8, r2, r1, r0)
            throw r0
        L_0x0b44:
            r8 = r23
            java.lang.String r0 = "'"
            java.lang.StringBuilder r0 = android.support.v4.media.a.q(r0)
            java.lang.Class r1 = ul.d0.f(r5)
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "' is not a valid response body type. Did you mean ResponseBody?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.IllegalArgumentException r0 = ul.d0.j(r8, r2, r0, r1)
            throw r0
        L_0x0b69:
            r0 = move-exception
            r8 = r23
            r1 = r0
            r0 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r7
            java.lang.String r0 = "Unable to create call adapter for %s"
            java.lang.IllegalArgumentException r0 = ul.d0.j(r8, r1, r0, r2)
            throw r0
        L_0x0b7a:
            r8 = r23
            r0 = 0
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "Service methods cannot return void."
            java.lang.IllegalArgumentException r0 = ul.d0.j(r8, r1, r2, r0)
            throw r0
        L_0x0b87:
            r8 = r23
            r0 = 1
            r2 = 0
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r1
            java.lang.String r1 = "Method return type must not include a type variable or wildcard: %s"
            java.lang.IllegalArgumentException r0 = ul.d0.j(r8, r3, r1, r0)
            throw r0
        L_0x0b97:
            java.lang.reflect.Method r0 = r2.f23224b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "HTTP method annotation is required (e.g., @GET, @POST, etc.)."
            java.lang.IllegalArgumentException r0 = ul.d0.j(r0, r8, r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ul.a0.b(ul.z, java.lang.reflect.Method):ul.i");
    }

    public abstract T a(Object[] objArr);
}
