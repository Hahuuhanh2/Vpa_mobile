package d;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8434a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f8435b;

    public /* synthetic */ i(Object obj, int i10) {
        this.f8434a = i10;
        this.f8435b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0159, code lost:
        if (r3 == null) goto L_0x015b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x024c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            int r0 = r14.f8434a
            r1 = 26
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 2
            switch(r0) {
                case 0: goto L_0x0585;
                case 1: goto L_0x057d;
                case 2: goto L_0x0566;
                case 3: goto L_0x055e;
                case 4: goto L_0x0556;
                case 5: goto L_0x0505;
                case 6: goto L_0x0454;
                case 7: goto L_0x0444;
                case 8: goto L_0x0435;
                case 9: goto L_0x042a;
                case 10: goto L_0x0402;
                case 11: goto L_0x03eb;
                case 12: goto L_0x03e3;
                case 13: goto L_0x02ab;
                case 14: goto L_0x02a3;
                case 15: goto L_0x000b;
                case 16: goto L_0x029b;
                case 17: goto L_0x0277;
                case 18: goto L_0x0267;
                case 19: goto L_0x025d;
                case 20: goto L_0x01f8;
                case 21: goto L_0x01e9;
                case 22: goto L_0x01a0;
                case 23: goto L_0x0056;
                case 24: goto L_0x0049;
                case 25: goto L_0x003c;
                case 26: goto L_0x0027;
                case 27: goto L_0x001a;
                case 28: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x058d
        L_0x000d:
            java.lang.Object r0 = r14.f8435b
            com.vpa.daugia.module.auth.ui.activity.ChangePasswordActivity r0 = (com.vpa.daugia.module.auth.ui.activity.ChangePasswordActivity) r0
            java.lang.String r1 = "this$0"
            sk.j.f(r0, r1)
            r0.finish()
            return
        L_0x001a:
            java.lang.Object r0 = r14.f8435b
            com.vpa.daugia.module.auction.ui.activity.SessionAuctionActivity r0 = (com.vpa.daugia.module.auction.ui.activity.SessionAuctionActivity) r0
            java.lang.String r1 = "this$0"
            sk.j.f(r0, r1)
            r0.finish()
            return
        L_0x0027:
            java.lang.Object r0 = r14.f8435b
            com.ots.core.utils.customview.a r0 = (com.ots.core.utils.customview.a) r0
            java.lang.String r1 = "this$0"
            sk.j.f(r0, r1)
            hf.a r0 = r0.C0
            if (r0 == 0) goto L_0x003b
            com.google.android.material.button.MaterialButton r0 = r0.f10772x
            if (r0 == 0) goto L_0x003b
            r0.performClick()
        L_0x003b:
            return
        L_0x003c:
            java.lang.Object r0 = r14.f8435b
            android.view.View r0 = (android.view.View) r0
            java.lang.String r1 = "$this_clickWithDebounce"
            sk.j.f(r0, r1)
            r0.setClickable(r2)
            return
        L_0x0049:
            java.lang.Object r0 = r14.f8435b
            com.kizitonwose.calendar.view.internal.CalendarLayoutManager r0 = (com.kizitonwose.calendar.view.internal.CalendarLayoutManager) r0
            java.lang.String r1 = "this$0"
            sk.j.f(r0, r1)
            r0.w1()
            return
        L_0x0056:
            java.lang.Object r0 = r14.f8435b
            rb.d r0 = (rb.d) r0
            m9.d r4 = r0.f14550d
            r4.a()
            android.content.Context r4 = r4.f13218a
            r0.f14556q = r4
            java.lang.String r4 = r4.getPackageName()
            r0.f14561v = r4
            jb.a r4 = jb.a.e()
            r0.f14557r = r4
            rb.c r4 = new rb.c
            android.content.Context r5 = r0.f14556q
            sb.g r12 = new sb.g
            r7 = 100
            r9 = 1
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MINUTES
            r6 = r12
            r6.<init>(r7, r9, r11)
            r4.<init>(r5, r12)
            r0.f14558s = r4
            ib.a r4 = ib.a.a()
            r0.f14559t = r4
            rb.a r4 = new rb.a
            za.b<c6.g> r5 = r0.f14553n
            jb.a r6 = r0.f14557r
            r6.getClass()
            jb.f r7 = jb.f.f11846b
            java.lang.Class<jb.f> r7 = jb.f.class
            monitor-enter(r7)
            jb.f r8 = jb.f.f11846b     // Catch:{ all -> 0x019d }
            if (r8 != 0) goto L_0x00a3
            jb.f r8 = new jb.f     // Catch:{ all -> 0x019d }
            r8.<init>()     // Catch:{ all -> 0x019d }
            jb.f.f11846b = r8     // Catch:{ all -> 0x019d }
        L_0x00a3:
            jb.f r8 = jb.f.f11846b     // Catch:{ all -> 0x019d }
            monitor-exit(r7)
            java.lang.Boolean r7 = hb.a.f10696a
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x00b4
            r8.getClass()
            java.lang.String r6 = "FIREPERF"
            goto L_0x00ff
        L_0x00b4:
            r8.getClass()
            java.lang.String r7 = "fpr_log_source"
            com.google.firebase.perf.config.RemoteConfigManager r9 = r6.f11839a
            r10 = -1
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.Object r7 = r9.getRemoteConfigValueOrDefault(r7, r10)
            java.lang.Long r7 = (java.lang.Long) r7
            long r9 = r7.longValue()
            java.lang.String r7 = "com.google.firebase.perf.LogSourceName"
            java.util.Map<java.lang.Long, java.lang.String> r11 = jb.f.f11847c
            java.lang.Long r12 = java.lang.Long.valueOf(r9)
            boolean r12 = r11.containsKey(r12)
            if (r12 == 0) goto L_0x00ec
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.lang.Object r9 = r11.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x00ec
            jb.v r6 = r6.f11841c
            r6.e(r7, r9)
            r6 = r9
            goto L_0x00ff
        L_0x00ec:
            sb.e r6 = r6.d(r8)
            boolean r7 = r6.b()
            if (r7 == 0) goto L_0x00fd
            java.lang.Object r6 = r6.a()
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x00ff
        L_0x00fd:
            java.lang.String r6 = "FIREPERF"
        L_0x00ff:
            r4.<init>(r5, r6)
            r0.f14554o = r4
            ib.a r4 = r0.f14559t
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            rb.d r6 = rb.d.f14546z
            r5.<init>(r6)
            java.util.HashSet r6 = r4.f11403f
            monitor-enter(r6)
            java.util.HashSet r4 = r4.f11403f     // Catch:{ all -> 0x019a }
            r4.add(r5)     // Catch:{ all -> 0x019a }
            monitor-exit(r6)     // Catch:{ all -> 0x019a }
            tb.c$a r4 = tb.c.R()
            r0.f14560u = r4
            m9.d r5 = r0.f14550d
            r5.a()
            m9.e r5 = r5.f13220c
            java.lang.String r5 = r5.f13232b
            r4.s()
            MessageType r6 = r4.f7906b
            tb.c r6 = (tb.c) r6
            tb.c.G(r6, r5)
            tb.a$a r5 = tb.a.M()
            java.lang.String r6 = r0.f14561v
            r5.s()
            MessageType r7 = r5.f7906b
            tb.a r7 = (tb.a) r7
            tb.a.G(r7, r6)
            r5.s()
            MessageType r6 = r5.f7906b
            tb.a r6 = (tb.a) r6
            tb.a.H(r6)
            android.content.Context r6 = r0.f14556q
            android.content.pm.PackageManager r7 = r6.getPackageManager()     // Catch:{ NameNotFoundException -> 0x015b }
            java.lang.String r6 = r6.getPackageName()     // Catch:{ NameNotFoundException -> 0x015b }
            android.content.pm.PackageInfo r3 = r7.getPackageInfo(r6, r3)     // Catch:{ NameNotFoundException -> 0x015b }
            java.lang.String r3 = r3.versionName     // Catch:{ NameNotFoundException -> 0x015b }
            if (r3 != 0) goto L_0x015d
        L_0x015b:
            java.lang.String r3 = ""
        L_0x015d:
            r5.s()
            MessageType r6 = r5.f7906b
            tb.a r6 = (tb.a) r6
            tb.a.I(r6, r3)
            r4.s()
            MessageType r3 = r4.f7906b
            tb.c r3 = (tb.c) r3
            com.google.protobuf.i r4 = r5.q()
            tb.a r4 = (tb.a) r4
            tb.c.K(r3, r4)
            java.util.concurrent.atomic.AtomicBoolean r3 = r0.f14549c
            r3.set(r2)
        L_0x017c:
            java.util.concurrent.ConcurrentLinkedQueue<rb.b> r2 = r0.f14548b
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0199
            java.util.concurrent.ConcurrentLinkedQueue<rb.b> r2 = r0.f14548b
            java.lang.Object r2 = r2.poll()
            rb.b r2 = (rb.b) r2
            if (r2 == 0) goto L_0x017c
            java.util.concurrent.ThreadPoolExecutor r3 = r0.f14555p
            v.f r4 = new v.f
            r4.<init>(r1, r0, r2)
            r3.execute(r4)
            goto L_0x017c
        L_0x0199:
            return
        L_0x019a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x019a }
            throw r0
        L_0x019d:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x01a0:
            java.lang.Object r0 = r14.f8435b
            com.google.firebase.perf.metrics.AppStartTrace r0 = (com.google.firebase.perf.metrics.AppStartTrace) r0
            com.google.firebase.perf.util.Timer r1 = r0.f7638w
            if (r1 == 0) goto L_0x01a9
            goto L_0x01e8
        L_0x01a9:
            lb.b r1 = r0.f7625c
            r1.getClass()
            com.google.firebase.perf.util.Timer r1 = new com.google.firebase.perf.util.Timer
            r1.<init>()
            r0.f7638w = r1
            tb.m$a r1 = r0.f7627e
            tb.m$a r2 = tb.m.Z()
            java.lang.String r3 = "_experiment_preDrawFoQ"
            r2.A(r3)
            com.google.firebase.perf.util.Timer r3 = r0.b()
            long r3 = r3.f7662a
            r2.y(r3)
            com.google.firebase.perf.util.Timer r3 = r0.b()
            com.google.firebase.perf.util.Timer r4 = r0.f7638w
            r3.getClass()
            long r4 = r4.f7663b
            long r6 = r3.f7663b
            long r4 = r4 - r6
            r2.z(r4)
            com.google.protobuf.i r2 = r2.q()
            tb.m r2 = (tb.m) r2
            r1.w(r2)
            tb.m$a r1 = r0.f7627e
            r0.d(r1)
        L_0x01e8:
            return
        L_0x01e9:
            java.lang.Object r0 = r14.f8435b
            com.google.firebase.messaging.c$a r0 = (com.google.firebase.messaging.c.a) r0
            android.content.Intent r1 = r0.f7621a
            r1.getAction()
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r0 = r0.f7622b
            r0.trySetResult(r4)
            return
        L_0x01f8:
            java.lang.Object r0 = r14.f8435b
            com.google.firebase.messaging.FirebaseMessaging r0 = (com.google.firebase.messaging.FirebaseMessaging) r0
            android.content.Context r0 = r0.f7589d
            android.content.Context r1 = r0.getApplicationContext()
            if (r1 != 0) goto L_0x0205
            r1 = r0
        L_0x0205:
            java.lang.String r5 = "com.google.firebase.messaging"
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r5, r3)
            java.lang.String r5 = "proxy_notification_initialized"
            boolean r1 = r1.getBoolean(r5, r3)
            if (r1 == 0) goto L_0x0214
            goto L_0x025c
        L_0x0214:
            java.lang.String r1 = "firebase_messaging_notification_delegation_enabled"
            android.content.Context r5 = r0.getApplicationContext()     // Catch:{ NameNotFoundException -> 0x023d }
            android.content.pm.PackageManager r6 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x023d }
            if (r6 == 0) goto L_0x023d
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x023d }
            r7 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r5 = r6.getApplicationInfo(r5, r7)     // Catch:{ NameNotFoundException -> 0x023d }
            if (r5 == 0) goto L_0x023d
            android.os.Bundle r6 = r5.metaData     // Catch:{ NameNotFoundException -> 0x023d }
            if (r6 == 0) goto L_0x023d
            boolean r6 = r6.containsKey(r1)     // Catch:{ NameNotFoundException -> 0x023d }
            if (r6 == 0) goto L_0x023d
            android.os.Bundle r5 = r5.metaData     // Catch:{ NameNotFoundException -> 0x023d }
            boolean r1 = r5.getBoolean(r1)     // Catch:{ NameNotFoundException -> 0x023d }
            goto L_0x023e
        L_0x023d:
            r1 = r2
        L_0x023e:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 29
            if (r5 < r6) goto L_0x0245
            goto L_0x0246
        L_0x0245:
            r2 = r3
        L_0x0246:
            if (r2 != 0) goto L_0x024c
            com.google.android.gms.tasks.Tasks.forResult(r4)
            goto L_0x025c
        L_0x024c:
            com.google.android.gms.tasks.TaskCompletionSource r2 = new com.google.android.gms.tasks.TaskCompletionSource
            r2.<init>()
            p3.q r3 = new p3.q
            r3.<init>(r0, r1, r2)
            r3.run()
            r2.getTask()
        L_0x025c:
            return
        L_0x025d:
            java.lang.Object r0 = r14.f8435b
            v9.f r0 = (v9.f) r0
            v9.e r0 = r0.f16101a
            r0.getClass()
            throw r4
        L_0x0267:
            java.lang.Object r0 = r14.f8435b
            com.google.android.material.textfield.k r0 = (com.google.android.material.textfield.k) r0
            android.widget.AutoCompleteTextView r1 = r0.f7037h
            boolean r1 = r1.isPopupShowing()
            r0.t(r1)
            r0.f7042m = r1
            return
        L_0x0277:
            java.lang.Object r0 = r14.f8435b
            com.google.android.material.sidesheet.SideSheetBehavior$c r0 = (com.google.android.material.sidesheet.SideSheetBehavior.c) r0
            r0.f6748b = r3
            com.google.android.material.sidesheet.SideSheetBehavior r1 = com.google.android.material.sidesheet.SideSheetBehavior.this
            c2.c r1 = r1.f6733p
            if (r1 == 0) goto L_0x028f
            boolean r1 = r1.h()
            if (r1 == 0) goto L_0x028f
            int r1 = r0.f6747a
            r0.a(r1)
            goto L_0x029a
        L_0x028f:
            com.google.android.material.sidesheet.SideSheetBehavior r1 = com.google.android.material.sidesheet.SideSheetBehavior.this
            int r2 = r1.f6732o
            if (r2 != r5) goto L_0x029a
            int r0 = r0.f6747a
            r1.y(r0)
        L_0x029a:
            return
        L_0x029b:
            java.lang.Object r0 = r14.f8435b
            f8.c r0 = (f8.c) r0
            r0.a(r2)
            return
        L_0x02a3:
            java.lang.Object r0 = r14.f8435b
            com.google.android.material.carousel.CarouselLayoutManager r0 = (com.google.android.material.carousel.CarouselLayoutManager) r0
            r0.i1()
            return
        L_0x02ab:
            java.lang.Object r0 = r14.f8435b
            androidx.work.impl.workers.ConstraintTrackingWorker r0 = (androidx.work.impl.workers.ConstraintTrackingWorker) r0
            java.lang.String r1 = "this$0"
            sk.j.f(r0, r1)
            z3.c<androidx.work.d$a> r1 = r0.f3854o
            java.lang.Object r1 = r1.f17841a
            boolean r1 = r1 instanceof z3.a.b
            if (r1 == 0) goto L_0x02be
            goto L_0x03e2
        L_0x02be:
            androidx.work.WorkerParameters r1 = r0.f3757b
            androidx.work.c r1 = r1.f3734b
            java.lang.String r5 = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"
            java.util.HashMap r1 = r1.f3754a
            java.lang.Object r1 = r1.get(r5)
            boolean r5 = r1 instanceof java.lang.String
            if (r5 == 0) goto L_0x02d1
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
        L_0x02d1:
            o3.j r1 = o3.j.a()
            java.lang.String r5 = "get()"
            sk.j.e(r1, r5)
            if (r4 == 0) goto L_0x02e4
            int r1 = r4.length()
            if (r1 != 0) goto L_0x02e3
            goto L_0x02e4
        L_0x02e3:
            r2 = r3
        L_0x02e4:
            if (r2 == 0) goto L_0x02f9
            int r1 = b4.a.f4000a
            z3.c<androidx.work.d$a> r0 = r0.f3854o
            java.lang.String r1 = "future"
            sk.j.e(r0, r1)
            androidx.work.d$a$a r1 = new androidx.work.d$a$a
            r1.<init>()
            r0.i(r1)
            goto L_0x03e2
        L_0x02f9:
            androidx.work.WorkerParameters r1 = r0.f3757b
            o3.s r1 = r1.f3737e
            android.content.Context r2 = r0.f3756a
            androidx.work.WorkerParameters r3 = r0.f3851e
            androidx.work.d r1 = r1.a(r2, r4, r3)
            r0.f3855p = r1
            if (r1 != 0) goto L_0x031c
            int r1 = b4.a.f4000a
            z3.c<androidx.work.d$a> r0 = r0.f3854o
            java.lang.String r1 = "future"
            sk.j.e(r0, r1)
            androidx.work.d$a$a r1 = new androidx.work.d$a$a
            r1.<init>()
            r0.i(r1)
            goto L_0x03e2
        L_0x031c:
            android.content.Context r1 = r0.f3756a
            p3.j0 r1 = p3.j0.b(r1)
            java.lang.String r2 = "getInstance(applicationContext)"
            sk.j.e(r1, r2)
            androidx.work.impl.WorkDatabase r2 = r1.f13939c
            x3.t r2 = r2.u()
            androidx.work.WorkerParameters r3 = r0.f3757b
            java.util.UUID r3 = r3.f3733a
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "id.toString()"
            sk.j.e(r3, r4)
            x3.s r2 = r2.t(r3)
            if (r2 != 0) goto L_0x0353
            z3.c<androidx.work.d$a> r0 = r0.f3854o
            java.lang.String r1 = "future"
            sk.j.e(r0, r1)
            int r1 = b4.a.f4000a
            androidx.work.d$a$a r1 = new androidx.work.d$a$a
            r1.<init>()
            r0.i(r1)
            goto L_0x03e2
        L_0x0353:
            t3.e r3 = new t3.e
            v3.l r4 = r1.f13946j
            java.lang.String r5 = "workManagerImpl.trackers"
            sk.j.e(r4, r5)
            r3.<init>(r4)
            a4.b r1 = r1.f13940d
            al.c1 r1 = r1.a()
            java.lang.String r4 = "workManagerImpl.workTask…r.taskCoroutineDispatcher"
            sk.j.e(r1, r4)
            al.k1 r1 = t3.h.a(r3, r2, r1, r0)
            z3.c<androidx.work.d$a> r4 = r0.f3854o
            d.d r5 = new d.d
            r6 = 23
            r5.<init>(r1, r6)
            y3.s r1 = new y3.s
            r1.<init>()
            r4.b(r5, r1)
            boolean r1 = r3.a(r2)
            if (r1 == 0) goto L_0x03d1
            int r1 = b4.a.f4000a
            androidx.work.d r1 = r0.f3855p     // Catch:{ all -> 0x03a4 }
            sk.j.c(r1)     // Catch:{ all -> 0x03a4 }
            z3.c r1 = r1.c()     // Catch:{ all -> 0x03a4 }
            java.lang.String r2 = "delegate!!.startWork()"
            sk.j.e(r1, r2)     // Catch:{ all -> 0x03a4 }
            v.n r2 = new v.n     // Catch:{ all -> 0x03a4 }
            r3 = 22
            r2.<init>(r3, r0, r1)     // Catch:{ all -> 0x03a4 }
            androidx.work.WorkerParameters r3 = r0.f3757b     // Catch:{ all -> 0x03a4 }
            java.util.concurrent.Executor r3 = r3.f3735c     // Catch:{ all -> 0x03a4 }
            r1.b(r2, r3)     // Catch:{ all -> 0x03a4 }
            goto L_0x03e2
        L_0x03a4:
            int r1 = b4.a.f4000a
            java.lang.Object r1 = r0.f3852f
            monitor-enter(r1)
            boolean r2 = r0.f3853n     // Catch:{ all -> 0x03ce }
            if (r2 == 0) goto L_0x03bd
            z3.c<androidx.work.d$a> r0 = r0.f3854o     // Catch:{ all -> 0x03ce }
            java.lang.String r2 = "future"
            sk.j.e(r0, r2)     // Catch:{ all -> 0x03ce }
            androidx.work.d$a$b r2 = new androidx.work.d$a$b     // Catch:{ all -> 0x03ce }
            r2.<init>()     // Catch:{ all -> 0x03ce }
            r0.i(r2)     // Catch:{ all -> 0x03ce }
            goto L_0x03cc
        L_0x03bd:
            z3.c<androidx.work.d$a> r0 = r0.f3854o     // Catch:{ all -> 0x03ce }
            java.lang.String r2 = "future"
            sk.j.e(r0, r2)     // Catch:{ all -> 0x03ce }
            androidx.work.d$a$a r2 = new androidx.work.d$a$a     // Catch:{ all -> 0x03ce }
            r2.<init>()     // Catch:{ all -> 0x03ce }
            r0.i(r2)     // Catch:{ all -> 0x03ce }
        L_0x03cc:
            monitor-exit(r1)
            goto L_0x03e2
        L_0x03ce:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x03d1:
            int r1 = b4.a.f4000a
            z3.c<androidx.work.d$a> r0 = r0.f3854o
            java.lang.String r1 = "future"
            sk.j.e(r0, r1)
            androidx.work.d$a$b r1 = new androidx.work.d$a$b
            r1.<init>()
            r0.i(r1)
        L_0x03e2:
            return
        L_0x03e3:
            java.lang.Object r0 = r14.f8435b
            androidx.work.impl.background.systemalarm.c r0 = (androidx.work.impl.background.systemalarm.c) r0
            androidx.work.impl.background.systemalarm.c.b(r0)
            return
        L_0x03eb:
            java.lang.Object r0 = r14.f8435b
            androidx.work.CoroutineWorker r0 = (androidx.work.CoroutineWorker) r0
            java.lang.String r1 = "this$0"
            sk.j.f(r0, r1)
            z3.c<androidx.work.d$a> r1 = r0.f3724f
            java.lang.Object r1 = r1.f17841a
            boolean r1 = r1 instanceof z3.a.b
            if (r1 == 0) goto L_0x0401
            al.k1 r0 = r0.f3723e
            r0.cancel((java.util.concurrent.CancellationException) r4)
        L_0x0401:
            return
        L_0x0402:
            java.lang.Object r0 = r14.f8435b
            x2.j r0 = (x2.j) r0
            java.lang.String r1 = "this$0"
            sk.j.f(r0, r1)
            x2.f r1 = r0.f16935f     // Catch:{ RemoteException -> 0x0429 }
            if (r1 == 0) goto L_0x0429
            x2.j$b r2 = r0.f16936g     // Catch:{ RemoteException -> 0x0429 }
            java.lang.String r3 = r0.f16930a     // Catch:{ RemoteException -> 0x0429 }
            int r1 = r1.k(r2, r3)     // Catch:{ RemoteException -> 0x0429 }
            r0.f16933d = r1     // Catch:{ RemoteException -> 0x0429 }
            x2.h r1 = r0.f16931b     // Catch:{ RemoteException -> 0x0429 }
            x2.h$c r0 = r0.f16934e     // Catch:{ RemoteException -> 0x0429 }
            if (r0 == 0) goto L_0x0423
            r1.a(r0)     // Catch:{ RemoteException -> 0x0429 }
            goto L_0x0429
        L_0x0423:
            java.lang.String r0 = "observer"
            sk.j.l(r0)     // Catch:{ RemoteException -> 0x0429 }
            throw r4     // Catch:{ RemoteException -> 0x0429 }
        L_0x0429:
            return
        L_0x042a:
            java.lang.Object r0 = r14.f8435b
            android.support.v4.media.a.s(r0)
            java.lang.String r0 = "this$0"
            sk.j.f(r4, r0)
            throw r4
        L_0x0435:
            java.lang.Object r0 = r14.f8435b
            android.content.Context r0 = (android.content.Context) r0
            w2.b r1 = new w2.b
            r1.<init>(r2)
            androidx.profileinstaller.c$a r2 = androidx.profileinstaller.c.f2922a
            androidx.profileinstaller.c.b(r0, r1, r2, r3)
            return
        L_0x0444:
            java.lang.Object r0 = r14.f8435b
            androidx.core.widget.ContentLoadingProgressBar r0 = (androidx.core.widget.ContentLoadingProgressBar) r0
            int r1 = androidx.core.widget.ContentLoadingProgressBar.f2130c
            r0.getClass()
            java.lang.System.currentTimeMillis()
            r0.setVisibility(r3)
            return
        L_0x0454:
            java.lang.Object r0 = r14.f8435b
            android.app.Activity r0 = (android.app.Activity) r0
            int r6 = i1.a.f10925a
            boolean r6 = r0.isFinishing()
            if (r6 != 0) goto L_0x0504
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 28
            if (r6 < r7) goto L_0x046d
            java.lang.Class<?> r1 = i1.e.f10932a
            r0.recreate()
            goto L_0x04ff
        L_0x046d:
            java.lang.Class<?> r7 = i1.e.f10932a
            r7 = 27
            if (r6 == r1) goto L_0x0478
            if (r6 != r7) goto L_0x0476
            goto L_0x0478
        L_0x0476:
            r8 = r3
            goto L_0x0479
        L_0x0478:
            r8 = r2
        L_0x0479:
            if (r8 == 0) goto L_0x0481
            java.lang.reflect.Method r8 = i1.e.f10937f
            if (r8 != 0) goto L_0x0481
            goto L_0x04fe
        L_0x0481:
            java.lang.reflect.Method r8 = i1.e.f10936e
            if (r8 != 0) goto L_0x048b
            java.lang.reflect.Method r8 = i1.e.f10935d
            if (r8 != 0) goto L_0x048b
            goto L_0x04fe
        L_0x048b:
            java.lang.reflect.Field r8 = i1.e.f10934c     // Catch:{ all -> 0x04fe }
            java.lang.Object r8 = r8.get(r0)     // Catch:{ all -> 0x04fe }
            if (r8 != 0) goto L_0x0494
            goto L_0x04fe
        L_0x0494:
            java.lang.reflect.Field r9 = i1.e.f10933b     // Catch:{ all -> 0x04fe }
            java.lang.Object r9 = r9.get(r0)     // Catch:{ all -> 0x04fe }
            if (r9 != 0) goto L_0x049d
            goto L_0x04fe
        L_0x049d:
            android.app.Application r10 = r0.getApplication()     // Catch:{ all -> 0x04fe }
            i1.e$a r11 = new i1.e$a     // Catch:{ all -> 0x04fe }
            r11.<init>(r0)     // Catch:{ all -> 0x04fe }
            r10.registerActivityLifecycleCallbacks(r11)     // Catch:{ all -> 0x04fe }
            android.os.Handler r12 = i1.e.f10938g     // Catch:{ all -> 0x04fe }
            i1.b r13 = new i1.b     // Catch:{ all -> 0x04fe }
            r13.<init>(r11, r8)     // Catch:{ all -> 0x04fe }
            r12.post(r13)     // Catch:{ all -> 0x04fe }
            if (r6 == r1) goto L_0x04ba
            if (r6 != r7) goto L_0x04b8
            goto L_0x04ba
        L_0x04b8:
            r1 = r3
            goto L_0x04bb
        L_0x04ba:
            r1 = r2
        L_0x04bb:
            if (r1 == 0) goto L_0x04e6
            java.lang.reflect.Method r1 = i1.e.f10937f     // Catch:{ all -> 0x04f2 }
            r6 = 9
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x04f2 }
            r6[r3] = r8     // Catch:{ all -> 0x04f2 }
            r6[r2] = r4     // Catch:{ all -> 0x04f2 }
            r6[r5] = r4     // Catch:{ all -> 0x04f2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x04f2 }
            r7 = 3
            r6[r7] = r5     // Catch:{ all -> 0x04f2 }
            r5 = 4
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x04f2 }
            r6[r5] = r7     // Catch:{ all -> 0x04f2 }
            r5 = 5
            r6[r5] = r4     // Catch:{ all -> 0x04f2 }
            r5 = 6
            r6[r5] = r4     // Catch:{ all -> 0x04f2 }
            r4 = 7
            r6[r4] = r7     // Catch:{ all -> 0x04f2 }
            r4 = 8
            r6[r4] = r7     // Catch:{ all -> 0x04f2 }
            r1.invoke(r9, r6)     // Catch:{ all -> 0x04f2 }
            goto L_0x04e9
        L_0x04e6:
            r0.recreate()     // Catch:{ all -> 0x04f2 }
        L_0x04e9:
            i1.c r1 = new i1.c     // Catch:{ all -> 0x04fe }
            r1.<init>(r10, r11)     // Catch:{ all -> 0x04fe }
            r12.post(r1)     // Catch:{ all -> 0x04fe }
            goto L_0x04ff
        L_0x04f2:
            r1 = move-exception
            android.os.Handler r2 = i1.e.f10938g     // Catch:{ all -> 0x04fe }
            i1.c r4 = new i1.c     // Catch:{ all -> 0x04fe }
            r4.<init>(r10, r11)     // Catch:{ all -> 0x04fe }
            r2.post(r4)     // Catch:{ all -> 0x04fe }
            throw r1     // Catch:{ all -> 0x04fe }
        L_0x04fe:
            r2 = r3
        L_0x04ff:
            if (r2 != 0) goto L_0x0504
            r0.recreate()
        L_0x0504:
            return
        L_0x0505:
            java.lang.Object r0 = r14.f8435b
            androidx.constraintlayout.helper.widget.Carousel r0 = (androidx.constraintlayout.helper.widget.Carousel) r0
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.f1533w
            int r2 = r0.J
            r1.setTransitionDuration(r2)
            int r1 = r0.I
            int r2 = r0.f1532v
            if (r1 >= r2) goto L_0x0536
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.f1533w
            int r2 = r0.B
            int r0 = r0.J
            boolean r3 = r1.isAttachedToWindow()
            if (r3 != 0) goto L_0x0532
            androidx.constraintlayout.motion.widget.MotionLayout$g r0 = r1.B0
            if (r0 != 0) goto L_0x052d
            androidx.constraintlayout.motion.widget.MotionLayout$g r0 = new androidx.constraintlayout.motion.widget.MotionLayout$g
            r0.<init>()
            r1.B0 = r0
        L_0x052d:
            androidx.constraintlayout.motion.widget.MotionLayout$g r0 = r1.B0
            r0.f1633d = r2
            goto L_0x0555
        L_0x0532:
            r1.E(r2, r0)
            goto L_0x0555
        L_0x0536:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.f1533w
            int r2 = r0.C
            int r0 = r0.J
            boolean r3 = r1.isAttachedToWindow()
            if (r3 != 0) goto L_0x0552
            androidx.constraintlayout.motion.widget.MotionLayout$g r0 = r1.B0
            if (r0 != 0) goto L_0x054d
            androidx.constraintlayout.motion.widget.MotionLayout$g r0 = new androidx.constraintlayout.motion.widget.MotionLayout$g
            r0.<init>()
            r1.B0 = r0
        L_0x054d:
            androidx.constraintlayout.motion.widget.MotionLayout$g r0 = r1.B0
            r0.f1633d = r2
            goto L_0x0555
        L_0x0552:
            r1.E(r2, r0)
        L_0x0555:
            return
        L_0x0556:
            java.lang.Object r0 = r14.f8435b
            v.z1 r0 = (v.z1) r0
            v.z1.u(r0)
            return
        L_0x055e:
            java.lang.Object r0 = r14.f8435b
            v.x1 r0 = (v.x1) r0
            r0.q(r0)
            return
        L_0x0566:
            java.lang.Object r0 = r14.f8435b
            q.j r0 = (q.j) r0
            q.n r0 = r0.f14194e0
            q.l$a r1 = r0.f14225e
            if (r1 != 0) goto L_0x0577
            q.m r1 = new q.m
            r1.<init>()
            r0.f14225e = r1
        L_0x0577:
            q.l$a r0 = r0.f14225e
            r0.b()
            return
        L_0x057d:
            java.lang.Object r0 = r14.f8435b
            androidx.appcompat.widget.r0 r0 = (androidx.appcompat.widget.r0) r0
            r0.a()
            return
        L_0x0585:
            java.lang.Object r0 = r14.f8435b
            d.j r0 = (d.j) r0
            d.j.a(r0)
            return
        L_0x058d:
            java.lang.Object r0 = r14.f8435b
            com.vpa.daugia.module.auth.ui.activity.StepFourActivity r0 = (com.vpa.daugia.module.auth.ui.activity.StepFourActivity) r0
            int r1 = com.vpa.daugia.module.auth.ui.activity.StepFourActivity.R
            java.lang.String r1 = "this$0"
            sk.j.f(r0, r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.vpa.daugia.ui.MainActivity> r2 = com.vpa.daugia.ui.MainActivity.class
            r1.<init>(r0, r2)
            r0.startActivity(r1)
            r0.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.i.run():void");
    }
}
