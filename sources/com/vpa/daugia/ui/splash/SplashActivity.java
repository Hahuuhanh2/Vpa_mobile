package com.vpa.daugia.ui.splash;

import android.annotation.SuppressLint;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import com.vpa.daugia.C0535R$layout;
import mg.r1;
import r2.w;
import sk.k;
import sk.s;

@SuppressLint({"CustomSplashScreen"})
/* compiled from: SplashActivity.kt */
public final class SplashActivity extends Hilt_SplashActivity<r1> {
    public static final /* synthetic */ int T = 0;
    public final d0 R = new d0(s.a(SplashViewModel.class), new b(this), new a(this), new c(this));
    public lg.b S;

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class a extends k implements rk.a<f0.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19924a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ComponentActivity componentActivity) {
            super(0);
            this.f19924a = componentActivity;
        }

        public final Object invoke() {
            return this.f19924a.f();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class b extends k implements rk.a<w> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19925a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f19925a = componentActivity;
        }

        public final Object invoke() {
            return this.f19925a.n();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    public static final class c extends k implements rk.a<s2.a> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f19926a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f19926a = componentActivity;
        }

        public final Object invoke() {
            return this.f19926a.g();
        }
    }

    public final int N() {
        return C0535R$layout.activity_splash;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fc  */
    public final void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            super.onCreate(r14)
            kf.a r14 = r13.L()
            androidx.lifecycle.o r0 = r13.f270d
            java.lang.String r1 = "<get-lifecycle>(...)"
            sk.j.e(r0, r1)
            r14.a(r0)
            com.google.firebase.analytics.FirebaseAnalytics r14 = com.google.firebase.analytics.FirebaseAnalytics.getInstance(r13)
            java.lang.String r0 = "getInstance(...)"
            sk.j.e(r14, r0)
            m9.d r14 = m9.d.d()
            java.lang.Class<vb.h> r0 = vb.h.class
            java.lang.Object r14 = r14.b(r0)
            vb.h r14 = (vb.h) r14
            java.lang.String r0 = "firebase"
            vb.e r14 = r14.a(r0)
            java.lang.String r0 = "getInstance(...)"
            sk.j.e(r14, r0)
            android.content.Context r0 = r14.f16142a
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
            r3 = 3
            r4 = 1
            r5 = 0
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x00b0 }
            if (r0 != 0) goto L_0x0044
            goto L_0x00b0
        L_0x0044:
            r6 = 2132213768(0x7f170008, float:2.0071359E38)
            android.content.res.XmlResourceParser r0 = r0.getXml(r6)     // Catch:{ IOException | XmlPullParserException -> 0x00b0 }
            int r6 = r0.getEventType()     // Catch:{ IOException | XmlPullParserException -> 0x00b0 }
            r7 = r5
            r8 = r7
            r9 = r8
        L_0x0052:
            if (r6 == r4) goto L_0x00b0
            r10 = 2
            if (r6 != r10) goto L_0x005c
            java.lang.String r7 = r0.getName()     // Catch:{ IOException | XmlPullParserException -> 0x00b0 }
            goto L_0x00ab
        L_0x005c:
            if (r6 != r3) goto L_0x0075
            java.lang.String r6 = r0.getName()     // Catch:{ IOException | XmlPullParserException -> 0x00b0 }
            java.lang.String r7 = "entry"
            boolean r6 = r6.equals(r7)     // Catch:{ IOException | XmlPullParserException -> 0x00b0 }
            if (r6 == 0) goto L_0x0073
            if (r8 == 0) goto L_0x0071
            if (r9 == 0) goto L_0x0071
            r1.put(r8, r9)     // Catch:{ IOException | XmlPullParserException -> 0x00b0 }
        L_0x0071:
            r8 = r5
            r9 = r8
        L_0x0073:
            r7 = r5
            goto L_0x00ab
        L_0x0075:
            r10 = 4
            if (r6 != r10) goto L_0x00ab
            if (r7 == 0) goto L_0x00ab
            r6 = -1
            int r10 = r7.hashCode()     // Catch:{ IOException | XmlPullParserException -> 0x00b0 }
            r11 = 106079(0x19e5f, float:1.48648E-40)
            if (r10 == r11) goto L_0x0094
            r11 = 111972721(0x6ac9171, float:6.4912916E-35)
            if (r10 == r11) goto L_0x008a
            goto L_0x009d
        L_0x008a:
            java.lang.String r10 = "value"
            boolean r10 = r7.equals(r10)     // Catch:{ IOException | XmlPullParserException -> 0x00b0 }
            if (r10 == 0) goto L_0x009d
            r6 = r4
            goto L_0x009d
        L_0x0094:
            java.lang.String r10 = "key"
            boolean r10 = r7.equals(r10)     // Catch:{ IOException | XmlPullParserException -> 0x00b0 }
            if (r10 == 0) goto L_0x009d
            r6 = r2
        L_0x009d:
            if (r6 == 0) goto L_0x00a7
            if (r6 == r4) goto L_0x00a2
            goto L_0x00ab
        L_0x00a2:
            java.lang.String r9 = r0.getText()     // Catch:{ IOException | XmlPullParserException -> 0x00b0 }
            goto L_0x00ab
        L_0x00a7:
            java.lang.String r8 = r0.getText()     // Catch:{ IOException | XmlPullParserException -> 0x00b0 }
        L_0x00ab:
            int r6 = r0.next()     // Catch:{ IOException | XmlPullParserException -> 0x00b0 }
            goto L_0x0052
        L_0x00b0:
            java.util.Date r0 = wb.d.f16764g     // Catch:{ JSONException -> 0x00e1 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00e1 }
            r0.<init>()     // Catch:{ JSONException -> 0x00e1 }
            java.util.Date r8 = wb.d.f16764g     // Catch:{ JSONException -> 0x00e1 }
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00e1 }
            r9.<init>()     // Catch:{ JSONException -> 0x00e1 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00e1 }
            r10.<init>()     // Catch:{ JSONException -> 0x00e1 }
            r11 = 0
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00e1 }
            r7.<init>(r1)     // Catch:{ JSONException -> 0x00e1 }
            wb.d r0 = new wb.d     // Catch:{ JSONException -> 0x00e1 }
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ JSONException -> 0x00e1 }
            wb.c r1 = r14.f16147f
            com.google.android.gms.tasks.Task r0 = r1.c(r0)
            da.j r1 = da.j.f8852a
            vb.d r6 = new vb.d
            r6.<init>(r2)
            r0.onSuccessTask(r1, r6)
            goto L_0x00e4
        L_0x00e1:
            com.google.android.gms.tasks.Tasks.forResult(r5)
        L_0x00e4:
            com.google.android.gms.tasks.Task r14 = r14.a()
            ca.a r0 = new ca.a
            r0.<init>(r13, r4)
            r14.addOnCompleteListener((android.app.Activity) r13, r0)
            android.content.Intent r14 = r13.getIntent()
            java.lang.String r0 = "click_action"
            boolean r14 = r14.hasExtra(r0)
            if (r14 == 0) goto L_0x0105
            android.content.Intent r14 = r13.getIntent()
            java.lang.String r0 = "click_action"
            r14.getStringExtra(r0)
        L_0x0105:
            com.google.firebase.messaging.a r14 = com.google.firebase.messaging.FirebaseMessaging.f7583m
            java.lang.Class<com.google.firebase.messaging.FirebaseMessaging> r14 = com.google.firebase.messaging.FirebaseMessaging.class
            monitor-enter(r14)
            m9.d r0 = m9.d.d()     // Catch:{ all -> 0x0167 }
            com.google.firebase.messaging.FirebaseMessaging r0 = com.google.firebase.messaging.FirebaseMessaging.getInstance(r0)     // Catch:{ all -> 0x0167 }
            monitor-exit(r14)
            ya.a r14 = r0.f7587b
            if (r14 == 0) goto L_0x011c
            com.google.android.gms.tasks.Task r14 = r14.b()
            goto L_0x0131
        L_0x011c:
            com.google.android.gms.tasks.TaskCompletionSource r14 = new com.google.android.gms.tasks.TaskCompletionSource
            r14.<init>()
            java.util.concurrent.Executor r1 = r0.f7593h
            v.n r2 = new v.n
            r6 = 28
            r2.<init>(r6, r0, r14)
            r1.execute(r2)
            com.google.android.gms.tasks.Task r14 = r14.getTask()
        L_0x0131:
            c0.q0 r0 = new c0.q0
            r0.<init>(r13, r4)
            r14.addOnCompleteListener(r0)
            lg.b r14 = r13.S
            if (r14 == 0) goto L_0x0161
            r14.f()
            d2.l r14 = r13.M()
            mg.r1 r14 = (mg.r1) r14
            android.widget.TextView r14 = r14.f21324w
            java.lang.String r0 = "0.1.0"
            r14.setText(r0)
            android.os.Handler r14 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r14.<init>(r0)
            gi.b0 r0 = new gi.b0
            r0.<init>(r13, r3)
            r1 = 2000(0x7d0, double:9.88E-321)
            r14.postDelayed(r0, r1)
            return
        L_0x0161:
            java.lang.String r14 = "sharedPrefsHelper"
            sk.j.l(r14)
            throw r5
        L_0x0167:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.ui.splash.SplashActivity.onCreate(android.os.Bundle):void");
    }
}
