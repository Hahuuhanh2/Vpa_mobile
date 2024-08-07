package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.R$id;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a0;
import androidx.lifecycle.i;
import d.r;
import d.y;
import e0.c0;
import e0.u;
import f0.b0;
import i1.w;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import r2.x;

public abstract class FragmentManager {
    public f.e A;
    public f.e B;
    public f.e C;
    public ArrayDeque<LaunchedFragmentInfo> D = new ArrayDeque<>();
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public ArrayList<a> J;
    public ArrayList<Boolean> K;
    public ArrayList<Fragment> L;
    public x M;
    public f N = new f();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<l> f2484a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f2485b;

    /* renamed from: c  reason: collision with root package name */
    public final a1.c f2486c = new a1.c(1);

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<a> f2487d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<Fragment> f2488e;

    /* renamed from: f  reason: collision with root package name */
    public final s f2489f = new s(this);

    /* renamed from: g  reason: collision with root package name */
    public y f2490g;

    /* renamed from: h  reason: collision with root package name */
    public final b f2491h = new b();

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f2492i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, BackStackState> f2493j = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, Bundle> f2494k = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, Object> f2495l = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: m  reason: collision with root package name */
    public final t f2496m = new t(this);

    /* renamed from: n  reason: collision with root package name */
    public final CopyOnWriteArrayList<y> f2497n = new CopyOnWriteArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public final u f2498o = new u(this, 0);

    /* renamed from: p  reason: collision with root package name */
    public final c0 f2499p = new c0(this, 3);

    /* renamed from: q  reason: collision with root package name */
    public final u f2500q = new u(this, 1);

    /* renamed from: r  reason: collision with root package name */
    public final u f2501r = new u(this, 1);

    /* renamed from: s  reason: collision with root package name */
    public final c f2502s = new c();

    /* renamed from: t  reason: collision with root package name */
    public int f2503t = -1;

    /* renamed from: u  reason: collision with root package name */
    public r<?> f2504u;

    /* renamed from: v  reason: collision with root package name */
    public o f2505v;

    /* renamed from: w  reason: collision with root package name */
    public Fragment f2506w;

    /* renamed from: x  reason: collision with root package name */
    public Fragment f2507x;

    /* renamed from: y  reason: collision with root package name */
    public d f2508y = new d();

    /* renamed from: z  reason: collision with root package name */
    public e f2509z = new e();

    public class a implements f.a<Map<String, Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FragmentManager f2512a;

        public a(w wVar) {
            this.f2512a = wVar;
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void b(Object obj) {
            int i10;
            Map map = (Map) obj;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((Boolean) arrayList.get(i11)).booleanValue()) {
                    i10 = 0;
                } else {
                    i10 = -1;
                }
                iArr[i11] = i10;
            }
            LaunchedFragmentInfo pollFirst = this.f2512a.D.pollFirst();
            if (pollFirst != null) {
                String str = pollFirst.f2510a;
                int i12 = pollFirst.f2511b;
                Fragment e10 = this.f2512a.f2486c.e(str);
                if (e10 != null) {
                    e10.R(i12, strArr, iArr);
                }
            }
        }
    }

    public class b extends r {
        public b() {
            super(false);
        }

        public final void a() {
            FragmentManager fragmentManager = FragmentManager.this;
            fragmentManager.y(true);
            if (fragmentManager.f2491h.f8450a) {
                fragmentManager.R();
            } else {
                fragmentManager.f2490g.b();
            }
        }
    }

    public class c implements w1.k {
        public c() {
        }

        public final boolean a(MenuItem menuItem) {
            return FragmentManager.this.o();
        }

        public final void b(Menu menu) {
            FragmentManager.this.p();
        }

        public final void c(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.j();
        }

        public final void d(Menu menu) {
            FragmentManager.this.s();
        }
    }

    public class d extends q {
        public d() {
        }

        public final Fragment a(String str) {
            Context context = FragmentManager.this.f2504u.f2698c;
            Object obj = Fragment.f2439d0;
            try {
                return (Fragment) q.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (InstantiationException e10) {
                throw new Fragment.InstantiationException(b0.s("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
            } catch (IllegalAccessException e11) {
                throw new Fragment.InstantiationException(b0.s("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
            } catch (NoSuchMethodException e12) {
                throw new Fragment.InstantiationException(b0.s("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
            } catch (InvocationTargetException e13) {
                throw new Fragment.InstantiationException(b0.s("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
            }
        }
    }

    public class e implements m0 {
    }

    public class f implements Runnable {
        public f() {
        }

        public final void run() {
            FragmentManager.this.y(true);
        }
    }

    public class g implements y {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Fragment f2517a;

        public g(Fragment fragment) {
            this.f2517a = fragment;
        }

        public final void a() {
            this.f2517a.getClass();
        }
    }

    public class h implements f.a<ActivityResult> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FragmentManager f2518a;

        public h(w wVar) {
            this.f2518a = wVar;
        }

        public final void b(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            LaunchedFragmentInfo pollLast = this.f2518a.D.pollLast();
            if (pollLast != null) {
                String str = pollLast.f2510a;
                int i10 = pollLast.f2511b;
                Fragment e10 = this.f2518a.f2486c.e(str);
                if (e10 != null) {
                    e10.G(i10, activityResult.f303a, activityResult.f304b);
                }
            }
        }
    }

    public class i implements f.a<ActivityResult> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FragmentManager f2519a;

        public i(w wVar) {
            this.f2519a = wVar;
        }

        public final void b(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            LaunchedFragmentInfo pollFirst = this.f2519a.D.pollFirst();
            if (pollFirst != null) {
                String str = pollFirst.f2510a;
                int i10 = pollFirst.f2511b;
                Fragment e10 = this.f2519a.f2486c.e(str);
                if (e10 != null) {
                    e10.G(i10, activityResult.f303a, activityResult.f304b);
                }
            }
        }
    }

    public static class j extends g.a<IntentSenderRequest, ActivityResult> {
        public final Intent a(ComponentActivity componentActivity, Object obj) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = intentSenderRequest.f306b;
            if (!(intent2 == null || (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    IntentSender intentSender = intentSenderRequest.f305a;
                    sk.j.f(intentSender, "intentSender");
                    intentSenderRequest = new IntentSenderRequest(intentSender, (Intent) null, intentSenderRequest.f307c, intentSenderRequest.f308d);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.J(2)) {
                intent.toString();
            }
            return intent;
        }

        public final Object c(Intent intent, int i10) {
            return new ActivityResult(intent, i10);
        }
    }

    public static abstract class k {
        public void a(Fragment fragment) {
        }

        public void b(Fragment fragment) {
        }

        public void c(FragmentManager fragmentManager, Fragment fragment, View view) {
        }
    }

    public interface l {
        boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2);
    }

    public class m implements l {

        /* renamed from: a  reason: collision with root package name */
        public final int f2520a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2521b;

        public m(int i10, int i11) {
            this.f2520a = i10;
            this.f2521b = i11;
        }

        public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f2507x;
            if (fragment == null || this.f2520a >= 0 || !fragment.o().R()) {
                return FragmentManager.this.T(arrayList, arrayList2, this.f2520a, this.f2521b);
            }
            return false;
        }
    }

    public static boolean J(int i10) {
        if (Log.isLoggable("FragmentManager", i10)) {
            return true;
        }
        return false;
    }

    public static boolean K(Fragment fragment) {
        Iterator it = fragment.A.f2486c.g().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null) {
                z10 = K(fragment2);
                continue;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public static boolean M(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        if (!fragment.I || (fragment.f2460y != null && !M(fragment.B))) {
            return false;
        }
        return true;
    }

    public static boolean N(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.f2460y;
        if (!fragment.equals(fragmentManager.f2507x) || !N(fragmentManager.f2506w)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0152, code lost:
        r6 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A(java.util.ArrayList<androidx.fragment.app.a> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            java.lang.Object r5 = r1.get(r3)
            androidx.fragment.app.a r5 = (androidx.fragment.app.a) r5
            boolean r5 = r5.f2570p
            java.util.ArrayList<androidx.fragment.app.Fragment> r6 = r0.L
            if (r6 != 0) goto L_0x001e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0.L = r6
            goto L_0x0021
        L_0x001e:
            r6.clear()
        L_0x0021:
            java.util.ArrayList<androidx.fragment.app.Fragment> r6 = r0.L
            a1.c r7 = r0.f2486c
            java.util.List r7 = r7.h()
            r6.addAll(r7)
            androidx.fragment.app.Fragment r6 = r0.f2507x
            r7 = 0
            r8 = r3
        L_0x0030:
            r9 = 2
            r10 = 1
            if (r8 >= r4) goto L_0x017a
            java.lang.Object r11 = r1.get(r8)
            androidx.fragment.app.a r11 = (androidx.fragment.app.a) r11
            java.lang.Object r12 = r2.get(r8)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x012b
            java.util.ArrayList<androidx.fragment.app.Fragment> r12 = r0.L
            r13 = 0
        L_0x0049:
            java.util.ArrayList<androidx.fragment.app.a0$a> r14 = r11.f2555a
            int r14 = r14.size()
            if (r13 >= r14) goto L_0x0163
            java.util.ArrayList<androidx.fragment.app.a0$a> r14 = r11.f2555a
            java.lang.Object r14 = r14.get(r13)
            androidx.fragment.app.a0$a r14 = (androidx.fragment.app.a0.a) r14
            int r15 = r14.f2571a
            if (r15 == r10) goto L_0x011a
            r10 = 9
            if (r15 == r9) goto L_0x00a1
            r9 = 3
            if (r15 == r9) goto L_0x0087
            r9 = 6
            if (r15 == r9) goto L_0x0087
            r9 = 7
            if (r15 == r9) goto L_0x0084
            r9 = 8
            if (r15 == r9) goto L_0x0070
            goto L_0x010e
        L_0x0070:
            java.util.ArrayList<androidx.fragment.app.a0$a> r9 = r11.f2555a
            androidx.fragment.app.a0$a r15 = new androidx.fragment.app.a0$a
            r3 = 0
            r15.<init>(r10, r6, r3)
            r9.add(r13, r15)
            r3 = 1
            r14.f2573c = r3
            int r13 = r13 + 1
            androidx.fragment.app.Fragment r6 = r14.f2572b
            goto L_0x010e
        L_0x0084:
            r10 = 1
            goto L_0x011a
        L_0x0087:
            androidx.fragment.app.Fragment r3 = r14.f2572b
            r12.remove(r3)
            androidx.fragment.app.Fragment r3 = r14.f2572b
            if (r3 != r6) goto L_0x010e
            java.util.ArrayList<androidx.fragment.app.a0$a> r6 = r11.f2555a
            androidx.fragment.app.a0$a r9 = new androidx.fragment.app.a0$a
            r9.<init>((int) r10, (androidx.fragment.app.Fragment) r3)
            r6.add(r13, r9)
            int r13 = r13 + 1
            r3 = 1
            r6 = 0
            r10 = r3
            goto L_0x011f
        L_0x00a1:
            androidx.fragment.app.Fragment r3 = r14.f2572b
            int r9 = r3.D
            int r10 = r12.size()
            int r10 = r10 + -1
            r15 = 0
        L_0x00ac:
            if (r10 < 0) goto L_0x0105
            java.lang.Object r16 = r12.get(r10)
            r2 = r16
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            int r1 = r2.D
            if (r1 != r9) goto L_0x00f8
            if (r2 != r3) goto L_0x00bf
            r1 = 1
            r15 = r1
            goto L_0x00f8
        L_0x00bf:
            if (r2 != r6) goto L_0x00d4
            java.util.ArrayList<androidx.fragment.app.a0$a> r1 = r11.f2555a
            androidx.fragment.app.a0$a r6 = new androidx.fragment.app.a0$a
            r16 = r9
            r9 = 0
            r4 = 9
            r6.<init>(r4, r2, r9)
            r1.add(r13, r6)
            int r13 = r13 + 1
            r6 = 0
            goto L_0x00d7
        L_0x00d4:
            r16 = r9
            r9 = 0
        L_0x00d7:
            androidx.fragment.app.a0$a r1 = new androidx.fragment.app.a0$a
            r4 = 3
            r1.<init>(r4, r2, r9)
            int r4 = r14.f2574d
            r1.f2574d = r4
            int r4 = r14.f2576f
            r1.f2576f = r4
            int r4 = r14.f2575e
            r1.f2575e = r4
            int r4 = r14.f2577g
            r1.f2577g = r4
            java.util.ArrayList<androidx.fragment.app.a0$a> r4 = r11.f2555a
            r4.add(r13, r1)
            r12.remove(r2)
            int r13 = r13 + 1
            goto L_0x00fa
        L_0x00f8:
            r16 = r9
        L_0x00fa:
            int r10 = r10 + -1
            r1 = r18
            r2 = r19
            r4 = r21
            r9 = r16
            goto L_0x00ac
        L_0x0105:
            if (r15 == 0) goto L_0x0111
            java.util.ArrayList<androidx.fragment.app.a0$a> r1 = r11.f2555a
            r1.remove(r13)
            int r13 = r13 + -1
        L_0x010e:
            r1 = 1
        L_0x010f:
            r10 = r1
            goto L_0x011f
        L_0x0111:
            r1 = 1
            r14.f2571a = r1
            r14.f2573c = r1
            r12.add(r3)
            goto L_0x010f
        L_0x011a:
            androidx.fragment.app.Fragment r1 = r14.f2572b
            r12.add(r1)
        L_0x011f:
            int r13 = r13 + r10
            r9 = 2
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            goto L_0x0049
        L_0x012b:
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r0.L
            java.util.ArrayList<androidx.fragment.app.a0$a> r2 = r11.f2555a
            int r2 = r2.size()
            int r2 = r2 - r10
        L_0x0134:
            if (r2 < 0) goto L_0x0163
            java.util.ArrayList<androidx.fragment.app.a0$a> r3 = r11.f2555a
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.a0$a r3 = (androidx.fragment.app.a0.a) r3
            int r4 = r3.f2571a
            if (r4 == r10) goto L_0x015a
            r9 = 3
            if (r4 == r9) goto L_0x0154
            switch(r4) {
                case 6: goto L_0x0154;
                case 7: goto L_0x015a;
                case 8: goto L_0x0151;
                case 9: goto L_0x014e;
                case 10: goto L_0x0149;
                default: goto L_0x0148;
            }
        L_0x0148:
            goto L_0x015f
        L_0x0149:
            androidx.lifecycle.i$b r4 = r3.f2578h
            r3.f2579i = r4
            goto L_0x015f
        L_0x014e:
            androidx.fragment.app.Fragment r3 = r3.f2572b
            goto L_0x0152
        L_0x0151:
            r3 = 0
        L_0x0152:
            r6 = r3
            goto L_0x015f
        L_0x0154:
            androidx.fragment.app.Fragment r3 = r3.f2572b
            r1.add(r3)
            goto L_0x015f
        L_0x015a:
            androidx.fragment.app.Fragment r3 = r3.f2572b
            r1.remove(r3)
        L_0x015f:
            int r2 = r2 + -1
            r10 = 1
            goto L_0x0134
        L_0x0163:
            if (r7 != 0) goto L_0x016c
            boolean r1 = r11.f2561g
            if (r1 == 0) goto L_0x016a
            goto L_0x016c
        L_0x016a:
            r1 = 0
            goto L_0x016d
        L_0x016c:
            r1 = 1
        L_0x016d:
            r7 = r1
            int r8 = r8 + 1
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            goto L_0x0030
        L_0x017a:
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r0.L
            r1.clear()
            if (r5 != 0) goto L_0x01bb
            int r1 = r0.f2503t
            r2 = 1
            if (r1 < r2) goto L_0x01bb
            r2 = r20
            r1 = r21
        L_0x018a:
            r3 = r18
            if (r2 >= r1) goto L_0x01bf
            java.lang.Object r4 = r3.get(r2)
            androidx.fragment.app.a r4 = (androidx.fragment.app.a) r4
            java.util.ArrayList<androidx.fragment.app.a0$a> r4 = r4.f2555a
            java.util.Iterator r4 = r4.iterator()
        L_0x019a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01b8
            java.lang.Object r5 = r4.next()
            androidx.fragment.app.a0$a r5 = (androidx.fragment.app.a0.a) r5
            androidx.fragment.app.Fragment r5 = r5.f2572b
            if (r5 == 0) goto L_0x019a
            androidx.fragment.app.FragmentManager r6 = r5.f2460y
            if (r6 == 0) goto L_0x019a
            androidx.fragment.app.z r5 = r0.f(r5)
            a1.c r6 = r0.f2486c
            r6.i(r5)
            goto L_0x019a
        L_0x01b8:
            int r2 = r2 + 1
            goto L_0x018a
        L_0x01bb:
            r3 = r18
            r1 = r21
        L_0x01bf:
            r2 = r20
        L_0x01c1:
            if (r2 >= r1) goto L_0x0438
            java.lang.Object r4 = r3.get(r2)
            androidx.fragment.app.a r4 = (androidx.fragment.app.a) r4
            r5 = r19
            java.lang.Object r6 = r5.get(r2)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.String r7 = "Unknown cmd: "
            if (r6 == 0) goto L_0x0316
            r6 = -1
            r4.c(r6)
            java.util.ArrayList<androidx.fragment.app.a0$a> r6 = r4.f2555a
            int r6 = r6.size()
            int r6 = r6 + -1
        L_0x01e5:
            if (r6 < 0) goto L_0x0434
            java.util.ArrayList<androidx.fragment.app.a0$a> r8 = r4.f2555a
            java.lang.Object r8 = r8.get(r6)
            androidx.fragment.app.a0$a r8 = (androidx.fragment.app.a0.a) r8
            androidx.fragment.app.Fragment r9 = r8.f2572b
            if (r9 == 0) goto L_0x0239
            androidx.fragment.app.Fragment$d r10 = r9.O
            if (r10 != 0) goto L_0x01f8
            goto L_0x01ff
        L_0x01f8:
            androidx.fragment.app.Fragment$d r10 = r9.l()
            r11 = 1
            r10.f2466a = r11
        L_0x01ff:
            int r10 = r4.f2560f
            r11 = 4099(0x1003, float:5.744E-42)
            r12 = 8197(0x2005, float:1.1486E-41)
            r13 = 8194(0x2002, float:1.1482E-41)
            r14 = 4097(0x1001, float:5.741E-42)
            r15 = 4100(0x1004, float:5.745E-42)
            if (r10 == r14) goto L_0x021d
            if (r10 == r13) goto L_0x021b
            if (r10 == r12) goto L_0x0219
            if (r10 == r11) goto L_0x021e
            if (r10 == r15) goto L_0x0217
            r11 = 0
            goto L_0x021e
        L_0x0217:
            r11 = r12
            goto L_0x021e
        L_0x0219:
            r11 = r15
            goto L_0x021e
        L_0x021b:
            r11 = r14
            goto L_0x021e
        L_0x021d:
            r11 = r13
        L_0x021e:
            androidx.fragment.app.Fragment$d r10 = r9.O
            if (r10 != 0) goto L_0x0225
            if (r11 != 0) goto L_0x0225
            goto L_0x022c
        L_0x0225:
            r9.l()
            androidx.fragment.app.Fragment$d r10 = r9.O
            r10.f2471f = r11
        L_0x022c:
            java.util.ArrayList<java.lang.String> r10 = r4.f2569o
            java.util.ArrayList<java.lang.String> r11 = r4.f2568n
            r9.l()
            androidx.fragment.app.Fragment$d r12 = r9.O
            r12.f2472g = r10
            r12.f2473h = r11
        L_0x0239:
            int r10 = r8.f2571a
            switch(r10) {
                case 1: goto L_0x02fc;
                case 2: goto L_0x023e;
                case 3: goto L_0x02eb;
                case 4: goto L_0x02c3;
                case 5: goto L_0x0293;
                case 6: goto L_0x0281;
                case 7: goto L_0x0269;
                case 8: goto L_0x0261;
                case 9: goto L_0x025a;
                case 10: goto L_0x0251;
                default: goto L_0x023e;
            }
        L_0x023e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = android.support.v4.media.a.q(r7)
            int r3 = r8.f2571a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0251:
            androidx.fragment.app.FragmentManager r10 = r4.f2552q
            androidx.lifecycle.i$b r8 = r8.f2578h
            r10.a0(r9, r8)
            goto L_0x0312
        L_0x025a:
            androidx.fragment.app.FragmentManager r8 = r4.f2552q
            r8.b0(r9)
            goto L_0x0312
        L_0x0261:
            androidx.fragment.app.FragmentManager r8 = r4.f2552q
            r9 = 0
            r8.b0(r9)
            goto L_0x0312
        L_0x0269:
            int r10 = r8.f2574d
            int r11 = r8.f2575e
            int r12 = r8.f2576f
            int r8 = r8.f2577g
            r9.f0(r10, r11, r12, r8)
            androidx.fragment.app.FragmentManager r8 = r4.f2552q
            r10 = 1
            r8.Z(r9, r10)
            androidx.fragment.app.FragmentManager r8 = r4.f2552q
            r8.g(r9)
            goto L_0x0312
        L_0x0281:
            int r10 = r8.f2574d
            int r11 = r8.f2575e
            int r12 = r8.f2576f
            int r8 = r8.f2577g
            r9.f0(r10, r11, r12, r8)
            androidx.fragment.app.FragmentManager r8 = r4.f2552q
            r8.c(r9)
            goto L_0x0312
        L_0x0293:
            int r10 = r8.f2574d
            int r11 = r8.f2575e
            int r12 = r8.f2576f
            int r8 = r8.f2577g
            r9.f0(r10, r11, r12, r8)
            androidx.fragment.app.FragmentManager r8 = r4.f2552q
            r10 = 1
            r8.Z(r9, r10)
            androidx.fragment.app.FragmentManager r8 = r4.f2552q
            r8.getClass()
            r10 = 2
            boolean r10 = J(r10)
            if (r10 == 0) goto L_0x02b3
            java.util.Objects.toString(r9)
        L_0x02b3:
            boolean r10 = r9.F
            if (r10 != 0) goto L_0x0312
            r10 = 1
            r9.F = r10
            boolean r11 = r9.P
            r10 = r10 ^ r11
            r9.P = r10
            r8.c0(r9)
            goto L_0x0312
        L_0x02c3:
            int r10 = r8.f2574d
            int r11 = r8.f2575e
            int r12 = r8.f2576f
            int r8 = r8.f2577g
            r9.f0(r10, r11, r12, r8)
            androidx.fragment.app.FragmentManager r8 = r4.f2552q
            r8.getClass()
            r8 = 2
            boolean r8 = J(r8)
            if (r8 == 0) goto L_0x02dd
            java.util.Objects.toString(r9)
        L_0x02dd:
            boolean r8 = r9.F
            if (r8 == 0) goto L_0x0312
            r8 = 0
            r9.F = r8
            boolean r8 = r9.P
            r8 = r8 ^ 1
            r9.P = r8
            goto L_0x0312
        L_0x02eb:
            int r10 = r8.f2574d
            int r11 = r8.f2575e
            int r12 = r8.f2576f
            int r8 = r8.f2577g
            r9.f0(r10, r11, r12, r8)
            androidx.fragment.app.FragmentManager r8 = r4.f2552q
            r8.a(r9)
            goto L_0x0312
        L_0x02fc:
            int r10 = r8.f2574d
            int r11 = r8.f2575e
            int r12 = r8.f2576f
            int r8 = r8.f2577g
            r9.f0(r10, r11, r12, r8)
            androidx.fragment.app.FragmentManager r8 = r4.f2552q
            r10 = 1
            r8.Z(r9, r10)
            androidx.fragment.app.FragmentManager r8 = r4.f2552q
            r8.U(r9)
        L_0x0312:
            int r6 = r6 + -1
            goto L_0x01e5
        L_0x0316:
            r6 = 1
            r4.c(r6)
            java.util.ArrayList<androidx.fragment.app.a0$a> r6 = r4.f2555a
            int r6 = r6.size()
            r8 = 0
        L_0x0321:
            if (r8 >= r6) goto L_0x0434
            java.util.ArrayList<androidx.fragment.app.a0$a> r9 = r4.f2555a
            java.lang.Object r9 = r9.get(r8)
            androidx.fragment.app.a0$a r9 = (androidx.fragment.app.a0.a) r9
            androidx.fragment.app.Fragment r10 = r9.f2572b
            if (r10 == 0) goto L_0x0358
            androidx.fragment.app.Fragment$d r11 = r10.O
            if (r11 != 0) goto L_0x0334
            goto L_0x033b
        L_0x0334:
            androidx.fragment.app.Fragment$d r11 = r10.l()
            r12 = 0
            r11.f2466a = r12
        L_0x033b:
            int r11 = r4.f2560f
            androidx.fragment.app.Fragment$d r12 = r10.O
            if (r12 != 0) goto L_0x0344
            if (r11 != 0) goto L_0x0344
            goto L_0x034b
        L_0x0344:
            r10.l()
            androidx.fragment.app.Fragment$d r12 = r10.O
            r12.f2471f = r11
        L_0x034b:
            java.util.ArrayList<java.lang.String> r11 = r4.f2568n
            java.util.ArrayList<java.lang.String> r12 = r4.f2569o
            r10.l()
            androidx.fragment.app.Fragment$d r13 = r10.O
            r13.f2472g = r11
            r13.f2473h = r12
        L_0x0358:
            int r11 = r9.f2571a
            switch(r11) {
                case 1: goto L_0x041a;
                case 2: goto L_0x035d;
                case 3: goto L_0x0409;
                case 4: goto L_0x03df;
                case 5: goto L_0x03b2;
                case 6: goto L_0x03a0;
                case 7: goto L_0x0388;
                case 8: goto L_0x0381;
                case 9: goto L_0x0379;
                case 10: goto L_0x0370;
                default: goto L_0x035d;
            }
        L_0x035d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = android.support.v4.media.a.q(r7)
            int r3 = r9.f2571a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0370:
            androidx.fragment.app.FragmentManager r11 = r4.f2552q
            androidx.lifecycle.i$b r9 = r9.f2579i
            r11.a0(r10, r9)
            goto L_0x0430
        L_0x0379:
            androidx.fragment.app.FragmentManager r9 = r4.f2552q
            r10 = 0
            r9.b0(r10)
            goto L_0x0430
        L_0x0381:
            androidx.fragment.app.FragmentManager r9 = r4.f2552q
            r9.b0(r10)
            goto L_0x0430
        L_0x0388:
            int r11 = r9.f2574d
            int r12 = r9.f2575e
            int r13 = r9.f2576f
            int r9 = r9.f2577g
            r10.f0(r11, r12, r13, r9)
            androidx.fragment.app.FragmentManager r9 = r4.f2552q
            r11 = 0
            r9.Z(r10, r11)
            androidx.fragment.app.FragmentManager r9 = r4.f2552q
            r9.c(r10)
            goto L_0x0430
        L_0x03a0:
            int r11 = r9.f2574d
            int r12 = r9.f2575e
            int r13 = r9.f2576f
            int r9 = r9.f2577g
            r10.f0(r11, r12, r13, r9)
            androidx.fragment.app.FragmentManager r9 = r4.f2552q
            r9.g(r10)
            goto L_0x0430
        L_0x03b2:
            int r11 = r9.f2574d
            int r12 = r9.f2575e
            int r13 = r9.f2576f
            int r9 = r9.f2577g
            r10.f0(r11, r12, r13, r9)
            androidx.fragment.app.FragmentManager r9 = r4.f2552q
            r11 = 0
            r9.Z(r10, r11)
            androidx.fragment.app.FragmentManager r9 = r4.f2552q
            r9.getClass()
            r9 = 2
            boolean r9 = J(r9)
            if (r9 == 0) goto L_0x03d2
            java.util.Objects.toString(r10)
        L_0x03d2:
            boolean r9 = r10.F
            if (r9 == 0) goto L_0x0430
            r10.F = r11
            boolean r9 = r10.P
            r9 = r9 ^ 1
            r10.P = r9
            goto L_0x0430
        L_0x03df:
            int r11 = r9.f2574d
            int r12 = r9.f2575e
            int r13 = r9.f2576f
            int r9 = r9.f2577g
            r10.f0(r11, r12, r13, r9)
            androidx.fragment.app.FragmentManager r9 = r4.f2552q
            r9.getClass()
            r11 = 2
            boolean r11 = J(r11)
            if (r11 == 0) goto L_0x03f9
            java.util.Objects.toString(r10)
        L_0x03f9:
            boolean r11 = r10.F
            if (r11 != 0) goto L_0x0430
            r11 = 1
            r10.F = r11
            boolean r12 = r10.P
            r11 = r11 ^ r12
            r10.P = r11
            r9.c0(r10)
            goto L_0x0430
        L_0x0409:
            int r11 = r9.f2574d
            int r12 = r9.f2575e
            int r13 = r9.f2576f
            int r9 = r9.f2577g
            r10.f0(r11, r12, r13, r9)
            androidx.fragment.app.FragmentManager r9 = r4.f2552q
            r9.U(r10)
            goto L_0x0430
        L_0x041a:
            int r11 = r9.f2574d
            int r12 = r9.f2575e
            int r13 = r9.f2576f
            int r9 = r9.f2577g
            r10.f0(r11, r12, r13, r9)
            androidx.fragment.app.FragmentManager r9 = r4.f2552q
            r11 = 0
            r9.Z(r10, r11)
            androidx.fragment.app.FragmentManager r9 = r4.f2552q
            r9.a(r10)
        L_0x0430:
            int r8 = r8 + 1
            goto L_0x0321
        L_0x0434:
            int r2 = r2 + 1
            goto L_0x01c1
        L_0x0438:
            r5 = r19
            int r2 = r1 + -1
            java.lang.Object r2 = r5.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r4 = r20
        L_0x0448:
            if (r4 >= r1) goto L_0x0493
            java.lang.Object r6 = r3.get(r4)
            androidx.fragment.app.a r6 = (androidx.fragment.app.a) r6
            if (r2 == 0) goto L_0x0472
            java.util.ArrayList<androidx.fragment.app.a0$a> r7 = r6.f2555a
            int r7 = r7.size()
            int r7 = r7 + -1
        L_0x045a:
            if (r7 < 0) goto L_0x0490
            java.util.ArrayList<androidx.fragment.app.a0$a> r8 = r6.f2555a
            java.lang.Object r8 = r8.get(r7)
            androidx.fragment.app.a0$a r8 = (androidx.fragment.app.a0.a) r8
            androidx.fragment.app.Fragment r8 = r8.f2572b
            if (r8 == 0) goto L_0x046f
            androidx.fragment.app.z r8 = r0.f(r8)
            r8.k()
        L_0x046f:
            int r7 = r7 + -1
            goto L_0x045a
        L_0x0472:
            java.util.ArrayList<androidx.fragment.app.a0$a> r6 = r6.f2555a
            java.util.Iterator r6 = r6.iterator()
        L_0x0478:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0490
            java.lang.Object r7 = r6.next()
            androidx.fragment.app.a0$a r7 = (androidx.fragment.app.a0.a) r7
            androidx.fragment.app.Fragment r7 = r7.f2572b
            if (r7 == 0) goto L_0x0478
            androidx.fragment.app.z r7 = r0.f(r7)
            r7.k()
            goto L_0x0478
        L_0x0490:
            int r4 = r4 + 1
            goto L_0x0448
        L_0x0493:
            int r4 = r0.f2503t
            r6 = 1
            r0.P(r4, r6)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r6 = r20
        L_0x04a0:
            if (r6 >= r1) goto L_0x04cd
            java.lang.Object r7 = r3.get(r6)
            androidx.fragment.app.a r7 = (androidx.fragment.app.a) r7
            java.util.ArrayList<androidx.fragment.app.a0$a> r7 = r7.f2555a
            java.util.Iterator r7 = r7.iterator()
        L_0x04ae:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x04ca
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.a0$a r8 = (androidx.fragment.app.a0.a) r8
            androidx.fragment.app.Fragment r8 = r8.f2572b
            if (r8 == 0) goto L_0x04ae
            android.view.ViewGroup r8 = r8.K
            if (r8 == 0) goto L_0x04ae
            androidx.fragment.app.l0 r8 = androidx.fragment.app.l0.f(r8, r0)
            r4.add(r8)
            goto L_0x04ae
        L_0x04ca:
            int r6 = r6 + 1
            goto L_0x04a0
        L_0x04cd:
            java.util.Iterator r4 = r4.iterator()
        L_0x04d1:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x04e6
            java.lang.Object r6 = r4.next()
            androidx.fragment.app.l0 r6 = (androidx.fragment.app.l0) r6
            r6.f2666d = r2
            r6.g()
            r6.c()
            goto L_0x04d1
        L_0x04e6:
            r2 = r20
        L_0x04e8:
            if (r2 >= r1) goto L_0x0509
            java.lang.Object r4 = r3.get(r2)
            androidx.fragment.app.a r4 = (androidx.fragment.app.a) r4
            java.lang.Object r6 = r5.get(r2)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0503
            int r6 = r4.f2554s
            if (r6 < 0) goto L_0x0503
            r6 = -1
            r4.f2554s = r6
        L_0x0503:
            r4.getClass()
            int r2 = r2 + 1
            goto L_0x04e8
        L_0x0509:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.A(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final Fragment B(String str) {
        return this.f2486c.d(str);
    }

    public final Fragment C(int i10) {
        a1.c cVar = this.f2486c;
        int size = ((ArrayList) cVar.f24a).size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = (Fragment) ((ArrayList) cVar.f24a).get(size);
                if (fragment != null && fragment.C == i10) {
                    return fragment;
                }
            } else {
                for (z zVar : ((HashMap) cVar.f25b).values()) {
                    if (zVar != null) {
                        Fragment fragment2 = zVar.f2721c;
                        if (fragment2.C == i10) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final Fragment D(String str) {
        a1.c cVar = this.f2486c;
        if (str != null) {
            int size = ((ArrayList) cVar.f24a).size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Fragment fragment = (Fragment) ((ArrayList) cVar.f24a).get(size);
                if (fragment != null && str.equals(fragment.E)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (z zVar : ((HashMap) cVar.f25b).values()) {
                if (zVar != null) {
                    Fragment fragment2 = zVar.f2721c;
                    if (str.equals(fragment2.E)) {
                        return fragment2;
                    }
                }
            }
        } else {
            cVar.getClass();
        }
        return null;
    }

    public final void E() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            if (l0Var.f2667e) {
                J(2);
                l0Var.f2667e = false;
                l0Var.c();
            }
        }
    }

    public final ViewGroup F(Fragment fragment) {
        ViewGroup viewGroup = fragment.K;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.D > 0 && this.f2505v.F()) {
            View z10 = this.f2505v.z(fragment.D);
            if (z10 instanceof ViewGroup) {
                return (ViewGroup) z10;
            }
        }
        return null;
    }

    public final q G() {
        Fragment fragment = this.f2506w;
        if (fragment != null) {
            return fragment.f2460y.G();
        }
        return this.f2508y;
    }

    public final List<Fragment> H() {
        return this.f2486c.h();
    }

    public final m0 I() {
        Fragment fragment = this.f2506w;
        if (fragment != null) {
            return fragment.f2460y.I();
        }
        return this.f2509z;
    }

    public final boolean L() {
        Fragment fragment = this.f2506w;
        if (fragment == null) {
            return true;
        }
        if (!fragment.C() || !this.f2506w.v().L()) {
            return false;
        }
        return true;
    }

    public final boolean O() {
        if (this.F || this.G) {
            return true;
        }
        return false;
    }

    public final void P(int i10, boolean z10) {
        r<?> rVar;
        if (this.f2504u == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z10 || i10 != this.f2503t) {
            this.f2503t = i10;
            a1.c cVar = this.f2486c;
            Iterator it = ((ArrayList) cVar.f24a).iterator();
            while (it.hasNext()) {
                z zVar = (z) ((HashMap) cVar.f25b).get(((Fragment) it.next()).f2447e);
                if (zVar != null) {
                    zVar.k();
                }
            }
            Iterator it2 = ((HashMap) cVar.f25b).values().iterator();
            while (true) {
                boolean z11 = false;
                if (!it2.hasNext()) {
                    break;
                }
                z zVar2 = (z) it2.next();
                if (zVar2 != null) {
                    zVar2.k();
                    Fragment fragment = zVar2.f2721c;
                    if (fragment.f2454s && !fragment.E()) {
                        z11 = true;
                    }
                    if (z11) {
                        cVar.j(zVar2);
                    }
                }
            }
            d0();
            if (this.E && (rVar = this.f2504u) != null && this.f2503t == 7) {
                rVar.N();
                this.E = false;
            }
        }
    }

    public final void Q() {
        if (this.f2504u != null) {
            this.F = false;
            this.G = false;
            this.M.f2718i = false;
            for (Fragment fragment : this.f2486c.h()) {
                if (fragment != null) {
                    fragment.A.Q();
                }
            }
        }
    }

    public final boolean R() {
        return S(-1, 0);
    }

    public final boolean S(int i10, int i11) {
        y(false);
        x(true);
        Fragment fragment = this.f2507x;
        if (fragment != null && i10 < 0 && fragment.o().R()) {
            return true;
        }
        boolean T = T(this.J, this.K, i10, i11);
        if (T) {
            this.f2485b = true;
            try {
                V(this.J, this.K);
            } finally {
                d();
            }
        }
        g0();
        u();
        this.f2486c.c();
        return T;
    }

    public final boolean T(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        boolean z10;
        if ((i11 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList<a> arrayList3 = this.f2487d;
        int i12 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i10 < 0) {
                i12 = z10 ? 0 : -1 + this.f2487d.size();
            } else {
                int size = this.f2487d.size() - 1;
                while (size >= 0) {
                    a aVar = this.f2487d.get(size);
                    if (i10 >= 0 && i10 == aVar.f2554s) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z10) {
                        while (size > 0) {
                            int i13 = size - 1;
                            a aVar2 = this.f2487d.get(i13);
                            if (i10 < 0 || i10 != aVar2.f2554s) {
                                break;
                            }
                            size = i13;
                        }
                    } else if (size != this.f2487d.size() - 1) {
                        size++;
                    }
                }
                i12 = size;
            }
        }
        if (i12 < 0) {
            return false;
        }
        for (int size2 = this.f2487d.size() - 1; size2 >= i12; size2--) {
            arrayList.add(this.f2487d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void U(Fragment fragment) {
        if (J(2)) {
            Objects.toString(fragment);
        }
        boolean z10 = !fragment.E();
        if (!fragment.G || z10) {
            a1.c cVar = this.f2486c;
            synchronized (((ArrayList) cVar.f24a)) {
                ((ArrayList) cVar.f24a).remove(fragment);
            }
            fragment.f2453r = false;
            if (K(fragment)) {
                this.E = true;
            }
            fragment.f2454s = true;
            c0(fragment);
        }
    }

    public final void V(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i10 < size) {
                    if (!arrayList.get(i10).f2570p) {
                        if (i11 != i10) {
                            A(arrayList, arrayList2, i11, i10);
                        }
                        i11 = i10 + 1;
                        if (arrayList2.get(i10).booleanValue()) {
                            while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f2570p) {
                                i11++;
                            }
                        }
                        A(arrayList, arrayList2, i10, i11);
                        i10 = i11 - 1;
                    }
                    i10++;
                }
                if (i11 != size) {
                    A(arrayList, arrayList2, i11, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public final void W(Bundle bundle) {
        int i10;
        boolean z10;
        z zVar;
        Bundle bundle2;
        Bundle bundle3;
        for (String next : bundle.keySet()) {
            if (next.startsWith("result_") && (bundle3 = bundle.getBundle(next)) != null) {
                bundle3.setClassLoader(this.f2504u.f2698c.getClassLoader());
                this.f2494k.put(next.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String next2 : bundle.keySet()) {
            if (next2.startsWith("fragment_") && (bundle2 = bundle.getBundle(next2)) != null) {
                bundle2.setClassLoader(this.f2504u.f2698c.getClassLoader());
                hashMap.put(next2.substring(9), bundle2);
            }
        }
        a1.c cVar = this.f2486c;
        ((HashMap) cVar.f26c).clear();
        ((HashMap) cVar.f26c).putAll(hashMap);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable("state");
        if (fragmentManagerState != null) {
            ((HashMap) this.f2486c.f25b).clear();
            Iterator<String> it = fragmentManagerState.f2523a.iterator();
            while (it.hasNext()) {
                Bundle k10 = this.f2486c.k((Bundle) null, it.next());
                if (k10 != null) {
                    Fragment fragment = this.M.f2713d.get(((FragmentState) k10.getParcelable("state")).f2532b);
                    if (fragment != null) {
                        if (J(2)) {
                            fragment.toString();
                        }
                        zVar = new z(this.f2496m, this.f2486c, fragment, k10);
                    } else {
                        zVar = new z(this.f2496m, this.f2486c, this.f2504u.f2698c.getClassLoader(), G(), k10);
                    }
                    Fragment fragment2 = zVar.f2721c;
                    fragment2.f2442b = k10;
                    fragment2.f2460y = this;
                    if (J(2)) {
                        fragment2.toString();
                    }
                    zVar.m(this.f2504u.f2698c.getClassLoader());
                    this.f2486c.i(zVar);
                    zVar.f2723e = this.f2503t;
                }
            }
            x xVar = this.M;
            xVar.getClass();
            Iterator it2 = new ArrayList(xVar.f2713d.values()).iterator();
            while (true) {
                i10 = 0;
                if (!it2.hasNext()) {
                    break;
                }
                Fragment fragment3 = (Fragment) it2.next();
                if (((HashMap) this.f2486c.f25b).get(fragment3.f2447e) != null) {
                    i10 = 1;
                }
                if (i10 == 0) {
                    if (J(2)) {
                        fragment3.toString();
                        Objects.toString(fragmentManagerState.f2523a);
                    }
                    this.M.e(fragment3);
                    fragment3.f2460y = this;
                    z zVar2 = new z(this.f2496m, this.f2486c, fragment3);
                    zVar2.f2723e = 1;
                    zVar2.k();
                    fragment3.f2454s = true;
                    zVar2.k();
                }
            }
            a1.c cVar2 = this.f2486c;
            ArrayList<String> arrayList = fragmentManagerState.f2524b;
            ((ArrayList) cVar2.f24a).clear();
            if (arrayList != null) {
                for (String next3 : arrayList) {
                    Fragment d10 = cVar2.d(next3);
                    if (d10 != null) {
                        if (J(2)) {
                            d10.toString();
                        }
                        cVar2.a(d10);
                    } else {
                        throw new IllegalStateException(b0.s("No instantiated fragment for (", next3, ")"));
                    }
                }
            }
            if (fragmentManagerState.f2525c != null) {
                this.f2487d = new ArrayList<>(fragmentManagerState.f2525c.length);
                int i11 = 0;
                while (true) {
                    BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f2525c;
                    if (i11 >= backStackRecordStateArr.length) {
                        break;
                    }
                    BackStackRecordState backStackRecordState = backStackRecordStateArr[i11];
                    backStackRecordState.getClass();
                    a aVar = new a(this);
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < backStackRecordState.f2423a.length) {
                        a0.a aVar2 = new a0.a();
                        int i14 = i12 + 1;
                        aVar2.f2571a = backStackRecordState.f2423a[i12];
                        if (J(2)) {
                            Objects.toString(aVar);
                            int i15 = backStackRecordState.f2423a[i14];
                        }
                        aVar2.f2578h = i.b.values()[backStackRecordState.f2425c[i13]];
                        aVar2.f2579i = i.b.values()[backStackRecordState.f2426d[i13]];
                        int[] iArr = backStackRecordState.f2423a;
                        int i16 = i14 + 1;
                        if (iArr[i14] != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        aVar2.f2573c = z10;
                        int i17 = i16 + 1;
                        int i18 = iArr[i16];
                        aVar2.f2574d = i18;
                        int i19 = i17 + 1;
                        int i20 = iArr[i17];
                        aVar2.f2575e = i20;
                        int i21 = i19 + 1;
                        int i22 = iArr[i19];
                        aVar2.f2576f = i22;
                        int i23 = iArr[i21];
                        aVar2.f2577g = i23;
                        aVar.f2556b = i18;
                        aVar.f2557c = i20;
                        aVar.f2558d = i22;
                        aVar.f2559e = i23;
                        aVar.b(aVar2);
                        i13++;
                        i12 = i21 + 1;
                    }
                    aVar.f2560f = backStackRecordState.f2427e;
                    aVar.f2563i = backStackRecordState.f2428f;
                    aVar.f2561g = true;
                    aVar.f2564j = backStackRecordState.f2430o;
                    aVar.f2565k = backStackRecordState.f2431p;
                    aVar.f2566l = backStackRecordState.f2432q;
                    aVar.f2567m = backStackRecordState.f2433r;
                    aVar.f2568n = backStackRecordState.f2434s;
                    aVar.f2569o = backStackRecordState.f2435t;
                    aVar.f2570p = backStackRecordState.f2436u;
                    aVar.f2554s = backStackRecordState.f2429n;
                    for (int i24 = 0; i24 < backStackRecordState.f2424b.size(); i24++) {
                        String str = backStackRecordState.f2424b.get(i24);
                        if (str != null) {
                            aVar.f2555a.get(i24).f2572b = B(str);
                        }
                    }
                    aVar.c(1);
                    if (J(2)) {
                        aVar.toString();
                        PrintWriter printWriter = new PrintWriter(new k0());
                        aVar.h("  ", printWriter, false);
                        printWriter.close();
                    }
                    this.f2487d.add(aVar);
                    i11++;
                }
            } else {
                this.f2487d = null;
            }
            this.f2492i.set(fragmentManagerState.f2526d);
            String str2 = fragmentManagerState.f2527e;
            if (str2 != null) {
                Fragment B2 = B(str2);
                this.f2507x = B2;
                q(B2);
            }
            ArrayList<String> arrayList2 = fragmentManagerState.f2528f;
            if (arrayList2 != null) {
                while (i10 < arrayList2.size()) {
                    this.f2493j.put(arrayList2.get(i10), fragmentManagerState.f2529n.get(i10));
                    i10++;
                }
            }
            this.D = new ArrayDeque<>(fragmentManagerState.f2530o);
        }
    }

    public final Bundle X() {
        BackStackRecordState[] backStackRecordStateArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle = new Bundle();
        E();
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((l0) it.next()).e();
        }
        y(true);
        this.F = true;
        this.M.f2718i = true;
        a1.c cVar = this.f2486c;
        cVar.getClass();
        ArrayList<String> arrayList2 = new ArrayList<>(((HashMap) cVar.f25b).size());
        for (z zVar : ((HashMap) cVar.f25b).values()) {
            if (zVar != null) {
                Fragment fragment = zVar.f2721c;
                cVar.k(zVar.o(), fragment.f2447e);
                arrayList2.add(fragment.f2447e);
                if (J(2)) {
                    fragment.toString();
                    Objects.toString(fragment.f2442b);
                }
            }
        }
        HashMap hashMap = (HashMap) this.f2486c.f26c;
        if (hashMap.isEmpty()) {
            J(2);
        } else {
            a1.c cVar2 = this.f2486c;
            synchronized (((ArrayList) cVar2.f24a)) {
                backStackRecordStateArr = null;
                if (((ArrayList) cVar2.f24a).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(((ArrayList) cVar2.f24a).size());
                    Iterator it2 = ((ArrayList) cVar2.f24a).iterator();
                    while (it2.hasNext()) {
                        Fragment fragment2 = (Fragment) it2.next();
                        arrayList.add(fragment2.f2447e);
                        if (J(2)) {
                            fragment2.toString();
                        }
                    }
                }
            }
            ArrayList<a> arrayList3 = this.f2487d;
            if (arrayList3 != null && (size = arrayList3.size()) > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i10 = 0; i10 < size; i10++) {
                    backStackRecordStateArr[i10] = new BackStackRecordState(this.f2487d.get(i10));
                    if (J(2)) {
                        Objects.toString(this.f2487d.get(i10));
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f2523a = arrayList2;
            fragmentManagerState.f2524b = arrayList;
            fragmentManagerState.f2525c = backStackRecordStateArr;
            fragmentManagerState.f2526d = this.f2492i.get();
            Fragment fragment3 = this.f2507x;
            if (fragment3 != null) {
                fragmentManagerState.f2527e = fragment3.f2447e;
            }
            fragmentManagerState.f2528f.addAll(this.f2493j.keySet());
            fragmentManagerState.f2529n.addAll(this.f2493j.values());
            fragmentManagerState.f2530o = new ArrayList<>(this.D);
            bundle.putParcelable("state", fragmentManagerState);
            for (String next : this.f2494k.keySet()) {
                bundle.putBundle(b0.r("result_", next), this.f2494k.get(next));
            }
            for (String str : hashMap.keySet()) {
                bundle.putBundle(b0.r("fragment_", str), (Bundle) hashMap.get(str));
            }
        }
        return bundle;
    }

    public final void Y() {
        synchronized (this.f2484a) {
            boolean z10 = true;
            if (this.f2484a.size() != 1) {
                z10 = false;
            }
            if (z10) {
                this.f2504u.f2699d.removeCallbacks(this.N);
                this.f2504u.f2699d.post(this.N);
                g0();
            }
        }
    }

    public final void Z(Fragment fragment, boolean z10) {
        ViewGroup F2 = F(fragment);
        if (F2 != null && (F2 instanceof FragmentContainerView)) {
            ((FragmentContainerView) F2).setDrawDisappearingViewsLast(!z10);
        }
    }

    public final z a(Fragment fragment) {
        String str = fragment.S;
        if (str != null) {
            p2.a.d(fragment, str);
        }
        if (J(2)) {
            fragment.toString();
        }
        z f10 = f(fragment);
        fragment.f2460y = this;
        this.f2486c.i(f10);
        if (!fragment.G) {
            this.f2486c.a(fragment);
            fragment.f2454s = false;
            if (fragment.L == null) {
                fragment.P = false;
            }
            if (K(fragment)) {
                this.E = true;
            }
        }
        return f10;
    }

    public final void a0(Fragment fragment, i.b bVar) {
        if (!fragment.equals(B(fragment.f2447e)) || !(fragment.f2461z == null || fragment.f2460y == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.T = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v34, resolved type: d.a0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v35, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v36, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v41, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.fragment.app.r<?> r5, androidx.fragment.app.o r6, androidx.fragment.app.Fragment r7) {
        /*
            r4 = this;
            androidx.fragment.app.r<?> r0 = r4.f2504u
            if (r0 != 0) goto L_0x0165
            r4.f2504u = r5
            r4.f2505v = r6
            r4.f2506w = r7
            if (r7 == 0) goto L_0x0017
            androidx.fragment.app.FragmentManager$g r6 = new androidx.fragment.app.FragmentManager$g
            r6.<init>(r7)
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.y> r0 = r4.f2497n
            r0.add(r6)
            goto L_0x0023
        L_0x0017:
            boolean r6 = r5 instanceof androidx.fragment.app.y
            if (r6 == 0) goto L_0x0023
            r6 = r5
            androidx.fragment.app.y r6 = (androidx.fragment.app.y) r6
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.y> r0 = r4.f2497n
            r0.add(r6)
        L_0x0023:
            androidx.fragment.app.Fragment r6 = r4.f2506w
            if (r6 == 0) goto L_0x002a
            r4.g0()
        L_0x002a:
            boolean r6 = r5 instanceof d.a0
            if (r6 == 0) goto L_0x003f
            r6 = r5
            d.a0 r6 = (d.a0) r6
            d.y r0 = r6.b()
            r4.f2490g = r0
            if (r7 == 0) goto L_0x003a
            r6 = r7
        L_0x003a:
            androidx.fragment.app.FragmentManager$b r1 = r4.f2491h
            r0.a(r6, r1)
        L_0x003f:
            if (r7 == 0) goto L_0x0062
            androidx.fragment.app.FragmentManager r5 = r7.f2460y
            androidx.fragment.app.x r5 = r5.M
            java.util.HashMap<java.lang.String, androidx.fragment.app.x> r6 = r5.f2714e
            java.lang.String r0 = r7.f2447e
            java.lang.Object r6 = r6.get(r0)
            androidx.fragment.app.x r6 = (androidx.fragment.app.x) r6
            if (r6 != 0) goto L_0x005f
            androidx.fragment.app.x r6 = new androidx.fragment.app.x
            boolean r0 = r5.f2716g
            r6.<init>(r0)
            java.util.HashMap<java.lang.String, androidx.fragment.app.x> r5 = r5.f2714e
            java.lang.String r0 = r7.f2447e
            r5.put(r0, r6)
        L_0x005f:
            r4.M = r6
            goto L_0x0086
        L_0x0062:
            boolean r6 = r5 instanceof r2.x
            if (r6 == 0) goto L_0x007e
            r2.x r5 = (r2.x) r5
            r2.w r5 = r5.n()
            androidx.lifecycle.f0 r6 = new androidx.lifecycle.f0
            androidx.fragment.app.x$a r0 = androidx.fragment.app.x.f2712j
            r6.<init>((r2.w) r5, (androidx.lifecycle.f0.b) r0)
            java.lang.Class<androidx.fragment.app.x> r5 = androidx.fragment.app.x.class
            r2.v r5 = r6.a(r5)
            androidx.fragment.app.x r5 = (androidx.fragment.app.x) r5
            r4.M = r5
            goto L_0x0086
        L_0x007e:
            androidx.fragment.app.x r5 = new androidx.fragment.app.x
            r6 = 0
            r5.<init>(r6)
            r4.M = r5
        L_0x0086:
            androidx.fragment.app.x r5 = r4.M
            boolean r6 = r4.O()
            r5.f2718i = r6
            a1.c r5 = r4.f2486c
            androidx.fragment.app.x r6 = r4.M
            r5.f27d = r6
            androidx.fragment.app.r<?> r5 = r4.f2504u
            boolean r6 = r5 instanceof a3.e
            if (r6 == 0) goto L_0x00b8
            if (r7 != 0) goto L_0x00b8
            a3.e r5 = (a3.e) r5
            a3.c r5 = r5.q()
            androidx.fragment.app.v r6 = new androidx.fragment.app.v
            r0 = r4
            androidx.fragment.app.w r0 = (androidx.fragment.app.w) r0
            r6.<init>(r0)
            java.lang.String r0 = "android:support:fragments"
            r5.c(r0, r6)
            android.os.Bundle r5 = r5.a(r0)
            if (r5 == 0) goto L_0x00b8
            r4.W(r5)
        L_0x00b8:
            androidx.fragment.app.r<?> r5 = r4.f2504u
            boolean r6 = r5 instanceof f.g
            if (r6 == 0) goto L_0x0121
            f.g r5 = (f.g) r5
            f.f r5 = r5.k()
            if (r7 == 0) goto L_0x00d4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = r7.f2447e
            java.lang.String r1 = ":"
            java.lang.String r6 = android.support.v4.media.a.o(r6, r0, r1)
            goto L_0x00d6
        L_0x00d4:
            java.lang.String r6 = ""
        L_0x00d6:
            java.lang.String r0 = "FragmentManager:"
            java.lang.String r6 = f0.b0.r(r0, r6)
            java.lang.String r0 = "StartActivityForResult"
            java.lang.String r0 = f0.b0.r(r6, r0)
            g.d r1 = new g.d
            r1.<init>()
            androidx.fragment.app.FragmentManager$h r2 = new androidx.fragment.app.FragmentManager$h
            r3 = r4
            androidx.fragment.app.w r3 = (androidx.fragment.app.w) r3
            r2.<init>(r3)
            f.e r0 = r5.d(r0, r1, r2)
            r4.A = r0
            java.lang.String r0 = "StartIntentSenderForResult"
            java.lang.String r0 = f0.b0.r(r6, r0)
            androidx.fragment.app.FragmentManager$j r1 = new androidx.fragment.app.FragmentManager$j
            r1.<init>()
            androidx.fragment.app.FragmentManager$i r2 = new androidx.fragment.app.FragmentManager$i
            r2.<init>(r3)
            f.e r0 = r5.d(r0, r1, r2)
            r4.B = r0
            java.lang.String r0 = "RequestPermissions"
            java.lang.String r6 = f0.b0.r(r6, r0)
            g.b r0 = new g.b
            r0.<init>()
            androidx.fragment.app.FragmentManager$a r1 = new androidx.fragment.app.FragmentManager$a
            r1.<init>(r3)
            f.e r5 = r5.d(r6, r0, r1)
            r4.C = r5
        L_0x0121:
            androidx.fragment.app.r<?> r5 = r4.f2504u
            boolean r6 = r5 instanceof k1.c
            if (r6 == 0) goto L_0x012e
            k1.c r5 = (k1.c) r5
            androidx.fragment.app.u r6 = r4.f2498o
            r5.A(r6)
        L_0x012e:
            androidx.fragment.app.r<?> r5 = r4.f2504u
            boolean r6 = r5 instanceof k1.d
            if (r6 == 0) goto L_0x013b
            k1.d r5 = (k1.d) r5
            e0.c0 r6 = r4.f2499p
            r5.j(r6)
        L_0x013b:
            androidx.fragment.app.r<?> r5 = r4.f2504u
            boolean r6 = r5 instanceof i1.w
            if (r6 == 0) goto L_0x0148
            i1.w r5 = (i1.w) r5
            e0.u r6 = r4.f2500q
            r5.h(r6)
        L_0x0148:
            androidx.fragment.app.r<?> r5 = r4.f2504u
            boolean r6 = r5 instanceof i1.x
            if (r6 == 0) goto L_0x0155
            i1.x r5 = (i1.x) r5
            androidx.fragment.app.u r6 = r4.f2501r
            r5.m(r6)
        L_0x0155:
            androidx.fragment.app.r<?> r5 = r4.f2504u
            boolean r6 = r5 instanceof w1.h
            if (r6 == 0) goto L_0x0164
            if (r7 != 0) goto L_0x0164
            w1.h r5 = (w1.h) r5
            androidx.fragment.app.FragmentManager$c r6 = r4.f2502s
            r5.r(r6)
        L_0x0164:
            return
        L_0x0165:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Already attached"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.b(androidx.fragment.app.r, androidx.fragment.app.o, androidx.fragment.app.Fragment):void");
    }

    public final void b0(Fragment fragment) {
        if (fragment == null || (fragment.equals(B(fragment.f2447e)) && (fragment.f2461z == null || fragment.f2460y == this))) {
            Fragment fragment2 = this.f2507x;
            this.f2507x = fragment;
            q(fragment2);
            q(this.f2507x);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void c(Fragment fragment) {
        if (J(2)) {
            Objects.toString(fragment);
        }
        if (fragment.G) {
            fragment.G = false;
            if (!fragment.f2453r) {
                this.f2486c.a(fragment);
                if (J(2)) {
                    fragment.toString();
                }
                if (K(fragment)) {
                    this.E = true;
                }
            }
        }
    }

    public final void c0(Fragment fragment) {
        int i10;
        int i11;
        int i12;
        int i13;
        ViewGroup F2 = F(fragment);
        if (F2 != null) {
            Fragment.d dVar = fragment.O;
            boolean z10 = false;
            if (dVar == null) {
                i10 = 0;
            } else {
                i10 = dVar.f2467b;
            }
            if (dVar == null) {
                i11 = 0;
            } else {
                i11 = dVar.f2468c;
            }
            int i14 = i11 + i10;
            if (dVar == null) {
                i12 = 0;
            } else {
                i12 = dVar.f2469d;
            }
            int i15 = i12 + i14;
            if (dVar == null) {
                i13 = 0;
            } else {
                i13 = dVar.f2470e;
            }
            if (i13 + i15 > 0) {
                int i16 = R$id.visible_removing_fragment_view_tag;
                if (F2.getTag(i16) == null) {
                    F2.setTag(i16, fragment);
                }
                Fragment fragment2 = (Fragment) F2.getTag(i16);
                Fragment.d dVar2 = fragment.O;
                if (dVar2 != null) {
                    z10 = dVar2.f2466a;
                }
                if (fragment2.O != null) {
                    fragment2.l().f2466a = z10;
                }
            }
        }
    }

    public final void d() {
        this.f2485b = false;
        this.K.clear();
        this.J.clear();
    }

    public final void d0() {
        Iterator it = this.f2486c.f().iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            Fragment fragment = zVar.f2721c;
            if (fragment.M) {
                if (this.f2485b) {
                    this.I = true;
                } else {
                    fragment.M = false;
                    zVar.k();
                }
            }
        }
    }

    public final HashSet e() {
        Object obj;
        HashSet hashSet = new HashSet();
        Iterator it = this.f2486c.f().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((z) it.next()).f2721c.K;
            if (viewGroup != null) {
                sk.j.f(I(), "factory");
                int i10 = R$id.special_effects_controller_view_tag;
                Object tag = viewGroup.getTag(i10);
                if (tag instanceof l0) {
                    obj = (l0) tag;
                } else {
                    obj = new d(viewGroup);
                    viewGroup.setTag(i10, obj);
                }
                hashSet.add(obj);
            }
        }
        return hashSet;
    }

    public final void e0(IllegalStateException illegalStateException) {
        illegalStateException.getMessage();
        PrintWriter printWriter = new PrintWriter(new k0());
        r<?> rVar = this.f2504u;
        if (rVar != null) {
            try {
                rVar.J(printWriter, new String[0]);
            } catch (Exception unused) {
            }
        } else {
            v("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw illegalStateException;
    }

    public final z f(Fragment fragment) {
        a1.c cVar = this.f2486c;
        z zVar = (z) ((HashMap) cVar.f25b).get(fragment.f2447e);
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(this.f2496m, this.f2486c, fragment);
        zVar2.m(this.f2504u.f2698c.getClassLoader());
        zVar2.f2723e = this.f2503t;
        return zVar2;
    }

    public final void f0(k kVar) {
        t tVar = this.f2496m;
        synchronized (tVar.f2705a) {
            int i10 = 0;
            int size = tVar.f2705a.size();
            while (true) {
                if (i10 >= size) {
                    break;
                } else if (tVar.f2705a.get(i10).f2707a == kVar) {
                    tVar.f2705a.remove(i10);
                    break;
                } else {
                    i10++;
                }
            }
        }
    }

    public final void g(Fragment fragment) {
        if (J(2)) {
            Objects.toString(fragment);
        }
        if (!fragment.G) {
            fragment.G = true;
            if (fragment.f2453r) {
                if (J(2)) {
                    fragment.toString();
                }
                a1.c cVar = this.f2486c;
                synchronized (((ArrayList) cVar.f24a)) {
                    ((ArrayList) cVar.f24a).remove(fragment);
                }
                fragment.f2453r = false;
                if (K(fragment)) {
                    this.E = true;
                }
                c0(fragment);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r0 = r4.f2491h;
        r1 = r4.f2487d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (r1 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        r1 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        if (r1 <= 0) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (N(r4.f2506w) == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        r0.f8450a = r2;
        r0 = r0.f8452c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g0() {
        /*
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$l> r0 = r4.f2484a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$l> r1 = r4.f2484a     // Catch:{ all -> 0x0018 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0018 }
            r2 = 1
            if (r1 != 0) goto L_0x001c
            androidx.fragment.app.FragmentManager$b r1 = r4.f2491h     // Catch:{ all -> 0x0018 }
            r1.f8450a = r2     // Catch:{ all -> 0x0018 }
            rk.a<ek.i> r1 = r1.f8452c     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x001a
            r1.invoke()     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r1 = move-exception
            goto L_0x0040
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            androidx.fragment.app.FragmentManager$b r0 = r4.f2491h
            java.util.ArrayList<androidx.fragment.app.a> r1 = r4.f2487d
            r3 = 0
            if (r1 == 0) goto L_0x0029
            int r1 = r1.size()
            goto L_0x002a
        L_0x0029:
            r1 = r3
        L_0x002a:
            if (r1 <= 0) goto L_0x0035
            androidx.fragment.app.Fragment r1 = r4.f2506w
            boolean r1 = N(r1)
            if (r1 == 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r2 = r3
        L_0x0036:
            r0.f8450a = r2
            rk.a<ek.i> r0 = r0.f8452c
            if (r0 == 0) goto L_0x003f
            r0.invoke()
        L_0x003f:
            return
        L_0x0040:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.g0():void");
    }

    public final void h(boolean z10, Configuration configuration) {
        if (!z10 || !(this.f2504u instanceof k1.c)) {
            for (Fragment fragment : this.f2486c.h()) {
                if (fragment != null) {
                    fragment.onConfigurationChanged(configuration);
                    if (z10) {
                        fragment.A.h(true, configuration);
                    }
                }
            }
            return;
        }
        e0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        throw null;
    }

    public final boolean i() {
        boolean z10;
        if (this.f2503t < 1) {
            return false;
        }
        for (Fragment fragment : this.f2486c.h()) {
            if (fragment != null) {
                if (!fragment.F) {
                    z10 = fragment.A.i();
                } else {
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        boolean z10;
        if (this.f2503t < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z11 = false;
        for (Fragment fragment : this.f2486c.h()) {
            if (fragment != null && M(fragment)) {
                if (!fragment.F) {
                    z10 = fragment.A.j() | false;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fragment);
                    z11 = true;
                }
            }
        }
        if (this.f2488e != null) {
            for (int i10 = 0; i10 < this.f2488e.size(); i10++) {
                Fragment fragment2 = this.f2488e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.getClass();
                }
            }
        }
        this.f2488e = arrayList;
        return z11;
    }

    public final void k() {
        boolean z10 = true;
        this.H = true;
        y(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((l0) it.next()).e();
        }
        r<?> rVar = this.f2504u;
        if (rVar instanceof x) {
            z10 = ((x) this.f2486c.f27d).f2717h;
        } else {
            Context context = rVar.f2698c;
            if (context instanceof Activity) {
                z10 = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z10) {
            for (BackStackState backStackState : this.f2493j.values()) {
                for (String d10 : backStackState.f2437a) {
                    x xVar = (x) this.f2486c.f27d;
                    xVar.getClass();
                    J(3);
                    xVar.d(d10);
                }
            }
        }
        t(-1);
        r<?> rVar2 = this.f2504u;
        if (rVar2 instanceof k1.d) {
            ((k1.d) rVar2).l(this.f2499p);
        }
        r<?> rVar3 = this.f2504u;
        if (rVar3 instanceof k1.c) {
            ((k1.c) rVar3).i(this.f2498o);
        }
        r<?> rVar4 = this.f2504u;
        if (rVar4 instanceof w) {
            ((w) rVar4).e(this.f2500q);
        }
        r<?> rVar5 = this.f2504u;
        if (rVar5 instanceof i1.x) {
            ((i1.x) rVar5).y(this.f2501r);
        }
        r<?> rVar6 = this.f2504u;
        if ((rVar6 instanceof w1.h) && this.f2506w == null) {
            ((w1.h) rVar6).x(this.f2502s);
        }
        this.f2504u = null;
        this.f2505v = null;
        this.f2506w = null;
        if (this.f2490g != null) {
            Iterator<d.c> it2 = this.f2491h.f8451b.iterator();
            while (it2.hasNext()) {
                it2.next().cancel();
            }
            this.f2490g = null;
        }
        f.e eVar = this.A;
        if (eVar != null) {
            eVar.b();
            this.B.b();
            this.C.b();
        }
    }

    public final void l(boolean z10) {
        if (!z10 || !(this.f2504u instanceof k1.d)) {
            for (Fragment fragment : this.f2486c.h()) {
                if (fragment != null) {
                    fragment.onLowMemory();
                    if (z10) {
                        fragment.A.l(true);
                    }
                }
            }
            return;
        }
        e0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        throw null;
    }

    public final void m(boolean z10, boolean z11) {
        if (!z11 || !(this.f2504u instanceof w)) {
            for (Fragment fragment : this.f2486c.h()) {
                if (fragment != null && z11) {
                    fragment.A.m(z10, true);
                }
            }
            return;
        }
        e0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        throw null;
    }

    public final void n() {
        Iterator it = this.f2486c.g().iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.D();
                fragment.A.n();
            }
        }
    }

    public final boolean o() {
        boolean z10;
        if (this.f2503t < 1) {
            return false;
        }
        for (Fragment fragment : this.f2486c.h()) {
            if (fragment != null) {
                if (!fragment.F) {
                    z10 = fragment.A.o();
                } else {
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f2503t >= 1) {
            for (Fragment fragment : this.f2486c.h()) {
                if (fragment != null && !fragment.F) {
                    fragment.A.p();
                }
            }
        }
    }

    public final void q(Fragment fragment) {
        if (fragment != null && fragment.equals(B(fragment.f2447e))) {
            fragment.f2460y.getClass();
            boolean N2 = N(fragment);
            Boolean bool = fragment.f2452q;
            if (bool == null || bool.booleanValue() != N2) {
                fragment.f2452q = Boolean.valueOf(N2);
                w wVar = fragment.A;
                wVar.g0();
                wVar.q(wVar.f2507x);
            }
        }
    }

    public final void r(boolean z10, boolean z11) {
        if (!z11 || !(this.f2504u instanceof i1.x)) {
            for (Fragment fragment : this.f2486c.h()) {
                if (fragment != null && z11) {
                    fragment.A.r(z10, true);
                }
            }
            return;
        }
        e0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        throw null;
    }

    public final boolean s() {
        boolean z10;
        if (this.f2503t < 1) {
            return false;
        }
        boolean z11 = false;
        for (Fragment fragment : this.f2486c.h()) {
            if (fragment != null && M(fragment)) {
                if (!fragment.F) {
                    z10 = fragment.A.s() | false;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z11 = true;
                }
            }
        }
        return z11;
    }

    /* JADX INFO: finally extract failed */
    public final void t(int i10) {
        try {
            this.f2485b = true;
            for (z zVar : ((HashMap) this.f2486c.f25b).values()) {
                if (zVar != null) {
                    zVar.f2723e = i10;
                }
            }
            P(i10, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((l0) it.next()).e();
            }
            this.f2485b = false;
            y(true);
        } catch (Throwable th2) {
            this.f2485b = false;
            throw th2;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f2506w;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f2506w)));
            sb2.append("}");
        } else {
            r<?> rVar = this.f2504u;
            if (rVar != null) {
                sb2.append(rVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f2504u)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u() {
        if (this.I) {
            this.I = false;
            d0();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String r10 = b0.r(str, "    ");
        a1.c cVar = this.f2486c;
        cVar.getClass();
        String str2 = str + "    ";
        if (!((HashMap) cVar.f25b).isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (z zVar : ((HashMap) cVar.f25b).values()) {
                printWriter.print(str);
                if (zVar != null) {
                    Fragment fragment = zVar.f2721c;
                    printWriter.println(fragment);
                    fragment.k(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = ((ArrayList) cVar.f24a).size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size3; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(((Fragment) ((ArrayList) cVar.f24a).get(i10)).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f2488e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size2; i11++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(this.f2488e.get(i11).toString());
            }
        }
        ArrayList<a> arrayList2 = this.f2487d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size; i12++) {
                a aVar = this.f2487d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.h(r10, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2492i.get());
        synchronized (this.f2484a) {
            int size4 = this.f2484a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i13 = 0; i13 < size4; i13++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i13);
                    printWriter.print(": ");
                    printWriter.println(this.f2484a.get(i13));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2504u);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2505v);
        if (this.f2506w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2506w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2503t);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.F);
        printWriter.print(" mStopped=");
        printWriter.print(this.G);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.H);
        if (this.E) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.E);
        }
    }

    public final void w(l lVar, boolean z10) {
        if (!z10) {
            if (this.f2504u == null) {
                if (this.H) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (O()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f2484a) {
            if (this.f2504u != null) {
                this.f2484a.add(lVar);
                Y();
            } else if (!z10) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public final void x(boolean z10) {
        if (this.f2485b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f2504u == null) {
            if (this.H) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.f2504u.f2699d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (!z10 && O()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.J == null) {
            this.J = new ArrayList<>();
            this.K = new ArrayList<>();
        }
    }

    /* JADX INFO: finally extract failed */
    public final boolean y(boolean z10) {
        boolean z11;
        x(z10);
        boolean z12 = false;
        while (true) {
            ArrayList<a> arrayList = this.J;
            ArrayList<Boolean> arrayList2 = this.K;
            synchronized (this.f2484a) {
                if (this.f2484a.isEmpty()) {
                    z11 = false;
                } else {
                    try {
                        int size = this.f2484a.size();
                        z11 = false;
                        for (int i10 = 0; i10 < size; i10++) {
                            z11 |= this.f2484a.get(i10).a(arrayList, arrayList2);
                        }
                    } finally {
                        this.f2484a.clear();
                        this.f2504u.f2699d.removeCallbacks(this.N);
                    }
                }
            }
            if (z11) {
                this.f2485b = true;
                try {
                    V(this.J, this.K);
                    d();
                    z12 = true;
                } catch (Throwable th2) {
                    d();
                    throw th2;
                }
            } else {
                g0();
                u();
                this.f2486c.c();
                return z12;
            }
        }
    }

    public final void z(l lVar, boolean z10) {
        if (!z10 || (this.f2504u != null && !this.H)) {
            x(z10);
            if (lVar.a(this.J, this.K)) {
                this.f2485b = true;
                try {
                    V(this.J, this.K);
                } finally {
                    d();
                }
            }
            g0();
            u();
            this.f2486c.c();
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public String f2510a;

        /* renamed from: b  reason: collision with root package name */
        public int f2511b;

        public class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            public final Object createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            public final Object[] newArray(int i10) {
                return new LaunchedFragmentInfo[i10];
            }
        }

        public LaunchedFragmentInfo(String str, int i10) {
            this.f2510a = str;
            this.f2511b = i10;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f2510a);
            parcel.writeInt(this.f2511b);
        }

        public LaunchedFragmentInfo(Parcel parcel) {
            this.f2510a = parcel.readString();
            this.f2511b = parcel.readInt();
        }
    }
}
