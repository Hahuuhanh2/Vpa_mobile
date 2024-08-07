package androidx.fragment.app;

import a3.e;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.i;
import androidx.lifecycle.o;
import d.a0;
import d.y;
import e0.b0;
import e0.c0;
import e0.u;
import f.f;
import f.g;
import i1.a;
import i1.w;
import i1.x;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import k1.c;
import k1.d;
import w1.h;

public class FragmentActivity extends ComponentActivity implements a.e {
    public static final /* synthetic */ int G = 0;
    public final p B = new p(new a());
    public final o C = new o(this);
    public boolean D;
    public boolean E;
    public boolean F = true;

    public class a extends r<FragmentActivity> implements c, d, w, x, r2.x, a0, g, e, y, h {
        public a() {
            super(FragmentActivity.this);
        }

        public final void A(v1.a<Configuration> aVar) {
            FragmentActivity.this.A(aVar);
        }

        public final o B() {
            return FragmentActivity.this.C;
        }

        public final boolean F() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null || window.peekDecorView() == null) {
                return false;
            }
            return true;
        }

        public final void J(PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump("  ", (FileDescriptor) null, printWriter, strArr);
        }

        public final FragmentActivity K() {
            return FragmentActivity.this;
        }

        public final LayoutInflater L() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        public final boolean M(String str) {
            FragmentActivity fragmentActivity = FragmentActivity.this;
            int i10 = i1.a.f10925a;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                return false;
            }
            if (i11 >= 32) {
                return a.d.a(fragmentActivity, str);
            }
            if (i11 == 31) {
                return a.c.b(fragmentActivity, str);
            }
            return a.b.c(fragmentActivity, str);
        }

        public final void N() {
            FragmentActivity.this.invalidateOptionsMenu();
        }

        public final void a() {
            FragmentActivity.this.getClass();
        }

        public final y b() {
            return FragmentActivity.this.b();
        }

        public final void e(u uVar) {
            FragmentActivity.this.e(uVar);
        }

        public final void h(u uVar) {
            FragmentActivity.this.h(uVar);
        }

        public final void i(u uVar) {
            FragmentActivity.this.i(uVar);
        }

        public final void j(c0 c0Var) {
            FragmentActivity.this.j(c0Var);
        }

        public final f k() {
            return FragmentActivity.this.f278s;
        }

        public final void l(c0 c0Var) {
            FragmentActivity.this.l(c0Var);
        }

        public final void m(u uVar) {
            FragmentActivity.this.m(uVar);
        }

        public final r2.w n() {
            return FragmentActivity.this.n();
        }

        public final a3.c q() {
            return FragmentActivity.this.f271e.f89b;
        }

        public final void r(FragmentManager.c cVar) {
            FragmentActivity.this.r(cVar);
        }

        public final void x(FragmentManager.c cVar) {
            FragmentActivity.this.x(cVar);
        }

        public final void y(u uVar) {
            FragmentActivity.this.y(uVar);
        }

        public final View z(int i10) {
            return FragmentActivity.this.findViewById(i10);
        }
    }

    public FragmentActivity() {
        this.f271e.f89b.c("android:support:lifecycle", new l(this, 0));
        A(new b0(this, 2));
        this.f281v.add(new c0(this, 2));
        D(new m(this));
    }

    public static boolean H(FragmentManager fragmentManager) {
        boolean z10;
        boolean z11;
        i.b bVar = i.b.STARTED;
        boolean z12 = false;
        for (Fragment next : fragmentManager.H()) {
            if (next != null) {
                if (next.s() != null) {
                    z12 |= H(next.o());
                }
                i0 i0Var = next.V;
                if (i0Var != null) {
                    i0Var.c();
                    if (i0Var.f2652e.f2785d.compareTo(bVar) >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        next.V.f2652e.h();
                        z12 = true;
                    }
                }
                if (next.U.f2785d.compareTo(bVar) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    next.U.h();
                    z12 = true;
                }
            }
        }
        return z12;
    }

    public final w G() {
        return this.B.f2695a.f2700e;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0064, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 33) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006b, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 31) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        r1 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dump(java.lang.String r6, java.io.FileDescriptor r7, java.io.PrintWriter r8, java.lang.String[] r9) {
        /*
            r5 = this;
            super.dump(r6, r7, r8, r9)
            r0 = 1
            r1 = 0
            if (r9 == 0) goto L_0x006e
            int r2 = r9.length
            if (r2 <= 0) goto L_0x006e
            r2 = r9[r1]
            r2.getClass()
            r3 = -1
            int r4 = r2.hashCode()
            switch(r4) {
                case -645125871: goto L_0x0044;
                case 100470631: goto L_0x0039;
                case 472614934: goto L_0x002e;
                case 1159329357: goto L_0x0023;
                case 1455016274: goto L_0x0018;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x004e
        L_0x0018:
            java.lang.String r4 = "--autofill"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0021
            goto L_0x004e
        L_0x0021:
            r3 = 4
            goto L_0x004e
        L_0x0023:
            java.lang.String r4 = "--contentcapture"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x002c
            goto L_0x004e
        L_0x002c:
            r3 = 3
            goto L_0x004e
        L_0x002e:
            java.lang.String r4 = "--list-dumpables"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0037
            goto L_0x004e
        L_0x0037:
            r3 = 2
            goto L_0x004e
        L_0x0039:
            java.lang.String r4 = "--dump-dumpable"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0042
            goto L_0x004e
        L_0x0042:
            r3 = r0
            goto L_0x004e
        L_0x0044:
            java.lang.String r4 = "--translation"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r3 = r1
        L_0x004e:
            switch(r3) {
                case 0: goto L_0x0067;
                case 1: goto L_0x0060;
                case 2: goto L_0x0060;
                case 3: goto L_0x0059;
                case 4: goto L_0x0052;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x006e
        L_0x0052:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L_0x006e
            goto L_0x006d
        L_0x0059:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L_0x006e
            goto L_0x006d
        L_0x0060:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r2 < r3) goto L_0x006e
            goto L_0x006d
        L_0x0067:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 < r3) goto L_0x006e
        L_0x006d:
            r1 = r0
        L_0x006e:
            r0 = r0 ^ r1
            if (r0 != 0) goto L_0x0072
            return
        L_0x0072:
            r8.print(r6)
            java.lang.String r0 = "Local FragmentActivity "
            r8.print(r0)
            int r0 = java.lang.System.identityHashCode(r5)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r8.print(r0)
            java.lang.String r0 = " State:"
            r8.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.print(r0)
            java.lang.String r1 = "mCreated="
            r8.print(r1)
            boolean r1 = r5.D
            r8.print(r1)
            java.lang.String r1 = " mResumed="
            r8.print(r1)
            boolean r1 = r5.E
            r8.print(r1)
            java.lang.String r1 = " mStopped="
            r8.print(r1)
            boolean r1 = r5.F
            r8.print(r1)
            android.app.Application r1 = r5.getApplication()
            if (r1 == 0) goto L_0x00ce
            t2.a r1 = new t2.a
            r2.w r2 = r5.n()
            r1.<init>(r5, r2)
            r1.J(r0, r8)
        L_0x00ce:
            androidx.fragment.app.p r0 = r5.B
            androidx.fragment.app.r<?> r0 = r0.f2695a
            androidx.fragment.app.w r0 = r0.f2700e
            r0.v(r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentActivity.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
        this.B.a();
        super.onActivityResult(i10, i11, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.C.f(i.a.ON_CREATE);
        w wVar = this.B.f2695a.f2700e;
        wVar.F = false;
        wVar.G = false;
        wVar.M.f2718i = false;
        wVar.t(1);
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.B.f2695a.f2700e.f2489f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        this.B.f2695a.f2700e.k();
        this.C.f(i.a.ON_DESTROY);
    }

    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.B.f2695a.f2700e.i();
        }
        return false;
    }

    public void onPause() {
        super.onPause();
        this.E = false;
        this.B.f2695a.f2700e.t(5);
        this.C.f(i.a.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        this.C.f(i.a.ON_RESUME);
        w wVar = this.B.f2695a.f2700e;
        wVar.F = false;
        wVar.G = false;
        wVar.M.f2718i = false;
        wVar.t(7);
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.B.a();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    public void onResume() {
        this.B.a();
        super.onResume();
        this.E = true;
        this.B.f2695a.f2700e.y(true);
    }

    public void onStart() {
        this.B.a();
        super.onStart();
        this.F = false;
        if (!this.D) {
            this.D = true;
            w wVar = this.B.f2695a.f2700e;
            wVar.F = false;
            wVar.G = false;
            wVar.M.f2718i = false;
            wVar.t(4);
        }
        this.B.f2695a.f2700e.y(true);
        this.C.f(i.a.ON_START);
        w wVar2 = this.B.f2695a.f2700e;
        wVar2.F = false;
        wVar2.G = false;
        wVar2.M.f2718i = false;
        wVar2.t(5);
    }

    public final void onStateNotSaved() {
        this.B.a();
    }

    public void onStop() {
        super.onStop();
        this.F = true;
        do {
        } while (H(G()));
        w wVar = this.B.f2695a.f2700e;
        wVar.G = true;
        wVar.M.f2718i = true;
        wVar.t(4);
        this.C.f(i.a.ON_STOP);
    }

    @Deprecated
    public final void w() {
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.B.f2695a.f2700e.f2489f.onCreateView((View) null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
