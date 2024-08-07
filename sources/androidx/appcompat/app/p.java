package androidx.appcompat.app;

import da.g;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f458a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f459b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f460c;

    public /* synthetic */ p(int i10, Object obj, Object obj2) {
        this.f458a = i10;
        this.f459b = obj;
        this.f460c = obj2;
    }

    public /* synthetic */ p(Runnable runnable, g.b bVar) {
        this.f458a = 29;
        this.f460c = runnable;
        this.f459b = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x013d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            int r0 = r15.f458a
            r1 = 1
            r2 = 0
            r3 = 0
            r4 = 2
            r5 = 9
            switch(r0) {
                case 0: goto L_0x04ea;
                case 1: goto L_0x04cf;
                case 2: goto L_0x04b2;
                case 3: goto L_0x04a6;
                case 4: goto L_0x046c;
                case 5: goto L_0x043f;
                case 6: goto L_0x0437;
                case 7: goto L_0x041c;
                case 8: goto L_0x040e;
                case 9: goto L_0x0400;
                case 10: goto L_0x03bc;
                case 11: goto L_0x0383;
                case 12: goto L_0x0375;
                case 13: goto L_0x035f;
                case 14: goto L_0x030f;
                case 15: goto L_0x0249;
                case 16: goto L_0x0219;
                case 17: goto L_0x020b;
                case 18: goto L_0x01f1;
                case 19: goto L_0x000b;
                case 20: goto L_0x01d3;
                case 21: goto L_0x01b4;
                case 22: goto L_0x018b;
                case 23: goto L_0x0161;
                case 24: goto L_0x0143;
                case 25: goto L_0x00b9;
                case 26: goto L_0x0044;
                case 27: goto L_0x001f;
                case 28: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0501
        L_0x000d:
            java.lang.Object r0 = r15.f459b
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r15.f460c
            wa.a r1 = (wa.a) r1
            java.lang.Object r0 = r0.getKey()
            wa.b r0 = (wa.b) r0
            r0.a(r1)
            return
        L_0x001f:
            java.lang.Object r0 = r15.f459b
            ca.q r0 = (ca.q) r0
            java.lang.Object r1 = r15.f460c
            za.b r1 = (za.b) r1
            za.b<T> r3 = r0.f4658b
            ca.i r4 = ca.q.f4656d
            if (r3 != r4) goto L_0x003c
            monitor-enter(r0)
            za.a$a<T> r3 = r0.f4657a     // Catch:{ all -> 0x0039 }
            r0.f4657a = r2     // Catch:{ all -> 0x0039 }
            r0.f4658b = r1     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            r3.f(r1)
            return
        L_0x0039:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r1
        L_0x003c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "provide() can be called only once."
            r0.<init>(r1)
            throw r0
        L_0x0044:
            java.lang.Object r0 = r15.f459b
            v9.e r0 = (v9.e) r0
            java.lang.Object r1 = r15.f460c
            androidx.fragment.app.o r1 = (androidx.fragment.app.o) r1
            v9.k r0 = r0.f16096b
            r0.getClass()
            boolean r3 = r1 instanceof v9.b
            java.lang.String r4 = "com.google.firebase.appcheck.TOKEN_TYPE"
            java.lang.String r5 = "com.google.firebase.appcheck.APP_CHECK_TOKEN"
            if (r3 == 0) goto L_0x009b
            ca.o<android.content.SharedPreferences> r0 = r0.f16116a
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            v9.b r1 = (v9.b) r1
            r1.getClass()
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0089 }
            r3.<init>()     // Catch:{ JSONException -> 0x0089 }
            java.lang.String r6 = "token"
            java.lang.String r7 = r1.f16088b     // Catch:{ JSONException -> 0x0089 }
            r3.put(r6, r7)     // Catch:{ JSONException -> 0x0089 }
            java.lang.String r6 = "receivedAt"
            long r7 = r1.f16089c     // Catch:{ JSONException -> 0x0089 }
            r3.put(r6, r7)     // Catch:{ JSONException -> 0x0089 }
            java.lang.String r6 = "expiresIn"
            long r7 = r1.f16090d     // Catch:{ JSONException -> 0x0089 }
            r3.put(r6, r7)     // Catch:{ JSONException -> 0x0089 }
            java.lang.String r2 = r3.toString()     // Catch:{ JSONException -> 0x0089 }
            goto L_0x008d
        L_0x0089:
            r1 = move-exception
            r1.getMessage()
        L_0x008d:
            android.content.SharedPreferences$Editor r0 = r0.putString(r5, r2)
            java.lang.String r1 = "DEFAULT_APP_CHECK_TOKEN"
            android.content.SharedPreferences$Editor r0 = r0.putString(r4, r1)
            r0.apply()
            goto L_0x00b8
        L_0x009b:
            ca.o<android.content.SharedPreferences> r0 = r0.f16116a
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = r1.v()
            android.content.SharedPreferences$Editor r0 = r0.putString(r5, r1)
            java.lang.String r1 = "UNKNOWN_APP_CHECK_TOKEN"
            android.content.SharedPreferences$Editor r0 = r0.putString(r4, r1)
            r0.apply()
        L_0x00b8:
            return
        L_0x00b9:
            java.lang.Object r0 = r15.f459b
            v9.e r0 = (v9.e) r0
            java.lang.Object r3 = r15.f460c
            com.google.android.gms.tasks.TaskCompletionSource r3 = (com.google.android.gms.tasks.TaskCompletionSource) r3
            v9.k r4 = r0.f16096b
            ca.o<android.content.SharedPreferences> r5 = r4.f16116a
            java.lang.Object r5 = r5.get()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.lang.String r6 = "com.google.firebase.appcheck.TOKEN_TYPE"
            java.lang.String r5 = r5.getString(r6, r2)
            ca.o<android.content.SharedPreferences> r7 = r4.f16116a
            java.lang.Object r7 = r7.get()
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7
            java.lang.String r8 = "com.google.firebase.appcheck.APP_CHECK_TOKEN"
            java.lang.String r7 = r7.getString(r8, r2)
            if (r5 == 0) goto L_0x013a
            if (r7 != 0) goto L_0x00e4
            goto L_0x013a
        L_0x00e4:
            int r5 = n0.l.w(r5)     // Catch:{ IllegalArgumentException -> 0x011d }
            int r5 = v.v.g(r5)     // Catch:{ IllegalArgumentException -> 0x011d }
            if (r5 == 0) goto L_0x00f8
            if (r5 == r1) goto L_0x00f3
            int r1 = v9.k.f16115b
            goto L_0x013a
        L_0x00f3:
            v9.b r1 = v9.b.K(r7)     // Catch:{ IllegalArgumentException -> 0x011d }
            goto L_0x013b
        L_0x00f8:
            int r1 = v9.b.f16087e     // Catch:{ IllegalArgumentException -> 0x011d }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0118 }
            r1.<init>(r7)     // Catch:{ JSONException -> 0x0118 }
            java.lang.String r5 = "token"
            java.lang.String r10 = r1.getString(r5)     // Catch:{ JSONException -> 0x0118 }
            java.lang.String r5 = "receivedAt"
            long r13 = r1.getLong(r5)     // Catch:{ JSONException -> 0x0118 }
            java.lang.String r5 = "expiresIn"
            long r11 = r1.getLong(r5)     // Catch:{ JSONException -> 0x0118 }
            v9.b r1 = new v9.b     // Catch:{ JSONException -> 0x0118 }
            r9 = r1
            r9.<init>(r10, r11, r13)     // Catch:{ JSONException -> 0x0118 }
            goto L_0x013b
        L_0x0118:
            r1 = move-exception
            r1.getMessage()     // Catch:{ IllegalArgumentException -> 0x011d }
            goto L_0x013a
        L_0x011d:
            r1 = move-exception
            int r5 = v9.k.f16115b
            r1.getMessage()
            ca.o<android.content.SharedPreferences> r1 = r4.f16116a
            java.lang.Object r1 = r1.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            android.content.SharedPreferences$Editor r1 = r1.edit()
            android.content.SharedPreferences$Editor r1 = r1.remove(r8)
            android.content.SharedPreferences$Editor r1 = r1.remove(r6)
            r1.apply()
        L_0x013a:
            r1 = r2
        L_0x013b:
            if (r1 == 0) goto L_0x013f
            r0.f16100f = r1
        L_0x013f:
            r3.setResult(r2)
            return
        L_0x0143:
            java.lang.Object r0 = r15.f459b
            y3.v r0 = (y3.v) r0
            java.lang.Object r2 = r15.f460c
            z3.c r2 = (z3.c) r2
            z3.c<java.lang.Void> r3 = r0.f17422a
            java.lang.Object r3 = r3.f17841a
            boolean r3 = r3 instanceof z3.a.b
            if (r3 != 0) goto L_0x015d
            androidx.work.d r0 = r0.f17425d
            v8.a r0 = r0.a()
            r2.k(r0)
            goto L_0x0160
        L_0x015d:
            r2.cancel(r1)
        L_0x0160:
            return
        L_0x0161:
            java.lang.Object r0 = r15.f459b
            r2.d r0 = (r2.d) r0
            java.lang.Object r1 = r15.f460c
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.String r2 = "this$0"
            sk.j.f(r0, r2)
            java.lang.String r2 = "$runnable"
            sk.j.f(r1, r2)
            java.util.ArrayDeque r2 = r0.f14470d
            boolean r1 = r2.offer(r1)
            if (r1 == 0) goto L_0x017f
            r0.a()
            return
        L_0x017f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cannot enqueue any more runnables"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x018b:
            java.lang.Object r0 = r15.f459b
            androidx.fragment.app.l0 r0 = (androidx.fragment.app.l0) r0
            java.lang.Object r1 = r15.f460c
            androidx.fragment.app.l0$a r1 = (androidx.fragment.app.l0.a) r1
            java.lang.String r2 = "this$0"
            sk.j.f(r0, r2)
            java.lang.String r2 = "$operation"
            sk.j.f(r1, r2)
            java.util.ArrayList r0 = r0.f2664b
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x01b3
            androidx.fragment.app.l0$b$b r0 = r1.f2669a
            androidx.fragment.app.Fragment r1 = r1.f2671c
            android.view.View r1 = r1.L
            java.lang.String r2 = "operation.fragment.mView"
            sk.j.e(r1, r2)
            r0.b(r1)
        L_0x01b3:
            return
        L_0x01b4:
            java.lang.Object r0 = r15.f459b
            androidx.fragment.app.d$c r0 = (androidx.fragment.app.d.c) r0
            java.lang.Object r1 = r15.f460c
            androidx.fragment.app.l0$b r1 = (androidx.fragment.app.l0.b) r1
            java.lang.String r2 = "$transitionInfo"
            sk.j.f(r0, r2)
            java.lang.String r2 = "$operation"
            sk.j.f(r1, r2)
            r0.a()
            boolean r0 = androidx.fragment.app.FragmentManager.J(r4)
            if (r0 == 0) goto L_0x01d2
            r1.toString()
        L_0x01d2:
            return
        L_0x01d3:
            java.lang.Object r0 = r15.f459b
            androidx.camera.view.f r0 = (androidx.camera.view.f) r0
            java.lang.Object r1 = r15.f460c
            c0.d1 r1 = (c0.d1) r1
            c0.d1 r3 = r0.f1515h
            if (r3 == 0) goto L_0x01e5
            if (r3 != r1) goto L_0x01e5
            r0.f1515h = r2
            r0.f1514g = r2
        L_0x01e5:
            androidx.camera.view.c$a r1 = r0.f1519l
            if (r1 == 0) goto L_0x01f0
            r0.f r1 = (r0.f) r1
            r1.a()
            r0.f1519l = r2
        L_0x01f0:
            return
        L_0x01f1:
            java.lang.Object r0 = r15.f459b
            n0.v r0 = (n0.v) r0
            java.lang.Object r1 = r15.f460c
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1
            r0.getClass()
            java.lang.Object r1 = r1.get()
            v1.a r1 = (v1.a) r1
            c0.g r2 = new c0.g
            r2.<init>(r0)
            r1.accept(r2)
            return
        L_0x020b:
            java.lang.Object r0 = r15.f459b
            n0.j r0 = (n0.j) r0
            java.lang.Object r1 = r15.f460c
            n0.j$b r1 = (n0.j.b) r1
            java.util.ArrayList r0 = r0.f13348k
            r0.add(r1)
            return
        L_0x0219:
            java.lang.Object r0 = r15.f459b
            n0.j r0 = (n0.j) r0
            java.lang.Object r2 = r15.f460c
            c0.x0 r2 = (c0.x0) r2
            h0.b r3 = r0.f13340c
            n0.g r4 = new n0.g
            r4.<init>(r0, r2)
            android.view.Surface r3 = r2.y(r3, r4)
            n0.m r4 = r0.f13338a
            r4.d(r1)
            r4.c()
            java.util.HashMap r1 = r4.f13360b
            boolean r1 = r1.containsKey(r3)
            if (r1 != 0) goto L_0x0243
            java.util.HashMap r1 = r4.f13360b
            n0.b r4 = n0.m.f13358t
            r1.put(r3, r4)
        L_0x0243:
            java.util.LinkedHashMap r0 = r0.f13345h
            r0.put(r2, r3)
            return
        L_0x0249:
            java.lang.Object r0 = r15.f459b
            f0.g0$a r0 = (f0.g0.a) r0
            java.lang.Object r4 = r15.f460c
            f0.g0$b r4 = (f0.g0.b) r4
            androidx.camera.view.PreviewView$g r6 = androidx.camera.view.PreviewView.g.IDLE
            java.util.concurrent.atomic.AtomicBoolean r7 = r0.f9535a
            boolean r7 = r7.get()
            if (r7 != 0) goto L_0x025d
            goto L_0x030e
        L_0x025d:
            java.lang.Throwable r7 = r4.f9539b
            if (r7 != 0) goto L_0x0263
            r8 = r1
            goto L_0x0264
        L_0x0263:
            r8 = r3
        L_0x0264:
            if (r8 == 0) goto L_0x02fb
            f0.j0$a<? super T> r0 = r0.f9536b
            if (r7 != 0) goto L_0x026c
            r7 = r1
            goto L_0x026d
        L_0x026c:
            r7 = r3
        L_0x026d:
            if (r7 == 0) goto L_0x02f3
            T r4 = r4.f9538a
            androidx.camera.view.a r0 = (androidx.camera.view.a) r0
            r0.getClass()
            f0.r$a r4 = (f0.r.a) r4
            f0.r$a r7 = f0.r.a.CLOSING
            if (r4 == r7) goto L_0x02e0
            f0.r$a r7 = f0.r.a.CLOSED
            if (r4 == r7) goto L_0x02e0
            f0.r$a r7 = f0.r.a.RELEASING
            if (r4 == r7) goto L_0x02e0
            f0.r$a r7 = f0.r.a.RELEASED
            if (r4 != r7) goto L_0x0289
            goto L_0x02e0
        L_0x0289:
            f0.r$a r2 = f0.r.a.OPENING
            if (r4 == r2) goto L_0x0295
            f0.r$a r2 = f0.r.a.OPEN
            if (r4 == r2) goto L_0x0295
            f0.r$a r2 = f0.r.a.PENDING_OPEN
            if (r4 != r2) goto L_0x030e
        L_0x0295:
            boolean r2 = r0.f1486f
            if (r2 != 0) goto L_0x030e
            f0.q r2 = r0.f1481a
            r0.a(r6)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            n0.f r4 = new n0.f
            r4.<init>(r1, r0, r2, r3)
            z0.b$d r4 = z0.b.a(r4)
            i0.d r4 = i0.d.a(r4)
            r0.b r6 = new r0.b
            r6.<init>(r0)
            h0.a r7 = j7.a.x()
            i0.d r4 = r4.d(r6, r7)
            ca.a r6 = new ca.a
            r6.<init>(r0, r5)
            h0.a r5 = j7.a.x()
            i0.b r4 = i0.f.f(r4, r6, r5)
            r0.f1485e = r4
            r0.c r5 = new r0.c
            r5.<init>(r0, r3, r2)
            h0.a r2 = j7.a.x()
            i0.f$b r3 = new i0.f$b
            r3.<init>(r4, r5)
            r4.b(r3, r2)
            r0.f1486f = r1
            goto L_0x030e
        L_0x02e0:
            r0.a(r6)
            boolean r1 = r0.f1486f
            if (r1 == 0) goto L_0x030e
            r0.f1486f = r3
            i0.d r1 = r0.f1485e
            if (r1 == 0) goto L_0x030e
            r1.cancel(r3)
            r0.f1485e = r2
            goto L_0x030e
        L_0x02f3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Result contains an error. Does not contain a value."
            r0.<init>(r1)
            throw r0
        L_0x02fb:
            r7.getClass()
            f0.j0$a<? super T> r0 = r0.f9536b
            androidx.camera.view.a r0 = (androidx.camera.view.a) r0
            i0.d r1 = r0.f1485e
            if (r1 == 0) goto L_0x030b
            r1.cancel(r3)
            r0.f1485e = r2
        L_0x030b:
            r0.a(r6)
        L_0x030e:
            return
        L_0x030f:
            java.lang.Object r0 = r15.f459b
            androidx.camera.core.impl.DeferrableSurface r0 = (androidx.camera.core.impl.DeferrableSurface) r0
            android.util.Size r2 = androidx.camera.core.impl.DeferrableSurface.f1309k
            r0.getClass()
            z0.b$d r2 = r0.f1317e     // Catch:{ Exception -> 0x032f }
            r2.get()     // Catch:{ Exception -> 0x032f }
            java.lang.String r2 = "Surface terminated"
            java.util.concurrent.atomic.AtomicInteger r5 = androidx.camera.core.impl.DeferrableSurface.f1312n     // Catch:{ Exception -> 0x032f }
            int r5 = r5.decrementAndGet()     // Catch:{ Exception -> 0x032f }
            java.util.concurrent.atomic.AtomicInteger r6 = androidx.camera.core.impl.DeferrableSurface.f1311m     // Catch:{ Exception -> 0x032f }
            int r6 = r6.get()     // Catch:{ Exception -> 0x032f }
            r0.f(r5, r6, r2)     // Catch:{ Exception -> 0x032f }
            return
        L_0x032f:
            r2 = move-exception
            java.lang.String r5 = "DeferrableSurface"
            r0.toString()
            c0.p0.b(r5)
            java.lang.Object r5 = r0.f1313a
            monitor-enter(r5)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x035c }
            java.lang.String r7 = "DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception."
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x035c }
            r8[r3] = r0     // Catch:{ all -> 0x035c }
            boolean r3 = r0.f1315c     // Catch:{ all -> 0x035c }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x035c }
            r8[r1] = r3     // Catch:{ all -> 0x035c }
            int r0 = r0.f1314b     // Catch:{ all -> 0x035c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x035c }
            r8[r4] = r0     // Catch:{ all -> 0x035c }
            java.lang.String r0 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x035c }
            r6.<init>(r0, r2)     // Catch:{ all -> 0x035c }
            throw r6     // Catch:{ all -> 0x035c }
        L_0x035c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x035c }
            throw r0
        L_0x035f:
            java.lang.Object r0 = r15.f459b
            e0.i0 r0 = (e0.i0) r0
            java.lang.Object r1 = r15.f460c
            c0.j0$g r1 = (c0.j0.g) r1
            c0.j0$e r0 = r0.f()
            java.util.Objects.requireNonNull(r0)
            java.util.Objects.requireNonNull(r1)
            r0.b()
            return
        L_0x0375:
            java.lang.Object r0 = r15.f459b
            e0.h0 r0 = (e0.h0) r0
            java.lang.Object r1 = r15.f460c
            e0.x r1 = (e0.x) r1
            java.util.ArrayList r0 = r0.f9009e
            r0.remove(r1)
            return
        L_0x0383:
            java.lang.Object r0 = r15.f459b
            e0.w r0 = (e0.w) r0
            java.lang.Object r1 = r15.f460c
            androidx.camera.core.ImageCaptureException r1 = (androidx.camera.core.ImageCaptureException) r1
            e0.f0 r0 = r0.f9055e
            e0.x r0 = (e0.x) r0
            r0.getClass()
            g0.m.a()
            boolean r2 = r0.f9065g
            if (r2 == 0) goto L_0x039a
            goto L_0x03bb
        L_0x039a:
            z0.b$d r2 = r0.f9061c
            boolean r2 = r2.isDone()
            java.lang.String r3 = "onImageCaptured() must be called before onFinalResult()"
            al.g0.E(r3, r2)
            r0.a()
            g0.m.a()
            e0.i0 r0 = r0.f9059a
            java.util.concurrent.Executor r2 = r0.a()
            v.n r3 = new v.n
            r4 = 12
            r3.<init>(r4, r0, r1)
            r2.execute(r3)
        L_0x03bb:
            return
        L_0x03bc:
            java.lang.Object r0 = r15.f459b
            e0.v r0 = (e0.v) r0
            java.lang.Object r1 = r15.f460c
            e0.v$b r1 = (e0.v.b) r1
            r0.getClass()
            e0.w r2 = r1.b()
            e0.w r3 = r1.b()     // Catch:{ ImageCaptureException -> 0x03fb, OutOfMemoryError -> 0x03ef, RuntimeException -> 0x03e3 }
            r3.getClass()     // Catch:{ ImageCaptureException -> 0x03fb, OutOfMemoryError -> 0x03ef, RuntimeException -> 0x03e3 }
            androidx.camera.core.d r0 = r0.b(r1)     // Catch:{ ImageCaptureException -> 0x03fb, OutOfMemoryError -> 0x03ef, RuntimeException -> 0x03e3 }
            h0.b r1 = j7.a.f0()     // Catch:{ ImageCaptureException -> 0x03fb, OutOfMemoryError -> 0x03ef, RuntimeException -> 0x03e3 }
            v.f r3 = new v.f     // Catch:{ ImageCaptureException -> 0x03fb, OutOfMemoryError -> 0x03ef, RuntimeException -> 0x03e3 }
            r3.<init>(r5, r2, r0)     // Catch:{ ImageCaptureException -> 0x03fb, OutOfMemoryError -> 0x03ef, RuntimeException -> 0x03e3 }
            r1.execute(r3)     // Catch:{ ImageCaptureException -> 0x03fb, OutOfMemoryError -> 0x03ef, RuntimeException -> 0x03e3 }
            goto L_0x03ff
        L_0x03e3:
            r0 = move-exception
            androidx.camera.core.ImageCaptureException r1 = new androidx.camera.core.ImageCaptureException
            java.lang.String r3 = "Processing failed."
            r1.<init>(r3, r0)
            e0.v.d(r2, r1)
            goto L_0x03ff
        L_0x03ef:
            r0 = move-exception
            androidx.camera.core.ImageCaptureException r1 = new androidx.camera.core.ImageCaptureException
            java.lang.String r3 = "Processing failed due to low memory."
            r1.<init>(r3, r0)
            e0.v.d(r2, r1)
            goto L_0x03ff
        L_0x03fb:
            r0 = move-exception
            e0.v.d(r2, r0)
        L_0x03ff:
            return
        L_0x0400:
            java.lang.Object r0 = r15.f459b
            w.z$a r0 = (w.z.a) r0
            java.lang.Object r1 = r15.f460c
            java.lang.String r1 = (java.lang.String) r1
            android.hardware.camera2.CameraManager$AvailabilityCallback r0 = r0.f16262b
            r0.onCameraAvailable(r1)
            return
        L_0x040e:
            java.lang.Object r0 = r15.f459b
            w.u$b r0 = (w.u.b) r0
            java.lang.Object r1 = r15.f460c
            android.hardware.camera2.CameraDevice r1 = (android.hardware.camera2.CameraDevice) r1
            android.hardware.camera2.CameraDevice$StateCallback r0 = r0.f16254a
            r0.onDisconnected(r1)
            return
        L_0x041c:
            java.lang.Object r0 = r15.f459b
            v.u r0 = (v.u) r0
            java.lang.Object r1 = r15.f460c
            java.util.List r1 = (java.util.List) r1
            r0.getClass()
            r0.H(r1)     // Catch:{ all -> 0x0430 }
            v.o r0 = r0.f15870o
            r0.j()
            return
        L_0x0430:
            r1 = move-exception
            v.o r0 = r0.f15870o
            r0.j()
            throw r1
        L_0x0437:
            java.lang.Object r0 = r15.f459b
            androidx.camera.core.impl.u$c r0 = (androidx.camera.core.impl.u.c) r0
            r0.a()
            return
        L_0x043f:
            java.lang.Object r0 = r15.f459b
            v.u r0 = (v.u) r0
            java.lang.Object r1 = r15.f460c
            java.lang.String r1 = (java.lang.String) r1
            r0.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Use case "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = " INACTIVE"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.s(r2)
            androidx.camera.core.impl.w r2 = r0.f15863a
            r2.e(r1)
            r0.K()
            return
        L_0x046c:
            java.lang.Object r0 = r15.f459b
            v.o$b r0 = (v.o.b) r0
            java.lang.Object r1 = r15.f460c
            android.hardware.camera2.TotalCaptureResult r1 = (android.hardware.camera2.TotalCaptureResult) r1
            int r2 = v.o.b.f15781c
            r0.getClass()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r3 = r0.f15782a
            java.util.Iterator r3 = r3.iterator()
        L_0x0484:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x049a
            java.lang.Object r4 = r3.next()
            v.o$c r4 = (v.o.c) r4
            boolean r5 = r4.a(r1)
            if (r5 == 0) goto L_0x0484
            r2.add(r4)
            goto L_0x0484
        L_0x049a:
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x04a5
            java.util.HashSet r0 = r0.f15782a
            r0.removeAll(r2)
        L_0x04a5:
            return
        L_0x04a6:
            java.lang.Object r0 = r15.f459b
            f0.f r0 = (f0.f) r0
            java.lang.Object r1 = r15.f460c
            j7.a r1 = (j7.a) r1
            r0.c(r1)
            return
        L_0x04b2:
            java.lang.Object r0 = r15.f459b
            v.o r0 = (v.o) r0
            java.lang.Object r2 = r15.f460c
            z0.b$a r2 = (z0.b.a) r2
            long r3 = r0.s()
            v.m r5 = new v.m
            r5.<init>(r0, r3)
            z0.b$d r0 = z0.b.a(r5)
            h0.a r3 = j7.a.x()
            i0.f.e(r1, r0, r2, r3)
            return
        L_0x04cf:
            java.lang.Object r0 = r15.f459b
            q.j r0 = (q.j) r0
            java.lang.Object r1 = r15.f460c
            q.l$b r1 = (q.l.b) r1
            q.n r0 = r0.f14194e0
            q.l$a r2 = r0.f14225e
            if (r2 != 0) goto L_0x04e4
            q.m r2 = new q.m
            r2.<init>()
            r0.f14225e = r2
        L_0x04e4:
            q.l$a r0 = r0.f14225e
            r0.c(r1)
            return
        L_0x04ea:
            java.lang.Object r0 = r15.f459b
            androidx.appcompat.app.q$a r0 = (androidx.appcompat.app.q.a) r0
            java.lang.Object r1 = r15.f460c
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.getClass()
            r1.run()     // Catch:{ all -> 0x04fc }
            r0.a()
            return
        L_0x04fc:
            r1 = move-exception
            r0.a()
            throw r1
        L_0x0501:
            java.lang.Object r0 = r15.f460c
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            java.lang.Object r1 = r15.f459b
            da.g$b r1 = (da.g.b) r1
            r0.run()     // Catch:{ Exception -> 0x050d }
            return
        L_0x050d:
            r0 = move-exception
            da.g$a r1 = (da.g.a) r1
            da.g r1 = da.g.this
            r1.q(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.p.run():void");
    }
}
